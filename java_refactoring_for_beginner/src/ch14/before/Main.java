package ch14.before;

import java.io.IOException;
import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
        try {
            AddressFile file = new AddressFile("test.txt");
            file.getDatabase().set("Hirishi Yuki", "lee@example.com");
            file.getDatabase().set("Lib", "kim@example.com");
            file.getDatabase().set("chosungil", "joo@example.com");
            file.getDatabase().update();

            Enumeration names = file.names();
            while (names.hasMoreElements()) {
                String name = (String) names.nextElement();
                String mail = file.getDatabase().get(name);
                System.out.println("name = " + name + ", mail = " + mail);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
