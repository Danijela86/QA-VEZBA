import PageMetods.DemoQaHomepage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClicOnElemntsTestBoxTest extends DemoQaHomepage {
    @BeforeEach
    public void setUp(){
        createDriver();
        getDriver().navigate().to("https://demoqa.com");
    }
    @Test
    public void test(){
DemoQaHomepage demo= new DemoQaHomepage();
demo.clikOnElements().clickOnTextBox();
    }
    @AfterEach
    public void close() {quitDriver();}
}
