import java.io.*;
import java.io.FileWriter;
import java.util.*;
public class Filehand{
    public static void main(String[] args) {
        
        try{
            File f=new File("C:\\Users\\lasta\\Desktop\\java\\hello1.txt");
            boolean var=f.createNewFile();
            if(var){
                System.out.println("new file has been created");
            }
            else{
                System.out.println("no file created");
            }
            FileWriter f1=new FileWriter("hello1.txt");
            f1.write("Files in Java are seriously good!! lorem");
            f1.close();
            Writer f2=new FileWriter("hello1.txt",false); //overwriting the text 
            f2.write("hello there guys");
            f2.close();
            if(f.exists()){
                System.out.println("File name :"+f.getName());
                System.out.println("File path :"+f.getAbsolutePath());
                System.out.println("File writable :"+f.canWrite());
                System.out.println("File length :"+f.length());

            }
            Scanner reader=new Scanner(f);
            while(reader.hasNextLine()){
                String Fc=reader.nextLine();
                System.out.println(Fc);
                int vowels=0;
                for(int i=0;i<Fc.length();i++){
                        if(Fc.charAt(i)=='o'){
                            vowels++;
                        }
               
                }
                System.out.println("Number of I in the file : "+vowels);
                reader.close();
                
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}