import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaterialManagement materialManagement = new MaterialManagement();
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Add meterial");
            System.out.println("2. Show list");
            System.out.println("3. Count money by id");
            System.out.println("Your choice: ");
            choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    materialManagement.addAll();
                    break;
                case 2:
                    materialManagement.showList();
                    break;
                case 3:
                    materialManagement.count(sc);
                    break;
            }
        } while (choice != 0);
    }
}
