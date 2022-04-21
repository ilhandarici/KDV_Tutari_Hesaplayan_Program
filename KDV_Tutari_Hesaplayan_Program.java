package KDVTutariHesaplayanProgram;
import java.util.Scanner;
public class KDV_Tutari_Hesaplayan_Program {

    public static void main(String[] args) {
        // Scanner sisteme ekleniyor.
        Scanner input = new Scanner(System.in);
        //Değişkenler ekleniyor.
        double tutar, kdv, toplam;
        // Kullanıcıdan veri alınıyor.
        try{
        System.out.print("Lütfen KDV'si hesaplanacak tutarı giriniz : ");
        tutar = input.nextDouble();
        }finally{
            input.close();
        }
        // Matematiksel işlemler yapılıyor.
        kdv = tutar * 0.18;
        toplam = tutar + kdv;
        // Çıktı vererek ekrana yazdırılıyor.
        System.out.println("KDV'siz fiyat : "+tutar);
        System.out.println("KDV'li fiyat : "+toplam);
        System.out.println("KDV tutarı : "+kdv);



    }
}