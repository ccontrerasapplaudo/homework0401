import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.logging.LogManager;

public class MainClass {
    public static void main(String[] args) {

        // Setting up driver locations
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\carlo\\Desktop\\Selenium Jar and Drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\carlo\\Desktop\\Selenium Jar and Drivers\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\carlo\\Desktop\\Selenium Jar and Drivers\\msedgedriver.exe");

        LogManager.getLogManager().reset();

        //******************************* Exercise 1 *******************************


        // Implementing exercise 1 testing on Firefox
        System.out.println("\n***** Executing Exercise 1: *****\n");

        WebDriver firefoxDriver = new FirefoxDriver();
//        Exercise1 exercise1 = new Exercise1(firefoxDriver,"Firefox");
//        exercise1.browserStart("http://opencart.abstracta.us/index.php?route=common/home");
//        exercise1.verifyPageTitle("My Store");
//        exercise1.refreshPage();
//        exercise1.navigateTo("https://google.com.sv");
//        exercise1.returnHomePage();
//        exercise1.compareURL("http://opencart.abstracta.us/index.php?route=common/home");
//        exercise1.closeBrowser();

        System.out.println();

        // Implementing exercise 1 testing on google chrome
//        WebDriver chromeDriver = new ChromeDriver();
//        exercise1.setDriver(chromeDriver);
//        exercise1.setBrowserName("Chrome");
//        exercise1.browserStart("http://opencart.abstracta.us/index.php?route=common/home");
//        exercise1.verifyPageTitle("My Store");
//        exercise1.refreshPage();
//        exercise1.navigateTo("https://google.com.sv");
//        exercise1.returnHomePage();
//        exercise1.compareURL("http://opencart.abstracta.us/index.php?route=common/home");
//        exercise1.closeBrowser();

        System.out.println();

        // Implementing exercise 1 testing on microsoft edge
//        WebDriver edgeDriver = new EdgeDriver();
//        exercise1.setDriver(edgeDriver);
//        exercise1.setBrowserName("Edge");
//        exercise1.browserStart("http://opencart.abstracta.us/index.php?route=common/home");
//        exercise1.verifyPageTitle("My Store");
//        exercise1.refreshPage();
//        exercise1.navigateTo("https://google.com.sv");
//        exercise1.returnHomePage();
//        exercise1.compareURL("http://opencart.abstracta.us/index.php?route=common/home");
//        exercise1.closeBrowser();

        System.out.println("\n***** Exercise 1 Completed! *****\n");

        //******************************* Exercise 2 *******************************

        System.out.println("\n***** Executing Exercise 2: *****\n");

        Exercise2 exercise2 = new Exercise2(firefoxDriver,"Firefox");
        exercise2.browserStart("http://automationpractice.com/index.php");
        exercise2.findElementUsingText("BEST SELLERS");
        exercise2.findElementUsingXpath("//a[@class='blockbestsellers']");
        exercise2.findElementUsingCSS("a.blockbestsellers");
        exercise2.clickUsingXpath("//a[@class='blockbestsellers']");
        exercise2.findElementUsingID("block_top_menu");
        exercise2.extractTextUsingID("block_top_menu");
        exercise2.refreshPage();
        exercise2.firstUsingXpath("(//span[@class=\"price product-price\"])[1]");
        exercise2.lastUsingXpath("(//span[@class=\"price product-price\"])[last()]");
        exercise2.closeBrowser();

        System.out.println("\n***** Exercise 2 Completed! *****\n");

    }
}
