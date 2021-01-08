package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void abreNavegdor(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.lourencodemonaco.com.br/vvtest/");
        wait = new WebDriverWait(driver, 15);

    }


    public static void fechaNavegador(){
        driver.quit();
    }


    public static WebElement waitVisibleElement(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitInvisibilityElement(By by){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static WebElement waitClicableElement(By by){
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

}
