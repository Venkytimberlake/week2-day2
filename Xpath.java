package selen2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement eleUser = driver.findElement(By.xpath("//input[@id='username']"));
		eleUser.sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();

		driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Integra");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("V");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Venkatesh");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Pondicherry");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.findElement(By.id("viewLead_statusId_sp")).getText());
	}

}
