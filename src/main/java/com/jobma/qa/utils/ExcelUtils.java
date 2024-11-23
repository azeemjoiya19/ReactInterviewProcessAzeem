package com.jobma.qa.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.jobma.qa.base.TestBase;

public class ExcelUtils extends TestBase {
	
	
	
	XSSFWorkbook workbook ;
	XSSFSheet sheet ;
	
	
	
	
	public  ExcelUtils(String projectPath,String sheetName)
	
	{
		try {
			workbook = new XSSFWorkbook(projectPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public int getRowCount()
	{
		int rowCount = sheet.getPhysicalNumberOfRows();
		return rowCount;
		
	}
	
	public int getColCount()
	{
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		return colCount; 
	}
	
	public String getCellStringValue(int row ,int col)
	{
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	public double getCellNumericValue(int row,int col)
	{
		double data = sheet.getRow(row).getCell(col).getNumericCellValue();
		return data;
	}
	
	
	
	/*public Object[][] readExceltData()
	{
		int rowCount = getRowCount();
		int colCount = getColCount();
		
         Object[][] data = new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j= 0;j<colCount;j++)
			{
				
				String cellValue = getCellStringValue(i,j);
				data[i-1][j] = cellValue;
				
			}
				
		}
		return data;
		
		
	}
	
	
	
	
	

	
	
}*/
	
	public Object[][] readExceltData() {
	    int rowCount = getRowCount();
	    int colCount = getColCount();
	    
	    // Temporary list to hold valid rows of data
	    List<Object[]> dataList = new ArrayList<>();

	    // Iterate through rows, starting from row 1 (skipping header if necessary)
	    for (int i = 1; i < rowCount; i++) {
	        boolean isRowEmpty = true; // Flag to check if the row is empty
	        Object[] rowData = new Object[colCount];

	        // Iterate through columns in the row
	        for (int j = 0; j < colCount; j++) {
	            String cellValue = getCellStringValue(i, j).trim();

	            if (!cellValue.isEmpty()) {
	                rowData[j] = cellValue; // Add valid cell value to rowData
	                isRowEmpty = false; // Mark row as non-empty
	            }
	        }

	        // Only add non-empty rows to the data list
	        if (!isRowEmpty) {
	            dataList.add(rowData);
	        }
	    }

	    // Convert the list to Object[][] and return
	    return dataList.toArray(new Object[0][]);
	}
	

}
