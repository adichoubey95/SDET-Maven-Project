package testng.basicsoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfTestNg {

@Test
    public void demoOfTestNg(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.navigate().to("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.close();
    }
@Test
public void demoOfTestNg_1(){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();// upcasting
    driver.navigate().to("https://mvnrepository.com/");
    driver.manage().window().maximize();
    driver.close();
}
@Test
public void demoOfTestNg_2(){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();// upcasting
    driver.navigate().to("https://www.facebook.com/");
    driver.manage().window().maximize();
    driver.close();

}
}