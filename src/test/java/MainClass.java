import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MainClass {
    public static void main(String[] args) {

        // Setting up driver locations
        System.setProperty("webdriver.chrome.driver","C:\\Users\\carlo\\Desktop\\Selenium Jar and Drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\carlo\\Desktop\\Selenium Jar and Drivers\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver","C:\\Users\\carlo\\Desktop\\Selenium Jar and Drivers\\msedgedriver.exe");

        // Testing code with firefox browser
        // Create firefox webdriver
        WebDriver firefoxDriver = new FirefoxDriver();
        // Maximize windows
        firefoxDriver.manage().window().maximize();
        // Navigate to google.com
        firefoxDriver.get("https://google.com");
        // Get webpage title
        System.out.println(firefoxDriver.getTitle());
        // Get webpage URL
        System.out.println(firefoxDriver.getCurrentUrl());
        // Navigate to yahoo.com
        firefoxDriver.navigate().to("http://yahoo.com");
        // Navigate back to google.com
        firefoxDriver.navigate().back();
        //Navigate back to yahoo.com
        firefoxDriver.navigate().forward();

        // Close all firefox instances
        firefoxDriver.quit();

        // Perform testing with chrome webdriver code
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://google.com");
        chromeDriver.quit();

        // Perform testing with edge webdriver code
        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().window().maximize();
        edgeDriver.get("https://google.com");
        edgeDriver.close();
    }
}
