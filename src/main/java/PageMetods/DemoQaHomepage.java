package PageMetods;

import Core.Atributs;
import Core.BasePage;
import Core.Locator;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

public class DemoQaHomepage extends BasePage {


    public DemoQaElements clikOnElements(){

        clickOneElement(By.xpath(getLocator(Locator.DEMO_QA_SECTION, Atributs.DEMO_QA_ELEMENTS)));
        return new DemoQaElements();
    }
    public DemoQaHomepage clikOnForms(){

        clickOneElement(By.xpath(getLocator(Locator.DEMO_QA_SECTION, Atributs.DEMO_QA_FORMS)));
        return this;
    }


}
