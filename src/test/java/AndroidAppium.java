import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidAppium {

   AppiumDriver<MobileElement> driver;
   String path;

    @Before
    public void setUp() throws MalformedURLException {
        path = System.getProperty("user.dir");
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "Galaxy S7");
        cap.setCapability("app", path+"//app//app.apk");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
}