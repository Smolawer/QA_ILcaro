package tests;

import manager.ApplicationManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import java.sql.Driver;

public class TestBase {
    static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setApp(){
        app.init();
    }
    public void tearDown(){
        app.stop();
    }


}
