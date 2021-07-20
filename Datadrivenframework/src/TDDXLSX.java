import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TDDXLSX {

	public static void login (String un ,String pwd) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		driver.getTitle();
		if (driver.getTitle().equals("Adactin.com - Search Hotel")) {
			System.out.println("Login passed");
		}
		else {
			System.out.println("login is failed");
		}
		

	}

}
