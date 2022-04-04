import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class FavoriButtons extends BaseTest{
    @Step("xpath <xpath> li elemente tıkla")
    public void clickByXpath(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();


    }

}
