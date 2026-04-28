package ro.ulbs.proiectaresoftware.lab8;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Application {
    public static void main(String[] args) {
        String input="laborator8_input.xlsx";
        citireinConsola(input);
        scriereMedie(input, "laborator8_output2.xlsx");
        scriereMedieFormula(input, "laborator8_output3.xlsx");
    }
    public static void citireinConsola(String fisierInput) {
        try (FileInputStream file = new FileInputStream(fisierInput);
             Workbook wb = new XSSFWorkbook(file)) {

            Sheet sheet = wb.getSheetAt(0);
            for (Row row : sheet) {
                for (Cell cell : row) {
                    if (cell.getCellType() == CellType.STRING) {
                        System.out.print(cell.getStringCellValue() + "\t");
                    } else if (cell.getCellType() == CellType.NUMERIC) {
                        System.out.print(cell.getNumericCellValue() + "\t");
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void scriereMedie(String fisierInput, String fisierOutput) {
        try (FileInputStream file = new FileInputStream(fisierInput);
             Workbook wb = new XSSFWorkbook(file)) {

            Sheet sheet = wb.getSheetAt(0);
            int rowIndex = 0;

            for (Row row : sheet) {
                Cell newCell = row.createCell(6);

                if (rowIndex == 0) {
                    newCell.setCellValue("Media");
                } else {
                    double n1 = row.getCell(3).getNumericCellValue();
                    double n2 = row.getCell(4).getNumericCellValue();
                    double n3 = row.getCell(5).getNumericCellValue();
                    newCell.setCellValue((n1 + n2 + n3) / 3.0);
                }
                rowIndex++;
            }

            try (FileOutputStream fos = new FileOutputStream(fisierOutput)) {
                wb.write(fos);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void scriereMedieFormula(String fisierInput, String fisierOutput) {
        try (FileInputStream file = new FileInputStream(fisierInput);
             Workbook wb = new XSSFWorkbook(file)) {

            Sheet sheet = wb.getSheetAt(0);
            int rowIndex = 0;

            for (Row row : sheet) {
                Cell newCell = row.createCell(6);

                if (rowIndex == 0) {
                    newCell.setCellValue("Media Formula");
                } else {
                    newCell.setCellFormula(String.format("AVERAGE(D%d:F%d)", rowIndex +1 , rowIndex+1));
                }
                rowIndex++;
            }

            try (FileOutputStream fos = new FileOutputStream(fisierOutput)) {
                wb.write(fos);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
