package Mang;

public class DemoMang {
    public static void main(String[] args) {
        //Khai báo mảng
        String mangName[] = new String[5];


        //Gán giá trị cho mảng
        mangName[0] = "Phương";
        mangName[1] = "Lam";
        mangName[2] = "Nhung";

        //Duyệt giá trị trong mảng
        //Dùng vòng lặp For
        for (int i = 0; i< mangName.length; i++){
            System.out.println(mangName[i]);

        }
        System.out.println("------");

        for (int x = 0; x < 3; x++){
            System.out.println(mangName[x]);

        }
        System.out.println("-------");

        //For cải tiến
        for (String name:mangName){
            System.out.println(name);
        }
    }
}
