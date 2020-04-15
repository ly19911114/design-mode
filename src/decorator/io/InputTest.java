package decorator.io;

/**
 * @author LiuYang
 * @date 2020/4/15
 */

import java.io.*;

/**
 * 自定义装饰者I/O测试
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\46993\\Desktop\\test.txt")))) {
            while ((c=in.read())>0){
                System.out.println((char)c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
