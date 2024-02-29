import java.util.Scanner;

public class agus {
    public static void main(String[] args) {
        Scanner student = new Scanner(System.in);
        boolean sudah = false;

        while (!sudah) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.println("Choose option (1-3): ");
            int suara = student.nextInt();

            switch (suara) {
                case 1:
                    System.out.println("Enter your NIM: ");
                    String studentNIM = student.next();
                    if (studentNIM.length() == 15) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }
                    break;
                case 2:
                    System.out.println("Enter your username (admin): ");
                    String Username = student.next();
                    System.out.println("Enter your password (admin): ");
                    String Password = student.next();
                    if (Username.equals("admin") && Password.equals("admin")) {
                        System.out.println("Successful Login as Admin");
                    } else {
                        System.out.println("Admin User Not Found!!");
                    }
                    break;
                case 3:
                    sudah = true;
                    System.out.println("terima kasih");
                    break;
                default:
                    System.out.println("pilihan tidak tersedia");
            }
        }

    }
}