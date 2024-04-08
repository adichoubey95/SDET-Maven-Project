package testng.parameterizaion;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfParameterization {
    @Test
    public void verifyCoursesOnGoogle(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.name("q"));
        element.sendKeys("selenium"+ "course");
        element.sendKeys(Keys.ENTER);
    }
}
