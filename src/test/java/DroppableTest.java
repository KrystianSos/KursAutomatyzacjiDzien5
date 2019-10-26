import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DroppableTest extends TestBase {

    /*
    Test steps:

       drag 'Drag me to my target' square and drop it in 'Drop here' area
       check if "Dropped!" text appeared

    */
    @Test
    public void droppableTest() {
        driver.get("http://seleniumui.tc-sii.com/droppable.php");
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(By.id("draggable")))
                .moveToElement(driver.findElement(By.id("droppable")))
                .release()
                .perform();

        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='droppable']/p")).getText(), "Dropped!");

    }

    @Test
    public void droppableTest2() {
        driver.get("http://seleniumui.tc-sii.com/droppable.php");
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")))
                .perform();


        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='droppable']/p")).getText(), "Dropped!");

    }

}