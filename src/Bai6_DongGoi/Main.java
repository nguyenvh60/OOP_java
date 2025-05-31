package Bai6_DongGoi;

public class Main {
    public static void main(String[] args) {
//        Person myObj = new Person();
//        myObj.name = "Hoàng Nguyên";  // lỗi
//        System.out.println(myObj.name); // lỗi
        // Nếu biến được khai báo là public, sẽ có kết quả
        // Thay vào đó, chúng ta sử dụng các phương thức getName() và setName()để truy cập và cập nhật biến:

        Person myObj = new Person();
        myObj.setName("Hoàng Nguyên"); // Đặt giá trị của biến name thành "Hoàng Nguyên"
        System.out.println(myObj.getName());


    }
}
