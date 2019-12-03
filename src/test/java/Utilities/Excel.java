package Utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;
    
    //The method is user to set file path and open excel file.
    public static void setExcelFile(String path,String Sheetname) throws Exception
    {
    	try
    	{
    		FileInputStream ExcelFile = new FileInputStream(path);
    		ExcelWBook = new XSSFWorkbook(ExcelFile);
    		ExcelWSheet = ExcelWBook.getSheet(Sheetname);
    		
    	}
    	catch(Exception e)
    	{
    		
    		throw(e);
    	}
    }
    
    
    //The method is to read the test data from the excel cell
    public static String getCellData(int RowNum,int ColNum)
    {
    	try
    	{
      	  Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
          String CellData = Cell.getStringCellValue();
          return CellData;
    	}
    	catch(Exception e)
    	{
    		return "";
    	}
    	
    }
    
    public static int getRowUsed() throws Exception {
		try{
			int RowCount = ExcelWSheet.getLastRowNum();		
			return RowCount;
		}catch (Exception e){
			System.out.println(e.getMessage());
			throw (e);
		}

	}
    
	public static int getRowContains(String sTestCaseName, int colNum) throws Exception{
		int i;
		try {
			int rowCount = Excel.getRowUsed();
			for ( i=0 ; i<rowCount; i++){
				if  (Excel.getCellData(i,colNum).equalsIgnoreCase(sTestCaseName)){
					break;
				}
			}
			return i;
				}catch (Exception e){
			throw(e);
			}
		}
}
