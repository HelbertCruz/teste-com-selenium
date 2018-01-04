package teste2017_2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testando {

	private static WebDriver driver;

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("file:///C:/Users/User/eclipse-workspace/Teste%20com%20selenium/WebContent/NewFile.html");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

	@Test
	public void fazerLoginTest() {

		driver.findElement(By.id("nome")).sendKeys("Helbert");
		driver.findElement(By.id("sobrenome")).sendKeys("Cruz");
		driver.findElement(By.id("enviar")).click();

		String textoDoAlert = driver.switchTo().alert().getText();

		assertEquals("Olá Helbert Cruz", textoDoAlert);
	}
}
