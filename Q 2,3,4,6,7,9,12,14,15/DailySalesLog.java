import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DailySalesLog {

    public static void main(String[] args) {

        double[] sales = {
                1200,
                1300,
                1400,
                1500,
                1600,
                1700,
                1800
        };

        try {

            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter(
                                    "weekly_sales.txt"));

            for(double s : sales) {

                bw.write(String.valueOf(s));
                bw.newLine();

            }

            bw.close();

            System.out.println("File Created");

        } catch(IOException e) {

            System.out.println(e.getMessage());

        }
    }
}