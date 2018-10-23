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
public class Pokemon {
    protected int level;
    protected int umur;
    protected String nama;

    public Pokemon(int level, int umur, String nama) {
        this.level = level;
        this.umur = umur;
        this.nama = nama;
    }
    
    public void levelUp(){
        level++;
    }
    
    public void umurUp(){
        umur++;
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
