package FileManage;

import java.io.Serializable;

public interface Writer {
    boolean save(Serializable s);

    Object read();

}