package trendyol;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OturumSayfasiTest {

    /*

        İlk önce bir driver oluşturarak okuma işlemlerini yaptırıyoruz. Ardından main() fonksiyonunda tanımladığımız
        fonksiyonu çalıştırıyoruz. TrendyolOturumAcma() adında fonksiyon tanımlayıp try-catch ile login olma işlemlerinin
        kontrolünü gerçekleştiriyoruz. Catch ile de oluşan hatayı bildirtiyoruz. Chrome Browser'ı açmak için ise
        chreomedriver.exe ekleyerek path'ini tanımlıyoruz.

     */

    private static WebDriver driver = null;
    @Before
    public static void main(String[] args) {

        TrendyolOturumAcma();
    }
    @Test
    public static void TrendyolOturumAcma() {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://trendyol.com/");

        try {
            OturumSayfasi.KullaniciGiris(driver).click();

            OturumSayfasi.emailKutusu(driver).sendKeys("deneme438@hotmail.com");

            OturumSayfasi.SifreKutusu(driver).sendKeys("123456Aa");

            OturumSayfasi.Girisbtn(driver).click();

            System.out.println("Giriş işlemi basarılı.");

        } catch (Exception e) {

            System.out.println("Giris Sağlanamadı.");

        }




    }



}
