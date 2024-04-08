package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void FacebookLogin(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        WebElement element=driver.findElement(By.name("login"));
        Assert.assertEquals(title,"Facebook – log in or sign up","Facebook tittle should be match");
        Assert.assertTrue(element.isEnabled(),"element should be enable");
        driver.close();

    }

}
