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

        System.out.println("Executing exercise 1: \n");
        // Create firefox webdriver
        WebDriver firefoxDriver = new FirefoxDriver();
        //Create exercise1 object and sending firefoxDriver
        Exercise1 exercise1 = new Exercise1(firefoxDriver,"Firefox");
        //Starts the Firefox browser and navigates to http://opencart.abstracta.us/index.php?route=common/home
        exercise1.browserStart("http://opencart.abstracta.us/index.php?route=common/home");
        System.out.println("\nExercise 1 Completed!\n");


        //******************************* Exercise 2 *******************************

    }
}
