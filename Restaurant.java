class Restaurant {

    boolean available = false;

    synchronized void produce() throws InterruptedException {
        System.out.println("Chef prepared food");
        available = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        if(!available)
            wait();

        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        Thread chef = new Thread(() -> {
            try { r.produce(); } catch(Exception e) {}
        });

        Thread waiter = new Thread(() -> {
            try { r.consume(); } catch(Exception e) {}
        });

        waiter.start();
        chef.start();
    }
}