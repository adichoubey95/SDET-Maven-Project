package testng.basicsoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();// upcasting
    }
    @Test
    public void demoOfTestNg(){
        driver.navigate().to("https://www.abhibus.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void demoOfTestNg_1(){
        driver.navigate().to("https://mvnrepository.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
