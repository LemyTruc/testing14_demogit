import java.util.Scanner;

public class Bai_tap_buoi_3 {
    public static void main(String[] args) {
        // bài tập 1: quản lý chi tiêu cá nhân trong 7 ngày,
        // cho phép người dùng nhập vào chi tiêu cá nhân trong 7 ngày, sau đó in ra tổng chi tiêu và trung bình chi tiêu mỗi ngày
        // chi tiêu cao nhất và thấp nhất trong 7 ngày
        Scanner sc = new Scanner(System.in);
//        double[] chiTieu = new double[7];
//        for (int i=0; i<chiTieu.length; i++) {
//            System.out.println("Nhập vào chi tiêu từng ngày " + (i + 1) + ";");
//            chiTieu[i] = sc.nextDouble();
//        }
//        double chiTieuCaoNhat = chiTieu[0];
//        double chiTieuThapNhat = chiTieu[0];
//        double tongChiTieu =0;
//        double chiTieuTrungBinh=0;
//        for (double chi :chiTieu){
//            tongChiTieu += chi; // tổng chi tiêu = tổng chi tiêu + chi
//            if (chi > chiTieuCaoNhat){
//                chiTieuCaoNhat = chi;
//            }
//        }
//        for (int i = 0; i<chiTieu.length; i++){
//            if (chiTieu[i] > chiTieuThapNhat){
//                chiTieuThapNhat = chiTieu[i];
//            }
//        }
//
//        chiTieuTrungBinh = tongChiTieu/chiTieu.length;
//        System.out.println("Tổng chi tiêu trong 7 ngày: " + tongChiTieu);
//        System.out.println("Trung bình chi tiêu mỗi ngày: " +chiTieuTrungBinh);

        // bài tập 2: quản lý điểm số của học sinh trong 5 môn học, cho phép người dùng nhập vào
        // điểm số học sinh trong 5 môn học, sau đó in ra điểm trung bình, điểm cao nhất, điểm thấp nhất
        // và số môn học có điểm số >5
//        int[] diemSo = new int[5];
//        for (int i=0; i<diemSo.length; i++) {
//            System.out.println("Nhập điểm số môn thứ " + (i+1));
//            diemSo[i] =sc.nextInt();
//        }
//        int tongDiem = 0;
//        double diemTrungBinh = 0;
//        int diemCaoNhat = 0;
//        int diemThapNhat = diemSo[0];
//        int diemLonHon5 =0;
//        for (int diem:diemSo){
//            tongDiem +=diem;
//            if(diem>diemCaoNhat){
//                diemCaoNhat = diem;
//            }
//            if(diem<diemThapNhat){
//                diemThapNhat = diem;
//            }
//            if (diem>5){
//                diemLonHon5 ++;
//            }
//        }
//        diemTrungBinh = (double) tongDiem /diemSo.length;
//        System.out.println("điểm trung bình: " + diemTrungBinh);
//        System.out.println("Điểm cao nhât" + diemCaoNhat);
//        System.out.println("Điểm thấp nhất: " + diemThapNhat);
//        System.out.println("Số môn học có điểm lớn hơn 5 là " + diemLonHon5);



        //bài tập 3: quản lí thông tin nhân viên, cho phép người dùng nhập thông tin nhân viên
        // số giờ làm mỗi ngày trong 1 tuần, sau đó in ra tổng số giờ làm trong tuần, trung bình số giờ làm mỗi ngày
        // và số ngày làm việc có số giờ làm >=8 giờ
        int[] soGio = new int[7];
        for (int i=0; i<soGio.length; i++) {
            System.out.println("Nhập số giờ làm việc ngày thứ: " + (i+1));
            soGio[i] =sc.nextInt();
        }
        int tongSoGio = 0;
        int giolamlonhon8 = 0;
        for (int gio:soGio){
            tongSoGio +=gio;
            if (gio>=8){
                giolamlonhon8 ++;
            }
        }
        double trungBinhSoGio = (double) tongSoGio/soGio.length; // -> ép kiểu về double

        System.out.println("Tổng giờ làm trong tuần là: " + tongSoGio);
        System.out.println("Trung bình số giờ làm mỗi ngày: " + trungBinhSoGio);
        System.out.println("Số ngày làm việc có số giờ >=8: " + giolamlonhon8);
    }

}
