import java.util.Scanner;

public class findnumbers{
    public static void main(String[] args) {
        int[] sayilar = new int[5];
        Scanner dizi= new Scanner(System.in);
        System.out.println("Beş elemanlı bir dizi oluşturunuz.");
        for(int i=0 ;i<sayilar.length ;i++){
            sayilar[i]= dizi.nextInt();
        }
        Scanner alinanSayi= new Scanner(System.in);
        System.out.println("Diğer kullanıcı dizide olup olmadığını kontrol etmek istediği sayıyı girsin lütfen.");
        int aranacakSayi= alinanSayi.nextInt();
        boolean varMi= false;

        for(int sayi : sayilar){
            if(sayi==aranacakSayi){
                varMi= true;
                break;
            }
        }
        if(varMi==true){
            System.out.println("Girilen değer dizide mevcuttur.");
        }
        else{
            System.out.println("Girilen değer dizide mevcut değildir.");
        }
    }
}