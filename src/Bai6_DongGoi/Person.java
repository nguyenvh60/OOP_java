package Bai6_DongGoi;

public class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;

//        Phương pháp này gett rả về giá trị của biến name.
//        Phương pháp này set lấy tham số ( newName) và gán nó cho biến name. Từ khóa được this sử dụng để tham chiếu đến đối tượng hiện tại.
//                Tuy nhiên, vì biến name được khai báo là private, chúng ta không thể truy cập nó từ bên ngoài lớp này:
    }
}
