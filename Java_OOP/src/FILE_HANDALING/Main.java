package FILE_HANDALING;

import javax.imageio.IIOException;
import java.io.File;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File input=new File("E:\\CSE 2-1\\Java_OOP\\src\\FILE_HANDALING\\input.txt");
        input.createNewFile();
        File output=new File("E:\\CSE 2-1\\Java_OOP\\src\\FILE_HANDALING\\output.txt");
        output.createNewFile();
        BufferedReader reader =new BufferedReader(new FileReader("E:\\CSE 2-1\\Java_OOP\\src\\FILE_HANDALING\\input.txt"));
        BufferedWriter writer =new BufferedWriter(new FileWriter("E:\\CSE 2-1\\Java_OOP\\src\\FILE_HANDALING\\input.txt"));

        writer.write("Input from java programme to file 1\n");
        writer.write("Input from java programme to file 2\n");
        writer.write("Input from java programme to file 3\n");
        writer.write("Input from java programme to file 4\n");
        writer.write("Input from java programme to file 5\n");
        writer.write("Input from java programme to file 6\n");
        writer.close();

        System.out.println(reader.readLine());
        String line;
        while ((line=reader.readLine())!=null)
            System.out.println(line);


        // file copy from one to another.

        Path source = Path.of("E:\\CSE 2-1\\Java_OOP\\src\\FILE_HANDALING\\input.txt");  // Path to the source file
        Path destination = Path.of("E:\\CSE 2-1\\Java_OOP\\src\\FILE_HANDALING\\output.txt");  // Path to the destination file

        try {
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }


        reader.close();




    }
}
