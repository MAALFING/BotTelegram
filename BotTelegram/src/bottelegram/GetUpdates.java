/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bottelegram;

import TelegramAPI.JsonReader;
import static bottelegram.BotTelegram.token;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author MAALFING
 */
public class GetUpdates extends Thread {

    Utenti vett = new Utenti();

    static String token = "5219732936:AAGmokA5wCDerqPAOWTNVAdpfHgXd6i5W4o";
    int lastID = -1;
    String xml = "";
    JSONObject json = null;
    Document document;

    @Override
    public void run() {
        while (true) {
            try {
                json = JsonReader.readJsonFromUrl("https://api.telegram.org/bot" + token + "/getUpdates");
                String text = json.getJSONArray("result").getJSONObject(json.getJSONArray("result").length() - 1).getJSONObject("message").getString("text");
                if (lastID != json.getJSONArray("result").getJSONObject(json.getJSONArray("result").length() - 1).getJSONObject("message").getInt("message_id")) {
                    lastID = json.getJSONArray("result").getJSONObject(json.getJSONArray("result").length() - 1).getJSONObject("message").getInt("message_id");
                    int id = json.getJSONArray("result").getJSONObject(json.getJSONArray("result").length() - 1).getJSONObject("message").getJSONObject("from").getInt("id");
                    System.out.println(id);
                    if (text.contains("/citta")) {
                        System.out.println("Sì");
                        text = text.substring(7, text.length());
                        String nome = json.getJSONArray("result").getJSONObject(json.getJSONArray("result").length() - 1).getJSONObject("message").getJSONObject("from").getString("first_name");
                        System.out.println(nome);
                        BufferedReader in = null;
                        //PrintWriter out;

                        try {
                            //out = new PrintWriter("xml/valute.xml");

                            URL url;
                            // System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
                            // url =  new URL("https://www.agenziaentrate.gov.it/portale/documents/20143/296358/Provvedimento+30+marzo+2017+Distributori+automatici_Allegato+Api+REST+Dispositivi+%28v.3.0%29.pdf/7cfe447f-5823-5873-e55d-d3fa825877fd");
                            url = new URL("https://nominatim.openstreetmap.org/search?q=" + text + "&format=xml&addressdetails=1");

                            in = new BufferedReader(new InputStreamReader(url.openStream()));
                            String line;
                            while ((line = in.readLine()) != null) {
                                //System.out.println("Documento:");
                                xml += line;
                                System.out.println(line);
                                //out.println(line);
                            }
                            in.close();
                            //out.close();

                        } catch (IOException ex) {
                            Logger.getLogger(GetUpdates.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        System.out.println(text);
                        String[] result = new String[2];
                        try {
                            result = parseDocument(xml, id).split(";");
                            xml = "";

                        } catch (ParserConfigurationException ex) {
                            Logger.getLogger(GetUpdates.class.getName()).log(Level.SEVERE, null, ex);

                        } catch (SAXException ex) {
                            Logger.getLogger(GetUpdates.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (NullPointerException ex) {
                            System.out.println("Nessun risultato trovato");
                        }
                        if (!vett.AU(new Utente(nome, id, text))) {
                            System.out.println("Utente già esistente");
                            JsonReader.readJsonFromUrl("https://api.telegram.org/bot" + token + "/sendMessage?chat_id=" + id + "&text=" + "Posizione aggiornata a:%0ALATITUDINE " + result[0] + "%0ALONGITUDINE " + result[1]);
                        } else {
                            JsonReader.readJsonFromUrl("https://api.telegram.org/bot" + token + "/sendMessage?chat_id=" + id + "&text=" + "Utente creato a:%0ALATITUDINE " + result[0] + "%0ALONGITUDINE " + result[1]);
                        }

                    }

                    //https://nominatim.openstreetmap.org/search?q=cesano+maderno&format=xml&addressdetails=1
                    getJSON();
                }
                //getJSON();
            } catch (IOException ex) {
                Logger.getLogger(GetUpdates.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(GetUpdates.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GetUpdates.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String getJSON() {
        //System.out.println(json.toString());
        System.out.println(json.getJSONArray("result").getJSONObject(json.getJSONArray("result").length() - 1).getJSONObject("message").get("text"));
        //System.out.println(json.getJSONArray("result").getJSONObject(json.getJSONArray("result").length()-1).getJSONObject("message").getInt("message_id"));
        return json.toString();
    }

    public String parseDocument(String filename, int id) throws ParserConfigurationException, SAXException, IOException {

        String result = "";
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Element root, element;
        NodeList nodelist;
        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();

        document = builder.parse(new InputSource(new StringReader(filename)));
        root = document.getDocumentElement();
        //List<Change> dati = new ArrayList();
        //Change dato;
        NodeList list = document.getElementsByTagName("searchresults");
        element = (Element) list.item(0);
        Element place = (Element) element.getElementsByTagName("place").item(0);
        String lat = place.getAttribute("lat");
        String log = place.getAttribute("lon");
        result = "LATITUDINE " + lat + "\nLONGITUDINE " + log;
        System.out.println("LATITUDINE " + lat + " LONGITUDINE " + log);

        return lat + ";" + log;
    }

}
