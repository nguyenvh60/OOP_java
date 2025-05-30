package Bai4_Constructor;

// Tạo 1 hàm tạo
public class Main {
    int x;  // Tạo 1 thuộc tính

    // Tạo một lớp Constructor cho lớp Main
    public Main() {
        x = 5;  // Đặt giá trị ban đầu cho thuộc tính lớp x
    }



    // Các hàm tạo cũng có thể sử dụng tham số để khởi tạo các thuộc tính.
    public Main(int y) {
        x = y;
    }
    // Bên trong constructor, chúng ta đặt x thành y (x=y). Khi chúng ta gọi constructor, chúng ta truyền một tham số vào constructor (5),
    // sẽ đặt giá trị của x thành 5:

    // Bạn có thể có nhiều tham số tùy ý:
    int modelYear;
    String modelName;

    public Main(int year, String name) {
        modelYear = year;
        modelName = name;
    }




    public static void main(String[] args) {
        Main myObj = new Main(); //Tạo một đối tượng của lớp Main (Điều này sẽ gọi hàm Constructor)
        System.out.println(myObj.x);

        Main myObj2 = new Main(5);
        System.out.println(myObj2.x);

        Main myCar = new Main(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}


