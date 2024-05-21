import PageMetods.DemoQaBrowserWindow;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClickBrowserWindowNewTabTest extends DemoQaBrowserWindow {

    @BeforeEach
    public void setUp() {
        createDriver();
        getDriver().navigate().to("https://demoqa.com/browser-windows");
    }

    @Test
    public void test() {
        DemoQaBrowserWindow demoQaBrowserWindow = new DemoQaBrowserWindow();
        demoQaBrowserWindow.clickNewWindow().switchToNewlyOpenedWindow().verifyTextFormHeading();

    }

    @AfterEach
    public void close() {
        quitDriver();
    }
}
