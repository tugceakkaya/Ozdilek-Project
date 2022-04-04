import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class LoginPageControl extends  BaseTest{
    @Step("xpath <xpath> li elementi bul ve <text> ini kontrol et")
    public void textiKontrolEt(String xpath, String text) {

        Assert.assertTrue("Element text değerini içermiyor",
                appiumDriver.findElementByXPath(xpath).getText().contains(text));
    }
}
