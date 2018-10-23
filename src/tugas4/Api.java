/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Api {
    protected int level,umur;
    protected String nama;
    public static int jumlah;
    public static ArrayList<Api> arr;
    public Api(String nama,int level, int umur ) {
        this.level = 1;
        this.umur = 0;
        this.nama = nama;
        arr = new ArrayList<Api>();
    }
    public void addjumlah(int i)
    {
        this.jumlah +=1;
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

