package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends Properties {





    protected void  clickOneElement (By locator) {
        Properties.getDriver().findElement(locator).click();
    }
        protected void waitForElementToBeVisible(By locator) {
            WebDriverWait wait = new WebDriverWait(Properties.getDriver(), Duration.ofSeconds(7));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));


        }
        protected void typeText(String text, By locator) {
        waitForElementToBeVisible(locator);  //da se prvo saceka da postane vidljiv
          Properties.getDriver().findElement(locator).sendKeys(text);
        }
    protected String getElementText(By locator){
        waitForElementToBeVisible(locator);
        return Properties.getDriver().findElement(locator).getText();
    }


    protected String getLocator(String locator, String arg) {
        return locator.replace("%ARG%", arg);
    }

    protected boolean isElementVisible(By locator) {
        boolean isVisible = true;
        try{
            waitForElementToBeVisible(locator);
        } catch (Exception e){
            isVisible=false;
        }
        return isVisible;
    }

    }



