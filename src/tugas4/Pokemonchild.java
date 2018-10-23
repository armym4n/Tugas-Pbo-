package tugas4;

public class Pokemonchild extends Pokemon{
    
    private String[][] dataPokemon = new String[1][2]; // ganti size sesuai pokemon
    private String[] ataraksiColl = new String[2]; // ganti size sesuai atraksi
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
            System.out.println("Atraksi Evolve");
            return;
        }
        
        // lanjutin lagi ataksinya
        switch(this.elemen){
            case "api":
                System.out.println("Atraksi Api");
                break;
        }
    }
    
    
    
}
