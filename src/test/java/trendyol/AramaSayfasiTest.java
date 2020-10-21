package trendyol;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AramaSayfasiTest {

    /*

        İlk önce bir driver oluşturarak okuma işlemlerini yaptırıyoruz. Ardından main() fonksiyonunda tanımladığımız
        fonksiyonu ve diğer class'lardaki fonksiyonları çalıştırıyoruz. TrendyolUrunEkleme() adında fonksiyon tanımlayıp
        try-catch ile ürünü arama ve sepete ekleme kontrolünü gerçekleştiriyoruz. Catch ile de oluşan hatayı
        bildirtiyoruz.

     */


    private static WebDriver driver = null;
    @Before
    public static void main(String[] args) {

        OturumSayfasiTest.TrendyolOturumAcma();

        TrendyolUrunEkleme();

    }
    @Test
    public static void TrendyolUrunEkleme() {

        try {
            AramaSayfasi.aramaKutusu(driver).sendKeys("bilgisayar");

            AramaSayfasi.UrunEklemeBtn(driver).click();

            AramaSayfasi.SepetIcn(driver).click();

            System.out.println("Sepete ekleme islemi basarılı.");

        }
        catch(Exception e){

            System.out.println("Sepete ekleme islemi başarısız.");
        }


    }



}
