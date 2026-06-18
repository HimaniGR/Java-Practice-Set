import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LogFileReader {

    public static void main(String[] args) {

        ArrayList<String> errors = new ArrayList<>();

        try {

            File file = new File("server.log");
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()) {

                String line = sc.nextLine();

                if(line.contains("ERROR")) {
                    errors.add(line);
                }
            }

            sc.close();

            System.out.println(errors);

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}