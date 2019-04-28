import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = nhapChuoi(scanner);
        String c = nhapKiTuCanDem(scanner);

        System.out.println("Chuoi : " + str);
        System.out.println("Ki tu dem trong chuoi : " + c);
        System.out.println("So lan xuat hien: " + dem(str, c));
    }

    static String nhapChuoi(Scanner scanner) {
        System.out.println("Nhap chuoi : ");
        String str = scanner.nextLine();
        return str;
    }

    static String nhapKiTuCanDem(Scanner scanner) {
        System.out.println("Nhap ki tu can dem : ");
        String c = scanner.nextLine();
        return c;
    }

    static int dem(String str, String c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c.charAt(0)) {
                count++;
            }
        }
        return count;
    }
}
