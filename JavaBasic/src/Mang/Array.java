package Mang;

public class Array {
    static void main(String[] args) {
        // mảng được sử dụng để lưu trữ nhiều giá trị trong 1 biến duy nhất
        //Khai báo mảng
        // Kiểu_dữ_liệu[] <tên mảng> = new Kiểu_dữ_liệu{gt1, gt2...}

        //Khai báo mảng bt:
        String[] name;
        //Kahi báo mảng kèm kích thước
        String[] age = new String[5];

        //Khai báo mảng kèm giá trị
        int[] num = new int[] {1,2,3};

        //Truy xuat phần tử của mảng. in mảng
        // tên_mảng[vị trí phần t]
        // mảng chạy từ 0 ->

        int[] array5 = {1, 2, 5, 7, 9, 2, 3, 54};
        System.out.println(array5[3]);

        // Chiều dài mảng dùng length
        //Tên_mảng.length
        System.out.println("Chiều dài của mảng là: " +array5.length);
        System.out.println(age.length);
    }
}
