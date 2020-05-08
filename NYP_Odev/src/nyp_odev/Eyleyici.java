/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyp_odev;

/**
 *
 * @author Muhammet Furkan Bingül
 */
public class Eyleyici {
    
//singleton için gereken fonksiyonun tanımı.
   private static Eyleyici eylem = new Eyleyici();
    
    public static Eyleyici getEylem(){
        
        return eylem;
    
    }
    
  //sistemin açıldığını bildiren fonksiyon.
    public void sistemiAc(){
        
         System.out.println("SOĞUTUCU SİSTEM AÇILDI!");      
    }
    
    //sistemin kapatıldığını bildiren foksiyon.
    public void sistemiKapa(){
        
         System.out.println("SOĞUTUCU SİSTEM KAPATILDI!");      
    }
}
