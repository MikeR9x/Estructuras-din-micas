import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;


public class Manager {
static File file = new File("test.dat");
	public void ejecutar() {
		try {
			write();
			read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void write() throws IOException {
			
	    FileWriter fileWriter 	= new FileWriter(file);
	    PrintWriter printWriter = new PrintWriter(fileWriter);

	    printWriter.print("hola");	    
	    printWriter.close();
	}
	
	public static void read()  throws IOException
    { 
        // Creating a path choosing file from local
        // directory by creating an object of Path class
        Path fileName = Path.of(file.getPath());
 
        // Now calling Files.readString() method to
        // read the file
        String str = Files.readString(fileName);
 
        // Printing the string
        System.out.println(str);
    }	

}
