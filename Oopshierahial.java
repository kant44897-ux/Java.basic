public class OOps {
    public static void main(String args[]){
        Fish f1 = new Fish();
        f1.eats();
        f1.breath();
        //f1.leg();
        Birds b1 = new Birds();
        b1.eats();
        b1.fly();
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
class Mammel extends Animal {
    void walk() {
        System.out.println("wlks on legs");
    }
}
class Fish extends Animal {
    void swims() {
        System.out.println(" all fish swims ");
    }
}
class Birds extends Animal {
    void fly(){
        System.out.println("only birds can fly");
    }
}
