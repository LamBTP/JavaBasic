package Package2.ObjectClass;

public class Student {
    String name ;
    int age ;
    String phone;

    //Khai báo hàm xây dựng không có tham số
//    public Student{
//
//    }

    //Khai báo hàm xây dựng có tham số
    public Student(String name, int age) {
        //Truyền tải giá trị
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void setInfo() {
        System.out.println("Tên: " + getName());
        System.out.println("Tuổi: " + getAge());
    }

    public static void main(String[] args) {
        Student st1 = new Student("lâm", 25);
        st1.setInfo();

    }
}
