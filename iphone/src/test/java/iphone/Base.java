package iphone;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
@Test
public class Base {
	
	
		public  void getSimulator() throws IOException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus Simulator");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"13.5");
		cap.setCapability(MobileCapabilityType.UDID,"C8C3337A-0C3D-4C84-80DE-45455CBBEEB9");
		

cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		IOSDriver<IOSElement> dr=new IOSDriver<>(url,cap);
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.get("https://www.target.com");
dr.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("dress",Keys.ENTER);
System.out.println("this is title"+dr.getTitle());
String cUrl=dr.getCurrentUrl();
System.out.println("this is current url"+" "+cUrl);
Assert.assertEquals(cUrl,"https://www.target.com/s?searchTerm=dress");
System.out.println("this is my url");
Set<String>contexts=dr.getContextHandles();
for(String context:contexts) {
	System.out.println("my current context is"+" "+context);
}
dr.context("NATIVE_APP");
Dimension d=dr.manage().window().getSize();
int height=d.height/2;
int widht=d.width;
TouchActions t=new TouchActions(dr);
t.click(dr.findElement(By.id("")));
t.doubleTap(dr.findElement(By.id("")));


		
		
		
		
	}

}
