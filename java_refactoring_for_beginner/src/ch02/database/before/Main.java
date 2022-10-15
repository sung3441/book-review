package ch02.database.before;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        try {
            SimpleDatabase db = new SimpleDatabase(new FileReader("./src/ch02/database/dbfile.txt"));
            Iterator<String> it = db.iterator();
            while (it.hasNext()) {
                String key = it.next();
                System.out.println("key = " + key);
                System.out.println("value = " + db.getValue(key));
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
