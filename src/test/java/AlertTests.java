import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase {

    @BeforeMethod
    public void openAlertPage() {
        driver.navigate().to(" http://seleniumui.tc-sii.com/alerts.php");
    }

    /*
    Test steps:

    Click on 'Simple Alert' button
    Click 'OK' button on alert
    Check that "OK button pressed" text has been shown
    */
    @Test
    public void simpleAlert() {
        driver.findElement(By.id("simple-alert")).click();
        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.findElement(By.id("simple-alert-label")).getText(), "OK button pressed");
            }
    /*
    Test steps:

    Click on 'Prompt Pop up' button
    Type "Lord Vader" in alert text box
    Click 'OK' button on alert
    Check that "Hello Lord Vader! How are you today?" text has been shown
    */
    @Test
    public void promptAlert() {

        driver.findElement(By.id("prompt-alert")).click();
        driver.switchTo().alert().sendKeys("Lord Vader");
        driver.switchTo().alert().accept();
        String assertMessage = driver.findElement(By.id("prompt-label")).getText();
        Assert.assertEquals(assertMessage, "Hello Lord Vader! How are you today?");
    }

    /*
    Test steps:

    Cick on 'Confirm Pop up' button
    Click 'OK' button on alert
    Check that "You pressed OK!" has been shown
    Click again on 'Confirm Pop up' button
    Click 'Anuluj' button on alert
    Check that "You pressed Cancel!" text has been shown
    */
    @Test
    public void confirmAlert() {

        driver.findElement(By.id("confirm-alert")).click();
        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.findElement(By.id("confirm-label")).getText(), "You pressed OK!");
        driver.findElement(By.id("confirm-alert")).click();
        driver.switchTo().alert().dismiss();
        Assert.assertEquals(driver.findElement(By.id("confirm-label")).getText(), "You pressed Cancel!");


    }
}
