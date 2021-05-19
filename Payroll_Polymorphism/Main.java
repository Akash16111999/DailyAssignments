import java.util.Scanner;

public class Main {
    public static void adminPanel() {
        Scanner sc = new Scanner(System.in);
        Admin a = new Admin();

        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter salary: ");
        int sal = sc.nextInt();

        a.adjustSalary(sal);
        a.doAdminStuff();
        sc.close();
    }

    public static void academicPanel() {
        Scanner sc = new Scanner(System.in);
        Academic a = new Academic();

        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter salary: ");
        int sal = sc.nextInt();

        a.adjustSalary(sal);
        a.giveLecture();
        sc.close();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the choice:\n1. Admin\n2. Academic");
        int ch = sc.nextInt();
        if (ch == 1)
            adminPanel();
        else if (ch == 2)
            academicPanel();
        else
            System.out.println("Wrong choice man!");
        sc.close();
    }
}