package com.vetasi;
/**
 * Created by smolka.tash on 26.02.2018.
 */

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Utils {

    public static void writeToExcel(String text) throws  IOException {

        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("List1");

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue(text);

        File dir = new File("C://excel");
        if (!dir.exists()) {
            dir.mkdir();
        }
        File fileName = new File(dir , "test.xlsx");
        FileOutputStream fileOut = new FileOutputStream(fileName);

        book.write(fileOut);
        fileOut.close();
    }
}
