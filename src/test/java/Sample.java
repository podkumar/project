import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\sample.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		for (int i = 0; i<sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j <sheet.getPhysicalNumberOfRows(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				if (cellType==0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
						String format = dateFormat.format(dateCellValue);
						System.out.println(format);
					}
					
				else {
					double d = cell.getNumericCellValue();
					long l = (long)d;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
				}
				}
			}
		}
			
	}
		
	}

