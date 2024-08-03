package FileManage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileHandler implements Writer {
    String path;

    @Override
    public boolean save(Serializable s) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("person.txt"))) {
            objectOutputStream.writeObject(s);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Object read() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("person.txt"))) {
            return objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
