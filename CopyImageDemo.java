import java.io.*;

public class CopyImageDemo {
    public static void main(String args[])throws Exception
    {
        FileInputStream fis = new FileInputStream(args[0]);
        byte b[] = new byte[fis.available()];
        fis.read(b);
        FileOutputStream fos = new FileOutputStream("./Test/copied.txt");
        fos.write(b);
        System.out.println("Copied Successfullyy!!!!");
        fis.close();
        fos.close();
    }    

}
