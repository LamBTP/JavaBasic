package Mang.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    //Bài 1: Viết chương trình tạo 1 mảng 1 chiều gồm nhiều phần tử là số nguyên, có n phần tử, n do người dùng nhập từ bàn phím
    static void main() {
        //Nhập vào số phần tử của mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();

        //Tạo mảng có n phần tử (cấp phát bộ nhớ cho mảng)
        int[] M =new int[n];

        //Nhập dữ liệu cho mảng
        for (int i = 0; i < M.length; i++) {
            System.out.println("M[" + i + "] = ");
            M[i] = sc.nextInt();
        }
        System.out.println("Mang sau khi tạo là: ");
        System.out.println(Arrays.toString(M));

        //Sắp xếp mảng tăng dần
        Arrays.sort(M);
        System.out.println("Mảng sau khi sort là: ");
        System.out.println(Arrays.toString(M));

        //Đảo ngược mảng
        for (i)
    }
}
