
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.lang.Thread;

public class Exercise1 {

    private WebDriver driver;
    private String browserName;

    public Exercise1(WebDriver driver, String browserName) {
        this.driver = driver;
        this.browserName = browserName;
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public void browserStart(String webPage){
        System.out.println(browserName+": Navigating to page "+webPage);
        driver.get(webPage);
        codePause();
    }

    public void codePause(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
