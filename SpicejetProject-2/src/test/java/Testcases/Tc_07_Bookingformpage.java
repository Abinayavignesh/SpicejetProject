package Testcases;

import org.testng.annotations.Test;

import Base.Baseclass;
import PageObject.Bookingformpage;
import PageObject.Search_Flightpage;
import PageObject.Select_Flightpage;

public class Tc_07_Bookingformpage extends Baseclass{
	
	@Test(priority=8)
	public void Bookingpage() throws Exception {
	//create an object of Search_Flightpage class
		Search_Flightpage fb=new Search_Flightpage(driver);
		fb.onewaytrip();
		Select_Flightpage selfp=new Select_Flightpage(driver);
		selfp.selectprice();
		selfp.contbtn();
		Thread.sleep(5000);
		Bookingformpage bp=new Bookingformpage(driver);
		bp.contactdetails();
		bp.Adult1();
		bp.Adult2();
		bp.Adult3();
		bp.infant();
		Thread.sleep(5000);
		
		
	}

}
