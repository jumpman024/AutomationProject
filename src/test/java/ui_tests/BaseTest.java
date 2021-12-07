package ui_tests;

import driver_manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver = DriverManager.getDriver();



    @BeforeTest
        void setupTest() {
//        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

//        this.mainPage = new webPages.MainPage(this.driver);


    }


    @AfterTest
    public void kill(){
        driver.close();
        driver.quit();
    }
}
