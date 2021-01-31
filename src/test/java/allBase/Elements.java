package allBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import java.io.IOException;

import java.io.File;
import java.net.MalformedURLException;

public class Elements {
    public void ele()throws InterruptedException, MalformedURLException {
        Base b=new Base();
       AppiumDriver driver= b.openBrowser();
       Thread.sleep(4000);
        File file=new File("");
        Actions ac=new Actions(driver);
      WebElement e= driver.findElement(By.xpath(""));
      // WebElement ele=driver.findElements(By.xpath(""));
        ac.moveToElement(driver.findElement(By.xpath("")));
        ac.moveToElement(e);
        File file2=new File("");





    }

}
