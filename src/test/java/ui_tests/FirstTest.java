package ui_tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webPages.MainPage;

public class FirstTest extends BaseTest {

    private final MainPage mainPage = new MainPage(driver);




    @Test()
    public void testTShirtPrice() {
        driver.get("http://automationpractice.com/index.php");
        mainPage.openTshirtTab()
                .addTShirtToCard()
                .proceedToCheckout();

        String actualResult = mainPage.checkPrice();
        String expectedResult = "$18.51";

            Assert.assertEquals(expectedResult,actualResult);

    }

}
