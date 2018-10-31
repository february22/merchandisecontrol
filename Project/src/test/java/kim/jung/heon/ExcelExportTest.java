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

		// ���� �ʿ������ �´� Ȯ���ڸ� �����ϸ� ��
		sb.append(fileLocation).append("C:\\").append("testWriteExcelFile.xls");
		Workbook workbook = new HSSFWorkbook(); // xls ����

		//sb.append(fileLocation).append("C:/").append("testWriteExcelFile.xlsx");
		//Workbook workbook = new SXSSFWorkbook(); //xlsx ����
		
		workbook.createSheet(sheetName1);
		workbook.createSheet(sheetName2);
		workbook.createSheet();

		HSSFSheet sheet = (HSSFSheet) workbook.getSheetAt(0);
		HSSFRow row;
		HSSFCell cell;
		row = sheet.createRow(0);
		row.createCell(0).setCellValue("ö��");
		row.createCell(1).setCellValue("����");
		row.createCell(2).setCellValue("�μ�");

		FileOutputStream outFile;

		try {
			outFile = new FileOutputStream("C:\\Users\\Desktop\\�޽���\\XlsWrite.xls"); // �̺κ��� ���� ��ο� ���� �̸� �����̴�
			workbook.write(outFile);
			outFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
