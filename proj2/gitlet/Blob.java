package gitlet;

import java.io.Serializable;

public class Blob implements Serializable {
    public String id;
    public Blob(String filename){
        id= Utils.sha1(Utils.readContentsAsString(Utils.join(Repository.CWD,filename)));//根据文件名找到文件，然后读取内容计算id

    }
}
