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
public class Persona {

    public String nome;
    public double lat, lon;
    public int alt;

    public Persona(String nome, double lat, double lon, int alt) {
        this.nome = nome;
        this.lat = lat;
        this.lon = lon;
        this.alt=alt;
    }

}
