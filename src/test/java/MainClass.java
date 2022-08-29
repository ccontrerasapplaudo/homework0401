import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MainClass {
    public static void main(String[] args) {

        // Setting up driver locations
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\carlo\\Desktop\\Selenium Jar and Drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\carlo\\Desktop\\Selenium Jar and Drivers\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\carlo\\Desktop\\Selenium Jar and Drivers\\msedgedriver.exe");


        //******************************* Exercise 1 *******************************

        // Create firefox webdriver
        WebDriver firefoxDriver = new FirefoxDriver();

        System.out.println("\n***** Executing Exercise 1: *****\n");

        //Create exercise1 object and sending firefoxDriver
        Exercise1 exercise1 = new Exercise1(firefoxDriver,"Firefox");
        //Starts the Firefox browser and navigates to http://opencart.abstracta.us/index.php?route=common/home
        exercise1.browserStart("http://opencart.abstracta.us/index.php?route=common/home");
        // Verifiying page title
        exercise1.verifyPageTitle("My Store");
        // Refresh page
        exercise1.refreshPage();
        // Navigate to google.com.sv
        exercise1.navigateTo("https://google.com.sv");
        // Return to home page
        exercise1.returnHomePage();
        // Compare actual URL with http://opencart.abstracta.us/index.php?route=common/home
        exercise1.compareURL("http://opencart.abstracta.us/index.php?route=common/home");
        // Closes the browser window
        exercise1.closeBrowser();

        System.out.println();

        // Implementing exercise 1 testing on google chrome
        WebDriver chromeDriver = new ChromeDriver();
        exercise1.setDriver(chromeDriver);
        exercise1.setBrowserName("Chrome");
        exercise1.browserStart("http://opencart.abstracta.us/index.php?route=common/home");
        exercise1.verifyPageTitle("My Store");
        exercise1.refreshPage();
        exercise1.navigateTo("https://google.com.sv");
        exercise1.returnHomePage();
        exercise1.compareURL("http://opencart.abstracta.us/index.php?route=common/home");
        exercise1.closeBrowser();

        System.out.println();

        // Implementing exercise 1 testing on microsoft edge
        WebDriver edgeDriver = new EdgeDriver();
        exercise1.setDriver(edgeDriver);
        exercise1.setBrowserName("Edge");
        exercise1.browserStart("http://opencart.abstracta.us/index.php?route=common/home");
        exercise1.verifyPageTitle("My Store");
        exercise1.refreshPage();
        exercise1.navigateTo("https://google.com.sv");
        exercise1.returnHomePage();
        exercise1.compareURL("http://opencart.abstracta.us/index.php?route=common/home");
        exercise1.closeBrowser();

        System.out.println("\n***** Exercise 1 Completed! *****\n");


        //******************************* Exercise 2 *******************************

    }
}
