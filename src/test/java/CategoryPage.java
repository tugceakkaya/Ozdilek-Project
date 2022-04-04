import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CategoryPage extends BaseTest {


    @Step("Kategori menüsünü açabilmek için <xpath> li elemente tıkla")
    public void categoryPage(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();


    }



}