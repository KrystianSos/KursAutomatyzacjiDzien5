import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class IframesTest extends TestBase {
    /*
    Test steps:

    Switch to first iframe and fill form
    Switch to second iframe and fill form
    Switch to main frame and click on 'Basic' button in main menu
    */
    @Test
    public void iframeTest() {
        driver.get("http://seleniumui.tc-sii.com/iframes.php");

        //przełącznik do frame
        driver.switchTo().frame("iframe1");

        driver.findElement(By.id("inputFirstName3")).sendKeys("Marian");
        driver.findElement(By.id("inputSurname3")).sendKeys("Marianowski");

        //przełącznik do głównego okna
        driver.switchTo().defaultContent();

        //przełącznik do frame
        driver.switchTo().frame("iframe2");

        driver.findElement(By.id("inputLogin")).sendKeys("marian123");
        driver.findElement(By.id("inputPassword")).sendKeys("123marian");
        driver.findElement(By.id("inlineFormCustomSelectPref")).click();

        //Wybór z listy
        WebElement continentsElement =driver.findElement(By.id("inlineFormCustomSelectPref"));
        Select continentSelect = new Select(continentsElement);
        continentSelect.selectByValue("africa");

        driver.findElement(By.id("gridRadios4")).click();

        //przełącznik do głównego okna
        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//div[@class=('container')]/ul/li/a")).click();
        //inny xpath(po tekscie): //a[contains(text(),'Basic')]



    }
}
