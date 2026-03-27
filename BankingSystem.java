class BankingSystem {

    int balance = 1000;

    void withdraw(int amt) {
        synchronized(this) {
            if(balance >= amt) {
                balance -= amt;
                System.out.println("Withdrawn: " + amt + " Remaining: " + balance);
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();

        Thread t1 = new Thread(() -> b.withdraw(500));
        Thread t2 = new Thread(() -> b.withdraw(700));

        t1.start();
        t2.start();
    }
}