package Main;

public class Second {
//    Sử dụng nhiều lớp
//    Bạn cũng có thể tạo một đối tượng của một lớp và truy cập nó trong một lớp khác.
//    Điều này thường được sử dụng để tổ chức các lớp tốt hơn (một lớp có tất cả các thuộc tính và phương thức,
//    trong khi lớp kia giữ main() phương thức (mã sẽ được thực thi)).Hãy nhớ rằng tên của tệp java phải khớp với tên lớp.

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
