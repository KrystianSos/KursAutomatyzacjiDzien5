import Pages.FormPage;
import org.testng.annotations.Test;

import java.io.File;

public class FormPoTest extends TestBase {

    @Test
    public void newFormTest() {
        driver.get("http://seleniumui.tc-sii.com/form.php");
        FormPage formPage = new FormPage(driver);
        formPage.setFirstName("jan");
        formPage.setLastName("kowalski");
        formPage.setSexRadioButtons(1);
        formPage.setAge("18");
        formPage.setEmail("kowalski@kowalski.pl");
        formPage.setGridExperience(1);
        formPage.setGridProfession(0);
        formPage.setContinents(2);
        formPage.setCommands(1);
        formPage.setAddInfo("Extra info");
        File file = new File("src\\main\\resources\\emptyFile.txt");
        formPage.addFile(file.getAbsolutePath());
        formPage.submit();
        formPage.assertValidatorMessage("Form send with success");
    }
}
