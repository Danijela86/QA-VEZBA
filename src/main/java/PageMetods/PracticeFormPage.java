package PageMetods;

import Core.Atributes;
import Core.BasePage;
import Core.Locators;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.util.jar.Attributes;

public class PracticeFormPage extends BasePage {
    public PracticeFormPage typeFirstName(String textToType) {
        typeText(textToType, By.xpath(getLocator(Locators.INPUT_BY_ID, Atributes.PRACTICE_FORM_FIRST_NAME)));
        return this;
    }
    public PracticeFormPage typelastName(String textToType) {
        typeText(textToType, By.xpath(getLocator(Locators.INPUT_BY_ID, Atributes.PRACTICE_FORM_FIRST_NAME)));
        return this;
    }

    public PracticeFormPage typeEmail(String textToType) {
        typeText(textToType, By.xpath(getLocator(Locators.INPUT_BY_ID, Atributes.PRACTICE_FORM_FIRST_NAME)));
        return this;
    }
    public PracticeFormPage verifyFirstName(String expectedName) {
        Assertions.assertEquals(expectedName, getElementText(By.xpath(getLocator(Locators.INPUT_BY_ID, Atributes.PRACTICE_FORM_FIRST_NAME))),"tEXT IV FIRST NAME INPUT FIELD IS NOT AS EXPEXT");
        return this;}
    public PracticeFormPage verifyLastName(String expectedLastName) {
        Assertions.assertEquals(expectedLastName, getElementText(By.xpath(getLocator(Locators.INPUT_BY_ID, Atributes.PRACTICE_FORM_LAST_NAME))),"tEXT IV FIRST NAME INPUT FIELD IS NOT AS EXPEXT");
        return this;
    }
    public PracticeFormPage verifyUserEmail(String expectedUserEmail) {
        Assertions.assertEquals(expectedUserEmail, getElementText(By.xpath(getLocator(Locators.INPUT_BY_ID, Atributes.PRACTICE_FORM_EMAIL))),"tEXT IV FIRST NAME INPUT FIELD IS NOT AS EXPEXT");
        return this;}
}
