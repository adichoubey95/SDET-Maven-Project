package testng.parameterizaion;

import com.google.common.collect.Table;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {
    @DataProvider(name="testData")
    public Object[][] testDataWithDataProvider() throws IOException {
        Object[][] arryObj=getDataFromExcel("C:\\Users\\admin\\Desktop\\DataProvider.xlsx","TestCase1");
        return arryObj;
    }
    public String[][] getDataFromExcel(String filepath, String sheetName) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(filepath);//file name access
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);// Excel file access
        XSSFSheet sheet=workbook.getSheet(sheetName);// sheetname access
        XSSFRow row= sheet.getRow(0);
        int noOfRows=sheet.getPhysicalNumberOfRows();// defining no of rows
        int noOfColoumn=row.getLastCellNum();
        Cell cell;
        String [][] data=new String[noOfRows-1][noOfColoumn];
        for(int i=1;i<noOfRows;i++){
            for(int j=1;j<noOfColoumn;j++){
                row=sheet.getRow(i);
                cell=row.getCell(j);
                data[i-1][j]= cell.getStringCellValue();
            }
        }
        return data;
    }
    @Test(dataProvider = "testData")
    public void coursesOnGoogle(String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(courseName+" "+ cityName);
        element.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }

}
