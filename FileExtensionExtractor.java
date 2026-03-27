import java.util.Scanner;

class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();

        int i = file.lastIndexOf(".");
        String ext = file.substring(i+1);

        System.out.println("Extension: " + ext);
    }
}