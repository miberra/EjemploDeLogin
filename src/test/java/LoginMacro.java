import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

//import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.*;



public class LoginMacro<txtUser, txtUser1, WebElementFacade> {

	@Test
	public void ChromeDriverSeleniumTennis () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://172.31.219.52:8084/MacroIndividuosDesktop/#");
		driver.manage().window().maximize();
		driver.findElement(By.id("textField1")).click();
	    driver.findElement(By.id("textField1")).clear();
	    driver.findElement(By.id("textField1")).sendKeys("emiliano");
	    driver.findElement(By.xpath("//button[@id='processCustomerLogin']/div/span/p")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("login_textField1")).click();	   
	    driver.findElement(By.id("login_textField1")).clear();
	    driver.findElement(By.id("login_textField1")).sendKeys("rr225588");
	    driver.findElement(By.xpath("//*[@id=\"processSystem_UserLogin\"]/div/span/p")).click();
	    
	    Thread.sleep(4000);
	    
	    WebElement seccionNombreUsuario = driver.findElement(By.xpath("//*[@id=\"UserSessionHeaderWidgetContainer_htmlContent\"]/div/p[1]"));
	    
	    	System.out.println(seccionNombreUsuario.getAttribute("innerHTML"));
	    	
	    	assertEquals (seccionNombreUsuario.getText(), "Emiliano Javier Venta" );
    		
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	System.out.println("	                __    _____ _____ ____ _____   ____   _    ____  ____  _____ __\r\n" + 
	    			"	          _     \\ \\  |_   _| ____/ ___|_   _| |  _ \\ / \\  / ___|/ ___|| ____|\r\n" + 
	    			"	         (_)_____| |   | | |  _| \\___ \\ | |   | |_) / _ \\ \\___ \\\\___ \\|  _| | |\r\n" + 
	    			"	          _|_____| |   | | | |___ ___) || |   |  __/ ___ \\ ___) |___) | |___| |\r\n" + 
	    			"	         (_)     | |   |_| |_____|____/ |_|   |_| /_/   \\_\\____/|____/|_____|__\r\n" + 
	    			"	                /_/\r\n" + 
	    			"\r\n" + 
	    			"	        TEST PASSED: Login");
	    		    

	    			
	    			
	    			
	    			
	    			
	    			
	    		
	}
	    
	  

	      }
	    
	  

	