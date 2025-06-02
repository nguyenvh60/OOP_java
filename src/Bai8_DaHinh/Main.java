package Bai8_DaHinh;

public class Main {

    // Bây giờ chúng ta có thể tạo Pig và Cat gọi animalSound()phương thức trên cả hai đối tượng:
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Tạo đối tượng động vật
        Animal myPig = new Pig();  // Tạo đối tượng heo
        Animal myCat = new Cat();  // Tạo đối tượng mèo
        Animal myDog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myCat.animalSound();
        myDog.animalSound();
    }
}
