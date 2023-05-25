import java.io.*;

public class RandomAccessFileClassDemo2 {

    public static void main(String args[])throws Exception
    {
        RandomAccessFile rf = new RandomAccessFile(args[0],"rw");

        String str = null;

        System.out.println("Contents of file :");

        while(true)
        {
            str = rf.readLine();

            if(str==null)
            {
                break;
            }
            System.out.println(str);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        File f = new File(args[0]);

        System.out.println("Enter position");

        int pos = Integer.parseInt(br.readLine());

        if(pos<0 || pos>f.length())
        {
            System.out.println("invaloid posiion");
        }
        else 
        {
            rf.seek(pos);
            System.out.println(rf.readLine());
        }

        rf.close();

    }
}
