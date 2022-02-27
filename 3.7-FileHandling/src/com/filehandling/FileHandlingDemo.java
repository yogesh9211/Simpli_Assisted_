package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class FileHandlingDemo {
public static void main(String[] args) throws IOException {

	
	String data1 = "Hello Simplilearn!";
	Files.write(Paths.get("/home/yogeshtonpempha/temp/simplilearn2.txt"), data1.getBytes());
	//Files.deleteIfExists("/home/yogeshtonpempha/temp/simplilearn2.txt");
	
	File file = new File("/home/yogeshtonpempha/temp/simplilearn.txt");
	if (file.createNewFile()) {
		System.out.println("file created");
	} else {
		System.out.println("file exist");
	}
	String data = "hello simplilaern...";
	FileWriter writer= new FileWriter(file);
	writer.append(data);
	writer.append(data);
	writer.close();
	System.out.println("file written successfully");
	
	System.out.println("file read successfully");
		BufferedReader reader = new BufferedReader(new FileReader("/home/yogeshtonpempha/temp/simplilearn2.txt"));
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
	
	
	
    try
    { 
        Files.deleteIfExists(Paths.get("/home/yogeshtonpempha/temp/simplilearn2.txt")); 
    } 
    catch(NoSuchFileException e) 
    { 
        System.out.println("No such file/directory exists"); 
    }
      
    System.out.println("file Deletion successfully"); 
} 
}

