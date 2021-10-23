package com.utility;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotUtility {

	public void pressEnter() {
		Robot r = null;
		try {
			r = new Robot();
		} catch (Exception e) {
			System.out.println(e);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
	public void pressTab() {
		Robot r = null;
		try {
			r = new Robot();
		} catch (Exception e) {
			System.out.println(e);
		}
		r.keyPress(KeyEvent.VK_TAB);
		
	}
	public void pressEscb() {
		Robot r = null;
		try {
			r = new Robot();
		} catch (Exception e) {
			System.out.println(e);
		}
		r.keyPress(KeyEvent.VK_ESCAPE);
		
	}
}
