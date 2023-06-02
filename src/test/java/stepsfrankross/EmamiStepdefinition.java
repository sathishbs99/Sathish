package stepsfrankross;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EmamiStepdefinition {
	WebDriver driver = new ChromeDriver();
	
	
	@Given("Open the Chrome and launch the application")
	public void open_the_chrome_and_launch_the_application() {
		
		driver.manage().window().maximize();
		driver.get("http://emami-web-staging.mobinius.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));	
	}
	

	@Given("Click the Login button")
	public void click_the_login_button() {
		 
		 
		WebElement Login = driver.findElement(By.xpath("//div[@class=\"log-reg-btn\"]"));
    	Login.click();
        System.out.println("Click the Login button");
     }

	@When("Enter the Mobile number {string}")
	public void enter_the_mobile_number(String number) {
		
	   
		
		WebElement Mobilenumber = driver.findElement(By.xpath("//input[@id='input_0']"));
		Mobilenumber.sendKeys(number);
      WebElement Loginbutton = driver.findElement(By.xpath("//div[@class='login-btn']"));
		Loginbutton.click();
		System.out.println("Enter the Mobile number");
	
		}

	

	@When("Enter the OTP {string}")
	public void enter_the_otp(String OTP) {
		
		

		WebElement Otp = driver.findElement(By.xpath("//input[@id='input_1']"));
		Otp.sendKeys(OTP);
		WebElement Continue = driver.findElement(By.xpath("//button[@class='md-raised md-green medium full md-button md-ink-ripple']"));
		Continue.click();
		System.out.println("Enter the OTP");
		

	}
	@And("Login should be success")
	public void login_should_be_success() {
    System.out.println("Login should be success");
		 
	}
	@When("Click the Deleiver to")
	public void click_the_deleiver_to() throws InterruptedException  {
		Thread.sleep(2000);
		
	   WebElement Deleiverto= driver.findElement(By.xpath("//div[@ng-click='selectAddress($event)']"));
	   Deleiverto.click();
	   System.out.println("Click the Deleiver to");
	 
	}
	


	@When("Enter the Pincode")
	public void enter_the_pincode() {
		
		WebElement Pincode= driver.findElement(By.xpath("//input[@ng-model='pincode']"));
		Pincode.sendKeys("700046");
		System.out.println("Enter the Pincode");
	}


	@When("Click the Check button")
	public void click_the_check_button() {
		
		WebElement checkbutton = driver.findElement(By.xpath("//button[@class='md-raised md-green medium add md-button md-ink-ripple']"));
		checkbutton.click();
		System.out.println("Click the Check button");
	}


	@When("Click the Search box and search the product")
	public void click_the_search_box_and_search_the_product() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		Searchbox.click();
		WebElement Variantid = driver.findElement(By.xpath("//input[@type='text']"));
		Variantid.sendKeys("21410");
		WebElement Search = driver.findElement(By.xpath("//button[@name=\"search\"]"));
		Search.click();
		System.out.println("Click the Search box and search the product");
	}

	@When("Adding a quantity")
	public void adding_a_quantity() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Quantity = driver.findElement(By.xpath("//input[@class='minus']"));
		Quantity.click();
		WebElement Cartbutton =driver.findElement(By.xpath("//button[@class='md-raised md-green smedium addtocatr md-button md-ink-ripple']"));
		Cartbutton.click();
		System.out.println("Adding a quantity");
	}
	
	@When("Click the cart icon")
	public void click_the_cart_icon() throws InterruptedException {
		Thread.sleep(3000);
	WebElement Carticon= driver.findElement(By.xpath("//*[@id=\"bodyfr\"]/div[2]/fr-header/div[2]/div/div[3]/fr-cart/span/a/div/span"));
	Carticon.click();
 
	}

	@Then("Click the Proceed button in cart")
	public void click_the_proceed_button_in_cart() {
		WebElement Proceedbutton = driver.findElement(By.xpath("//*[@id=\"bodyfr\"]/div[2]/div[2]/div/div/div[2]/span[1]/div[2]/div[2]/div/button"));
		Proceedbutton.click();
   
	}

	@Then("Select the address and Deleivery slot")
	public void select_the_address_and_deleivery_slot() throws InterruptedException {
		WebElement AddressSelection = driver.findElement(By.cssSelector("md-radio-button[value=\"346071\"]"));
		AddressSelection.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,700)", "");
	    WebElement DeleiverySlot = driver.findElement(By.xpath("//*[@id=\"radio_13\"]"));
	    DeleiverySlot.click();
		Thread.sleep(2000);
		WebElement Continuebutton =driver.findElement(By.xpath("//button[@class='md-raised md-green large conitnue-btn md-button md-ink-ripple']"));
		Continuebutton.click();

	}

	@Then("click the Pay on Deleivery")
	public void click_the_pay_on_deleivery() throws InterruptedException {
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"bodyfr\"]/div[2]/div[2]/div/div/div[3]/div[2]/div[1]/div/span/md-checkbox/div[1]")).click();
		
	}

	@Then("Click the confirm order")
	public void click_the_confirm_order() throws InterruptedException {
		//Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		
//		WebElement Walletcheckbox = driver.findElement(By.cssSelector("md-checkbox[class='md-primary ng-pristine ng-untouched ng-valid ng-not-empty md-checked']"));
//		Walletcheckbox.click();

		WebElement ConfirmOrder = driver.findElement(By.xpath("//button[@class=\"md-raised md-green large full placeorder md-button md-ink-ripple\"]"));
		ConfirmOrder.click();
	}

	@Then("Payment is successfull")
	public void payment_is_successfull() {
	System.out.println("Payment is successfull");
  
	}


	    
	    
    //Entering the pincode		
//	@When("Click the Deleiver to")
//	public void click_the_deleiver_to() throws InterruptedException {
//		
//		WebElement Deleiverto= driver.findElement(By.xpath("//div[@class=\"srch-text ng-scope\"]"));
//	Deleiverto.click();
//	System.out.println("Click the Deleiver to");
//	 
//	}
//	
//
//
//	@When("Enter the Pincode")
//	public void enter_the_pincode() {
//		
//		WebElement Pincode= driver.findElement(By.xpath("//input[@ng-model='pincode']"));
//		Pincode.sendKeys("700049");
//		System.out.println("Enter the Pincode");
//	}
//
//
//	@When("Click the Check button")
//	public void click_the_check_button() {
//		
//		WebElement checkbutton = driver.findElement(By.xpath("//button[@class='md-raised md-green medium add md-button md-ink-ripple']"));
//		checkbutton.click();
//		System.out.println("Click the Check button");
//	}
//
//
    //Adding product to cart	
//	@When("Click the Search box and search the product")
//	public void click_the_search_box_and_search_the_product() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='text']")).click();
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("26784");
//		driver.findElement(By.xpath("//button[@name=\"search\"]")).click();
//		System.out.println("Click the Search box and search the product");
//	}
//
//	@When("Adding a quantity")
//	public void adding_a_quantity() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@class='minus']")).click();
//		driver.findElement(By.xpath("//button[@class='md-raised md-green smedium addtocatr md-button md-ink-ripple']")).click();
//		System.out.println("Adding a quantity");
//	}
//	@Then("check the product stock")
//	public void check_the_product_stock() {
//		System.out.println("Out of stock");
//		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    try {
//	    	FileUtils.copyFile(screenshot,new File("D:\\Cucumber\\shot1.png"));
//	    	}catch(IOException e) {
//	    	System.out.println(e.getMessage());
//	    
//}
//	}	
    //	Background 
//	@Given("before myscenario")
//	public void before_myscenario() {
//	   System.out.println("before myscenario");
//	}
//	@When("i open browser")
//	public void i_open_browser() {
//	   System.out.println("i open browser");
//	}
	
	//Negative scenario
//	@Given("Open the Chrome and launch the application")
//	public void open_the_chrome_and_launch_the_application() {
//		driver.manage().window().maximize();
//		driver.get("http://emami-web-staging.mobinius.net/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));		
//	}
//	@When("Click the Login button")
//	public void click_the_login_button() {
//		WebElement Login = driver.findElement(By.xpath("//div[@class=\"log-reg-btn\"]"));
//    	Login.click();
//     System.out.println("Click the Login button");
//	}
//	@When("Enter the Mobile number {string}")
//	public void enter_the_mobile_number(String string) {
//		 WebElement Mobilenumber = driver.findElement(By.xpath("//input[@id='input_0']"));
//			Mobilenumber.sendKeys(string);
//		
//			WebElement Loginbutton = driver.findElement(By.xpath("//div[@class='login-btn']"));
//		Loginbutton.click();
//		System.out.println("Enter the Mobile number");
//	}
//	@When("Enter the OTP {string}")
//	public void enter_the_otp(String string) {
//		WebElement Otp = driver.findElement(By.xpath("//input[@id='input_1']"));
//		Otp.sendKeys(string);
//		WebElement Continue = driver.findElement(By.xpath("//button[@class='md-raised md-green medium full md-button md-ink-ripple']"));
//		Continue.click();
//		System.out.println("Enter the OTP");
//	}
//	@When("user entered wrong OTP")
//	public void user_entered_wrong_otp() {
//		System.out.println("user entered wrong OTP");
//	}
//	@When("login must be unsuccessfull")
//	public void login_must_be_unsuccessfull() {
//		System.out.println("login must be unsuccessfull"); 
//	}
//

	//Adding product into cart and placing COD payment

//	@Given("Open the Chrome and launch the application")
//	public void open_the_chrome_and_launch_the_application() {
//		driver.manage().window().maximize();
//		driver.get("http://emami-web-staging.mobinius.net/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));	
//	}
//
//	@Given("Click the Login button")
//	public void click_the_login_button() {
//		WebElement Login = driver.findElement(By.xpath("//div[@class=\"log-reg-btn\"]"));
//    	Login.click();   
//	}
//
//	@When("Enter the Mobile number {string}")
//	public void enter_the_mobile_number(String string) {
//      WebElement Mobilenumber = driver.findElement(By.xpath("//input[@id='input_0']"));
//	  Mobilenumber.sendKeys(string);
//	
//	  WebElement Loginbutton = driver.findElement(By.xpath("//div[@class='login-btn']"));
//	Loginbutton.click();  
//	}
//
//	@When("Enter the OTP {string}")
//	public void enter_the_otp(String string) {
//		WebElement Otp = driver.findElement(By.xpath("//input[@id='input_1']"));
//		Otp.sendKeys(string);
//		WebElement Continue = driver.findElement(By.xpath("//button[@class='md-raised md-green medium full md-button md-ink-ripple']"));
//		Continue.click(); 
//	}
//
//	@When("Login should be success")
//	public void login_should_be_success() {
//	    
//	}
//
//	@When("Click the Deleiver to")
//	public void click_the_deleiver_to() {
//		WebElement Deleiverto= driver.findElement(By.xpath("//div[@class=\"srch-text ng-scope\"]"));
//		Deleiverto.click();  
//	}
//
//	@When("Enter the Pincode")
//	public void enter_the_pincode() {
//		WebElement Pincode= driver.findElement(By.xpath("//input[@ng-model='pincode']"));
//		Pincode.sendKeys("700049");
//	}
//
//	@When("Click the Check button")
//	public void click_the_check_button() {
//		WebElement checkbutton = driver.findElement(By.xpath("//button[@class='md-raised md-green medium add md-button md-ink-ripple']"));
//		checkbutton.click();  
//	}
//
//	@When("Click the Search box and search the product")
//	public void click_the_search_box_and_search_the_product() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='text']")).click();
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("26784");
//		driver.findElement(By.xpath("//button[@name=\"search\"]")).click();
//	}
//
//	@When("Adding a quantity")
//	public void adding_a_quantity() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@class='minus']")).click();
//		driver.findElement(By.xpath("//button[@class='md-raised md-green smedium addtocatr md-button md-ink-ripple']")).click();  
//	}

//	@When("Click the cart icon")
//	public void click_the_cart_icon() {
//		driver.findElement(By.xpath("//*[@id=\"bodyfr\"]/div[2]/fr-header/div[2]/div/div[3]/fr-cart/span/a/div/span")).click();
//
//	}
//
//	@Then("Click the Proceed button in cart")
//	public void click_the_proceed_button_in_cart() {
//		driver.findElement(By.xpath("//*[@id=\"bodyfr\"]/div[2]/div[2]/div/div/div[2]/span[1]/div[2]/div[2]/div/button")).click();
//
//	}
//
//	@Then("Select the address and Deleivery slot")
//	public void select_the_address_and_deleivery_slot() {
//		driver.findElement(By.cssSelector("md-radio-button[value='345891']")).click();
//		driver.findElement(By.cssSelector("md-radio-button[value=\"830104\"]")).click();
//
//  	}
//
//	@Then("click the Pay on Deleivery")
//	public void click_the_pay_on_deleivery() throws InterruptedException {
//		driver.findElement(By.xpath("//button[@class='md-raised md-green large conitnue-btn md-button md-ink-ripple']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"bodyfr\"]/div[2]/div[2]/div/div/div[3]/div[2]/div[1]/div/span/md-checkbox/div[1]")).click();
//		
//
//	}
//
//	@Then("Click the confirm order")
//	public void click_the_confirm_order() throws InterruptedException {
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)", "");
//		//driver.findElement(By.cssSelector("md-radio-button[value='cod']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class=\"md-raised md-green large full placeorder md-button md-ink-ripple\"]")).click();
//	}
//
//	@Then("Payment is successfull")
//	public void payment_is_successfull() {
//	    System.out.println("Payment is successfull");
//	}
//	@Given("before myscenario")
//	public void before_myscenario() {
//	   
//	}
//
//	@When("i open browser")
//	public void i_open_browser() {
//	    
//	}

}





