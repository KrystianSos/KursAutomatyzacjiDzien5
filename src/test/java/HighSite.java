import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class HighSite extends TestBase{

    @Test
    public void scrollDown(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("http://seleniumui.tc-sii.com/high-site.php");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }



}
