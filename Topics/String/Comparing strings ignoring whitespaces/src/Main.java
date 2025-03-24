import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next();
        firstString = firstString.replaceAll(" ", "");
        String secondString =scanner.next();
        secondString = secondString.replaceAll(" ", "");
        // start coding here
        System.out.print(firstString.equals(secondString));
    }
}
