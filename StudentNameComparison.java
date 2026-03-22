import java.util.Scanner;

class StudentNameComparison{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();

        System.out.println("Case-sensitive: " + n1.equals(n2));
        System.out.println("Case-insensitive: " + n1.equalsIgnoreCase(n2));
    }
}