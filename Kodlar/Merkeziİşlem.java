/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyp_odev;
import java.util.Scanner;

/**
 *
 * @author Muhammet Furkan Bingül
 */
public class Merkeziİşlem {


    public static void main(String[] args) {
       //kullanıcının girdiği seçimi tutan değişkenimiz.
        int secim = 0;
       //Kullanıcının girdiği değerlerin atandığı değişkenler.
        String Sifre;
        String Kullaniciadi;
        
        //Singleton metoduna göre sınıflarımızın fonksiyonlarını kullanacağımız kod satırları.
        SıcaklıkAlgılayıcı sıcaklık = SıcaklıkAlgılayıcı.getSıcaklık();
        Eyleyici eylem = Eyleyici.getEylem();
        DBsorgu sorgu = DBsorgu.getSorgu();
        
        Scanner KA = new Scanner(System.in);
        Scanner SF = new Scanner(System.in);
        
        //Kullanıcıdan değer aldığımız kısım.
        System.out.println("Kullanici Adi :");
        Kullaniciadi = KA.next();
        System.out.println("Sifre :");
        Sifre = SF.next();
        
        //Sql bilgilerini aldığımız kısım.
        sorgu.sqlSorgu();
        
        //Girilen değerlerle sql dekileri karşılaştırdığımız fonksiyonu çağırıyoruz.
          sorgu.sorgulama(Kullaniciadi,Sifre);    
        //menümüzü ekrana yazdırıyoruz uygulamadan çıkılmasını istenmediği sürece dönen bir döngü içerisinde.
        while (secim != 4){
        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz...");
        System.out.println("1 => Sıcaklık Göster");
        System.out.println("2 => Soğutucuyu Kapa");
        System.out.println("3 => Soğutucuyu Aç");
        System.out.println("4 => Uygulamadan Çıkış \n");
        
        //kullanıcının seçimini uygulamamız için kullanıcıdan seçim için girdi alıyoruz.
        Scanner giris = new Scanner(System.in);
        secim=giris.nextInt();
        
        //kullanıcının seçeneğine göre uygulamamızın işlemi uygulaması için switch case e giriyor.
        switch (secim) {
        case 1 :
            
            //kullancıcı sıcaklık değerini görmek istediğinde sıcaklık algılayıcı sınıfındaki random sıcaklık üreten fonksiyonumuzu çağırıyoruz.
            sıcaklık.sıcaklıkUret();
            break;

        case 2 :
            //Sistemi kapatmak istediğimizde eyleyici sınıfındaki ekrana bildirimi yazdıran fonksiyonumuzu çağırıyoruz.
            eylem.sistemiKapa();
           break;

        case 3 :
            //Sistemi açmak istediğimiz zaman eyleyici sınıfındaki açtığımıza dair bildirimi yazdıran fonksiyonu çağırıyoruz.
            eylem.sistemiAc();
            break;
            
        case 4 :
            //Kullanıcı uygulamadan çıkamak istediğinde uygulamamızı kapatıyoruz.
            System.exit(0);
            break;

        default :
            //eğer menü ışında bir değer girilirse hata mesajı yazdırıyoruz.
            System.out.println("Hatali secim! 1, 2 ya da 3'e basiniz.");
            break;
        }
        }

    }
    
    
}
