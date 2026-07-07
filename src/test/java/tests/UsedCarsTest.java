package tests;

import baseTest.DriverSetupTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.UsedCarsPage;
import java.util.ArrayList;
import java.util.List;

public class UsedCarsTest extends DriverSetupTest {
    List<WebElement> carList = new ArrayList<WebElement>();

    @Test()
    public void navToUsedCarsPage(){
        UsedCarsPage ucp = new UsedCarsPage(driver);
        ucp.navigateToUsedCars();
    }

    @Test(dependsOnMethods = "navToUsedCarsPage")
    public void selectLocation() throws InterruptedException {
        UsedCarsPage ucp = new UsedCarsPage(driver);
        ucp.selectLocation();
    }

    @Test(dependsOnMethods = "selectLocation")
    public void scrollToPopularModels() throws InterruptedException {
        UsedCarsPage ucp = new UsedCarsPage(driver);
        ucp.scrollToPopularModels();
    }

    @Test(dependsOnMethods = "scrollToPopularModels")
    public void selectAllModels() throws InterruptedException {
        UsedCarsPage ucp = new UsedCarsPage(driver);
        ucp.selectAllOptions();
    }

    @Test(dependsOnMethods = "selectAllModels")
    public void getCarList() throws InterruptedException {
        UsedCarsPage ucp = new UsedCarsPage(driver);
        carList = ucp.getCarList();
    }

}
