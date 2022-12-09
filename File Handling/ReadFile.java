import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * Read file for read data from text file using Scanner class  
 */
public class ReadFile {

    public static void main(String[] args) {
        try {
            File fileObject = new File("myTestFile.txt");
            Scanner Reader = new Scanner(fileObject);
            while (Reader.hasNextLine()) {
                String readData = Reader.nextLine();
                System.out.println(readData);
            }
            Reader.close();
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }

}
