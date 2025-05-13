package task8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {
		ClassLoader classLoader = ReadExcel.class.getClassLoader();
		URL resource = classLoader.getResource("WriteExcel.xlsx");

		if (resource == null) {
			System.err.println("File not found!");
			return;
		}

		try (InputStream fis = new FileInputStream(resource.getFile()); Workbook workbook = new XSSFWorkbook(fis)) {

			Sheet sheet = workbook.getSheet("sheet1");
			if (sheet == null) {
				System.err.println("Sheet 'sheet1' not found.");
				return;
			}
			for (Row row : sheet) {
				for (Cell cell : row) {
					switch (cell.getCellType()) {
					case STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						break;
					case NUMERIC:
						System.out.print((int) cell.getNumericCellValue() + "\t");
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue() + "\t");
						break;
					case FORMULA:
						System.out.print(cell.getCellFormula() + "\t");
						break;
					default:
						System.out.print(" \t");
						break;
					}
				}
				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
