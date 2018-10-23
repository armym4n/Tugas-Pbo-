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
                    else if(jenis.equals("ivysaur")){
                        Ivysaur ii = (Ivysaur)arr.get(i);
                        System.out.println(ii.getNama() + " " + ii.getLevel() + " " + ii.getUmur());
                   }
                    else if(jenis.equals("bayleef")){
                        Bayleef bb = (Bayleef)arr.get(i);
                        System.out.println(bb.getNama() + " " + bb.getLevel() + " " + bb.getUmur());
                   }
               }
            break;
            
       }
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
                int tam = rnd.nextInt(2)+1;
                for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("api")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                    }
                }
                
                if(tam==1){
                     for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("api")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        System.out.println("sedang melompat");
                    }
                
                }
              }
                if(tam==2){
                 for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("api")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        System.out.println("sedang berlari");
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
                    }
                }
                
                if(tem==1){
                     for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("air")){
                        
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        System.out.println("sedang berenang");
                    }
                
                }
              }
                if(tem==2){
                 for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("air")){
                        
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        System.out.println("sedang berjemur");
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
                    }
                }
                
                if(tem==1){
                     for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("rumput")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        System.out.println("sedang makan");
                    }
                
                }
              }
                if(tem==2){
                 for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("rumput")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        System.out.println("sedang berlari");
                    }
                 }
 
              }
                
                if(!isOwnFire){
                    System.out.println("Tidak Punya");
                }


            
            }
            
            if(menu==4){
                
                
                 boolean isOwnFire = false;
                int tem = rnd.nextInt(2)+1;
                for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("evolusi")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                    }
                }
                
                if(tem==1){
                     for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("evolusi")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        System.out.println("sedang makan");
                    }
                
                }
              }
                if(tem==2){
                 for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("evolusi")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        System.out.println("sedang mengunyah");
                    }
                 }
 
              }
                if(tem==3){
                 for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("evolusi")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        System.out.println("sedang mimpi");
                    }
                 }
 
              }
                if(tem==4){
                 for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("evolusi")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        System.out.println("sedang melamun");
                    }
                 }
 
              }
                if(tem==5){
                 for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("evolusi")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        System.out.println("sedang mengunyah");
                    }
                 }
 
              }
                
               if(tem==6){
                 for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("evolusi")){
                        isOwnFire = true;
                        System.out.println(pokemonChilds.get(i).nama+" "+pokemonChilds.get(i).level+" "+pokemonChilds.get(i).umur);
                        System.out.println("sedang mengaum");
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
                            System.out.println("anda mendapat charmander");
                           pokemonChilds.add(new Pokemonchild(1,0,"Charmander","api"));
                            //Api.jumlah +=1;
                            uang-=100;
                        }
                    }
                    if(kocok==2){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapat vulpix");
                            pokemonChilds.add(new Pokemonchild(1,0,"Vulpix","api"));

                            uang-=100;
                      }
                    }
                    if(kocok==3){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                        System.out.println("anda mendapatkan squirtle");
                        pokemonChilds.add(new Pokemonchild(1,0,"Squirtle","air"));
                    
                        uang-=100;
                         }
                    }
                    if(kocok==4){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                        System.out.println("anda mendapatkan magikarp");
                         pokemonChilds.add(new Pokemonchild(1,0,"magikarp","air"));
                        
                        uang-=100;
                         }
                    }
                    if(kocok==5){
                        if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                        System.out.println("anda mendapatkan bulbasaur");
                        pokemonChilds.add(new Pokemonchild(1,0,"bulbasaur","rumput"));
                        
                        uang-=100;
                        }
                    }
                    if(kocok==6){
                        if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                        System.out.println("anda mendapatkan chikorita");
                         pokemonChilds.add(new Pokemonchild(1,0,"chikorita","rumput"));
                        
                        uang-=100;
                        }
                    }
                    
                }
                if(pil==2){
                      int buat = rnd.nextInt(20)+1;
                    if(buat==1){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapat charmander");
                             pokemonChilds.add(new Pokemonchild(1,0,"charmander","api"));


                            System.out.println("anda mendapat vulpix");
                             pokemonChilds.add(new Pokemonchild(1,0,"vuplix","api"));

                             uang-=250;
                      }
                    }
                    if(buat==2){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapatkan squirtle");
                             pokemonChilds.add(new Pokemonchild(1,0,"squirtle","air"));

                            System.out.println("anda mendapatkan magikarp");
                            pokemonChilds.add(new Pokemonchild(1,0,"magikarp","air"));

                             uang-=250;
                         }
                   }
                    if(buat==3){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapatkan bulbasaur");
                           pokemonChilds.add(new Pokemonchild(1,0,"bulbasaur","rumput"));


                           System.out.println("anda mendapatkan chikorita");
                            pokemonChilds.add(new Pokemonchild(1,0,"chikorita","rumput"));

                           uang-=250;
                        }
                    }
                    
                    if(buat==4){
                        if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                          System.out.println("anda mendapat charmander");
                          pokemonChilds.add(new Pokemonchild(1,0,"charmander","api"));
                           
                           System.out.println("anda mendapatkan squirtle");
                           pokemonChilds.add(new Pokemonchild(1,0,"squirtle","air"));
                           
                           uang-=250;
                      }
                    }
                    
                    if(buat==5){
                        if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                            System.out.println("anda mendapat charmander");
                             pokemonChilds.add(new Pokemonchild(1,0,"charmander","api"));


                            System.out.println("anda mendapatkan magikarp");
                            pokemonChilds.add(new Pokemonchild(1,0,"magikarp","air"));
                           
                            uang-=250;
                        }
                    }
                    
                    if(buat==6){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapat vulpix");
                           pokemonChilds.add(new Pokemonchild(1,0,"vuplix","api"));


                            System.out.println("anda mendapatkan squirtle");
                          pokemonChilds.add(new Pokemonchild(1,0,"squirtle","air"));

                            uang-=250;
                       }
                    }
                    
                    if(buat==7){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapat vulpix");
                            pokemonChilds.add(new Pokemonchild(1,0,"vuplix","api"));


                            System.out.println("anda mendapatkan magikarp");
                             pokemonChilds.add(new Pokemonchild(1,0,"magikarp","air"));

                            uang-=250;
                       }
                    }
                    
                    if(buat==8){
                        if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                            System.out.println("anda mendapatkan squirtle");
                            pokemonChilds.add(new Pokemonchild(1,0,"squirtle","air"));


                            System.out.println("anda mendapatkan bulbasaur");
                            pokemonChilds.add(new Pokemonchild(1,0,"bulbasaur","rumput"));

                            uang-=250;
                       }
                    }
                    if(buat==9){
                        if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                                System.out.println("anda mendapatkan magikarp");
                             pokemonChilds.add(new Pokemonchild(1,0,"magikarp","air"));


                               System.out.println("anda mendapatkan bulbasaur");
                             pokemonChilds.add(new Pokemonchild(1,0,"bulbasaur","rumput"));

                              uang-=250;
                        }
                    }
                    
                    if(buat==10){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapatkan squirtle");
                            pokemonChilds.add(new Pokemonchild(1,0,"squirtle","air"));


                            System.out.println("anda mendapatkan chikorita");
                           pokemonChilds.add(new Pokemonchild(1,0,"chikorita","rumput"));

                            uang-=250;
                       }
                    }
                    if(buat==11){
                         if(uang<100){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapatkan magikarp");
                          pokemonChilds.add(new Pokemonchild(1,0,"magikarp","air"));


                            System.out.println("anda mendapatkan chikorita");
                            pokemonChilds.add(new Pokemonchild(1,0,"chikorita","rumput"));

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
                             pokemonChilds.add(new Pokemonchild(1,0,"charmeleon","evolusi"));
                            uang-=350;
                       }
                    }
                    if(besar==2){
                         if(uang<350){
                            System.out.println("uang tidak cukup");
                        }
                          else{
                            System.out.println("anda mendapatkan pokemon evolusi ninetales");
                           pokemonChilds.add(new Pokemonchild(1,0,"ninetales","evolusi"));
                           uang-=350;
                         }
                    }
                    if(besar==3){
                         if(uang<350){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapatkan pokemon evolusi wartortle");
                            pokemonChilds.add(new Pokemonchild(1,0,"wartortle","evolusi"));
                            uang-=350;
                         }
                    }
                    if(besar==4){
                        if(uang<350){
                            System.out.println("uang tidak cukup");
                        }
                        else{
                            System.out.println("anda mendapatkan pokemon evolusi gyarados");
                              pokemonChilds.add(new Pokemonchild(1,0,"gyarados","evolusi"));
                            uang-=350;
                        }
                    }
                    if(besar==5){
                         if(uang<350){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapatkan pokemon evolusi ivysaur");
                          pokemonChilds.add(new Pokemonchild(1,0,"ivysaur","evolusi"));
                            uang-=350;
                       }
                    }
                    if(besar==6){
                         if(uang<350){
                            System.out.println("uang tidak cukup");
                        }
                         else{
                            System.out.println("anda mendapatkan pokemon evolusi bayleef");
                           pokemonChilds.add(new Pokemonchild(1,0,"bayleef","evolusi"));
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
                    int jumlah=0;
                    int ctr=-1;
                    int a =-1;
                    int index=0;
                    for (int i = 0; i < pokemonChilds.size(); i++) {
                    if(pokemonChilds.get(i).getElemen().equals("api")){
                        
                        jumlah++;
                    }      
                 }
                    if(jumlah>2){
                        for (int i = 0; i < pokemonChilds.size(); i++) {
                           
                            if(pokemonChilds.get(i).getLevel()>ctr ||pokemonChilds.get(i).getLevel()>a ){
                                ctr= pokemonChilds.get(i).getLevel();
                                a = pokemonChilds.get(i).getLevel();
                                index=i;
                                System.out.println(pokemonChilds.get(index).nama+" "+pokemonChilds.get(index).level);
                                System.out.println("memimpin pertunjukan");
                                System.out.println(pokemonChilds.get(index).nama+" "+pokemonChilds.get(index).level);
                                System.out.println("melakukan Fire dance dengan indah");
                              
                            }
                    
                        }
                    }
                    
               
                    
                    
                    
//                   System.out.println("Sebelum Evolve : ");
//                for (int i = 0; i < pokemonChilds.size(); i++) {
//                    System.out.println(pokemonChilds.get(i).nama);
//                }
//                
//                //cetak ataksi sebelum evolve
//                pokemonChilds.get(0).atraksi();
//                
//                //cara evolve
//                pokemonChilds.get(0).evolve();
//                
//                //hasil evolve
//                System.out.println("Setelah Evolve : ");
//                System.out.println(pokemonChilds.get(0).nama);
//                
//                //cetak ataksi sesudah evolve
//                pokemonChilds.get(0).atraksi();
//                
                    
                   
                
                }
                
              }
            if(menu==7){
            
            
            }
        
          }
        
      }
}
  

    


