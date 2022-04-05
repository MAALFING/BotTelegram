/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcoladistanze;

/**
 *
 * @author MAALFING
 */
public class Citta {
    public double lat,lon;
    public int alt;
    public String nome, prov;

    public Citta(double lat, double lon, int alt, String nome, String prov) {
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.nome = nome;
        this.prov = prov;
    }
    
    
    
    
}
