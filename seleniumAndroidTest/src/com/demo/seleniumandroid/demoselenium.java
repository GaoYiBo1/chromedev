package com.demo.seleniumandroid;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
public class demoselenium  {
//extends TestCase
	
	public static void main(String[] args) {
	
		try {
			//��webdriver
			Runtime.getRuntime().exec("adb shell am start -a android.intent.action.MAIN "
					+ "-n org.openqa.selenium.android.app/.MainActivity");
			/*���ӷ����webdriver�������õĶ˿�Ϊ8080����������п����˻�ʹ���˸ö˿ڣ���Ҫ�رգ�http://localhost:8080/exit������Ȼ���Ӳ��Ϸ����webdriver   */
			Runtime.getRuntime().exec("adb -s HC51BWWE0103 forward tcp:8080 tcp:8080");
		} catch (Exception e) {
			// TODO: handle exception
		}
		WebDriver driver = new AndroidDriver();
		driver.get("http://m.fun.tv/");
//			WebElement element = driver.findElement(By.name("q"));
//			element.sendKeys("hello");
//			
//			element.submit();
//			
			System.out.println("title:"+driver.getTitle());//console ��ӡtitle:������-�й����ȵ���һ����Ƶƽ̨
		driver.quit();
	}

}
