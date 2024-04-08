package testng.parameterizaion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
@Parameters({"coursename","cityname"})
    @Test
    public void verifyCoursesOnGoogle(String courseName,String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.name("q"));
        element.sendKeys(courseName+ cityName);
        element.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
}}
