package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SecurePage {
	
	@FindBy(css="div#flash")
	public WebElement flasMessage;

}