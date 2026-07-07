package tests;

import baseTest.DriverSetupTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ScreenShotUtil;

import java.io.IOException;

public class LoginTest extends DriverSetupTest {

    @Test()
    public void clickLoginIcon(){
        LoginPage lt = new LoginPage(driver);
        lt.clickLoginIcon();
    }

    @Test(dependsOnMethods = "clickLoginIcon")
    public void clickGoogleBtn() throws InterruptedException {
        LoginPage lt = new LoginPage(driver);
        lt.clickGoogleBtn();
    }

    @Test(dependsOnMethods = "clickGoogleBtn")
    public void switchToGoogleWindow() throws InterruptedException {
        LoginPage lt = new LoginPage(driver);
        lt.switchToGoogleWindow();
    }

    @Test(dependsOnMethods = "switchToGoogleWindow")
    public void checkWindowHeading(){
        LoginPage lt = new LoginPage(driver);
        lt.checkWindowHeading();
    }

    @Test(dependsOnMethods = "checkWindowHeading")
    public void clickNextBtn(){
        LoginPage lt = new LoginPage(driver);
        lt.clickNextBtn();
    }

    @Test(dependsOnMethods = "clickNextBtn")
    public void takeScreenShot() throws IOException {
        ScreenShotUtil sc = new ScreenShotUtil(driver);
        sc.takeScreenShot();
    }

}
