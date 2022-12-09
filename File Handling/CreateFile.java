import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        try {
            File Obj = new File("myTestFile.txt");
            if (Obj.createNewFile()) {
                System.out.println("File created: " + Obj.getName());
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
