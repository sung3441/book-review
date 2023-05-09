package ch01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baekjoon2750 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(Integer.parseInt(br.readLine()));
        }
        list.stream().sorted().forEach(System.out::println);
    }
}
