package PageMetods;

import Core.Atributs;
import Core.BasePage;
import Core.Locator;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

import java.util.jar.Attributes;

public class DemoQaElements extends BasePage {
    public DemoQaElements clickOnTextBox() {
        clickOneElement(By.xpath(getLocator(Locator.SPAN_ELEMENT_BY_TEXT, Atributs.DEMO_QA_ELEMENTS_TEXT_BOX)));
        return new DemoQaElements();
    }

    public DemoQaElements verifyElementsListVisible() {
        Assert.isTrue(isElementVisible(By.xpath(Locator.ELEMENT_LIST_SHOW)), "Element list is not visible");
        return this;

    }
}
