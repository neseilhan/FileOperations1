import java.io.*;
public class file_exercise1 {
    public static void main(String[] args ) throws IOException {
        File file = new File("kod.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        String val = "it's coding time.";

        FileWriter fWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(val);
        bWriter.write("\t I luv Java");
        bWriter.close();

        String line;
        FileReader fileReader  = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fileReader);
        while((line = bReader.readLine()) != null){
            System.out.println(line);
        }

        bReader.close();



    }
}
