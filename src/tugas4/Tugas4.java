/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author Asus
 */
public class Tugas4 {
    
   
    
  
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Scanner o = new Scanner(System.in);
       
     
        ArrayList<Pokemonchild> pokemonChilds = new ArrayList<>();
         int ctr2=0;
         int tambah=0;
        int menu=0,uang=1000,hari=1;
        Random rnd = new Random();
        int acak = ((int)(Math.random()*2));
        int ran = ((int)(Math.random()*5));
        
        int pil=0,lihat=0;
        
        int ctrApi = 0,ctrAir = 0,ctrRumput = 0,ctrEvolusi =0;
        String atraksiApi = "Fire Dance";
        String atraksiAir = "Water Blast";
        String atraksiRumput = "Frenzy Plant";
        String atraksiEvolusi = "Lunar Dance";
        ArrayList<Integer> penjualanatraksi = new ArrayList<Integer>();
        ArrayList<String> jenisatraksi = new ArrayList<String>();
        
        while(menu<8){
            System.out.println("Dana :"+uang);
            System.out.println("Hari :"+hari);
            System.out.println("1. Lihat Pokemon - Api");
            System.out.println("2. Lihat Pokemon - Air");
            System.out.println("3. Lihat Pokemon - Rumput");
            System.out.println("4. Lihat Pokemon - Evolusi");
            System.out.println("5. Tambah Pokemon");
            System.out.println("6. Lakukan Pertunjukan");
            System.out.println("7. Ganti Hari");
            System.out.print("Masukkan Pilihan : ");
            menu=s.nextInt();
//            
            if(menu==1){
                //Cetak yang baru
                //cek untuk elemen 
                boolean isOwnFire = false;
                int tam = rnd.nextInt(2)+1;
                for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("api")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        if(tam == 1){
                            System.out.println("Melakukan Kegiatan meloncat");
                        }
                        else if(tam == 2){
                            System.out.println("Melakukan Kegiatan berlari");
                        }
                    }
                }
                
                
                if(!isOwnFire){
                    System.out.println("Tidak Punya");
                }
            }

            if(menu==2){
                
                 boolean isOwnFire = false;
                int tem = rnd.nextInt(2)+1;
                for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("air")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        if(tem == 1){
                            System.out.println("Melakukan Kegiatan meloncat");
                        }
                        else if(tem == 2){
                            System.out.println("Melakukan Kegiatan berlari");
                        }
                    }
                    
                }
                

                
                if(!isOwnFire){
                    System.out.println("Tidak Punya");
                }


            }
            
            if(menu==3){
             boolean isOwnFire = false;
                int tem = rnd.nextInt(2)+1;
                for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("rumput")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        if(tem == 1){
                            System.out.println("Melakukan Kegiatan meloncat");
                        }
                        else if(tem == 2){
                            System.out.println("Melakukan Kegiatan berlari");
                        }
                    }
                }
                
      
                
                if(!isOwnFire){
                    System.out.println("Tidak Punya");
                }


            
            }
            
            if(menu==4){
                
                
                 boolean isOwnFire = false;
                int tem = rnd.nextInt(6)+1;
                for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("evolusi")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        if(tem == 1){
                            System.out.println("Melakukan Kegiatan meloncat");
                        }
                        else if(tem == 2){
                            System.out.println("Melakukan Kegiatan berlari");
                        }
                        else if(tem==3){
                            System.out.println("melakukan kegiatan makan");
                        
                        }
                        else if(tem==4){
                            System.out.println("melakukan kegitan minum");
                        
                        }
                        else if(tem==5){
                            System.out.println("melakukan kegitan menjilt");
                        
                        }
                        else if(tem==6){
                            System.out.println("melakukan kegitan berjemur");
                        
                        }
                    }
                }
                
                
                
                if(!isOwnFire){
                    System.out.println("Tidak Punya");
                }

            }
                 
            if(menu==5){
                System.out.println("1. Jasa A - 100");
                System.out.println("2. Jasa B - 250");
                System.out.println("3. Jasa C - 350");
                pil=s.nextInt();
                int kocok = rnd.nextInt(6)+1;
                
                if(pil==1){
                    
                    if(kocok==1){
                        if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                            System.out.println("anda mendapat Charmander - Api");
                           pokemonChilds.add(new Charmander(1,0,"Charmander","api"));
                            //Api.jumlah +=1;
                            uang-=100;
                        }
                    }
                    if(kocok==2){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapat Vulpix - Api");
                            pokemonChilds.add(new Vulpix(1,0,"Vulpix","api"));

                            uang-=100;
                      }
                    }
                    if(kocok==3){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                        System.out.println("anda mendapatkan Squirtle - Air");
                        pokemonChilds.add(new Squirtle(1,0,"Squirtle","air"));
                    
                        uang-=100;
                         }
                    }
                    if(kocok==4){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                        System.out.println("anda mendapatkan Magikarp - Air");
                         pokemonChilds.add(new Magikarp(1,0,"Magikarp","air"));
                        
                        uang-=100;
                         }
                    }
                    if(kocok==5){
                        if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                        System.out.println("anda mendapatkan Bulbasur - Rumput");
                        pokemonChilds.add(new Bulbasaur(1,0,"Bulbasaur","rumput"));
                        
                        uang-=100;
                        }
                    }
                    if(kocok==6){
                        if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                        System.out.println("anda mendapatkan Chikorita - Rumput");
                         pokemonChilds.add(new Chikorita(1,0,"Chikorita","rumput"));
                        
                        uang-=100;
                        }
                    }
                    
                }
                if(pil==2){
                    int buat = rnd.nextInt(10)+1;
                    if(buat==1){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapat charmander");
                             pokemonChilds.add(new Charmander(1,0,"Charmander","api"));


                            System.out.println("anda mendapat vulpix");
                             pokemonChilds.add(new Vulpix(1,0,"Vulpix","api"));

                             uang-=250;
                      }
                    }
                    if(buat==2){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapatkan squirtle");
                             pokemonChilds.add(new Squirtle(1,0,"Squirtle","air"));

                            System.out.println("anda mendapatkan magikarp");
                            pokemonChilds.add(new Magikarp(1,0,"Magikarp","air"));

                             uang-=250;
                         }
                   }
                    if(buat==3){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapatkan bulbasaur");
                           pokemonChilds.add(new Bulbasaur(1,0,"Bulbasaur","rumput"));


                           System.out.println("anda mendapatkan chikorita");
                            pokemonChilds.add(new Chikorita(1,0,"Chikorita","rumput"));
                           uang-=250;
                        }
                    }
                    
                    if(buat==4){
                        if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                          System.out.println("anda mendapat charmander");
                          pokemonChilds.add(new Charmander(1,0,"Charmander","api"));
                           
                           System.out.println("anda mendapatkan squirtle");
                           pokemonChilds.add(new Squirtle(1,0,"Squirtle","air"));
                           
                           uang-=250;
                      }
                    }
                    
                    if(buat==5){
                        if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                            System.out.println("anda mendapat charmander");
                             pokemonChilds.add(new Charmander(1,0,"Charmander","api"));


                            System.out.println("anda mendapatkan magikarp");
                            pokemonChilds.add(new Magikarp(1,0,"Magikarp","air"));
                           
                            uang-=250;
                        }
                    }
                    
                    if(buat==6){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapat vulpix");
                           pokemonChilds.add(new Vulpix(1,0,"Vulpix","api"));


                            System.out.println("anda mendapatkan squirtle");
                          pokemonChilds.add(new Squirtle(1,0,"Squirtle","air"));

                            uang-=250;
                       }
                    }
                    
                    if(buat==7){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapat vulpix");
                            pokemonChilds.add(new Vulpix(1,0,"Vuplix","api"));


                            System.out.println("anda mendapatkan magikarp");
                            pokemonChilds.add(new Magikarp(1,0,"Magikarp","air"));

                            uang-=250;
                       }
                    }
                    
                    if(buat==8){
                        if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                            System.out.println("anda mendapatkan squirtle");
                           pokemonChilds.add(new Squirtle(1,0,"Squirtle","air"));


                            System.out.println("anda mendapatkan bulbasaur");
                            pokemonChilds.add(new Bulbasaur(1,0,"Bulbasaur","rumput"));

                            uang-=250;
                       }
                    }
                    if(buat==9){
                        if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                                System.out.println("anda mendapatkan magikarp");
                            pokemonChilds.add(new Magikarp(1,0,"Magikarp","air"));


                               System.out.println("anda mendapatkan bulbasaur");
                             pokemonChilds.add(new Bulbasaur(1,0,"Bulbasaur","rumput"));

                              uang-=250;
                        }
                    }
                    
                    if(buat==10){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapatkan squirtle");
                            pokemonChilds.add(new Squirtle(1,0,"Squirtle","air"));


                            System.out.println("anda mendapatkan chikorita");
                           pokemonChilds.add(new Chikorita(1,0,"Chikorita","rumput"));

                            uang-=250;
                       }
                    }
                    if(buat==11){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapatkan magikarp");
                           pokemonChilds.add(new Magikarp(1,0,"Magikarp","air"));


                            System.out.println("anda mendapatkan chikorita");
                             pokemonChilds.add(new Chikorita(1,0,"Chikorita","rumput"));

                           uang-=250;
                       }
                    }

                }
                if(pil==3){
                    int besar= rnd.nextInt(6)+1;
                    if(besar==1){
                          if(uang<350){
                            System.out.println("uang tidak cukup");
                        }
                          else{
                            System.out.println("anda mendapatkan pokemon evolusi charmeleon");
                              pokemonChilds.add(new Charmeleon(1,0,"Charmeleon","evolusi"));
                            uang-=350;
                       }
                    }
                    if(besar==2){
                         if(uang<350){
                            System.out.println("uang tidak cukup");
                        }
                          else{
                            System.out.println("anda mendapatkan pokemon evolusi ninetales");
                           pokemonChilds.add(new Ninetales(1,0,"Ninetales","evolusi"));
                           uang-=350;
                         }
                    }
                    if(besar==3){
                         if(uang<350){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapatkan pokemon evolusi wartortle");
                            pokemonChilds.add(new Wartortle(1,0,"Wartortle","evolusi"));
                            uang-=350;
                         }
                    }
                    if(besar==4){
                        if(uang<350){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                            System.out.println("anda mendapatkan pokemon evolusi gyarados");
                              pokemonChilds.add(new Gyarados(1,0,"Gyarados","evolusi"));
                            uang-=350;
                        }
                    }
                    if(besar==5){
                         if(uang<350){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapatkan pokemon evolusi ivysaur");
                          pokemonChilds.add(new Ivysaur(1,0,"Ivusaur","evolusi"));
                            uang-=350;
                       }
                    }
                    if(besar==6){
                         if(uang<350){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapatkan pokemon evolusi bayleef");
                           pokemonChilds.add(new Bayleef(1,0,"Bayleef","evolusi"));
                            uang-=350;
                      }
                    }
                  
                 }
            
              }
            if(menu==6){
                System.out.println("1. Pertunjukkan Atraksi Api");
                System.out.println("2. Pertunjukkan Atraksi Air");
                System.out.println("3. Pertunjukkan Atraksi Rumput");
                System.out.println("4. Pertunjukkan Atraksi Evolusi");
                lihat = s.nextInt();
                 
                if(lihat==1){
                    if(ctrApi < 1){
                        int jumlahApi = 0;
                        ArrayList<Integer> simpanlvl = new ArrayList<Integer>();
                        ArrayList<Integer> simpanpos = new ArrayList<Integer>();
                        
                        for (int i = 0; i < pokemonChilds.size(); i++) {
                            if(pokemonChilds.get(i).getElemen().equals("api") && !pokemonChilds.get(i).isIsEvolve()){
                                //System.out.println("Nama : "+pokemonChilds.get(i).getNama().toString()+" Level :"+pokemonChilds.get(i).getLevel());
                                simpanpos.add(i);
                                simpanlvl.add(pokemonChilds.get(i).getLevel());
                                jumlahApi++;
                            }      
                        }
                        
                        int max = 0;
                        int maxIndex = 0;
                        for (int i = 0; i < simpanlvl.size(); i++) {
                            int newnumber = simpanlvl.get(i);
                            if ((newnumber > max)){
                                max = newnumber;
                                maxIndex = simpanpos.get(i);
                            }
                        }
                        
                        /*for (Integer number: simpanlvl ){
                            int newnumber = number;
                            if ((newnumber > simpanlvl.get(maxIndex))){
                                maxIndex = simpanlvl.indexOf(newnumber);
                            }
                        }*/
                        //System.out.println(maxIndex);
                        //Object obj = Collections.max(simpanlvl);
                        
                        System.out.println("Max Index : "+maxIndex);
                        if(jumlahApi < 2) {
                            System.out.println("Maaf jumlah pokemon Api kurang");
                        }
                        else{
                            for (int i = 0; i < pokemonChilds.size(); i++) {
                                if(pokemonChilds.get(i).getElemen().equals("api") && !pokemonChilds.get(i).isIsEvolve()){
                                    if(i == maxIndex){
                                        pokemonChilds.get(i).setLevel(pokemonChilds.get(i).getLevel() + 1);
                                        System.out.println(pokemonChilds.get(i).getNama()+ " "+pokemonChilds.get(i).getLevel()+" memimpin pertunjukan!");
                                        
                                        if(pokemonChilds.get(i).getLevel() == 3){
                                            pokemonChilds.get(i).evolve();
                                            System.out.println("Nama : "+pokemonChilds.get(i).nama);
                                        }
                                    }
                                    else{
                                        System.out.println(pokemonChilds.get(i).getNama()+ " "+pokemonChilds.get(i).getLevel()+" melakukan "+atraksiApi+" dengan indah");                                    
                                    }
                                }      
                            }
                            jenisatraksi.add("api");
                            penjualanatraksi.add(1000);
                            ctrApi++;
                        }
                        //System.out.println("Jumlah Pokemon Api :"+jumlahApi);
                    }
                    else{
                        System.out.println("Maaf sudah mencapai maksimuk atraksi hari ini");
                    }
                
                }
                if(lihat==2){
                    
               if(ctrAir < 1){
                        int jumlahAir = 0;
                        ArrayList<Integer> simpanlvl = new ArrayList<Integer>();
                        ArrayList<Integer> simpanpos = new ArrayList<Integer>();
                        
                        for (int i = 0; i < pokemonChilds.size(); i++) {
                            if(pokemonChilds.get(i).getElemen().equals("air") && !pokemonChilds.get(i).isIsEvolve()){
                                //System.out.println("Nama : "+pokemonChilds.get(i).getNama().toString()+" Level :"+pokemonChilds.get(i).getLevel());
                                simpanpos.add(i);
                                simpanlvl.add(pokemonChilds.get(i).getLevel());
                                jumlahAir++;
                            }      
                        }
                        
                        int max = 0;
                        int maxIndex = 0;
                        for (int i = 0; i < simpanlvl.size(); i++) {
                            int newnumber = simpanlvl.get(i);
                            if ((newnumber > max)){
                                max = newnumber;
                                maxIndex = simpanpos.get(i);
                            }
                        }
                        //System.out.println(maxIndex);
                        //Object obj = Collections.max(simpanlvl);
                        
                        
                        if(jumlahAir < 2) {
                            System.out.println("Maaf jumlah pokemon Air kurang");
                        }
                        else{
                            for (int i = 0; i < pokemonChilds.size(); i++) {
                                if(pokemonChilds.get(i).getElemen().equals("air") && !pokemonChilds.get(i).isIsEvolve()){
                                    if(i == maxIndex){
                                        pokemonChilds.get(i).setLevel(pokemonChilds.get(i).getLevel() + 1);
                                        System.out.println(pokemonChilds.get(i).getNama()+ " "+pokemonChilds.get(i).getLevel()+" memimpin pertunjukan!");
                                        
                                        if(pokemonChilds.get(i).getLevel() == 3){
                                            pokemonChilds.get(i).evolve();
                                        }
                                    }
                                    else{
                                        System.out.println(pokemonChilds.get(i).getNama()+ " "+pokemonChilds.get(i).getLevel()+" melakukan "+atraksiAir+" dengan indah");                                    
                                    }
                                }      
                            }
                            jenisatraksi.add("air");
                            penjualanatraksi.add(1000);
                            ctrAir++;

                        }
                        //System.out.println("Jumlah Pokemon Api :"+jumlahApi);
                    }
                    else{
                        System.out.println("Maaf sudah mencapai maksimuk atraksi hari ini");
                    }
                }
                
                if(lihat==3){
                   if(ctrRumput < 1){
                        int jumlahRumput = 0;
                        ArrayList<Integer> simpanlvl = new ArrayList<Integer>();
                        ArrayList<Integer> simpanpos = new ArrayList<Integer>();
                        
                        for (int i = 0; i < pokemonChilds.size(); i++) {
                            if(pokemonChilds.get(i).getElemen().equals("rumput") && !pokemonChilds.get(i).isIsEvolve()){
                                //System.out.println("Nama : "+pokemonChilds.get(i).getNama().toString()+" Level :"+pokemonChilds.get(i).getLevel());
                                simpanpos.add(i);
                                simpanlvl.add(pokemonChilds.get(i).getLevel());
                                jumlahRumput++;
                            }      
                        }
                        
                        int max = 0;
                        int maxIndex = 0;
                        for (int i = 0; i < simpanlvl.size(); i++) {
                            int newnumber = simpanlvl.get(i);
                            if ((newnumber > max)){
                                max = newnumber;
                                maxIndex = simpanpos.get(i);
                            }
                        }
                        //System.out.println(maxIndex);
                        //Object obj = Collections.max(simpanlvl);
                        
                        
                        if(jumlahRumput < 2) {
                            System.out.println("Maaf jumlah pokemon rumput kurang");
                        }
                        else{
                            for (int i = 0; i < pokemonChilds.size(); i++) {
                                if(pokemonChilds.get(i).getElemen().equals("rumput") && !pokemonChilds.get(i).isIsEvolve()){
                                    if(i == maxIndex){
                                        pokemonChilds.get(i).setLevel(pokemonChilds.get(i).getLevel() + 1);
                                        System.out.println(pokemonChilds.get(i).getNama()+ " "+pokemonChilds.get(i).getLevel()+" memimpin pertunjukan!");
                                        
                                        if(pokemonChilds.get(i).getLevel() == 3){
                                            pokemonChilds.get(i).evolve();
                                        }
                                    }
                                    else{
                                        System.out.println(pokemonChilds.get(i).getNama()+ " "+pokemonChilds.get(i).getLevel()+" melakukan "+atraksiApi+" dengan indah");                                    
                                    }
                                }      
                            }
                            jenisatraksi.add("rumput");
                            penjualanatraksi.add(1000);
                            ctrRumput++;
                        }
                        //System.out.println("Jumlah Pokemon Api :"+jumlahApi);
                    }
                    else{
                        System.out.println("Maaf sudah mencapai maksimuk atraksi hari ini");
                    }
                
                }
                if(lihat==4){
                     if(ctrEvolusi < 1){
                        int jumlahEvolusi = 0;
                        ArrayList<Integer> simpanlvl = new ArrayList<Integer>();
                        ArrayList<Integer> simpanpos = new ArrayList<Integer>();
                        
                        for (int i = 0; i < pokemonChilds.size(); i++) {
                            if(pokemonChilds.get(i).isIsEvolve()){
                                //System.out.println("Nama : "+pokemonChilds.get(i).getNama().toString()+" Level :"+pokemonChilds.get(i).getLevel());
                                simpanpos.add(i);
                                simpanlvl.add(pokemonChilds.get(i).getLevel());
                                jumlahEvolusi++;
                            }      
                        }
                        
                        int max = 0;
                        int maxIndex = 0;
                        for (int i = 0; i < simpanlvl.size(); i++) {
                            int newnumber = simpanlvl.get(i);
                            if ((newnumber > max)){
                                max = newnumber;
                                maxIndex = simpanpos.get(i);
                            }
                        }
                        //System.out.println(maxIndex);
                        //Object obj = Collections.max(simpanlvl);
                        
                        
                        if(jumlahEvolusi < 2) {
                            System.out.println("Maaf jumlah pokemon Api kurang");
                        }
                        else{
                            for (int i = 0; i < pokemonChilds.size(); i++) {
                                if(pokemonChilds.get(i).getElemen().equals("evolusi") && !pokemonChilds.get(i).isIsEvolve()){
                                    if(i == maxIndex){
                                        pokemonChilds.get(i).setLevel(pokemonChilds.get(i).getLevel() + 1);
                                        System.out.println(pokemonChilds.get(i).getNama()+ " "+pokemonChilds.get(i).getLevel()+" memimpin pertunjukan!");
                                    }
                                    else{
                                        System.out.println(pokemonChilds.get(i).getNama()+ " "+pokemonChilds.get(i).getLevel()+" melakukan "+atraksiApi+" dengan indah");                                    
                                    }
                                }      
                            }
                            jenisatraksi.add("evolve");
                            penjualanatraksi.add(2000);
                            ctrEvolusi++;
                        }
                        //System.out.println("Jumlah Pokemon Api :"+jumlahApi);
                    }
                    else{
                        System.out.println("Maaf sudah mencapai maksimuk atraksi hari ini");
                    }
                }
              }
            if(menu==7){
                ctrApi = 0;
                ctrRumput = 0;
                ctrAir = 0;
                ctrEvolusi = 0;

                int total = 0;
                int hasil = rnd.nextInt(8)+1;
                int penghasilan = hasil*100+tambah;
                System.out.println("Penghasilan hari "+hari+" :");
                System.out.println(penghasilan+" dari penjualan tiket");
                for (int i = 0; i < jenisatraksi.size(); i++) {
                    System.out.println(penjualanatraksi.get(i).toString()+" dari uang pertunjukan atraksi "+jenisatraksi.get(i).toString());
                    total += Integer.parseInt(penjualanatraksi.get(i).toString());
                }
                System.out.println("Total yang didapat "+(total+penghasilan));
                uang = uang + total+penghasilan;
                hari+=1;
            }
        
          }
        
      }
}
  

    


