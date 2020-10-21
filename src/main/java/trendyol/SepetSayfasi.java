package trendyol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SepetSayfasi {

    /*

        Sepet için bir WEbElement döndürerek bulunacak alanları eşleştiriyoruz..
        findElement in className özelliği ile ilgili özel isimlerine göre eşleştiriyoruz.


     */

    private static WebElement element = null;

    public static WebElement counterBtn(WebDriver driver) {
        element = driver.findElement(By.className("ty-numeric-counter-button"));
        return element;
    }
    public static WebElement trashIcon(WebDriver driver) {
        element = driver.findElement(By.className("i-trash"));
        return element;
    }


}
