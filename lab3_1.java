import java.util.Scanner;

public class lab3_1 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số a");
        a=sc.nextInt();
        System.out.println("nhap số b");
        b=sc.nextInt();

        if ( b == 0)
        {

            System.out.println(b);
        }
        else{
             c=a/b;
            System.out.println("kết quả ="+c);
        }
    }
}
