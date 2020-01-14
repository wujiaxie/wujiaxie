import java.io.*;

public class CopyFile {
    import java.io.*

    public static class CopyFile {

        public static void main(String[] args) {

            String src = "d:/TEST/加勒比海盗-黑珍珠号的诅咒.rmvb";
            String dst = "d:/TEST/加勒比海盗-黑珍珠号的诅咒-Java复制.rmvb";

            long startTime = System.currentTimeMillis();
            copy(src, dst);
            long endTime = System.currentTimeMillis();

            System.out.println("spend time: " + (endTime-startTime) );

        }


        public static void copy(String src, String dst) {


            File fileIN = new File(src);
            File fileOUT = new File(dst);

            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;

            try {

                FileInputStream fis = new FileInputStream(fileIN);
                FileOutputStream fos = new FileOutputStream(fileOUT);

                bis = new BufferedInputStream(fis);
                bos = new BufferedOutputStream(fos);


                byte[] b = new byte[65536];
                int len;
                while( (len=bis.read(b)) != -1 ) {
                    bos.write(b, 0, len);
                    bos.flush();
                }

            } catch(IOException e) {

                e.printStackTrace();

            } finally {

                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
