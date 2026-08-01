public class OOps {
    public static void main(String args[]) {
        Animal dog = new Animal();
       dog.setname("Tommy");
       dog.setage(4);
       
       System.out.println(dog.getname());
       System.out.println(dog.getage());
       
       
    }
}

class Animal {
   private String name;
   private int age;
   String getname(){
       return this.name;
   }
   void setname(String name) {
       this.name = name;
   }
   int getage() {
       return this.age;
   }
   void setage(int age) {
       this.age = age;
   }
}
