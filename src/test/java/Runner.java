import io.appium.java_client.AppiumDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Runner extends AndroidAppium{

    @Test
    public void firstTest() {
//        driver.findElement(By.id("Accessibility")).click();
        WebElement access = driver.findElement(By.id("Accessibility"));
        access.click();
    }
}
