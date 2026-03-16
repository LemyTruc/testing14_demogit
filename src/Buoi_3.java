import java.lang.reflect.Array;
import java.util.Arrays;

public class Buoi_3 {
    public static void main(String[] args) {
        // mảng: là một cấu trúc dữ liệu dùng để lưu nhiều giá trị cùng kiểu dữ liệu
        // cùng 1 mục đích sử dụng
        // khai báo biến: kiểu dữ liệu tenBien = giá trị;
        // khai báo mảng: kiểu dữ liệu [] tenmang = new kiểu dữ liệu [kích thước] -> số lượng phần tử trong mảng
        // vị trí của giá trị trong 1 mảng được gọi là index, bắt đầu từ sô 0

        int [] mangso = new int[5];
        mangso[0] = 1;
        mangso[1] = 2;
        mangso[2] = 3;
        mangso[3] = 4;
        mangso[4] = 4;

        System.out.println("giá trị của phần tử có index 0:"+ mangso[4]);
        System.out.println("giá trị của mảng là: " + Arrays.toString(mangso));

        // khai báo mảng; kiểu dữ liệu [] tenMang = {giá trị 1; giá trị 2; giá trị 3; ...}
        String[] mangTen = {"Trịnh An Thành", "Khôi", "Hùng"};
        mangTen [0] = "Nguyễn bảo giang";
        System.out.println("Giá trị của phần tử có index 0: " +mangTen[0]);
        System.out.println("Số lượng phần tử trong mảng: " + mangTen.length);// trả về số lượng phần tử trong mảng

        // duyệt mảng: sử dụng vòng lặp để lấy ra được phần tử trong mảng
        for (int i= 0; i <mangTen.length; i++){
            System.out.println("Phần tử có index " + i + "là " + mangTen);
        }
        // for... each
        // có cú pháp: for (kiểu dữ liệu tenBien : tenMang) {logic sử dụng tenBien}
        for(String ten : mangTen){
            System.out.println("tên học sinh: " + ten);
        }


        // if else if statement:
        // toán tử 3 ngôi:
        // cú pháp: điều kiện đúng? thực hiện logic A : thực hiện logic B
        int diem = 85;
       // có thể viêt: System.out.println(diem>=80? "học sinh đạt điều kiện":"học sinh không đạt điều kiện"); hoặc
        String KetQua = diem>=80? "học sinh đạt điều kiện":"học sinh không đạt điều kiện";
        System.out.println(KetQua);

        // ép kiểu dữ liệu: chuyển đổi từ kiểu dữ liệu này sang kiểu dữ liệu khác
        // ép kiểu ngầm định: tự động chuyển độ dữ liệu nhỏ hơn sang kiểu dữ liệu lớn hơn (cùng một loại dữ liệu)
        // kiểu dữ liệu là số: byte < short< int< long < float< double
        byte so1=10;
        int so2= so1; // ép kiểu ngầm định từ byte sang int

        // ép kiểu tường minh, tự động chuyển dữ liệu từ kiểu dữ liệu lớn hớn sang kiểu dữ liệu bé hơn (cùng 1 loại dữ liệu)
        // cú pháp: <kiểu dữ liệu cần chuyển> tenBien = (kiểu dữ liệu cần chuyển) giá trị cần chuyển
        double so3 = 3.14;
        int so4= (int) so3; // ép kiểu tường minh từ double sang int

        // ép kiểu từ số sang chuỗi hoặc ngược lại
        int so5 = 100;
        String str5 = Integer.toString(so5); // ép từ số sang chuỗi
        String str5_1 = String.valueOf(so5); // cách khác để ép từ số sang chuỗi

        String str6 = "200";
        int so6 = Integer.parseInt(str6); // ép từ chuỗi sang số

    }
}

