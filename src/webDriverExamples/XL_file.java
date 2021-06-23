package webDriverExamples;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class XL_file {
public static void main(String[] args)throws Exception {
FileInputStream file =new FileInputStream("E:\\ASISH FOLDER\\Software Testing\\ReadExcel.xls");
Workbook wb =Workbook.getWorkbook(file);
Sheet st =wb.getSheet(0);
int rowcount=st.getRows();
System.out.println(rowcount);
for(int i=1;i<rowcount;i++){
String empname =st.getCell(0,1).getContents();
String empid =st.getCell(1,i).getContents();
String empno =st.getCell(2,i).getContents();
String empmail=st.getCell(3,i).getContents();
System.out.println(empname);
System.out.println(empid);
System.out.println(empno);
System.out.println(empmail);

}

}
}
