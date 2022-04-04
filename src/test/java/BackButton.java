import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class BackButton extends BaseTest{


    @Step("id <id> li elemente tıkla")
    public static void clickByid(String id) {
        appiumDriver.findElement(By.id(id)).click();
    }
}
