package org.junitpom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mycart extends Base{
	
	 public Mycart() {
		 PageFactory.initElements(driver,this);
	 }
		
	
	@FindBy(xpath = "//h5[text()='My Cart']")
	private WebElement mycart;
	
    @FindBy(xpath ="/html/body/div[4]/section[2]/div/div[2]/div[2]/div/a")
    private WebElement deliveryclick;
    
    @FindBy(xpath = "//select[@class='form-control height50']")
    private WebElement addresstype;
    
    @FindBy(xpath = "(//input[@name='first_name'])[1]")
    private WebElement first_name;
    
    @FindBy(xpath = "(//input[@name='last_name'])[1]")
    private WebElement lastname;
    
    @FindBy(xpath = "(//input[@type='text'])[8]")
    private WebElement number;
    
    @FindBy(xpath = "//input[@placeholder='House No*']")
    private WebElement housenum;
    
    @FindBy(xpath = "(//input[@type='text'])[10]")
    private WebElement housename;
    
    @FindBy(xpath = "//select[@name='state']")
     private WebElement state;
    

	@FindBy(xpath = "//select[@name='city']")
    private WebElement city;
    
    @FindBy(xpath = "//input[@name='zipcode']")
    private WebElement zipcode;
    
    @FindBy(xpath = "(//button[text()='Save'])[3]")
    private WebElement save;
    
    @FindBy(xpath = "//select[@id='payment_type']")
    private WebElement paymenttype;
    
    @FindBy(xpath = "//label[@for='visa_card']")
    private WebElement visa;
    
    @FindBy( xpath = "//input[@placeholder='Card Number']" )
    private WebElement cardnum;
    
    @FindBy(xpath ="(//select[@name='month'])[1]")
    private WebElement month;
    
     @FindBy(id="year")
     private WebElement year;
     
     @FindBy(name = "cvv")
     private WebElement cvv;
     
     @FindBy(id ="placeOrder" )
     private WebElement placeOrder;
    
    
	public WebElement getMycart() {
		return mycart;
	}


	public WebElement getDeliveryclick() {
		return deliveryclick;
	}


	public WebElement getAddresstype() {
		return addresstype;
	}


	public WebElement getFirst_name() {
		return first_name;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getNumber() {
		return number;
	}


	public WebElement getHousenum() {
		return housenum;
	}


	public WebElement getHousename() {
		return housename;
	}


	public WebElement getState() {
		return state;
	}


	public WebElement getCity() {
		return city;
	}


	public WebElement getZipcode() {
		return zipcode;
	}


	public WebElement getSave() {
		return save;
	}


	public WebElement getPaymenttype() {
		return paymenttype;
	}


	public WebElement getVisa() {
		return visa;
	}


	public WebElement getCardnum() {
		return cardnum;
	}


	public WebElement getMonth() {
		return month;
	}


	public WebElement getYear() {
		return year;
	}


	public WebElement getCvv() {
		return cvv;
	}


	public void mycart() throws IOException, InterruptedException {
		
		elementClick(deliveryclick);
		sleep();
		elementDdnText(addresstype,getcelldata("output", 1, 5));
		elementSendKeys(getcelldata("output", 1, 6),first_name);
		elementSendKeys(getcelldata("output", 1, 7),lastname);
		elementSendKeys(getcelldata("output", 1, 8),number);
		elementSendKeys(getcelldata("output", 1, 9),housenum);
		elementSendKeys(getcelldata("output", 1, 10),housename);
		elementDdnText(state, getcelldata("output", 1, 11));
		elementDdnText(city, getcelldata("output", 1, 12));
        elementSendKeys(getcelldata("output", 1, 13),zipcode);
        elementClick(save);
        sleep();
        elementDdnText(paymenttype, getcelldata("output", 1, 14));        
        elementClick(visa);
        elementSendKeys(getcelldata("output", 1, 15),cardnum);
        elementDdnAtrribute(month,getcelldata("output", 1, 16));
        elementDdnText(cvv, getcelldata("output", 1, 17));
        elementClick(placeOrder);
        
        
        
        
        
       
	}
    
    
    
}

