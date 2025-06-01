package Bai7_KeThua;

public class Car extends PhuongTien {
    private String modelName = "Mustang";    // Thuộc tính Car

    public static void main(String[] args) {

        // Tạo 1 dối tượng
        Car myCar = new Car();

       // Gọi phương thức honk() (từ lớp PhuongTien) trên đối tượng myCar
        myCar.honk();

        // Hiển thị giá trị của thuộc tính thương hiệu (từ lớp PhuongTien) và giá trị của modelName từ lớp Car
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
