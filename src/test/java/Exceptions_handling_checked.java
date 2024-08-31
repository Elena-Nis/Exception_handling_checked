import java.io.*;

public class Exceptions_handling_checked {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\e4887\\Desktop\\Hello.txt";
       // BufferedReader bufRed = null;
try
        //Using try-with-resources to automatically close a file
        (
    FileReader fileReader = new FileReader(filePath);
   BufferedReader bufRed = new BufferedReader(fileReader);
        )
    //FileReader create an OBJECT of the class FileReader, opens the file for reading
    //FileReader OBJECT is created to read a file character by character
    //BufferedReader OBJECT is created for block (line) reading of a file
        {
            String line;
    while ((line = bufRed.readLine()) != null) {

        //The readLine method on BufferedReader object calls the read method on FileReader object.
        //The buffer is filled with characters, blocks of characters are displayed on the screen

        System.out.println(line);
          }
   } catch (FileNotFoundException e) {
     System.out.println("File not found");
   } catch (IOException e) {
     System.out.println(e.getMessage());
   }

     }
    }


