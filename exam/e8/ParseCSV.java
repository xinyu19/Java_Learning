package exam.e8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class ParseCSV {
	public static void main(String[] args) {
		/*
		 * 將exam/e8/Employee.csv Copy至c:\java 利用Commons csv library來處理csv檔案 網址如下
		 * https://commons.apache.org/proper/commons-csv/
		 * 1.下載commons-csv-1.8-bin.zip，解壓縮後將jar放至lib目錄 
		 * 2.eclipse中設定library 
		 * 3.參考官方的User Guide處理此csv 取得薪水的加總
		 */
		String cvs_path = "C:\\JavaWorkspace\\JavaLab\\src\\exam\\e8\\Employees.csv";

		try (Reader reader = Files.newBufferedReader(Paths.get(cvs_path));
				CSVParser csvParser = new CSVParser(reader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

			List<String> headers = csvParser.getHeaderNames();
//			System.out.println(headers);
			String empno = headers.get(0);
			String name = headers.get(1);
			String salary = headers.get(2);
			String age = headers.get(3);

			int sum = 0;
			for (CSVRecord csvRecord : csvParser) {
//				System.out.println(empno + ": " + csvRecord.get(0));
//				System.out.println(name + " : " + csvRecord.get(1));
//				System.out.println(salary + " : " + csvRecord.get(2));
//				System.out.println(age + " : " + csvRecord.get(3));
//				System.out.println("---------------");
//				System.out.println(csvRecord.get(2));
				String eachSalary = csvRecord.get(2);
				eachSalary = eachSalary.replaceAll(",", "");
//				System.out.println(eachSalary);
				int eachsalary = Integer.parseInt(eachSalary);
				sum += eachsalary;
			}

			System.out.println("The total of everyone's salary: " + sum);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
