import java.util.Scanner;

public class CalcArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth: ");
        float breadth = sc.nextFloat();
        int area = (int) length * (int) breadth;

        System.out.println("The area of rectangle is :" + area);
        sc.close();
    }
}
