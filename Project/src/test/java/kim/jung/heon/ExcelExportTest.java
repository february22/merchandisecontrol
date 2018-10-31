package kim.jung.heon;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;


public class ExcelExportTest {
	public static void main(String[] args) {

		String sheetName1 = "first sheet";
		String sheetName2 = "second sheet";
		String fileLocation = "";

		StringBuffer sb = new StringBuffer();

		// 엑셀 필요버전에 맞는 확장자를 선택하면 됨
		sb.append(fileLocation).append("C:\\").append("testWriteExcelFile.xls");
		Workbook workbook = new HSSFWorkbook(); // xls 버전

		//sb.append(fileLocation).append("C:/").append("testWriteExcelFile.xlsx");
		//Workbook workbook = new SXSSFWorkbook(); //xlsx 버전
		
		workbook.createSheet(sheetName1);
		workbook.createSheet(sheetName2);
		workbook.createSheet();

		HSSFSheet sheet = (HSSFSheet) workbook.getSheetAt(0);
		HSSFRow row;
		HSSFCell cell;
		row = sheet.createRow(0);
		row.createCell(0).setCellValue("철수");
		row.createCell(1).setCellValue("영희");
		row.createCell(2).setCellValue("민수");

		FileOutputStream outFile;

		try {
			outFile = new FileOutputStream("C:\\Users\\Desktop\\메신져\\XlsWrite.xls"); // 이부분은 파일 경로와 파일 이름 저장이다
			workbook.write(outFile);
			outFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
