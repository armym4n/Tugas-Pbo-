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
public class Evolusi extends Pokemonchild {
     private int level,umur;
    private String nama;
    public static int jumlah;

    public Evolusi(int level, int umur, String nama, String elemen) {
        super(level, umur, nama, elemen);
    }

   

   

   

    
    
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    

}
