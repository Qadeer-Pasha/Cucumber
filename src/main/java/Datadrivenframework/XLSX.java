package Datadrivenframework;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XLSX {
	
	public void login(String un ,String pwd) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/");
		 driver.findElement(By.name("username")).sendKeys(un);
		 driver.findElement(By.name("password")).sendKeys(pwd);
		 driver.findElement(By.id("login")).click();
	}

}
