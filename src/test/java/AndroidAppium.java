import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidAppium {

   AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        // Created object of DesiredCapabilities class.
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "Galaxy S7");
        cap.setCapability("app", "/Users/arsensmorins/Downloads/ApiDemos-debug.apk");
//        cap.setCapability("appPackage", "io.appium.android.apis");
//        cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//        driver = new AndroidDriver(cap);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

//    @Test
//    public void firstTest() {
////        driver.findElement(By.id("Accessibility")).click();
//        WebElement access = driver.findElement(By.id("Accessibility"));
//        access.click();
//    }
}