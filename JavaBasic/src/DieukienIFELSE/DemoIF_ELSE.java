package DieukienIFELSE;

public class DemoIF_ELSE {
    // Ví dụ trong test auto
    // Case login thành công
    //1. URL không chứa từ khoá/ login
    //2. Không hiện header login
    //3. Hiện menu dashboard
    int n;
    public static void main(String[] args) {
        int n = 5;
        if(n == 5){
            System.out.println("Login thành cong");
            // Dùng assert để kiểm chứng

        }else{
            System.out.println("Login không thành công");
        }
    }
}
