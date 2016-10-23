public class Main {
    //Deisknelerde ayni degiskene birden fazla deger
    //versenizde ayni degiskene verdiginiz 1den fazla degerin her zaman
    //sonuncusu dikkate alinir ve hesaplama yapilir

    public static void main(String[] args) {

        double pisayisi = 3.14, yaricap = 5.71;
        int alan = 0;
        alan = (int) (pisayisi * yaricap * yaricap);//Farkli tip degiskenlerde islem yapilirsa cast yapilmak zorunda!!!
        //Cast yapma farkli tipleri birbirine cevirir.
        System.out.println("Dairenin Alani: " + alan + "\n");
//----------------------------------------------------------------------------------------------------------------------
        //Karakter Degisken Tipleri
        char karakter1, karakter2;
        karakter1 = 89;
        karakter2 = 'c';
        System.out.println("Karakter 1: " + karakter1);
        System.out.println("Karakter 2: " + karakter2);
        //Karakterlerde matematiksel islemlerde yapabiliriz.
        System.out.println("Sonuc: " +karakter1*karakter2 + "\n");
//----------------------------------------------------------------------------------------------------------------------
        //boolean Degisken Tipi
        boolean degisken = true;
        System.out.println(degisken);
        boolean degisken2 = false;
        System.out.println(degisken2);
//----------------------------------------------------------------------------------------------------------------------
        //Programin icinden dinamik deger verme
        int sayi1 = 14, sayi2 = 53;
        float sayi3;
        double sayi4,sayi5;
        sayi4 = sayi1 + 5.71;
        System.out.println("\nSayi 4 Sonuc: " + sayi4);
        sayi3 = (float) Math.sqrt(sayi2+sayi1);
        System.out.println("Sayi 3 Sonuc: " + sayi3);
        sayi5 = Math.sqrt(sayi2+sayi1);//Kucuk degiskeni buyuk degiskenin icine atabiliyoruz
        System.out.println("Sayi5 Sonuc: " + sayi5 + "\n");
//----------------------------------------------------------------------------------------------------------------------
        //Tip Donusumleri
        //buyuk degiskeni kucuk degiskene koyarsak data kaybi olur
        //yanlis cevap donderir
        //byte sayi_1;
        //int sayi_2;
        //float sayi_3 = 15.17f;
        //double sayi_4 = 192.3;
        //sayi_1 = (byte)sayi_2;
        //System.out.println("Int byte tipipine dondu" + sayi_1);
        //sayi_1 = (byte)sayi_3;
        //System.out.println("Float byte tipipine dondu" + sayi_1);
        //sayi_1 = (byte)sayi_4;
        //System.out.println("Double byte tipipine dondu" + sayi_1);
//----------------------------------------------------------------------------------------------------------------------
    }
}
