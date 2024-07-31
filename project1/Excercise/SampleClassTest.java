package Excercise;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SampleClassTest {
	@Test
	public void createInvoiceTest() throws Throwable 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle,"hi");
		driver.quit();
	}

}
