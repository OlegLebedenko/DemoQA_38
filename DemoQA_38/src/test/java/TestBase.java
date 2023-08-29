import manager.AppManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class TestBase implements AppManager {

    @BeforeSuite
    public void setUp() {
        init();

    }

    @AfterSuite
    public void stop(){

        tearDown();
    }

}
