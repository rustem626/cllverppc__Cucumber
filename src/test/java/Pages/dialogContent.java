package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dialogContent extends parent {

    public dialogContent() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "")
    public WebElement username;

    @FindBy(css = "")
    private WebElement password ;

    @FindBy(id = "")
    private WebElement adress;


    public void findAndClick(String elementName) {

        switch (elementName) {
            case "username":
                WebElement myElement = username;
                break;

        }}
}
