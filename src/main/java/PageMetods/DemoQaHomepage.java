package PageMetods;

import Core.Atributes;
import Core.BasePage;
import Core.Locators;
import org.openqa.selenium.By;

public class DemoQaHomepage extends BasePage {


    public DemoQaElements clikOnElements(){

        clickOneElement(By.xpath(getLocator(Locators.DEMO_QA_SECTION, Atributes.DEMO_QA_ELEMENTS)));
        return new DemoQaElements();
    }
    public DemoQaHomepage clikOnForms(){

        clickOneElement(By.xpath(getLocator(Locators.DEMO_QA_SECTION, Atributes.DEMO_QA_FORMS)));
        return this;
    }


}
