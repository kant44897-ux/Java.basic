public class OOps {
    public static void main(String args[]) {
        Animal dog = new Animal();
        dog.setname(" tommy ");
        dog.setage(5);
        System.out.println(dog.name);
        System.out.println(dog.age);
    }
}

class Animal {
    String name;
    int age;
    void setname(String name) {
        this.name = name;
    }
    void setage(int age) {
        this.age = age;
    }
}
