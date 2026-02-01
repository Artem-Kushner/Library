package homework.leson1;

public class Dog {
    void sayHello(){
        System.out.println("Гав!");
    }
    void catchCat(){
        Cat cat = new Cat();
        System.out.println("Кошка  поймана!");
        sayHello();
        cat.sayHello();

    }
}
