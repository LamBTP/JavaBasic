package Ham;

public class DemoHamKhongtrave {
    String name = "Phuong lam";
    int age = 18;
    String address = "HH";

    //khai báo hàm không trả về
    public void showInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
    public static void main(String[] args) {
        System.out.println("Showing 1 to 25 of 495 entries");
        DemoHamKhongtrave object1 = new DemoHamKhongtrave();
        object1.showInfo();
    }
}
