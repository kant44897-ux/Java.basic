import java.util.Scanner;
class Main{
    
 public static void mirrPat( int n ){
        for( int i = 1; i <= n; i++){
            for( int j = 1; j <= i; j++){
                  System.out.print(j + " ");
            }
            System.out.println();
        }
         
    for( int i = n-1; i >=1; i--){
        for( int j = 1; j <= i; j++){
             System.out.print(j + " ");
        }
        System.out.println();
    }
}
    
public static void payRa( int n ){
    for( int i = 1; i<= n; i++){
        for( int j = 1; j <= n-i; j++){
            System.out.print("  ");
        }
        for( int j = 1; j <= 2*i-1; j++){
            System.out.print("* ");
        }
              System.out.println(); 
        }
        for( int i = n-1; i >= 1; i--){
             for( int j = 1; j <= n-i; j++){
                 System.out.print("  ");
             }
             for( int j = 1; j<=2*i-1; j++){
                 System.out.print("* ");
             }
             System.out.println();
        }
    }    
public static void ultapyaa( int n ){
    int num = n;
    for( int i = 1; i <= n; i++){
        for( int j = 1; j <= n-i; j++){
          System.out.print(" ");
        }
        for( int j = 1; j<=i; j++){
             System.out.print(" " +num);
             num--;
        }
         System.out.println();
    }
}    
public static void ultapya( int n ){
    for( int i = 1; i <= n; i++){
        for( int j = 1; j <= i-1; j++){
             System.out.print(" ");
        }
        for( int j = 1; j <= n-i+1; j++){
             System.out.print(" " +j);
        }
        System.out.println();
    }
}
public static void backVrr( int n ){
    for( int i = 1; i <= n; i++){
        for( int j = 1; j <= n-i; j++){
              System.out.print(" ");
        }
        for( int j = 1; j <= i; j++){
              System.out.print(" " +j);
        }
        System.out.println();
    }
}
public static void backVr( int n ){
    for( int i = 1; i <= n; i++){
        for( int j = 1; j<=i-1;j++){
             System.out.print("  ");
        }
        for( int j = 1; j<=n-i+1; j++){
            System.out.print("* ");
        }
         System.out.println();
    }
}
public static void inVr( int n ){
    for( int i = 1; i <= n; i++){
        for( int j = 1; j <= n-i+1; j++){
            System.out.print("* ");
        }
          System.out.println();
    }
}
public static void butFly( int n ){
    for( int i = 1; i <= n; i++){
        for( int j = 1; j<=i; j++){
            System.out.print("*");
        }
            for( int j = 1; j<=2*(n-i); j++){
              System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                 System.out.print("*");
            }
               System.out.println();
       }
            for(int i = n; i>=1; i--){
                for(int j = 1; j<=i; j++){
                     System.out.print("*");
                }
                for(int j = 1; j <= 2 * (n - i); j++) {
            System.out.print(" ");
        }
                 for(int j = 1; j <= i; j++) {
            System.out.print("*");
            }
             System.out.println();
            }
        }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter your num  ");
         int n = sc.nextInt();
     butFly(n);
   }
}
