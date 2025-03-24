import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();
        int minRange = scanner.nextInt();
        int maxRange = scanner.nextInt();
        System.out.print(message.substring(minRange, maxRange+1));
        // start coding here
    }
}
