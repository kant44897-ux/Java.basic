public class OOps {
    public static void main(String args[]) {
        Animal dog = new Animal("Bhalu" , 2);
         System.out.println(dog.name);
         System.out.println(dog.speed);
       
       
    }
}

class Animal {
    String name;
    int speed;
    // defult constructor
    Animal(){
        System.out.println("constructor is called");
    }
    Animal(String name , int speed ){
        this.name = name;
        this.speed = speed;
    }
}
