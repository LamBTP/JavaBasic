package StaticTrongJava;

public class Company {
    //Khai báo biến static
    public static String companyName = "VietNam";
    public static String companyaddress = "ha Noi";


    //Dùng trong test automation phải set up biến toàn cục. test web phải có URL, mọi testcase đều thông qua URL đó, Url chính là cục bộ
    public static String EMAIL = "Admin";
    public static String Url = "http";
    public static String password = "0501";


    //Khởi tại hàm static
    public static void showInfo(){
        System.out.println(EMAIL);
        System.out.println(Url);
    }
}
