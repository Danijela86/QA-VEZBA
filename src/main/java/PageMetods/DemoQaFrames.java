package PageMetods;

import Core.BasePage;
import Core.Locators;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DemoQaFrames extends BasePage {
    private String getTextFromHeading(){
        waitForElementToBeVisible(By.xpath(Locators.FRAMESHEADING));
       return getElementText(By.xpath(Locators.FRAMESHEADING));
    }
    public DemoQaFrames verifyTextFormHeading(){
        Assertions.assertEquals("This is a sample page",
                getTextFromHeading(), "Heading text is not as expected");
        return this;
    }
    public DemoQaFrames switchToIframe(){
        getDriver().switchTo().frame("frame1");

        return  this;
    }
}
