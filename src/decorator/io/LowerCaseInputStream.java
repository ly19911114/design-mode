package decorator.io;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author LiuYang
 * @date 2020/4/14
 */

/**
 * 自定义Java I/O装饰者
 * 首先，扩展FileInputStream，这是所有InputStream的抽象装饰者
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in){
        super(in);
    }

    //把字节转化成小写
    public int read() throws IOException {
        int c=super.read();
        return (c==-1?c:Character.toLowerCase((char)c));
    }

    //把字节数组转化成小写
    public int read(byte[] b,int offset,int len) throws IOException {
        int result=super.read(b,offset,len);
        for (int i=offset;i<offset+result;i++){
            b[i]=(byte) Character.toLowerCase((char)b[i]);
        }
        return result;
    }

}
