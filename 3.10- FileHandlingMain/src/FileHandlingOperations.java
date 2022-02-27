import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandlingOperations {
	public static void main(String[] args) throws IOException {
		
		File file = new File("/home/yogeshtonpempha/temp1/Simplilearn.txt");
		if (file.createNewFile()) {
			System.out.println("file created Successfully");
		} else {
			System.out.println("file Alraedy Exist");
		}
		
		String data = "Hello Yogesh....";
		Files.write(Paths.get("/home/yogeshtonpempha/temp1/Simplilearn.txt"), data.getBytes());
		System.out.println("Fiile Written Successfully");
		FileWriter writer= new FileWriter(file);
		writer.append(data);
		writer.append(data);
		writer.append(data);
		writer.close();
		System.out.println("Fiile Append Operation Done Successfully");
		BufferedReader reader = new BufferedReader(new FileReader("/home/yogeshtonpempha/temp1/Simplilearn.txt"));
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
		System.out.println("Fiile Readed Successfully");	
	}
}
