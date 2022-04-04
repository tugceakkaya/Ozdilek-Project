import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class Login extends BaseTest{

    @Step("id <id> li elementi bul ve <text> değerini yaz")
    public void sendkeysByid(String id, String text) {
        appiumDriver.findElement(By.id(id)).sendKeys(text);


    }

}
