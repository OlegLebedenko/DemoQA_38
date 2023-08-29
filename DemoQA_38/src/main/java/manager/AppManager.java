package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public interface AppManager {

    WebDriver wd = new ChromeDriver();

    default void init(){
        wd.navigate().to("https://demoqa.com/");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
     default void tearDown(){

        //    wd.quit();
    }

}
