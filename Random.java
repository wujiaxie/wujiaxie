import java.io.*;
import java.util.Arrays;
public class Random{
    public static void main(String[] args)  {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("D:/1/d.txt"));
            int a[]=new int[100];

            for(int k=0;k<100;k++)           {
                a[k]=(int)(Math.random()*99);
            }
            for(int i=0;i<100;i++)            {
                out.write((String.valueOf(a[i])));
                out.write(" ");
            }
            out.close();
            BufferedReader in=new BufferedReader(new FileReader("D:/1/d.txt"));
            String s=new String("");
            String b=null;
            while((s=in.readLine())!=null) {
                System.out.print(s);
            }
            in.close();
        }catch (IOException e) {}


    }
}
