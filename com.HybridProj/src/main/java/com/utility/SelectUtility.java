package com.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.testbase.BaseClass;

public class SelectUtility extends BaseClass {
	public void Seletext(WebElement element, String text) {
	Select sel = new Select(element);
	sel.selectByVisibleText(text);
}
}