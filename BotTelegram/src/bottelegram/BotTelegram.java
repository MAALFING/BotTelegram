/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bottelegram;
import TelegramAPI.*;
import static TelegramAPI.JsonReader.readJsonFromUrl;
import java.io.IOException;
import org.json.JSONObject;

/**
 *
 * @author soggiu_marco
 */
public class BotTelegram {
    
    static String token = "5219732936:AAGmokA5wCDerqPAOWTNVAdpfHgXd6i5W4o";
    static GetUpdates GU=new GetUpdates();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        GU.start();        
        String text="ciao";
        //JsonReader.readJsonFromUrl("https://api.telegram.org/bot" + token + "/sendMessage?chat_id=844853114&text="+text);

    //System.out.println(json.get("id"));
    }
    
}
