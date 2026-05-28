import java.util.*;
class Main {
public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int are[] = new int[n];
          for( int i = 0; i<n; i++){   //this for loop is to take input and put                           in array position i  
             are[i] = sc.nextInt();
         }
         int tar = sc.nextInt();
         boolean isPresent = false;
         for(int i = 0; i<n; i++){
             if( tar == are[i]){
                 isPresent = true;
                 break;
             }
             
         }
         if(isPresent == true){
             System.out.println("tar is present");
         }else{
             System.out.println("sorry not found");
         }
    }
}
