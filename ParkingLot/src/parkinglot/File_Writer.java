package parkinglot;

import java.io.*;
import java.io.FileWriter;

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
 
 }