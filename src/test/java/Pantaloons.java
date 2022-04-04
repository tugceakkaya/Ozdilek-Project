import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class Pantaloons extends  BaseTest {

    @Step("Pantolon kategorisinin ait <xpath> e tıkla")
    public void clickByXpath(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();


    }

}
