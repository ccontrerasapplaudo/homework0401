
import org.openqa.selenium.WebDriver;
import java.lang.Thread;

public class Exercise1 {

    private WebDriver driver;
    private String browserName;

    public Exercise1(WebDriver driver, String browserName) {
        this.driver = driver;
        this.browserName = browserName;
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
        driver.manage().window().maximize();
        driver.get(webPage);
        codePause();
    }

    public void verifyPageTitle(String pageTitle){
        System.out.println(browserName+": Verifying page title");

        if(driver.getTitle().contains(pageTitle)){
            System.out.println(browserName+": The title is correct");
        }
        else{
            System.out.println(browserName+": The title is incorrect");
        }
        codePause();
    }

    public void refreshPage(){
        System.out.println(browserName+": Refresh page");
        driver.navigate().refresh();
        codePause();
    }

    public void returnHomePage(){
        System.out.println(browserName+": Returning to homepage");
        driver.navigate().back();
        codePause();
    }

    public void navigateTo(String navigatingTo){
        System.out.println(browserName+": Navigating to "+navigatingTo);
        driver.navigate().to(navigatingTo);
        codePause();
    }

    public void compareURL(String compareURL){
        System.out.println(browserName+": Comparing page URL");

        if(driver.getCurrentUrl().contains(compareURL)){
            System.out.println(browserName+": The URL's are the same");
        }
        else{
            System.out.println(browserName+": The URL's are not the same");
        }
        codePause();
    }

    public void closeBrowser(){
        codePause();
        driver.close();
    }

    public void codePause(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
