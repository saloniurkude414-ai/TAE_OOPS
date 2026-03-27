import java.util.Scanner;

class MessageFormatter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String last = sc.next();

        String full = first + " " + last;
        System.out.println("Full Name: " + full);
    }
}