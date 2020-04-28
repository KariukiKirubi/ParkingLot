package parkinglot;

import java.io.*;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

 public class File_Writer {
     
     
     
     
   //Method to write iinto a file
     public void Witer_into_File(String filename, String Message){
    
    try
    {
        BufferedWriter output;
        output = new BufferedWriter(new FileWriter(filename, true));  //clears file every time
        output.newLine();
        output.append(Message);
        output.close();
    }
    catch(IOException ioe)
    {
        System.err.println("IOException: " + ioe.getMessage());
    }       
       
     }
     
     //method to update a line
     public void updateFile(String fileName, String find, String replace) throws FileNotFoundException{
          String line;
         File file =new File(fileName);
        Scanner in =in = new Scanner(file); 
     
            while(in.hasNext())
            {
                line=in.nextLine();
                
                if(line.contains(find)){
                      try {
			
			Path filePath = Paths.get(fileName);
			String fileContent = new String(Files.readAllBytes(filePath));
			
			fileContent = fileContent.replaceFirst(find, replace);
                        Files.write(filePath, fileContent.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
                   
                }
                }
        
        
     }
     public void clearFile(String filename){
    
    try
    {
        PrintWriter writer = new PrintWriter(filename);
        writer.print("");
        writer.close();
    }
    catch(IOException ioe)
    {
        System.err.println("IOException: " + ioe.getMessage());
    }       
       
     }
     
 
 }