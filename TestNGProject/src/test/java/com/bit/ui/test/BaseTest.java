package com.bit.ui.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BaseTest {
	
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	 System.out.println("00. Base UnitTest I am M1(dp) From BaseTest Class ");
  } 
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("1.BM beforeMethod");
	  
  }

@AfterMethod
  public void afterMethod() {
	  System.out.println("2.AM  afterMethod");
	 
  }


  @DataProvider
  public Object[][] dp() {
	  
   return new Object[][] {
     new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }

  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("3.BC  beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("4.AC   afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("5.BT   beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("6.AT   afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("7.BS   beforeSuit");
  }
  
  @AfterSuite
  public void afterSuite() {
	  System.out.println("8.AS   afterSuite");
	  
  }

}
