package SwitchCase;

import java.sql.SQLOutput;

public class DemoSwitchCase {
    public static void main(String[] args) {
        String browser = "Chorme";

        switch (browser) {
            case "Chorme":
                System.out.println("Chạy web với trình duyệt chorme");
                break;
            case "EDGE":
                System.out.println("Chạy web với EDGE");
                break;
            default:
                System.out.println("Chạy mặc định");


        }
    }



}
