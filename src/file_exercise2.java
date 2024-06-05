import java.io.File;
import java.io.IOException;

public class file_exercise2 {
    public static void main(String[] args) throws IOException {
        //creating file
        File myFile = new File("myFile.txt");

        //checking file exists
        if(myFile.exists()){
            System.out.println("Dosya mevcut.");
        }
        else{
            System.out.println("Dosya mevcut değil");
            myFile.createNewFile();
        }

        //Creating Dir.
        File myDir = new File("myDirectory");
        if (!myFile.exists()){
            if(myDir.mkdir()){
                System.out.println("Dizin olusturuldu.");
            }
            else{
                System.out.println("Dizin olusturulamadi.");
            }
        }
        //List the Directions and Files
        File dir = new File(".");
        File[] filesList = dir.listFiles();
        for (File file : filesList){
            if(file.isFile()){
                System.out.println(file.getName());
            }
            else if(file.isDirectory()){
                System.out.println(file.getName());
            }
        }


    }

}
