package com.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

    public static void main(String[] args) throws IOException {

        //File path
        File file = new File("C:\\Users\\Erol\\Desktop\\City.xlsx");

        //reading data from file
        FileInputStream fis = new FileInputStream(file);

        //creating workbook of wanted file
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        //selecting wanted sheet it can be by name(string) or number 0 is first one 1 is second etc..
//        XSSFSheet sheetInt = workbook.getSheetAt(0);
        XSSFSheet sheetStr = workbook.getSheet("Sheet1");


        //get string value first row
        String city1 = sheetStr.getRow(0).getCell(0).getStringCellValue();
        String city2 = sheetStr.getRow(0).getCell(1).getStringCellValue();
        String city3 = sheetStr.getRow(0).getCell(2).getStringCellValue();
        String city4 = sheetStr.getRow(0).getCell(3).getStringCellValue();

        //get int value from second row
        String population1 = sheetStr.getRow(1).getCell(0).getStringCellValue();
        int population2 = (int) sheetStr.getRow(1).getCell(1).getNumericCellValue();
        int population3 = (int) sheetStr.getRow(1).getCell(2).getNumericCellValue();
//        long CellData2 = new Double(Cell.getNumericCellValue()).longValue();

        //get double value from 3 row
        String square1 = sheetStr.getRow(2).getCell(0).getStringCellValue();
        double squeare2 = sheetStr.getRow(2).getCell(1).getNumericCellValue();
        double squeare3 = sheetStr.getRow(2).getCell(2).getNumericCellValue();


        //get string value 4 row
        String city5 = sheetStr.getRow(3).getCell(0).getStringCellValue();
        String city6 = sheetStr.getRow(3).getCell(1).getStringCellValue();
        String city7 = sheetStr.getRow(3).getCell(2).getStringCellValue();
        String city8 = sheetStr.getRow(3).getCell(3).getStringCellValue();


        System.out.print("Name of row: "+ city1 + "\n" + city2 + "\n" + city3 + "\n" + city4);

        System.out.print("\nName of row: "+ population1 + "\n" + population2 + "\n" + population3);

        System.out.print("\nName of row: "+ city5 + "\n" + city6 + "\n" + city7 + "\n" + city8);

        System.out.print("\nName of row: "+ square1 + "\n" + squeare2 + "\n" + squeare3);

        fis.close();

    }

}
