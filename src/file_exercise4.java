import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class file_exercise4 {
    public static void main(String[] args)  {
    // Dosya ve dizin oluşturma
        Path myFile = Paths.get("myFile3.txt");
        Path myDir = Paths.get("myDirectory");

        try {
            Files.createFile(myFile);
            Files.createDirectories(myDir);
        }
        catch (IOException e) {
            e.printStackTrace();        }

    // Dosyanın var olup olmadığını kontrol etme
        boolean exists = Files.exists(myFile);
        System.out.println("Dosya mevcut: " + exists);
    // Dosyayı başka bir konuma taşıma
        Path targetPath = Paths.get("myDirectory/myFile3.txt");
        try {
            Files.move(myFile, targetPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
