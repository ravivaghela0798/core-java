import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Create File Object and use createNewFile() for creating file 
 * and add some data in text file using FileWriter Object 
 * and write() method to add some data and close FileWriter object class  
 */

public class CreateFile {

    public static void main(String[] args) {

        try {
            File fileObject = new File("myTestFile.txt");
            if (fileObject.createNewFile()) {
                System.out.println("File created: " + fileObject.getName());
                FileWriter Writer = new FileWriter("myTestFile.txt");
                Writer.write("Ravi Vaghela, QDev Technolab, Naroda, Ahmedabad, Gujarat, India");
                Writer.close();
                System.out.println("Successfully written.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }

}
