package StaticTrongJava;

public class Student {

    public String phone ="05012002";
    public static String name = "Phuong lam";


    public static void showInfo(){
        System.out.println(name);

        Student st1 = new Student();
        System.out.println(st1.phone);


    }

    public void testLogin(){
        System.out.println(Company.EMAIL);
        System.out.println(Company.password);
    }
    public static void main(String[] args) {

        Student st1 = new Student();
        System.out.println(st1.phone);

        System.out.println(Company.companyName);
        System.out.println(Company.companyaddress);


        //Khởi tại hàm static
        showInfo();
        Company.showInfo();

    }
}
