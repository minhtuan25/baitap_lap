import javax.swing.*;
import java.util.Scanner;

public class lab3_1b {
    public static void main(String[] args) {
        int M = 2;
        float n, R;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n>2");
        n = sc.nextInt();
        if (n < 2) {
            System.out.println("ban phai nhap lai gia tri phai lon hon 2");
        }
        if (n == 2) {
            System.out.println("la so nguyen to");
        }

        R = n % M;
        if (R == 0){
            System.out.println("khong phai so nguyen to");


            if (M < n - 1) {
                M = M + 1;
                System.out.println("m" + M); }
        }
        else {
                System.out.println("n so nguyen to");
            }


    }
}



