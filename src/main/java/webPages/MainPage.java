package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MainPage {

    private WebDriver driver;


    private final By tShirtsButton = By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a");
    private final By addTshirt = By.xpath("//*[text()='Add to cart']");
    private final By proceedToCheckout = By.xpath("//*[@title='Proceed to checkout']");
    private final By priceIndicator = By.xpath("//*[@id='total_price']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage openTshirtTab() {
        this.driver.findElement(tShirtsButton).click();
        return this;
    }

    public MainPage addTShirtToCard(){
        Actions action = new Actions(driver);
        WebElement a = driver.findElement(By.xpath("//li[contains(@class,'ajax_block_product')]"));
        action.moveToElement(a).build().perform();
        this.driver.findElement(addTshirt).click();
        return this;
    }

    public MainPage proceedToCheckout() {
        this.driver.findElement(proceedToCheckout).click();
        return this;
    }

    public String checkPrice() {
        return  this.driver.findElement(priceIndicator).getText();
    }

}
