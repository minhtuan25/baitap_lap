import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args) {
        String hovaten, quequan, chuyennganh;
        String gioi4 = "f";
        String gioi3 = "m";
        int namsinh, cannang,stt;
        float chieucao, diemtb;
        char gioitinh;
        int i = 1;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("*** moi nhap ung vien so 1:");
            System.out.println("stt");
            stt=sc.nextInt();
            sc.nextLine();
            System.out.println("+ nhập họ và tên :");
            hovaten = sc.nextLine();
            System.out.println("+ nhap năm sinh :");
            namsinh = sc.nextInt();
            System.out.println("+ nhap giới tính ;");
            gioitinh = sc.next().charAt(0);


            System.out.println("+ nhập chiều cao :");
            chieucao = sc.nextFloat();
            System.out.println("+ nhập cân nặng :");
            cannang = sc.nextInt();


            sc.nextLine();
            System.out.println("+ nhập quê quán :");
            quequan = sc.nextLine();
            System.out.println("+ nhập chuyên ngành :");
            chuyennganh = sc.nextLine();
            System.out.println("+ nhập điểm TB :");
            diemtb = sc.nextFloat();
            i++;
        } while (i < 4);


        System.out.println("danh sách các thí sinh");
        System.out.printf("stt\tHo va ten\tNam sinh\tGioi tinh\tchieu cao\tCan nang\tQue quan\tChuyen ngành\tDiem TB\n" );
        System.out.println("===================================================================================");
        System.out.print(+stt +"\t"+hovaten+"\t"+namsinh+"\t"+gioitinh+"\t"+quequan+"\t"+chuyennganh+"\t"+diemtb);
        System.out.printf("%-15s", hovaten);

    }
        }
