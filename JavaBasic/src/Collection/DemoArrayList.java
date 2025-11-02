package Collection;

import java.util.ArrayList;
import java.util.List;


public class DemoArrayList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");


//        arrayList.remove( index:1);
        arrayList.contains("Java");

        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");

//        ArrayList<String> menuList = new ArrayList<>(String);
//        menuList.contains("PHP");
//        menuList.size();
   }
}

