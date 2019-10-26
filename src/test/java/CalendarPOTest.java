import Pages.Callendar;
import org.testng.annotations.Test;

public class CalendarPOTest extends TestBase{

    @Test
    public void mainPage(){
        driver.get("http://seleniumui.tc-sii.com/datepicker.php");
        Callendar callendar = new Callendar(driver);
        callendar.datePicker();
    }

}
