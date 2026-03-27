class FileProcessingSystem {
    public static void main(String[] args) {
        try {
            System.out.println("Reading file...");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}