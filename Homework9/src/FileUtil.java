import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    static boolean saveReaderList(List<Reader> readers) {
        boolean save = false;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Library"))) {
            oos.writeObject(readers);
            save = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return save;
    }

    static List<Reader> restoreReaderList() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Library"))) {
            return (ArrayList<Reader>) ois.readObject();

        } catch (IOException e) {
            throw new RuntimeException("Файл пуст");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Файл не найден");
        }
    }





}
