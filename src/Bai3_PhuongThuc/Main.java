package Bai3_PhuongThuc;

public class Main {
    static void myMethod() {
        System.out.println("Hello World!");
//        myMethod()in ra một văn bản (hành động), khi nó được gọi .
//        Để gọi một phương thức, hãy viết tên phương thức theo sau là hai dấu ngoặc đơn () và dấu chấm phẩy ;
    }

    // Static
    static void myStaticMethod() {
        System.out.println("Các phương thức tĩnh có thể được gọi mà không cần tạo đối tượng");
    }

    // Public
    public void myPublicMethod() {
        System.out.println("Các phương thức công khai phải được gọi bằng cách tạo đối tượng");
    }

    // Tạo phương thức fullThrottle
    public void fullThrottle() {
        System.out.println("Chiếc xe đang chạy nhanh nhất có thể!");
    }

    // Tạo phương thức speed() và thêm tham số
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
    // Bên trong main, gọi các phương thức trên đối tượng myCar



    public static void main(String[] args) {
        myMethod();
        myStaticMethod(); // Không cần tao đối tượng
        Main myObj = new Main();
        myObj.myPublicMethod(); // Buộc phải tạo đối tượng

//        Main myCar = new Main();
//        myCar.fullThrottle();
//        myCar.speed(3000);
    }

    // Dấu chấm (.) được sử dụng để truy cập các thuộc tính và phương thức của đối tượng.
    // Để gọi một phương thức trong Java, hãy viết tên phương thức theo sau là một cặp dấu ngoặc đơn () , theo sau là dấu chấm phẩy (;).



}
