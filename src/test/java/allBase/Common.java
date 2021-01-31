package allBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import io.appium.java_client.MobileElement;

public class Common {
    AppiumDriver<AndroidElement> dr;



    public void com() {
       MobileElement ele= dr.findElement(By.id(""));
       Thread.sleep(3000);
 
}
}