import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Buoi_1 {

    // snippet_code: gõ code nhanh
    // ctrl + / để comment
    //main + enter -> tạo hàm main nhanh
    // Println: xuống dòng, Print: in dữ liệu trên cùng dòng
    // Gõ sout + tab/enter -> tạo lệnh system.out.println nhanh

    // biến là một vùng lưu trữ dữ liệu
    // cú pháp: <kiểu dữ liệu><tên biến> = <giá trị>;
    // chuỗi: string
    // số: int(số nguyên), float(số thập phân, 7-8 số sau dấu ,), double(số thập phân, 15-16 số sau dấu ,)
    // boolen: true/false

    //Scanner là biến dùng để nhận dữ liệu người dùng

    // Toán tử
    // Toán tử số học : + - * / %
    // Toán tử so sánh




    public static void main (String[]args) {
        // lệnh xuất dữ liệu / in dữ liệu
        // System.out.print("hello testing");
        //  System.out.print("hello Trịnh An Thành");
        System.out.println("hello testing");
        System.out.println("Hello World");

        // tạo biến tên là name
        String hoTen = "Trịnh An Thành";
        String diaChi = "Hà nội";
        int tuoi = 20;
        System.out.println(hoTen);

        boolean isStudent = true;
        boolean isLogin = false;
        System.out.println("Họ và tên: " + hoTen);

        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập họ và tên");
        String fullname = sc.nextLine();

        // ví dụ: nhập và in thông tin học sinh gồm họ tên, tuổi, trường, lớp
        System.out.println("Vui lòng nhập tuổi");
        int age = sc.nextInt() ;// kiểu dữ liệu Int
        sc.nextLine();
        System.out.println("Vui lòng nhập trường");
        String school = sc.nextLine();
        System.out.println("Vui lòng nhập lớp");
        String Lop = sc.nextLine();
        System.out.println("Họ và tên: " + fullname);
        System.out.println("Tuổi: " +age);
        System.out.println("Trường: " + school);
        System.out.println("lớp: " + Lop);


        int soA = 5;
        int soB = 10;
        int tinhTong = soA + soB;
        int tinhHieu = soB - soA;
        int tinhTich = soA*soB;
        int tinhThuong = soA/soB;

        //%: chia lấy dư
        int soDu = soA%soB;
        System.out.println("Tổng: " + tinhTong + ", Hiệu: "
                + tinhHieu + ", Tích: " + tinhTich+ ", Thương: " + tinhThuong + ", Số dư: " + soDu );

        //so sánh bằng
        boolean kq1 = soA == soB;
        // so sánh khác
        boolean kq2 = soA!=soB;
        // so sánh lớn hơn, bé hơn, lớn hơn bằng, bé hơn bằng
        Boolean kq3 = soA > soB;
        Boolean kq4 = soA >= soB;

        //
        String a = "hello";
        String b = "hello";
        String c = new String("Hello"); // tạo cái này làm string pool khác, c hỗ trợ nhiều phương thức
        Boolean kq5 = a==b;//true
        Boolean kq6= c==b; // false
        //Muốn so sánh được, sử sụng equal
        boolean kq7 = b.equals(c); // true
      // muốn check vùng nhớ: dùng System.out.println(System.identityHashCode(a)); (tìm tới vị trí trên string bool)

        System.out.println(kq6);
    }



    }

