package trendyol;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SepetSayfasiTest {

    /*

        İlk önce bir driver oluşturarak okuma işlemlerini yaptırıyoruz. Ardından main() fonksiyonunda tanımladığımız
        fonksiyonu ve diğer class'lardaki fonksiyonları çalıştırıyoruz. TrendyolSepetIslemleri() adında fonksiyon
        tanımlayıp try-catch ile sepette ki kontrolünü gerçekleştiriyoruz.


     */

    private static WebDriver driver = null;
    @Before
    public static void main(String[] args) {

        OturumSayfasiTest.TrendyolOturumAcma();

        AramaSayfasiTest.TrendyolUrunEkleme();

        TrendyolSepetIslemleri();
    }
    @Test
    public static void TrendyolSepetIslemleri() {

        try {
            SepetSayfasi.counterBtn(driver).click();

            SepetSayfasi.trashIcon(driver).click();

            System.out.println("Sepet İşlemi Başarılı.");

        }
        catch(Exception e){

            System.out.println("Sepet İslemi Başarısız.");

        }
    }


}
