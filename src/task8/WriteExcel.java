package task8;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("sheet1");

		String[][] data = {
		        {"Name", "Age", "Email"},
		        {"John Doe", "30", "john@test.com"},
		        {"Jane Doe", "28", "jane@test.com"},
		        {"Bob Smith", "35", "jacky@example.com"},
		        {"Swapnil", "37", "swapnil@example'com"}
		    };

		    // Write data to cells
		    for (int i = 0; i < data.length; i++) {
		        XSSFRow row = sheet.createRow(i);
		        for (int j = 0; j < data[i].length; j++) {
		            XSSFCell cell = row.createCell(j);
		            cell.setCellValue(data[i][j]);
		        }
		    }

		    // Auto size columns
		    for (int i = 0; i < data[0].length; i++) {
		        sheet.autoSizeColumn(i);
		    }

		    String path = WriteExcel.class.getClassLoader().getResource("").getPath();
		    System.out.println(path);
		    String outputPath = path + "WriteExcel.xlsx";
		    
		    
		    // Write the workbook to a file
		    try (FileOutputStream Output= new FileOutputStream(new File(outputPath))) {
		        workbook.write(Output);
		        workbook.close();
		       
		    } catch (Exception e) {
		        e.printStackTrace();
		    }

		
		
		    

	}

}
