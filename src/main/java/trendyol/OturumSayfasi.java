package trendyol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OturumSayfasi {

    /*

        Trendyol'da oturum açmak için bir WEbElement döndürerek bulunacak alanları eşleştiriyoruz..
        findElement in id özelliği ile ilgili özel isimlerine göre eşleştiriyoruz.


     */

    private static WebElement element = null;

    public static WebElement KullaniciGiris(WebDriver driver) {
        element = driver.findElement(By.id("login-panel-container"));
        return element;
    }

    public static WebElement emailKutusu(WebDriver driver) {
        element = driver.findElement(By.id("login-email"));
        return element;
    }
    public static WebElement SifreKutusu(WebDriver driver) {
        element = driver.findElement(By.id("login-password-input"));
        return element;
    }
    public static WebElement Girisbtn(WebDriver driver) {
        element = driver.findElement(By.className("q-primary q-fluid q-button-medium q-button submit"));
        return element;
    }

}
