import java.io.*;

public class ConfigLoader {

    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader(
                                    "config.txt"));

            System.out.println(
                    "Config Loaded");

            br.close();

        }

        catch(FileNotFoundException e) {

            try {

                BufferedWriter bw =
                        new BufferedWriter(
                                new FileWriter(
                                        "config.txt"));

                bw.write(
                        "username=admin");

                bw.newLine();

                bw.write(
                        "password=1234");

                bw.close();

                System.out.println(
                        "Default Config Created");

            }

            catch(IOException ex) {

                System.out.println(
                        ex.getMessage());

            }
        }

        catch(IOException e) {

            System.out.println(
                    e.getMessage());

        }
    }
}