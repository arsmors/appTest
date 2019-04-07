import org.junit.Test;
import org.openqa.selenium.By;


public class Runner extends AndroidAppium {

    private final By dateWidgets = By.xpath("//android.widget.TextView[@content-desc=\"Date Widgets\"]");
    private final By inline = By.xpath("//android.widget.TextView[@content-desc=\"2. Inline\"]");

    public void clickNumber(String number){
        driver.findElement(By.id(number)).click();
    }


    @Test
    public void firstTest() {

        driver.findElement(By.id("Views")).click();
        driver.findElement(dateWidgets).click();
        driver.findElement(inline).click();
        clickNumber("9");
        clickNumber("45");
    }
}
