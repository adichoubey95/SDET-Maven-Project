package testng.parameterizaion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class NormalDataProviderAnnotation {

    @DataProvider(name="testData")
    public Object[][] testDataWithDataProvider(){
        return new Object[][]{
                {"selenium","pune"},{"python", "mumbai"},{"java","nashik"}
        };
    }
    @Test(dataProvider = "testData")
    public void coursesOnGoogle(String coursename, String cityname) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(coursename+" "+ cityname);
        element.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }

}

