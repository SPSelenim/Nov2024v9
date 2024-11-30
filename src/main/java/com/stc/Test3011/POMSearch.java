package com.stc.Test3011;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMSearch {
	
By FN=By.id("fname");
By LN=By.id("lname");
By QA=By.xpath("//a[@name='QA']");

public WebDriver driver=null;

public POMSearch(WebDriver driver)
{
	this.driver=driver;
}

public void SendFNameData(String D1)
{
	try
	{
driver.findElement(FN).sendKeys(D1);
Thread.sleep(1000);
	}
	catch(Exception e)
	{
		System.out.println( e.getMessage());
	}
}

public void SendLNameData(String D2)
{
	try
	{
driver.findElement(LN).sendKeys(D2);
Thread.sleep(1000);
	}
	catch(Exception e)
	{
		System.out.println( e.getMessage());
	}
}


public void ClickQA()
{
	try
	{
driver.findElement(QA).click();
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		System.out.println( e.getMessage());
	}
}

}
