package test;

import org.testng.annotations.Test;

import base.base1;

public class TC1 extends base1{

	@Test
	public void GetTitle() {
		String title =driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void GetURl() {
		String URL =driver.getCurrentUrl();
		System.out.println(URL);
	}
	@Test
	public void GetWindowhandle() {
		String windowcount = driver.getWindowHandle();
		System.out.println(windowcount);
	}
}
