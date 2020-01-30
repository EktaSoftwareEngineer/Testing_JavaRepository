package com.TestUtiltiy;

import java.util.ArrayList;
import com
public class TestUtil {
	 static Xls_Reader reader;
	
	 public static ArrayList<Object[]> getDataFromExcel(){
	
	ArrayList <Object[]>myData = new ArrayList<Object[]> ();
	try {
		reader = new Xls_Reader(
				System.getProperty(key)
	}catch(Exception e) {
		e.printStackTrace();
	}
	for(int rowCount =2;rowCount<=reader.getRowCount("");rowCount++) {
		String currentTestMethod =reader.getCellData("","testcaseName",rowCount);
		if(currentTestMethod.equals(testMethodName)) {
			String firstname=reader.getCellData("PRSCrossRef","firstname",rowCount);
			String lastname=reader.getCellData("PRSCrossRef", "lastname", rowCount);
			String emailid =reader.getCellData("PRSCrossRef", "email", rowCount);
			
			myData.add(new Object[] {firstname, lastname,emailid});
		}
			return myData;
		}
	
	
	}
	

}
