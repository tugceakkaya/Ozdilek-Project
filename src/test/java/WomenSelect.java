import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class WomenSelect extends  BaseTest{


    @Step("Kadın menüsünün üzerine gelip ona ait <xpath> li elemente tıkla")
    public void clickByXpath(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();


    }
}
