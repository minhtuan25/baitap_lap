import java.util.Scanner;

public class lab3_2 {
    public static void main(String[] args) {
        //phuong trinh bac hai

        float a,b,c;
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap a");
        a=sc.nextInt();
        System.out.println("nhap b");
        b=sc.nextInt();
        System.out.println("nhap c");
        c=sc.nextInt();

        float delta = b*b - 4*a*c;
        if (delta>0){
            System.out.println("pt cos hai nghiem x1= "+(-b+ Math.sqrt(delta)));
            System.out.println("x2="+(-b-Math.sqrt(delta)));

        }
        if (delta<0){
            System.out.println("pt vo nghiem");
        }
        if (delta==0){
            System.out.println("pt co nghiem kep x1,x2="+(-b/2*a));
        }
/// b

    }
}
