public class OOps {
    public static void main(String args[]) {
        Animal dog = new Animal();
        dog.name = "bhalu";
        dog.speed = 5;
        
        // Copy constructor.......
        Animal cat = new Animal(dog);
       
       
    }
}

class Animal {
    String name;
    int speed;
    // Copy constructor Steps.......
    Animal(Animal dog){
        this.name = dog.name;
        this.speed = dog.speed;
    }
    
    // defult constructor
    Animal(){
        System.out.println("constructor is called");
    }
    Animal(String name , int speed ){
        this.name = name;
        this.speed = speed;
    }
}
