import PageMetods.DemoQaFrames;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VerifyFormHeadingTextTest extends DemoQaFrames {

    @BeforeEach
    public void setUp(){
        createDriver();
        getDriver().navigate().to("https://demoqa.com/frames");
    }
    @Test
    public  void test()
    {
       DemoQaFrames demoQaFrames = new DemoQaFrames();
       demoQaFrames.switchToIframe().verifyTextFormHeading();
    }
    @AfterEach
    public  void close(){
        quitDriver();
    }

}
