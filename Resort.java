import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;

    // Function to input data
    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();

        System.out.print("Enter Customer Name: ");
        Name = sc.next();

        System.out.print("Enter Charges per Day: ");
        Charges = sc.nextFloat();

        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    // Function to calculate amount
    float Compute() {
        float amount = Days * Charges;

        if (amount > 11000) {
            amount = 1.02f * amount;
        }

        return amount;
    }

    // Function to display details
    void DispInfo() {
        float Amount = Compute();

        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: " + Charges);
        System.out.println("Days of Stay: " + Days);
        System.out.println("Total Amount: " + Amount);
    }

    public static void main(String[] args) {
        Resort r = new Resort();

        r.Getinfo();
        r.DispInfo();
    }
}