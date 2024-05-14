package PageMetods;

import Core.Atributes;
import Core.BasePage;
import Core.Locators;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DemoQaElements extends BasePage {
    public DemoQaElements clickOnTextBox() {
        clickOneElement(By.xpath(getLocator(Locators.SPAN_ELEMENT_BY_TEXT, Atributes.DEMO_QA_ELEMENTS_TEXT_BOX)));
        return new DemoQaElements();
    }

    public DemoQaElements verifyElementsListVisible() {
        Assert.isTrue(isElementVisible(By.xpath(Locators.ELEMENT_LIST_SHOW)), "Element list is not visible");
        return this;

    }

    public DemoQaElements verifyElementsMenuOptionsCount(){
        Assertions.assertEquals(6, getElementCount("//li[@class='btn btn-light ']//ancestor::div[@class='element-group']//div[text()='Elements']"), "Number of options is elements menu is not as expected");

        return this;
    }
}
