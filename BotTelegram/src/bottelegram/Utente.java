/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bottelegram;

/**
 *
 * @author MAALFING
 */
public class Utente {
    public String nome, citta;
    public int id;

    public Utente() {
        nome=null;
        id=-1;
        citta="Cesano Maderno";
    }
        
    public Utente(String nome, int id, String citta) {
        this.nome = nome;
        this.id = id;
        this.citta = citta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }
    
    
    
}
