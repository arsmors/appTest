import org.junit.Test;
import org.openqa.selenium.By;


public class Runner extends AndroidAppium {

    private final By dateWidgets = By.xpath("//android.widget.TextView[@content-desc=\"Date Widgets\"]");
    private final By inline = By.xpath("//android.widget.TextView[@content-desc=\"2. Inline\"]");

    @Test
    public void firstTest() {

        driver.findElement(By.id("Views")).click();
        driver.findElement(dateWidgets).click();
        driver.findElement(inline).click();
        driver.findElement(By.id("9")).click();
        driver.findElement(By.id("45")).click();

//        List<WebElement> listItems = driver.findElements(LIST);
//        for (int i = 0; i < listItems.size(); i++) {
//            if (listItems.get(i).getText().equals("Views")) {
//                listItems.get(i).click();
//                break;
//            }
//        }
    }
}
