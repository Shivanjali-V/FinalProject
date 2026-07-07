package pages;

import utilities.LocatorReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToUpcomingBikes(){
        String newBikes = LocatorReader.getNewBikes();
        WebElement ele = driver.findElement(By.xpath(newBikes));
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();

        String upcomingBikes = LocatorReader.getUpcomingBikes();
        WebElement ele2 = driver.findElement(By.linkText(upcomingBikes));
        ele2.click();
    }
}
