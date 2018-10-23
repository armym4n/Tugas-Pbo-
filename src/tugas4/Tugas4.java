/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Tugas4 {
    
    public static void cetak(ArrayList arr,String elemen, String jenis){
       switch(elemen){
            case "api":
               for (int i = 0; i < arr.size(); i++) {
                   if(jenis.equals("charmander")){
                       Charmander charmander = (Charmander)arr.get(i);
                       System.out.println(charmander.getNama() + " " + charmander.getLevel() + " " + charmander.getUmur());
                   }
                   else if(jenis.equals("vulpix")){
                        Vulpix vulpix = (Vulpix)arr.get(i);
                        System.out.println(vulpix.getNama() + " " + vulpix.getLevel() + " " + vulpix.getUmur());
                   }
               }
            break;
            case "air":
               for (int i = 0; i < arr.size(); i++) {
                   if(jenis.equals("squirtle")){
                       Squirtle squirtle = (Squirtle)arr.get(i);
                       System.out.println(squirtle.getNama() + " " + squirtle.getLevel() + " " + squirtle.getUmur());
                   }
                   else if(jenis.equals("magikarp")){
                        Magikarp magikarp = (Magikarp)arr.get(i);
                        System.out.println(magikarp.getNama() + " " + magikarp.getLevel() + " " + magikarp.getUmur());
                   }
               }
            break;
             case "rumput":
               for (int i = 0; i < arr.size(); i++) {
                   if(jenis.equals("bulbasaur")){
                       Bulbasaur bulbasaur = (Bulbasaur)arr.get(i);
                       System.out.println(bulbasaur.getNama() + " " + bulbasaur.getLevel() + " " + bulbasaur.getUmur());
                   }
                   else if(jenis.equals("chikorita")){
                        Chikorita chikorita = (Chikorita)arr.get(i);
                        System.out.println(chikorita.getNama() + " " + chikorita.getLevel() + " " + chikorita.getUmur());
                   }
               }
            break;
            case "evolusi":
               for (int i = 0; i < arr.size(); i++) {
                   if(jenis.equals("charmeleon")){
                       Charmeleon charmeleon = (Charmeleon)arr.get(i);
                       System.out.println(charmeleon.getNama() + " " + charmeleon.getLevel() + " " + charmeleon.getUmur());
                   }
                   else if(jenis.equals("ninetales")){
                        Ninetales n = (Ninetales)arr.get(i);
                        System.out.println(n.getNama() + " " + n.getLevel() + " " + n.getUmur());
                   }
                   else if(jenis.equals("wartortle")){
                        Wartortle w = (Wartortle)arr.get(i);
                        System.out.println(w.getNama() + " " + w.getLevel() + " " + w.getUmur());
                   }
                   else if(jenis.equals("gyarados")){
                        Gyarados g = (Gyarados)arr.get(i);
                        System.out.println(g.getNama() + " " + g.getLevel() + " " + g.getUmur());
                   }
               }
            break;
            
       }
    }
    
    public static int ataraksi(ArrayList arr,String elemen, String jenis){
        switch(elemen){
            case "api":
               int lead = -1;
               for (int i = 0; i < arr.size(); i++) {
                   if(jenis.equals("charmander")){
                       Charmander charmander = (Charmander)arr.get(i);
                       if(lead < charmander.getLevel()){
                           lead = charmander.getLevel();
                       }
    //System.out.println(charmander.getNama() + " " + charmander.getLevel() + " " + charmander.getUmur());
                   }
                   else if(jenis.equals("vulpix")){
                        Vulpix vulpix = (Vulpix)arr.get(i);
                        if(lead < vulpix.getLevel()){
                           lead = vulpix.getLevel();
                       }
//System.out.println(vulpix.getNama() + " " + vulpix.getLevel() + " " + vulpix.getUmur());
                   }
               }
            break;
       }
        return 0;
        
       
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Scanner o = new Scanner(System.in);
        Api h = new Api("",1,0);
        Air l = new Air("",1,0);
        Rumput r = new Rumput("",1,0);
        Evolusi z = new Evolusi(1,0,"");
        ArrayList<Charmander> c = new ArrayList<Charmander>(); 
        ArrayList<Vulpix> v = new ArrayList<Vulpix>(); 
        ArrayList<Squirtle> ss = new ArrayList<Squirtle>(); 
        ArrayList<Magikarp> m = new ArrayList<Magikarp>();
        ArrayList<Bulbasaur> b = new ArrayList<Bulbasaur>();
        ArrayList<Chikorita> cc = new ArrayList<Chikorita>(); 
        ArrayList<Charmeleon> cd = new ArrayList<Charmeleon>();
        ArrayList<Ninetales> n = new ArrayList<Ninetales>(); 
        ArrayList<Wartortle> w = new ArrayList<Wartortle>();
        ArrayList<Gyarados> g = new ArrayList<Gyarados>();
        ArrayList<Ivysaur> ii = new ArrayList<Ivysaur>();
        ArrayList<Bayleef> bb = new ArrayList<Bayleef>();
        
        ArrayList<Pokemonchild> pokemonChilds = new ArrayList<>();
        
        int menu=0,uang=1000,hari=1;
        Random rnd = new Random();
        int acak = ((int)(Math.random()*2));
        int ran = ((int)(Math.random()*5));
        
        int pil=0,lihat=0;
        
        while(menu!=8){
            System.out.println("Dana :"+uang);
            System.out.println("Hari :"+hari);
            System.out.println("1. Lihat Pokemon - Api");
            System.out.println("2. Lihat Pokemon - Air");
            System.out.println("3. Lihat Pokemon - Rumput");
            System.out.println("4. Lihat Pokemon - Evolusi");
            System.out.println("5. Tambah Pokemon");
            System.out.println("6. Lakukan Pertunjukan");
            System.out.println("7. Ganti Hari");
            menu=s.nextInt();
//             c.add(new Charmander("Charmander",1,0));
//             v.add(new Vulpix("Vulpix",1,0));

            if(menu == 9){
                //Cara add pokemon
                pokemonChilds.add(new Pokemonchild(0, 0, "charmander","api"));
                
                //cetak pokemon sekarang
                System.out.println("Sebelum Evolve : ");
                for (int i = 0; i < pokemonChilds.size(); i++) {
                    System.out.println(pokemonChilds.get(i).nama);
                }
                
                //cetak ataksi sebelum evolve
                pokemonChilds.get(0).atraksi();
                
                //cara evolve
                pokemonChilds.get(0).evolve();
                
                //hasil evolve
                System.out.println("Setelah Evolve : ");
                System.out.println(pokemonChilds.get(0).nama);
                
                //cetak ataksi sesudah evolve
                pokemonChilds.get(0).atraksi();
                
                
                
                System.out.println();
            }
                    
            if(menu==1){
                //Cetak yang baru
                //cek untuk elemen 
                boolean isOwnFire = false;
                for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("api")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama);
                    }
                }
                if(!isOwnFire){
                    System.out.println("Tidak Punya");
                }
                
                
                if(c.size() <= 0 && v.size() <= 0){
                    System.out.println("Abaikan");
                }
                else{
                    //cetak(c,"api","charmander");
                    //cetak(v,"api","vulpix");
                }
               
              
               if(Api.jumlah==0){
                   System.out.println("Abaikan");
                   
               }
               else if(Api.jumlah == -15){
                   int tam = rnd.nextInt(2)+1;
                   if(c.size()<0 && v.size()<0){
                       return;
                   
                   }
                   
                      for (int i = 0; i < c.size(); i++) {
                          
                        System.out.println(c.get(i).getNama()+"- LV."+c.get(i).getLevel()+"- "+c.get(i).getUmur()+"Hari");
                             // System.out.println("sedang lompat");
                          
                          
                        }
                     
                     for (int i = 0; i < v.size(); i++) {
                        System.out.println(v.get(i).getNama()+"- LV."+v.get(i).getLevel()+"- "+v.get(i).getUmur()+"Hari");
                        
                        }
                     
                    if(tam==1){
                        for (int i = 0; i < c.size(); i++) {
                        System.out.println(c.get(0).getNama()+"- LV."+c.get(0).getLevel()+"- "+c.get(0).getUmur()+"Hari");
                        System.out.println("sedang lompat");
                        }
                        
                    }
                    if(tam==2){
                        for (int i = 0; i < v.size(); i++) {
                        System.out.println(v.get(0).getNama()+"- LV."+v.get(0).getLevel()+"- "+v.get(0).getUmur()+"Hari");
                        System.out.println("sedang menggaruk badan");
                        }
                    
                 }
               }
              
         }
            if(menu==2){
                 if(Air.jumlah==0){
                   System.out.println("tidak ada pokemon");
               }
               else{
                   int tam = rnd.nextInt(2)+1;
                   if(ss.size()<0 && m.size()<0){
                       return;
                   
                   }
                   
                      for (int i = 0; i < ss.size(); i++) {
                          
                        System.out.println(ss.get(i).getNama()+"- LV."+ss.get(i).getLevel()+"- "+ss.get(i).getUmur()+"Hari");
                             // System.out.println("sedang lompat");
                          
                          
                        }
                     
                     for (int i = 0; i < m.size(); i++) {
                        System.out.println(m.get(i).getNama()+"- LV."+m.get(i).getLevel()+"- "+v.get(i).getUmur()+"Hari");
                        
                        }
                     
                    if(tam==1){
                        for (int i = 0; i < ss.size(); i++) {
                        System.out.println(ss.get(i).getNama()+"- LV."+ss.get(i).getLevel()+"- "+ss.get(i).getUmur()+"Hari");
                        System.out.println("sedang lompat");
                        }
                        
                    }
                    if(tam==2){
                        for (int i = 0; i < m.size(); i++) {
                        System.out.println(m.get(i).getNama()+"- LV."+m.get(i).getLevel()+"- "+m.get(i).getUmur()+"Hari");
                        System.out.println("sedang menggaruk badan");
                        }
                    
                 }
               }
            
            }
            
            if(menu==3){
                 if(Rumput.jumlah<0){
                   System.out.println("tidak ada pokemon");
               }
               else{
                   int tam = rnd.nextInt(2)+1;
                   if(b.size()<0 && cc.size()<0){
                       return;
                   
                   }
                   
                      for (int i = 0; i < b.size(); i++) {
                          
                        System.out.println(b.get(i).getNama()+"- LV."+b.get(i).getLevel()+"- "+b.get(i).getUmur()+"Hari");
                             // System.out.println("sedang lompat");
                          
                          
                        }
                     
                     for (int i = 0; i < cc.size(); i++) {
                        System.out.println(cc.get(i).getNama()+"- LV."+cc.get(i).getLevel()+"- "+cc.get(i).getUmur()+"Hari");
                        
                        }
                     
                    if(tam==1){
                        for (int i = 0; i < b.size(); i++) {
                        System.out.println(b.get(i).getNama()+"- LV."+b.get(i).getLevel()+"- "+b.get(i).getUmur()+"Hari");
                        System.out.println("sedang lompat");
                        }
                        
                    }
                    if(tam==2){
                        for (int i = 0; i < cc.size(); i++) {
                        System.out.println(cc.get(i).getNama()+"- LV."+cc.get(i).getLevel()+"- "+cc.get(i).getUmur()+"Hari");
                        System.out.println("sedang makan");
                        }
                    
                 }
               }
            
            }
            
            if(menu==4){
                 if(Evolusi.jumlah==0){
                   System.out.println("tidak ada pokemon");
               }
               else{
                   int tam = rnd.nextInt(7)+1;
                   if(cd.size()<0 && n.size()<0 && w.size()<0 && g.size()<0&& ii.size()<0&&bb.size()<0){
                       return;
                   
                   }
                   
                      for (int i = 0; i < cd.size(); i++) {
                          
                        System.out.println(cd.get(i).getNama()+"- LV."+cd.get(i).getLevel()+"- "+cd.get(i).getUmur()+"Hari");
                             // System.out.println("sedang lompat");
                          
                          
                        }
                     
                     for (int i = 0; i < n.size(); i++) {
                        System.out.println(n.get(i).getNama()+"- LV."+n.get(i).getLevel()+"- "+n.get(i).getUmur()+"Hari");
                        
                        }
                     
                     for (int i = 0; i < w.size(); i++) {
                        System.out.println(w.get(i).getNama()+"- LV."+w.get(i).getLevel()+"- "+w.get(i).getUmur()+"Hari");
                        
                        }
                     for (int i = 0; i < g.size(); i++) {
                        System.out.println(g.get(i).getNama()+"- LV."+g.get(i).getLevel()+"- "+g.get(i).getUmur()+"Hari");
                        
                        }
                     
                     for (int i = 0; i < ii.size(); i++) {
                        System.out.println(ii.get(i).getNama()+"- LV."+ii.get(i).getLevel()+"- "+ii.get(i).getUmur()+"Hari");
                        
                        }
                     for (int i = 0; i < bb.size(); i++) {
                        System.out.println(bb.get(i).getNama()+"- LV."+bb.get(i).getLevel()+"- "+bb.get(i).getUmur()+"Hari");
                        
                        }
                     
                    if(tam==1){
                        for (int i = 0; i < cd.size(); i++) {
                        System.out.println(cd.get(i).getNama()+"- LV."+cd.get(i).getLevel()+"- "+cd.get(i).getUmur()+"Hari");
                        System.out.println("sedang lompat");
                        }
                        
                    }
                    if(tam==2){
                        for (int i = 0; i < n.size(); i++) {
                        System.out.println(n.get(i).getNama()+"- LV."+n.get(i).getLevel()+"- "+n.get(i).getUmur()+"Hari");
                        System.out.println("sedang joget");
                        }
                    }
                    if(tam==3){
                        for (int i = 0; i < w.size(); i++) {
                        System.out.println(w.get(i).getNama()+"- LV."+w.get(i).getLevel()+"- "+w.get(i).getUmur()+"Hari");
                        System.out.println("sedang jalan");
                        }
                    }
                     if(tam==4){
                        for (int i = 0; i < g.size(); i++) {
                        System.out.println(g.get(i).getNama()+"- LV."+g.get(i).getLevel()+"- "+g.get(i).getUmur()+"Hari");
                        System.out.println("sedang makan");
                        }
                     }
                    if(tam==5){
                        for (int i = 0; i < ii.size(); i++) {
                        System.out.println(ii.get(i).getNama()+"- LV."+ii.get(i).getLevel()+"- "+ii.get(i).getUmur()+"Hari");
                        System.out.println("sedang minum");
                        }
                    }
                    
                    if(tam==6){
                        for (int i = 0; i < bb.size(); i++) {
                        System.out.println(bb.get(i).getNama()+"- LV."+bb.get(i).getLevel()+"- "+bb.get(i).getUmur()+"Hari");
                        System.out.println("sedang melamun");
                        }
                    }
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
                            System.out.println("anda mendapat charmander");
                            c.add(new Charmander("Charmander",1,0));
                            //Api.jumlah +=1;
                            uang-=100;
                        }
                    }
                    if(kocok==2){
                        System.out.println("anda mendapat vulpix");
                        v.add(new Vulpix("Vulpix",1,0));
                        Api.jumlah +=1;
                        uang-=100;
                        if(uang<0){
                            System.out.println("uang tidak cukup");
                        }
                    }
                    if(kocok==3){
                        System.out.println("anda mendapatkan squirtle");
                        ss.add(new Squirtle("Squirtle",1,0));
                        Api.jumlah+=1;
                        uang-=100;
                        if(uang<0){
                            System.out.println("uang tidak cukup");
                        }
                    }
                    if(kocok==4){
                        System.out.println("anda mendapatkan magikarp");
                        m.add(new Magikarp("Magikarp",1,0));
                        Api.jumlah+=1;
                        uang-=100;
                        if(uang<0){
                            System.out.println("uang tidak cukup");
                        }
                    }
                    if(kocok==5){
                        System.out.println("anda mendapatkan bulbasaur");
                        b.add(new Bulbasaur("Bulbasaur",1,0));
                        Api.jumlah+=1;
                        uang-=100;
                        if(uang<0){
                            System.out.println("uang tidak cukup");
                        }
                    }
                    if(kocok==6){
                        System.out.println("anda mendapatkan chikorita");
                        cc.add(new Chikorita("Chikorita",1,0));
                        Api.jumlah+=1;
                        uang-=100;
                        if(uang<0){
                            System.out.println("uang tidak cukup");
                        }
                    }
                    
                }
                if(pil==2){
                      int buat = rnd.nextInt(20)+1;
                    if(buat==1){
                        System.out.println("anda mendapat charmander");
                        c.add(new Charmander("Charmander",1,0));
                        Api.jumlah +=1;
                        
                        System.out.println("anda mendapat vulpix");
                        v.add(new Vulpix("Vulpix",1,0));
                        Api.jumlah +=1;
                       uang-=250;
                    }
                    if(buat==2){
                        System.out.println("anda mendapatkan squirtle");
                        ss.add(new Squirtle("Squirtle",1,0));
                        Air.jumlah+=1;
                        
                        System.out.println("anda mendapatkan magikarp");
                        m.add(new Magikarp("Magikarp",1,0));
                        Air.jumlah+=1;
                    uang-=250;
                    }
                    if(buat==3){
                         System.out.println("anda mendapatkan bulbasaur");
                        b.add(new Bulbasaur("Bulbasaur",1,0));
                        Rumput.jumlah+=1;
                        
                        System.out.println("anda mendapatkan chikorita");
                        cc.add(new Chikorita("Chikorita",1,0));
                        Rumput.jumlah+=1;
                    uang-=250;
                    }
                    
                    if(buat==4){
                         System.out.println("anda mendapat charmander");
                        c.add(new Charmander("Charmander",1,0));
                        Api.jumlah +=1;
                        
                        
                        System.out.println("anda mendapatkan squirtle");
                        ss.add(new Squirtle("Squirtle",1,0));
                        Air.jumlah+=1;
                        uang-=250;
                    }
                    
                    if(buat==5){
                    
                        System.out.println("anda mendapat charmander");
                        c.add(new Charmander("Charmander",1,0));
                        Api.jumlah +=1;
                        
                        System.out.println("anda mendapatkan magikarp");
                        m.add(new Magikarp("Magikarp",1,0));
                        Air.jumlah+=1;
                        uang-=250;
                    }
                    
                    if(buat==6){
                        System.out.println("anda mendapat vulpix");
                        v.add(new Vulpix("Vulpix",1,0));
                        Api.jumlah +=1;
                        
                        System.out.println("anda mendapatkan squirtle");
                        ss.add(new Squirtle("Squirtle",1,0));
                        Air.jumlah+=1;
                        uang-=250;
                    }
                    
                    if(buat==7){
                        System.out.println("anda mendapat vulpix");
                        v.add(new Vulpix("Vulpix",1,0));
                        Api.jumlah +=1;
                        
                        System.out.println("anda mendapatkan magikarp");
                        m.add(new Magikarp("Magikarp",1,0));
                        Air.jumlah+=1;
                        uang-=250;
                    }
                    
                    if(buat==8){
                        System.out.println("anda mendapatkan squirtle");
                        ss.add(new Squirtle("Squirtle",1,0));
                        Air.jumlah+=1;
                        
                        System.out.println("anda mendapatkan bulbasaur");
                        b.add(new Bulbasaur("Bulbasaur",1,0));
                        Rumput.jumlah+=1;
                        uang-=250;

                    }
                    if(buat==9){
                          System.out.println("anda mendapatkan magikarp");
                        m.add(new Magikarp("Magikarp",1,0));
                        Air.jumlah+=1;
                        
                         System.out.println("anda mendapatkan bulbasaur");
                        b.add(new Bulbasaur("Bulbasaur",1,0));
                        Rumput.jumlah+=1;
                        uang-=250;
                    
                    }
                    
                    if(buat==10){
                        System.out.println("anda mendapatkan squirtle");
                        ss.add(new Squirtle("Squirtle",1,0));
                        Air.jumlah+=1;
                        
                        System.out.println("anda mendapatkan chikorita");
                        cc.add(new Chikorita("Chikorita",1,0));
                        Rumput.jumlah+=1;
                        uang-=250;
                    
                    }
                    if(buat==11){
                         System.out.println("anda mendapatkan magikarp");
                        m.add(new Magikarp("Magikarp",1,0));
                        Air.jumlah+=1;
                        
                         System.out.println("anda mendapatkan chikorita");
                        cc.add(new Chikorita("Chikorita",1,0));
                        Rumput.jumlah+=1;
                        uang-=250;
                    
                    }
                    
                
                }
                if(pil==3){
                    int besar= rnd.nextInt(6)+1;
                    if(besar==1){
                        System.out.println("anda mendapatkan pokemon evolusi charmeleon");
                        cd.add(new Charmeleon("Chikorita",1,0));
                        uang-=350;
                    }
                    if(besar==2){
                         System.out.println("anda mendapatkan pokemon evolusi ninetales");
                        n.add(new Ninetales("Ninetales",1,0));
                        uang-=350;
                    }
                    if(besar==3){
                        System.out.println("anda mendapatkan pokemon evolusi wartortle");
                        w.add(new Wartortle("Wartortle",1,0));
                        uang-=350;
                    }
                    if(besar==4){
                        System.out.println("anda mendapatkan pokemon evolusi gyarados");
                        g.add(new Gyarados("Gyarados",1,0));
                        uang-=350;
                    }
                    if(besar==5){
                        System.out.println("anda mendapatkan pokemon evolusi ivysaur");
                        ii.add(new Ivysaur("Ivysaur",1,0));
                        uang-=350;
                    
                    }
                    if(besar==6){
                        System.out.println("anda mendapatkan pokemon evolusi bayleef");
                        bb.add(new Bayleef("Bayleef",1,0));
                        uang-=350;
                    
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
                    int lead = -1;
                    Charmander charm;
                    Vulpix ba;
                    for (int i = 0; i < c.size(); i++) {
                        if(lead < c.get(i).getLevel()){
                            lead = c.get(i).getLevel();
                            charm = c.get(i);
                        }
                    }
                    for (int i = 0; i < v.size(); i++) {
                        if(lead < v.get(i).getLevel()){
                            lead = v.get(i).getLevel();
                            ba = v.get(i);
                        }
                    }
                    
                   
                
                }
                
              }
            if(menu==7){
            
            
            }
        
          }
        
      }
    
  }

    


