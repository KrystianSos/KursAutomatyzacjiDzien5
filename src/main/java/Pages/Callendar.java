package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Callendar {

    public Callendar(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "datepicker")
    private WebElement datepicker;

    public void datePicker(){
        datepicker.click();
    }



}
