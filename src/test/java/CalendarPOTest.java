import Pages.Callendar;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class CalendarPOTest extends TestBase{

    // tablica miesięcy dzięki której możemy porównać który miesiąc jest wcześniejszy/późniejszy
    private List<String> allMonths =
            Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");


    @Test
    public void mainPage(){
        driver.get("http://seleniumui.tc-sii.com/datepicker.php");
        Callendar callendar = new Callendar(driver);
        callendar.datePicker();

    }

}
