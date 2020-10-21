package trendyol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AramaSayfasi {

    /*

        Ürünlerimizi aramak için bir WEbElement döndürerek bulunacak alanları eşleştiriyoruz..
        findElement in className özelliği ile ilgili özel isimlerine göre eşleştiriyoruz.


     */

    private static WebElement element = null;

    public static WebElement aramaKutusu(WebDriver driver) {
        element = driver.findElement(By.className("search-box"));
        return element;
    }
    public static WebElement UrunEklemeBtn(WebDriver driver) {
        element = driver.findElement(By.className("pr-in-btn add-to-bs"));
        return element;
    }
    public static WebElement SepetIcn(WebDriver driver) {
        element = driver.findElement(By.className("icon navigation-icon-basket"));
        return element;
    }



}
