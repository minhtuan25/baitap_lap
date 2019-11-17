import java.util.Scanner;

public class baitaplab1_1 {

    public static void main(String[] args) {
            String hovaten,quequan,chuyennganh;
            String gioi4 ="f";
        String gioi3 ="m";
        int namsinh,cannang;
        float chieucao,diemtb;
        char gioitinh;
        Scanner sc =new Scanner(System.in);

        System.out.println("*** moi nhap ung vien so 1:");
        System.out.println("+ nhập họ và tên :");
        hovaten= sc.nextLine();
        System.out.println("+ nhap năm sinh :");
        namsinh =sc.nextInt();
        System.out.println("+ nhap giới tính ;");
        gioitinh=sc.next().charAt(0);



        System.out.println("+ nhập chiều cao :");
        chieucao=sc.nextFloat();
        System.out.println("+ nhập cân nặng :");
        cannang=sc.nextInt();


        sc.nextLine();
        System.out.println("+ nhập quê quán :");
          quequan=sc.nextLine();
        System.out.println("+ nhập chuyên ngành :");
        chuyennganh=sc.nextLine();
        System.out.println("+ nhập điểm TB :");
        diemtb=sc.nextFloat();

        System.out.println("+ họ và tên :"+hovaten);
        System.out.println(" + năm sinh :"+namsinh);
        if (gioi3 =="m"){
            System.out.println("+ giơi tinh"+ "nam");
        }
        if (gioi3 =="f"){
            System.out.println("gioi tinh"+ "nữ");
        }


        System.out.println("+ chiều cao :"+chieucao);
        System.out.println("+ cân nặng :"+cannang);
        System.out.println("+ quê quán :"+quequan);
        System.out.println("+ chuyên ngành :"+chuyennganh);
        System.out.println("+ điểm TB :"+diemtb);




    }
}
