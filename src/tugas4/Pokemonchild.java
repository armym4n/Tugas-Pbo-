package tugas4;

public class Pokemonchild extends Pokemon{
    
    private String[][] dataPokemon = new String[6][6]; // ganti size sesuai pokemon
    
    private String elemen;
    private boolean isEvolve = false;
    
    public Pokemonchild(int level, int umur, String nama, String elemen) {
        super(level, umur, nama);
        this.elemen = elemen;
        
        
        //Init data pokemon
        //datapokemon[0][0] -> basicnya
        //datapokemon[0][1] -> evolvenya
        
        dataPokemon[0][0] = "charmander";
        dataPokemon[0][1] = "charmeleon";
        
        dataPokemon[1][0] = "vulpix";
        dataPokemon[1][1] = "ninetales";
        
        dataPokemon[2][0] = "squirtle";
        dataPokemon[2][1] = "wartortle";
        
        dataPokemon[3][0] = "magikarp";
        dataPokemon[3][1] = "gyarados";
        
        dataPokemon[4][0] = "bulbasaur";
        dataPokemon[4][1] = "ivysaur";
        
        dataPokemon[5][0] = "chikorita";
        dataPokemon[5][1] = "bayleef";
    }

    public String getElemen() {
        return elemen;
    }
    
    public void evolve(){
        for (int i = 0; i < dataPokemon.length; i++) {
           if(dataPokemon[i][0].equals(this.nama)){
               this.nama = dataPokemon[i][1];
               isEvolve = true;
           }
        }
    }
    
    
    public void atraksi(){
        // lanjutin lagi Evolve
        if(isEvolve){
            System.out.println("Lunar Dance");
            return;
        }
        
        // lanjutin lagi ataksinya
        switch(this.elemen){
            case "api":
                System.out.println("Fire Dance");
                break;
             case "air":
                System.out.println("Water Blast");
                break;
             case "rumput":
                System.out.println("Frenzy Plant");
                break;
                 case "evolusi":
                System.out.println("Lunar Dance");
                break;
        }
    }
    
    
    
}
