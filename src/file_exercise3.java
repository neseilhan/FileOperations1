import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_exercise3 {
    public static void main(String[] args) {
    // Dosyaya yazma
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("myFile2.txt"))) {
            bw.write("Nese ilhan");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    // Dosyadan okuma
        try (BufferedReader br = new BufferedReader(new FileReader("myFile2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
