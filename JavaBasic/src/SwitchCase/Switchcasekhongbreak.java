package SwitchCase;

public class Switchcasekhongbreak {
    public static void main(String[] args) {
        String browser = "Chorme";

        switch (browser) {
            case "Chorme":
                System.out.println("Chạy web với trình duyệt chorme");
            case "EDGE":
                System.out.println("Chạy web với EDGE");
            case "efox":
                System.out.println("Chạy web với efox");
            default:
                System.out.println("Chạy mặc định");
        }
    }
}
