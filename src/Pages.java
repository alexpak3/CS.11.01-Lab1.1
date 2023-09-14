import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages;
        System.out.println("Please input your age:");
        pages = scanner.nextInt();
        System.out.println(100-pages);
    }
}
