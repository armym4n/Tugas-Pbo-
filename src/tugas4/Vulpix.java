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
public class Vulpix extends Api {
    private boolean atraksi;
    public Vulpix(String nama, int level, int umur) {
        super(nama, level, umur);
    }

    public boolean isAtraksi() {
        return atraksi;
    }

    public void setAtraksi(boolean atraksi) {
        this.atraksi = atraksi;
    }
    
  
    
}
