import org.testng.annotations.Test;
import Pages.FormPage;

public class FormPoTest extends TestBase {

    @Test
    public void newFormTest(){
        driver.get("http://seleniumui.tc-sii.com/form.php");
        FormPage formPage = new FormPage(driver);
        formPage.setFirstName("jan");
    }
}
