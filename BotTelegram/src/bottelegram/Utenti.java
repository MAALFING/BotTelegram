/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bottelegram;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MAALFING
 */
public class Utenti {

    public List<Utente> vett;
    FileReader FR = null;
    File F = new File("C:/Users/utenti.txt");
    FileWriter FW = null;

    public Utenti() {
        vett = new ArrayList();
        try {
            LF();
                    } catch (IOException ex) {
            Logger.getLogger(Utenti.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //F.createNewFile();
            FR = new FileReader(F);
            FW = new FileWriter(F);
            //FW.write("Ciao");
            //FW.flush();
        } catch (IOException ex) {

        }

    }

    ;
    public void LF() throws IOException {

            Scanner myReader = new Scanner(F);
            while (myReader.hasNextLine()) {
                String[] data = myReader.nextLine().split(";");
                System.out.println(data[0]+","+data[1]+","+data[2]);
                vett.add(new Utente(data[0],Integer.valueOf(data[1]),data[2]));
            }
        
    }

    public void SF() throws IOException {
        F.delete();
        F.createNewFile();
        for (int i = 0; i < vett.size(); i++) {
            FW.write(vett.get(i).nome + ";" + vett.get(i).id + ";" + vett.get(i).citta + "\n");
        }
        FW.flush();
    }

    public boolean AU(Utente U) throws IOException {
        for (int i = 0; i < vett.size(); i++) {
            if (vett.get(i).id==(U.id)) {
                SF();
                return false;
            }
        }
        vett.add(U);
        SF();
        return true;
    }

    public Utente CU(int ID) {
        for (int i = 0; i < vett.size(); i++) {
            if (vett.get(i).id == (ID)) {
                return vett.get(i);
            }
        }
        return null;
    }

    public void MU(Utente U, String citta) {
        for (int i = 0; i < vett.size(); i++) {
            if (vett.get(i).equals(U)) {
                vett.get(i).citta = citta;
                try {
                    SF();
                } catch (IOException ex) {
                    Logger.getLogger(Utenti.class.getName()).log(Level.SEVERE, null, ex);
                }
                return;
            }
        }
        System.out.println("Utente inesistente");
    }

}
