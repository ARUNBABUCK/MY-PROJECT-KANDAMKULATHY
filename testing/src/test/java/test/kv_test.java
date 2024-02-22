package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Kv_pages;

public class kv_test{
	
	

	WebDriver driver;
	String baseurl="https://www.kandamkulathy.com/";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeTest
	public void url() {
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
    public void test() throws InterruptedException, IOException {
	Kv_pages kvk =	new Kv_pages(driver);
	Thread.sleep(2000);
	kvk.logodisplay();
	kvk.logoclk();
	Thread.sleep(3000);
	kvk.about();
	Thread.sleep(3000);
	kvk.department();
	Thread.sleep(3000);
	kvk.hospitalclk();
	Thread.sleep(3000);
	kvk.shopclk();
	Thread.sleep(3000);
	kvk.careers();
	kvk.contactclk();
	Thread.sleep(3000);
	kvk.search();
	Thread.sleep(3000);
	kvk.searchbuttonclk();
	Thread.sleep(3000);
	
//===================DANGER==================================	
//	kvk.cartclk();/  not working
//	Thread.sleep(2000);
//	kvk.signinclk("arunbabuarun36@gmail.com", "arun123@");
//	Thread.sleep(2000)
//	kvk.loginclk();
//	kvk.emailclk("arunbabuarun36@gmail.com", "arun123@");
//	Thread.sleep(30000);
//	kvk.signup1clk();
//	Thread.sleep(10000);
//=====================DANGER=================================	
	
	
	kvk.back();
	Thread.sleep(3000);
	kvk.homeclk();
	Thread.sleep(3000);
	kvk.scroll();
	Thread.sleep(3000);
	kvk.scroll();
	Thread.sleep(3000);
	kvk.product1();
	Thread.sleep(3000);
	kvk.selectclk();
	kvk.back();
	Thread.sleep(3000);
    kvk.navigationleft1();
    Thread.sleep(3000);
    kvk.scroll();
    Thread.sleep(3000);
    kvk.scroll();
    Thread.sleep(3000);
    kvk.scroll();
    kvk.pharmadivision1();
    Thread.sleep(3000);
    kvk.scroll();
    Thread.sleep(3000);
    kvk.scroll();
    Thread.sleep(3000);
    kvk.back();
    Thread.sleep(4000);
    kvk.herbaldivision1();
    kvk.scroll();
    Thread.sleep(3000);
    kvk.scroll();
    kvk.back();
    Thread.sleep(4000);
    kvk.rdclk();
    kvk.scroll();
    Thread.sleep(3000);
    kvk.scroll();
    Thread.sleep(4000);
    kvk.back();
    Thread.sleep(4000);
    kvk.scroll();
    kvk.scroll();
    kvk.bottomlink();
    kvk.scroll();
    Thread.sleep(3000);
    kvk.socialmedia();
    Thread.sleep(5000);
    kvk.homescroll();
    Thread.sleep(4000);
	
	
//    //-------ABOUT------
    kvk.about();
    Thread.sleep(2000);
    kvk.scroll();
    Thread.sleep(2000);
    kvk.scroll();
    Thread.sleep(2000);
    kvk.scroll();
    Thread.sleep(2000);
    kvk.scroll();
    Thread.sleep(2000);
    kvk.scroll();
    Thread.sleep(4000);
    kvk.homescroll();
    Thread.sleep(4000);
	
	
//    //-----DEPARTMENT-----
    kvk.department();
    Thread.sleep(2000);
    kvk.scroll();
    Thread.sleep(2000);
    kvk.scroll();
    Thread.sleep(2000);
    kvk.scroll();
    Thread.sleep(2000);
    kvk.homescroll();
    Thread.sleep(4000);
	
	
//    //-----HOSPITAL-------
    kvk.hospitalclk();
    Thread.sleep(4000);
    kvk.scroll();
    Thread.sleep(4000);
    kvk.scroll();
    Thread.sleep(4000);
    kvk.scroll();
    kvk.homescroll();
    Thread.sleep(4000);
	
	
    //------SHOP----------
    kvk.shopclk();
    Thread.sleep(2000);
    kvk.searchproduct1();
    Thread.sleep(3000);
//    kvk.selectpacking1();
    Thread.sleep(3000);
//    kvk.quantity1();	
    kvk.back();
    Thread.sleep(3000);
	
	//-----PATENT(shop)-----
    kvk.patentclk();
    Thread.sleep(3000);
    kvk.scroll();
    Thread.sleep(3000);
    kvk.scroll();
    Thread.sleep(3000);
    kvk.back();
    Thread.sleep(3000);
	
	//----SPECIAL(shop)-----
    kvk.specialclk();
    Thread.sleep(3000);
    kvk.scroll();
    Thread.sleep(3000);
    kvk.scroll();
    Thread.sleep(3000);
    kvk.back();
    Thread.sleep(3000);
	
	//-----PILLS(shop)-------
    kvk.pillsclk();
    Thread.sleep(3000);
    kvk.scroll();
    Thread.sleep(3000);
    kvk.back();
    Thread.sleep(3000);
	
	//------MEDICATED(shop)---
    kvk.medicatedclk();
    Thread.sleep(5000);
    kvk.scroll();
    Thread.sleep(5000);
    kvk.scroll();
    Thread.sleep(5000);
    kvk.back();
    Thread.sleep(5000);
    kvk.scroll();
	
	//---CHOORNAM(shop)------
    kvk.choornamclk();
    Thread.sleep(5000);
    kvk.scroll();
    Thread.sleep(5000);
    kvk.scroll();
    kvk.back();
    Thread.sleep(3000);
	
	//-----ARISHTAM(shop)-----
    kvk.arisshtasclk();
    Thread.sleep(5000);
    kvk.scroll();
    Thread.sleep(5000);
    kvk.scroll();
    kvk.back();
    Thread.sleep(3000);
	
	//----DECOTION(shop)------
    kvk.decotionsclk();
    Thread.sleep(5000);
    kvk.scroll();
    Thread.sleep(5000);
    kvk.scroll();
    kvk.back();
    Thread.sleep(3000);
	
	//-----LEHYAM(shop)
    kvk.lehyamclk();
    Thread.sleep(5000);
    kvk.scroll();
    Thread.sleep(5000);
    kvk.scroll();
    kvk.back();
    Thread.sleep(3000);
	
	//----PRASAVARAKSHA(shop)---
    kvk.prasvarakshaclk();
    Thread.sleep(5000);
    kvk.scroll();
    Thread.sleep(5000);
    kvk.scroll();
    kvk.back();
    Thread.sleep(3000);
	
	//---ALL PRODUCTS(shop)----
    kvk.allproductsclk();
    Thread.sleep(3000);
    kvk.scroll();
    Thread.sleep(3000);
    kvk.scroll();
    Thread.sleep(3500);
    kvk.scroll();
    Thread.sleep(3500);
    kvk.scroll();
    Thread.sleep(3000);
    kvk.back();
    Thread.sleep(3000);
    kvk.back();
    Thread.sleep(3000);
    kvk.back();
    Thread.sleep(3000);
    kvk.scrollup();
    Thread.sleep(3000);
    kvk.scrollup();
    Thread.sleep(3000);
	
	//---CAREERS-----
    kvk.careers();
    Thread.sleep(3000);
    kvk.fullnameclk();
    Thread.sleep(3000);
    kvk.scroll();
    kvk.back();
    Thread.sleep(3000);
	
	//---CONTACT------
    kvk.contactclk();
    Thread.sleep(3000);
    kvk.enquiryclk();
    Thread.sleep(3000);
    kvk.scroll();
    Thread.sleep(2000);
    kvk.back();
		
	}
}
