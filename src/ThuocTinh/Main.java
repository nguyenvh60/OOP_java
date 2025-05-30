package ThuocTinh;

// Có thể truy cập các thuộc tính bằng cách tạo một đối tượng của lớp và bằng cách sử dụng cú pháp dấu chấm ( .):
// Ví dụ sau sẽ tạo một đối tượng của lớp Main, với tên myObj. Chúng ta sử dụng x thuộc tính trên đối tượng để in giá trị của nó
public class Main {
    int x = 5;
    int y ;
    String fname = "Hoàng";
    String lname = "Nguyên";
    int age = 21;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);

        // Cũng có thể sửa đổi giá trị thuộc tính:
        Main myObj1 = new Main();
        myObj1.y = 40;
        System.out.println(myObj.y);

        // Hoặc ghi đè các giá trị hiện có: Thay đổi giá trị x thành 25:
        Main myObj2 = new Main();
        myObj2.x = 25; // x is now 25
        System.out.println(myObj2.x);

        // Nhiều đối tượng
        Main myObj3 = new Main();  // Object 1
        Main myObj4 = new Main();  // Object 2
        myObj4.x = 25;
        System.out.println(myObj3.x);  // Outputs 5
        System.out.println(myObj4.x);  // Outputs 25

        // Thay đổi giá trị x thành 25 trong myObj4, và giữ nguyên x myObj3:


        // Nhiều Thuộc Tính
        Main myObj5 = new Main();
        System.out.println("Name: " + myObj5.fname + " " + myObj5.lname);
        System.out.println("Age: " + myObj5.age);


    }


}
