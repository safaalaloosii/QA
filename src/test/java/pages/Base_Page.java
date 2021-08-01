package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Base_Page {


    public Base_Page () {
        PageFactory.initElements(Driver.getDriver(), this);

    }
        @FindBy(id = "username")
        public WebElement usernameInput;


    @FindBy(id = "password")
    public WebElement passwordInput;



    }



