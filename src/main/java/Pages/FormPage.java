package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.util.List;

public class FormPage {
    public FormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "inputFirstName3")
    private WebElement firstName;

    @FindBy(id = "inputLastName3")
    private WebElement lastName;

    @FindBy(name = "gridRadiosSex")
    private List<WebElement> sexRadioButtons;

    @FindBy(id = "inputEmail3")
    private WebElement email;

    @FindBy(id = "inputAge3")
    private WebElement age;

    @FindBy(name = "gridRadiosExperience")
    private List<WebElement> gridExperience;

    @FindBy(name = "gridCheckboxProfession")
    private List<WebElement> gridProfession;

    @FindBy(id = "selectContinents")
    private WebElement continents;

    @FindBy(xpath = "//div//select[@class='custom-select']")
    private WebElement commands;

    @FindBy(id = "additionalInformations")
    private WebElement addInfo;

    @FindBy(id = "chooseFile")
    private WebElement addFile;

    @FindBy(css = "button[type='submit']")
    private WebElement submit;

    @FindBy(id = "validator-message")
    private WebElement validatorMessage;

    public void assertValidatorMessage(String message) {
        Assert.assertEquals(validatorMessage.getText(), message);
    }

    public void submit(){
        submit.click();
    }

    public void addFile(String path){
        addFile.sendKeys(path);
    }

    public void setAddInfo(String info) {
        addInfo.sendKeys(info);
    }

    public void setCommands(int id) {
        Select commandsSelect = new Select(commands);
        commandsSelect.selectByIndex(id);
    }

    public void setContinents(int id) {
        Select continentSelect = new Select(continents);
        continentSelect.selectByIndex(id);
    }

    public void setFirstName(String name) {
        firstName.sendKeys(name);
    }

    public void setLastName(String name) {
        lastName.sendKeys(name);
    }

    public void setSexRadioButtons(int id) {
        sexRadioButtons.get(id).click();
    }

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void setAge(String age) {
        this.age.sendKeys(age);
    }

    public void setGridExperience(int id) {
        this.gridExperience.get(id).click();
    }

    public void setGridProfession(int id) {
        this.gridProfession.get(id).click();
    }




}