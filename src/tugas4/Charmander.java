/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author Asus
 */
public class Charmander extends Api {
    private boolean atraksi;
    private String elemen = "api";

    public Charmander(int level, int umur, String nama, String elemen) {
        super(level, umur, nama, elemen);
    }

    

    
    
    
   
    public boolean isAtraksi() {
        return atraksi;
    }

    public void setAtraksi(boolean atraksi) {
        this.atraksi = atraksi;
    }
    
    
    
    
    
    
}
