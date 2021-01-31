package allBase;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class Base {


    public AppiumDriver<AndroidElement> openBrowser()throws  InterruptedException, MalformedURLException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"");
        Thread.sleep(2000);
        URL url=new URL("");
        File file=new File("","");
        AppiumDriver<AndroidElement>driver=new AndroidDriver<AndroidElement>(url,cap);
        return driver;


    }
}
