package BaseAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by funkoigame on 03/06/2017.
 */
public class BaseAuto {
     String m_linkOpen;
    public WebDriver mWebDriver;
    String srcFileChrome;

    public BaseAuto() {
        m_linkOpen = "https://mobile.facebook.com/reg/";
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        this.mWebDriver = new ChromeDriver() ;
    }

    public BaseAuto(String linkRegFace) {
        this.m_linkOpen = linkRegFace;
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        this.mWebDriver = new ChromeDriver();
    }

    public BaseAuto(String linkRegFace, String srcFileChorome) {
        this.m_linkOpen = linkRegFace;
        if (srcFileChorome != null) {
            this.srcFileChrome = srcFileChorome;
            System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        }
        this.mWebDriver = new ChromeDriver();
    }

    public void startOpenLink(String url) {
        mWebDriver.get(url);
    }

    public void openTab(String tab){
        mWebDriver.navigate().to(tab);
    }

    public void setClickButtonByName(String nameButton){
        WebElement e=mWebDriver.findElement(By.name(nameButton));
        e.click();
    }

    public void setClickByClass(String className){
        WebElement e=mWebDriver.findElement(By.className(className));
        e.click();
    }

    public void clickByValue(String value){
        WebElement bt = mWebDriver.findElement(By.cssSelector("input[value='"+value+"'"));
        bt.click();
    }
}
