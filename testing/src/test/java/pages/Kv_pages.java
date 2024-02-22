package pages;

import java.awt.RenderingHints.Key;
import java.io.IOException;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;



public class Kv_pages {
	WebDriver driver;
	
	//=======HOMEPAGE(click)=======================
	By logo = By.xpath("//*[@id=\"img_comp-kwkjx4lm\"]/img");
	By home =By.xpath("//*[@id=\"comp-kwkjy33c0label\"]");
	By about1 =By.xpath("//*[@id=\"comp-kwkjy33c1label\"]");
	By department1=By.xpath("//*[@id=\"comp-kwkjy33c2label\"]");
	By hospitals1 =By.xpath("//*[@id=\"comp-kwkjy33c3label\"]");
	By shop1 =By.xpath("//*[@id=\"comp-kwkjy33c4label\"]");
	By careers1 = By.xpath("//*[@id=\"comp-kwkjy33c5label\"]");
	By contact1 = By.xpath("//*[@id=\"comp-kwkjy33c6label\"]");
	By search1 = By.xpath("//*[@id=\"input_search-box-input-comp-kwrljbel\"]");
	By searchbutton1 = By.xpath("//*[@id=\"comp-kwrljbel\"]/div/div/form/div/button");
	By cart1 =By.xpath("/html/body/div[1]/div/div[3]/div/header/div/div[2]/div/div/div[1]/section[2]/div[2]/div[3]/div[2]/div/div[2]/div/a/div/svg");
    By signin1 = By.xpath("//*[@id=\"comp-kwxgdni1\"]/button/span");
    By emailclick = By.xpath("//*[@id=\"switchToEmailLink_SM_ROOT_COMP774\"]");
    By emailval = By.id("input_input_emailInput_SM_ROOT_COMP774");
    By passval = By.id("input_input_passwordInput_SM_ROOT_COMP774");
    By signupbtn = By.xpath("//*[@id=\"okButton_SM_ROOT_COMP774\"]/button");
    
    
 //======SELECT THE FAST MOVING PRODUCT FROM HOMEPAGE=============   
    By product1 =By.xpath("//*[@id=\"comp-kwkgui3q\"]/div/div/div/div/div[2]/div/div/div[7]/div/div/div/div/div/div[1]/a/div/div/div[1]/h3");
    By select1 = By.xpath("//*[@id=\"TPAMultiSection_kwkgu7e9\"]/div/div/article/div[1]/section[2]/div[6]/div[1]/div/div[1]/div/div[2]/div/div/div/div");
//    By measurement =By.xpath("//*[@id=\"dropdown-options-container_-4_option-2\"]/div/div");
    By navigateleft = By.xpath("//*[@id=\"comp-kwkgui3q\"]/div/div/div/div/div[1]/button");
    
    
 //======CHECKING THE DEPARTMENTS IN HOMEPAGE==============
    By pharmadivision =By.xpath("//*[@id=\"comp-kwrhtwz71\"]/p/a/span/span/span/span");
    By herbaldivision =By.xpath("//*[@id=\"comp-kwrhtwze1\"]/p/a");
    By rd1 =By.xpath("//*[@id=\"comp-kwrhtwzl\"]/p/a");
    
    
 //========POLICIES====================   
    By mobnum1 = By.xpath("//*[@id=\"comp-kwrgil82\"]/p[2]/span/span/span/a");
    By refund =By.xpath("//*[@id=\"comp-kwrgl1cy\"]/p[1]/a");
    By privacy =By.xpath("//*[@id=\"comp-kwrgl1cy\"]/p[2]/a");
    By shipping =By.xpath("//*[@id=\"comp-kwrgl1cy\"]/p[3]/a");
    By cancellation =By.xpath("//*[@id=\"comp-kwrgl1cy\"]/p[4]/a");
    By terms = By.xpath("//*[@id=\"comp-kwrgl1cy\"]/p[5]/a");
    
    
 //========QUICKLINKS=================   
    By prasavam = By.xpath("//*[@id=\"comp-kwrgm2qb\"]/p[1]/span/span/span/a");
    By jobopen = By.xpath("//*[@id=\"comp-kwrgm2qb\"]/p[2]/a");
    By balancesheets =By.xpath("//*[@id=\"comp-kwrgm2qb\"]/p[4]/span/span/a");
    
    
 //========BUY PRODUCTS==============   
    By shopnow = By.xpath("//*[@id=\"comp-ll3b6eyl\"]/p[1]/a");
    By coupons = By.xpath("//*[@id=\"comp-ll3b6eyl\"]/p[2]/span/span/span/a");
    
    
 //========SOCIAL MEDIA==============
    By fb =By.xpath("//*[@id=\"dataItem-kwrgqgm1-comp-kwrgqgl0\"]/a");
    By insta = By.xpath("//*[@id=\"dataItem-kwrgqgm01-comp-kwrgqgl0\"]/a");
    By whatsapp = By.xpath("//*[@id=\"dataItem-kwrgydyo-comp-kwrgqgl0\"]/a");
    By twitter =By.xpath("//*[@id=\"dataItem-kwrgqgm12-comp-kwrgqgl0\"]/a");
    By linkedin = By.xpath("//*[@id=\"dataItem-kwrgqgm14-comp-kwrgqgl0\"]/a");
    By youtube =By.xpath("//*[@id=\"dataItem-kwrgqgm16-comp-kwrgqgl0\"]/a");
    By pinintrest =By.xpath("//*[@id=\"dataItem-kwrgydyp-comp-kwrgqgl0\"]/a");
    By whatsapp1=By.xpath("//*[@id=\"comp-ky2nkyv5\"]/a");
    By textmesg =By.xpath("//*[@id=\"minimized-chat\"]/svg/path");
    By txtclose = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/button");
    
    
 //===========SHOP(Taskbar)==============
    By searchprdct= By.xpath("//*[@id=\"input_search-box-input-comp-l6yifowl\"]");
    By searcheladi= By.xpath("//*[@id=\"comp-l6yifowl\"]/div/div[2]/div/div[2]/div/div[2]");
    By selectpacking= By.xpath("//*[@id=\"label-for-id_-2\"]");	
//    By quantity = By.xpath("//*[@id=\"dropdown-options-container_-10_option-1\"]/div");
    By patent1 =By.xpath("//*[@id=\"comp-kye98ai9__item-kye9k2q7\"]/a");
    By special1=By.xpath("/html/body/div/div/div[3]/div/main/div/div/div[2]/div/div/div/section[2]/div[2]/div/div/div/fluid-columns-repeater/div[2]/div[2]/div/div/a");
    By pills1 =By.xpath("//*[@id=\"comp-kye98ai9__item-kye9iw03\"]/a/span");
    By medicatedoil =By.xpath("//*[@id=\"comp-kye98ai9__item-kye9iv9r\"]/a");
    By choornam =By.xpath("//*[@id=\"comp-kye98ai9__item-kye9iufo\"]/a");
    By arishtas =By.xpath("//*[@id=\"comp-kye98ai9__item1\"]/a");
    By decotions =By.xpath("//*[@id=\"comp-kye98ai9__item3\"]/a");
    By lehyam =By.xpath("//*[@id=\"comp-kye98ai9__item3\"]/a");
    By prasavaraksha =By.xpath("//*[@id=\"comp-kye98ai9__item-l6xjribd\"]/a");
    By allproducts =By.xpath("//*[@id=\"comp-kye98ai9__item-kyi7toia\"]/a");
    
  
 //==============CAREER================
    By fullname =By.xpath("//*[@id=\"input_comp-l7ztetdd1\"]");
    By phone =By.xpath("//*[@id=\"input_comp-l7zu4jaw\"]");
    By emailjob=By.xpath("//*[@id=\"input_comp-l7ztetdw\"]");
    By place =By.xpath("//*[@id=\"input_comp-l7zxisv6\"]");
    By jobposistion =By.xpath("//*[@id=\"collection_comp-l8038b4u\"]");
    By jobpost = By.xpath("//*[@id=\"menuitem-5\"]/div");
    By experience =By.xpath("//*[@id=\"collection_comp-l802cxfi\"]");
    By experinceyear =By.xpath("//*[@id=\"menuitem-2\"]/div");
    By maritalstatus= By.xpath("//*[@id=\"comp-l7zxrcx5\"]/fieldset/div/label[1]/div[1]/div");
    By gender = By.xpath("//*[@id=\"comp-l7zxx87b\"]/fieldset/div/label[2]/div[1]/div");
    By briefyrslf =By.xpath("//*[@id=\"input_comp-l7zufkx1\"]");
    By uploadcv =By.xpath("//*[@id=\"comp-lmbu5rjt\"]/div[2]/div[1]/span");
//    By captcha =By.xpath("//*[@id=\"recaptcha-anchor\"]/div[3]");
    
    
 //================CONTACT OR ENQUIRY=================
    By enquiryname =By.xpath("//*[@id=\"input_comp-kwkgxobe\"]");
    By enquiryemail =By.xpath("//*[@id=\"input_comp-kwkgxobj\"]");
    By enquiryphone =By.xpath("//*[@id=\"input_comp-kwkgxobl1\"]");
    By enquiryaddress =By.xpath("//*[@id=\"input_comp-kwkgxobn2\"]");
    By enquiryrelated =By.xpath("//*[@id=\"collection_comp-ky5kjt7o\"]");
    By enquirymsg =By.xpath("//*[@id=\"textarea_comp-kwkgxobs2\"]");
  
 //==========================CLOSE======================
    
    
	public Kv_pages(WebDriver driver) {
		this.driver = driver;
	}
//----------HOME PAGE CLICK ONLY--------------
	
	
	public void logodisplay() {
		boolean logo1 = driver.findElement(logo).isDisplayed();

		if (logo1 == true) {
			System.out.println("logo is dispalyed");
		} else {
			System.out.println("logo is not displayed");
		}
	}
	public void logoclk() {
		driver.findElement(logo).click();
	}
	public void homeclk() {
		driver.findElement(home).click();
	}
	public void back() {
		driver.navigate().back();
	}
	public void about() {
		driver.findElement(about1).click();
	}
	public void department() {
		driver.findElement(department1).click();
	}
	public void hospitalclk() {
		driver.findElement(hospitals1).click();
	}
	public void shopclk() {
		driver.findElement(shop1).click();
	}
	public void careers() {
		driver.findElement(careers1).click();
	}
	public void contactclk() {
		driver.findElement(contact1).click();
	}
	public void search() {
		driver.findElement(search1).click();
	}
	public void searchbuttonclk() {
		driver.findElement(searchbutton1).click();
	}
//--------------------------------------------------------------------------------	
//	public void cartclk() {                  /dynamic
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(cart1)).click().perform();
////		driver.findElement(cart1).click();
//	}
	
//	public void signinclk(String e, String p) throws InterruptedException {
//		driver.findElement(signin1).click();
//
//		Thread.sleep(20000);
//		
//		driver.findElement(emailclick).click();
//		Thread.sleep(10000);
//		driver.findElement(emailval).sendKeys(e);
//		Thread.sleep(1000);
//		
//		driver.findElement(passval).sendKeys(p);
//		Thread.sleep(15000);
//		
//		driver.findElement(signupbtn).click();
//		
//	}
//------------------------------------------------------------------------------------
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}
	

	public void scrollup() {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-350)", "");
	}
	
	
	public void homescroll() {

		Actions act = new Actions(driver);
		act.sendKeys(Keys.HOME).perform();
	}
	
	
//------------FAST MOVING PRODUCTS IN THE HOME PAGE-----------
	
	public void product1() {
		driver.findElement(product1).click();
	}

	public void selectclk() throws InterruptedException {
		Actions act = new Actions(driver);

		driver.findElement(select1).click();
		Thread.sleep(2000);

		act.sendKeys(Keys.ARROW_DOWN).perform();
	}

	public void navigationleft1() {
		driver.findElement(navigateleft).click();
	}
	
	
//------DEPARTMENTS IN THE HOME PAGE--------	
	public void pharmadivision1() {
		driver.findElement(pharmadivision).click();
	}

	public void herbaldivision1() {

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(herbaldivision)).click().perform();

	}

	public void rdclk() {
		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(rd1)).click().perform();

	}
//------------------------------------------------------------------------------------
	
	
//-------------POLICIES,QUICKLINKS,BUYPRODUCTS------
	
	
    public void bottomlink() throws InterruptedException {
    	driver.findElement(mobnum1).click();;
    	Thread.sleep(4000);
    	Thread.sleep(2000);
    	
    	driver.findElement(refund).click();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
    	driver.findElement(privacy).click();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
    	driver.findElement(shipping).click();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
    	driver.findElement(cancellation).click();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
    	driver.findElement(terms).click();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
    	driver.findElement(prasavam).click();
    	Thread.sleep(4000);
//    	driver.navigate().back();
    	Thread.sleep(2000);
    	
    	driver.findElement(jobopen).click(); 
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
    	driver.findElement(balancesheets).click(); // click cntrl+1
    	Thread.sleep(4000);
    	
    	
    	driver.findElement(shopnow).click();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
    	driver.findElement(coupons).click(); //click
    	Thread.sleep(4000);
//    	driver.navigate().back();
    	Thread.sleep(2000);
    }
    
    
 //============SOCIALMEDIA(Bottom)============
    
    
    public void socialmedia() throws InterruptedException {
    	driver.findElement(fb).click();
    	Thread.sleep(7000);
    	
    	driver.findElement(insta).click();
    	Thread.sleep(7000);
    	
    	driver.findElement(whatsapp).click();
    	Thread.sleep(6000);
    	
    	driver.findElement(twitter).click();
    	Thread.sleep(6000);
    	
    	driver.findElement(linkedin).click();
    	Thread.sleep(6000);
    	
    	driver.findElement(youtube).click();
    	Thread.sleep(6000);
    	
    	driver.findElement(pinintrest).click();
    	Thread.sleep(4000);
    	
    	driver.findElement(whatsapp1).click();
    	Thread.sleep(4000);
    	
    }
    
	
//=============SEARCH PRODUCTS( in shop)==================	

	public void searchproduct1() throws InterruptedException {
		driver.findElement(searchprdct).click();
		Thread.sleep(2000);

		driver.findElement(searcheladi).click();
		Thread.sleep(3000);
	}

    public void selectpacking1() throws InterruptedException {	
    	
        Actions act=new Actions(driver);
    	
    	act.moveToElement(driver.findElement(selectpacking)).click().perform();
    	act.sendKeys(Keys.ARROW_DOWN).perform();
    	Thread.sleep(3000);
    }
//----------------------------------------------------------------------------    	
//   public void quantity1() throws InterruptedException {
//	   
//	   Actions act=new Actions(driver);
//   	
//   	act.moveToElement(driver.findElement(quantity)).click().perform();
//   	act.sendKeys(Keys.ARROW_DOWN).perform();
//   	
//    	
////    	driver.findElement(quantity).click();
//    	Thread.sleep(3000);
//    }
//----------------------------------------------------------------------------
    
 //=========(Once again Home,About,Departments,Hospitals have called in the test page)=====
    
    
//=============SHOP===================    
    
	public void patentclk() throws InterruptedException {
		driver.findElement(patent1).click();
		Thread.sleep(3000);
	}

	public void specialclk() throws InterruptedException {

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"comp-kye98ai9__item-kye9k39q\"]/a"))).click()
				.perform();
//    	driver.findElement(special1).click();
		Thread.sleep(3000);
	}

	public void pillsclk() throws InterruptedException {

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(pills1)).click().perform();
		Thread.sleep(3000);
	}

    public void medicatedclk() throws InterruptedException {
    	driver.findElement(medicatedoil).click();
    	Thread.sleep(3000);
    }
    
	public void choornamclk() throws InterruptedException {
		driver.findElement(choornam).click();
		Thread.sleep(3000);
	}

	public void arisshtasclk() throws InterruptedException {

		driver.findElement(arishtas).click();
		Thread.sleep(3000);
	}

	public void decotionsclk() throws InterruptedException {

		driver.findElement(decotions).click();
		Thread.sleep(3000);
	}

	public void lehyamclk() throws InterruptedException {

		driver.findElement(lehyam).click();
		Thread.sleep(3000);
	}

	public void prasvarakshaclk() throws InterruptedException {
		driver.findElement(prasavaraksha).click();
		Thread.sleep(3000);
	}

	public void allproductsclk() throws InterruptedException {

		driver.findElement(allproducts).click();
		Thread.sleep(3000);
	}
	
	
	
//====================CAREER=======================	
	
	public void fullnameclk() throws InterruptedException, IOException {
		driver.findElement(fullname).sendKeys("Arun babu ck");
		Thread.sleep(3000);
		
		driver.findElement(phone).sendKeys("9447980318");
		Thread.sleep(3000);
		
		driver.findElement(emailjob).sendKeys("arunbabuarun36@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(place).sendKeys("kozhikode");
		Thread.sleep(3000);
		
		driver.findElement(jobposistion).click();
		Thread.sleep(3000);
		
		driver.findElement(jobpost).click();
		Thread.sleep(3000);
		
		driver.findElement(experience).click();
		Thread.sleep(3000);
		
		driver.findElement(experinceyear).click();
		Thread.sleep(3000);
		
		driver.findElement(maritalstatus).click();
		Thread.sleep(3000);
		
		driver.findElement(gender).click();
		Thread.sleep(3000);
		
		driver.findElement(briefyrslf).sendKeys("Iam Arun babu ck");
		Thread.sleep(3000);
		
		driver.findElement(uploadcv).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\kandamkulathy.exe");
		Thread.sleep(3000);}
		
//		driver.findElement(captcha).click();
//		Thread.sleep(5000);
		
//================================================================
	
	
//=============CONTACT===========================	
	
	public void enquiryclk() throws InterruptedException {
		driver.findElement(enquiryname).sendKeys("ARUN BABU CK");
		Thread.sleep(3000);
		
		driver.findElement(enquiryemail).sendKeys("arunbabuarun36@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(enquiryphone).sendKeys("9447980318");
		Thread.sleep(3000);
		
		driver.findElement(enquiryaddress).sendKeys("calicut");
		Thread.sleep(3000);
		
		driver.findElement(enquiryrelated).click();
		Thread.sleep(3000);
		
		driver.findElement(enquirymsg).sendKeys("good work");
		Thread.sleep(3000);
	}
		
//===================================================		
	}




