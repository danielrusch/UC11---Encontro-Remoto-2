package teste.senai;

import java.sql.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCursoSenai {
	
	private WebDriver driver;
	
	@Before
	public void ConfigurarTeste () {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver() ;
		driver.manage().window().maximize();
	}
	@Test
	public void TesteNavegabilidade () {
		try {
		driver.get("http://localhost:4200/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("daniel@mail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("senha")).clear();
		driver.findElement(By.id("senha")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"botao-enviar\"]")).click();
		Thread.sleep(3000);	
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@After
	public void Fim () {
		driver.quit();
	}
}
