package org.zerock.controller;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Calendar;

import org.junit.Test;

public class FilePathTest {

	@Test
	public void test() {
		Calendar cal = Calendar.getInstance();
		String uploadPath = "c:\\data\\Spring";
		String yearPath = File.separator + cal.get(Calendar.YEAR);
		String monthPath = yearPath + File.separator + new DecimalFormat("00").format(cal.get(Calendar.MONTH) + 1);
		String datePath = monthPath + File.separator + new DecimalFormat("00").format(cal.get(Calendar.DATE));
		
		System.out.println(yearPath);
		System.out.println(monthPath);
		System.out.println(datePath);
		
		File dirPath = new File(uploadPath + yearPath);
		if(!dirPath.exists()) {
			dirPath.mkdir();
		}
		dirPath = new File(uploadPath + monthPath);
		if(!dirPath.exists()) {
			dirPath.mkdir();
		}
		dirPath = new File(uploadPath + datePath);
		if(!dirPath.exists()) {
			dirPath.mkdir();
		}
	}

}
