import java.io.*;
import java.util.ArrayList;

public class EmployeePayroll {

    public static void main(String[] args) {

        ArrayList<String> staff =
                new ArrayList<>();

        staff.add("Ram - 50000");
        staff.add("Hari - 45000");
        staff.add("Sita - 60000");

        try {

            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter(
                                    "payroll_report.txt"));

            for(String emp : staff) {

                bw.write(emp);

                bw.newLine();
            }

            bw.close();

            System.out.println(
                    "Payroll Report Generated");

        }

        catch(IOException e) {

            System.out.println(
                    e.getMessage());

        }
    }
}
