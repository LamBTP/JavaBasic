package DieukienIFELSE;

public class DemoIF_ELSE_IF {
    public static void main(String[] args) {
        double dtb = 8.5;
        if (dtb >= 8) {
            System.out.println("Xếp loại giỏi");
        } else if (dtb > 7 && dtb <8) {
            System.out.println("Xếp loại khá");

        } else if (dtb >= 5 && dtb <=7) {
            System.out.println("Xếp loại trung bình");

        }else {
            System.out.println("Ở lại lop");
        }
    }
}
