package Bai9_TruuTuong;

// Lớp truu tượng
abstract class Animal {
    public abstract void animalSound(); //// Phương thức trừu tượng (không có thân)
    public void sleep() {
        System.out.println("Zzz");
//        Animal myObj = new Animal(); // lỗi không thể tạo đối tượng của lớp Animal:
//        Để truy cập lớp trừu tượng, nó phải được kế thừa từ một lớp khác.
//        Hãy chuyển đổi lớp Animal mà sử dụng trong chương Đa hình thành một lớp trừu tượng:
    }

}