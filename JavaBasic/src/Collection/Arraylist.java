package Collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    // Do hạn chế của mảng: Không thể thêm, xóa phần tử
    // Java cung cấp tập collection: cho chúng ta có thể thêm, xóa, và thay đổi kích thước tệp này
    // ArrayList: Nó giống như mảng nhưng có thể kéo dãn kích thước các phần tử
    // HashMap: Cho phép lưu trưc các cặp (key, value) và tìm kiếm các giá trị bằng key

    static void main() {
        //1.1 Khai báo list
        ArrayList<Integer> lst1 = new ArrayList<>();

        //1.2. Khai báo với số lượng ban đầu
        ArrayList<Integer> lst2 = new ArrayList<>(5);

        //1.3. Khởi tạo list các phần tử sẵn có
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,5));

        //1.4 Xuất list
        System.out.println(lst3);
        System.out.println(lst1);
        System.out.println(lst2);

        ArrayList<Integer> lst4 = new ArrayList<>();

        //2. add list
        lst4.add(3);
        lst3.add(8);

        System.out.println("lst4: ");
        System.out.println(lst4);
        System.out.println(lst3);

        //2.1. Add vào 1 vị trí chỉ định
        lst3.add(2, 890);
        System.out.println(lst3);

        //2.2. Trả về số phâ tử: size
        System.out.println("Số phần tử của lst3: " + lst3.size());

        //2.3. get(int index); trả về giá trị list tại vị trí
    }
}
