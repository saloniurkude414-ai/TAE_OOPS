class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating two Person objects
        Person p1 = new Person("Rahul", 20);
        Person p2 = new Person("Priya", 22);

        // Printing details
        p1.display();
        p2.display();
    }
}