package testng.parameterizaion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample2 {
    WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void preRequisite(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }/* else if (browserName.equalsIgnoreCase("firefox")) {

        } else if (browserName.equalsIgnoreCase("edge")) {

        }*/ else {
            System.out.println("select the correct browser");
        }

    }
    @Parameters({"coursename", "cityname"})
    @Test
    public void verifyCoursesOnGoogle(String coursename, String cityname) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(coursename + cityname);
        element.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
    @AfterMethod
    public void postRequisite() {
        driver.close();
    }
}
