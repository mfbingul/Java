/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyp_odev;
import java.util.Random;
/**
 *
 * @author Muhammet Furkan Bingül
 */
public class SıcaklıkAlgılayıcı {
   
    //singleton için gereken fonksiyonun tanımı.
    private static SıcaklıkAlgılayıcı sıcaklık = new SıcaklıkAlgılayıcı();

    public static SıcaklıkAlgılayıcı getSıcaklık(){
        
        return sıcaklık;
    
    }
  public void sıcaklıkUret(){
      //random bir şekilde sıcaklık üretiliyor.
      
      Random rsıc=new Random(); //random sınıfı
      
      //0 ile 32 arasında random bir sayı üretiliyor.
      int sıcaklık = rsıc.nextInt(33);
    
      System.out.println("Şu anki sıcaklık : " + sıcaklık); 
     
  }
    
    
}
