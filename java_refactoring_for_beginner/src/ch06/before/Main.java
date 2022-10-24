package ch06.before;

public class Main {

    public static void main(String[] args) {
        Book refactoring = new Book(
                "Refactoring: improving the design of existing code",
                "ISBN02999892",
                "$44.90",
                "Hong gildong",
                "hgd@example.com");

        Book math = new Book(
                "수학의 정석",
                "ISBN2122891",
                "20,000원",
                "김 정석",
                "kim@example.com");

        System.out.println("refactoring:");
        System.out.println(refactoring.toXml());

        System.out.println("math:");
        System.out.println(math.toXml());
    }
}
