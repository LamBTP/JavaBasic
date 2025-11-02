package Ham;

public class DemoHamcoTrave {
    String name = "Phuong lam";
    int age = 18;
    String address = "HH";
    int a, b;

    //Khai báo hàm có trả vêf
    public  String getName(){
        return name;
    }

    public int cong2so(){
        return a + b;
    }
    public static void main(String[] args) {
        DemoHamcoTrave object1 = new DemoHamcoTrave();
        System.out.println(object1.cong2so());
    }
}
