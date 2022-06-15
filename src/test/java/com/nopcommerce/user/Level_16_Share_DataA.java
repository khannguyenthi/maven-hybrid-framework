package com.nopcommerce.user;

import org.testng.annotations.Test;

import com.nopcommerce.common.Common_01_Register_End_User;

import commons.BasePage;
import commons.BaseTest;
import commons.BaseTestNopCommerce;
import pageObject.portal.nopCommerce.PageGeneratorManager;
import pageObject.portal.nopCommerce.UserAddressPageObject;
import pageObject.portal.nopCommerce.UserCustomerInfoPageObject;
import pageObject.portal.nopCommerce.UserHomePageObject;
import pageObject.portal.nopCommerce.UserLoginPageObject;
import pageObject.portal.nopCommerce.UserMyProductReviewPageObject;
import pageObject.portal.nopCommerce.UserRegisterPageObject;
import pageObject.portal.nopCommerce.UserRewardPointPageObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Level_16_Share_DataA extends BaseTest{
	 
 @Parameters({"browser","url"})
 @BeforeClass 
  public void beforeClass(String browserName, String appUrl) {
	 driver = getBrowserDriver(browserName, appUrl);	 
	
	 homePage = PageGeneratorManager.getUserHomePage(driver);
	 //registerPage = PageGeneratorManager.getUserRegisterPage(driver);	 
	 
	  emailAddress = Common_01_Register_End_User.emailAddress;
	  password = Common_01_Register_End_User.password;
  
	  log.info("Login - Step 01: Navigate to Login page");
	  loginPage = homePage.clickToLoginLinkUser();
	  
	  log.info("Login - Step 02: Enter to email textbox with value is '" + emailAddress);
	  loginPage.inputToEmailTextbox(emailAddress);
	  
	  log.info("Login - Step 03: Enter to password textbox with value is '" + password);
	  loginPage.inputToPasswordTextbox(password);
	  
	  log.info("Login - Step 04: Click Login button");
	  homePage = loginPage.clickToLoginButton();  
  }
 
 @Test
 public void Search_01_EmptyData() {
	 log.info("Login - Step 04: Verify My Account link display");
	 Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
 }
 @Test
 public void Search_02_Relative_Product_Name() {
	 log.info("Login - Step 04: Verify My Account link display");
	 Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
 }
 @Test
 public void Search_03_Absolute_Product_Name() {
	 log.info("Login - Step 04: Verify My Account link display");
	 Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
 }
 @Test
 public void Search_04_Parent_Category() {
	 log.info("Login - Step 04: Verify My Account link display");
	 Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
 }
 @Test
 public void Search_05_Incorrect_Manufactor() {
	 log.info("Login - Step 04: Verify My Account link display");
	 Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
 }
 @Test
 public void Search_06_Correct_Manufactor() {
	 log.info("Login - Step 04: Verify My Account link display");
	  Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
 }
  
  @AfterTest
	public void afterClass() {
		driver.quit();
	}
    private WebDriver driver; 
	//private String projectPath = System.getProperty("user.dir");
	private String emailAddress, firstName, lastName, password, myAccountLinkText;
	private UserHomePageObject homePage; 
	private UserLoginPageObject loginPage;
	private UserRegisterPageObject registerPage;
	private UserCustomerInfoPageObject customerInforPage;
	//private UserAddressPageObject addressPage;
	//private UserMyProductReviewPageObject myProductReviewPage;
	//private UserRewardPointPageObject rewardPointPage;
}
