import Pages.FormPage;
import org.testng.annotations.Test;

import java.io.File;

public class FormPoTest extends TestBase {

    @Test
    public void newFormTest() {
        driver.get("http://seleniumui.tc-sii.com/form.php");
        File file = new File("src\\main\\resources\\emptyFile.txt");
        FormPage formPage = new FormPage(driver);
        formPage.setFirstName("jan")
                .setLastName("kowalski")
                .setSexRadioButtons(1)
                .setAge("18")
                .setEmail("kowalski@kowalski.pl")
                .setGridExperience(1)
                .setGridProfession(0)
                .setContinents(2)
                .setCommands(1)
                .setAddInfo("Extra info")
                .addFile(file.getAbsolutePath())
                .submit()
                .assertValidatorMessage("Form send with success");
    }
}
