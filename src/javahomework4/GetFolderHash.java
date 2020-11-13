package javahomework4;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Scanner;

public class GetFolderHash {

    //getFolderHash函数目的是传入文件路径，返回哈希码，但希望能够对子文件夹递归调用这个函数来update文件摘要，所以还要增加一个MessageDigest对象参数
    public static byte[] getFolderHash(String path, MessageDigest complete) throws Exception{
        byte[] buffer = new byte[1024];//设置缓冲区用来读取输入流，一次最多读取1024个字节
        File dir = new File(path);
        File[] fs = dir.listFiles();//将文件夹下的文件都放入一个File数组
        if(fs==null){//文件夹为空的情况
            return complete.digest();
        }
        Arrays.sort(fs); // 对文件进行排序
        for (File f : fs) {//遍历每一个文件
            if (f.isFile()) {//是文件，直接用文件内容更新complete
                FileInputStream is = new FileInputStream(f);
                int numRead;
                do {
                    numRead = is.read(buffer);//将文件输入流取出读入缓冲区
                    if (numRead > 0) {
                        complete.update(buffer, 0, numRead);
                    }
                } while (numRead != -1);
                is.close();
            }
            if (f.isDirectory()) {//是文件夹，递归调用求文件夹哈希的函数getFolderHash
                getFolderHash(path + File.separator + f.getName(), complete);
            }
        }
        return complete.digest();
    }

    //主程序提示用户输入一个路径，系统输出该路径的hashcode
    public static void main(String[] args){
        try{
            System.out.println("请输入待求hashcode的文件夹路径（格式例如：”C:\\Users\\huashizi\\Documents\\个人文件\\软微大一课件\\java“）：");
            Scanner cin = new Scanner(System.in);
            String path = cin.nextLine();
            cin.close();
            MessageDigest complete = MessageDigest.getInstance("SHA-1"); // 选择SHA-1方法
            byte[] sha1 = getFolderHash(path,complete); // 计算hashcode
            //输出hashcode
            StringBuilder result = new StringBuilder();
            for (byte b : sha1) {
                result.append(Integer.toString(b & 0xFF, 16));
            }
            System.out.println("the Hashcode is " + result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
