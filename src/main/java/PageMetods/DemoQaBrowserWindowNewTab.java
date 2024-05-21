package PageMetods;

import Core.BasePage;
import Core.Locators;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DemoQaBrowserWindowNewTab extends BasePage {
    public  DemoQaBrowserWindowNewTab swtchToNewlyOpenTab() {
        switchToNewWindow();
        return this;
    }


        private String getTextFromHeading(){
            waitForElementToBeVisible(By.xpath(Locators.HEADER_SAMPLE_PAGE));
            return getElementText(By.xpath(Locators.HEADER_SAMPLE_PAGE));
        }
        public DemoQaBrowserWindowNewTab verifyTextFormHeading(){
            Assertions.assertEquals("This is a sample page",
                    getTextFromHeading(), "Heading text is not as expected");
            return this;
        }

}


