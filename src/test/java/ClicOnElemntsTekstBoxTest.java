import PageMetods.DemoQaElements;
import PageMetods.DemoQaHomepage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClicOnElemntsTekstBoxTest extends DemoQaHomepage {
    @BeforeEach
    public void setUp(){
        createDriver();
        getDriver().navigate().to("https://demoqa.com");
    }
    @Test
    public void test(){
        DemoQaHomepage demo= new DemoQaHomepage();
        DemoQaElements demoQaElements = demo.clikOnElements();
        demoQaElements.clickOnTextBox();
    }
    @AfterEach
    public void close() {
        quitDriver();
    }
}
