public class OOps {
    public static void main(String args[]){
        Dog d1 = new Dog();
        d1.eats();
        d1.breath();
        d1.leg();
    }
}

class Animal {
    String color;
    void eats(){
        System.out.println("Animal eats");
    }
    void breath(){
        System.out.println("Animal breath");
    }
}
class Dog extends Animal {
    String bread;
    void leg(){
        System.out.println("4 legs");
    }
}
