//package StepDefinations;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class LoginDemoSteps {
//	WebDriver driver= null;
//
//
//	@Given("Browser is open")
//	public void browser_is_open() {
//		String projectPath	= System.getProperty("user.dir");
//		System.out.println("project Path is: "+ projectPath);
//
//		System.out.println("Inside step - browser is open");
//		System.setProperty("webdriver.chrome.driver",projectPath+ "/src/test/resources/drivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().window().maximize();    
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//
//	}
//	@And("user clicks on login")
//	public void user_clicks_on_login() throws InterruptedException {
//		driver.findElement(By.id("login")).click();
//		Thread.sleep(2000);
//
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() {
//		driver.findElement(By.id("logout")).isDisplayed();
//		driver.close();
//		driver.quit();
//	}
//
//}
