import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

import javax.lang.model.element.Element;

public class BasePage extends  BaseTest{


    @Step("<time> saniye kadar bekle")
    public static void waitForseconds(int time) throws InterruptedException {
        Thread.sleep(1000*time);
    }




    @Step("Alışverişe başla <id> li elemente tıkla")
    public static void clickByid(String id) {
        appiumDriver.findElement(By.id(id)).click();
    }
}
