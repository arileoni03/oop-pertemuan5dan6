/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5dan6;

/**
 *
 * @author arile
 */
public class Pertemuan5dan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        manusia johan = new manusia("L");
        johan.warnakulit = "brown";
        johan.SetWarnaRambut("hitam");
        
        
        
        manusia leoni = new manusia("P");
        leoni.warnakulit = "brown";
        leoni.SetWarnaRambut("brown");
        
        
    }
    
}

class manusia{
    public String warnakulit="";
    //kalau private harus menambahkan public void, kalau public tidak perlu 
    private String warnarambut="";
    private String warnakuku="";
    private String jeniskelamin="";
    
    //constructor (boleh ada boleh tidak)
    public manusia(String jkel){
        this.jeniskelamin = jkel;
    }
    
    
    public void SetWarnaRambut(String warna){
    //menambahkan kode identifikasi
    this.warnarambut = warna;
    }
    
    
    
    
}
