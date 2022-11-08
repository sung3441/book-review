package ch14.after;

import java.io.IOException;
import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
        try {
            AddressFile file = new AddressFile("test.txt");
            file.set("Hirishi Yuki", "lee@example.com");
            file.set("Lib", "kim@example.com");
            file.set("chosungil", "joo@example.com");
            file.update();

            Enumeration names = file.names();
            while (names.hasMoreElements()) {
                String name = (String) names.nextElement();
                String mail = file.get(name);
                System.out.println("name = " + name + ", mail = " + mail);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
