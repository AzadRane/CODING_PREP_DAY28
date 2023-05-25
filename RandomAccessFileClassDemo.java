import java.io.*;

public class RandomAccessFileClassDemo
{
    public static void main(String args[])throws Exception
    {
        RandomAccessFile rf = new RandomAccessFile(args[0],"rw");

        System.out.println(rf.readLine());

        //how to read

        rf.seek(7);
        System.out.println(rf.readLine());


        //how to replace

        rf.seek(12);
        rf.writeBytes(" JAI SANATAN");

        //how to append 

        File f = new File(args[0]);
        rf.seek(f.length());
        rf.writeBytes(" JAI MAHARASHTRA");

        rf.close();
    }
}