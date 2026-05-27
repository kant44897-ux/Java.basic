import java.util.Scanner;
class Main{
    
public static void trgHoo( int n ){
    for( int i = 1; i <= n; i++){
        for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= 2*i-1; j++){
             System.out.print("*");
        }
         System.out.println();
    }
}    
    
public static void trgHo( int n ){
        for( int i = 1; i <= n; i++){
           for(int j = 1; j <= n-i; j++){
               System.out.print(" ");
           } 
           for(int j = 1; j <= 2*i-1; j++){
               if( i == 1 || i == n || j == 1 || j == 2*i-1){
                    System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           }
                          System.out.println();
        }
    }
    
    
public static void uniquEsss( int n ){
    int num = 1;
    for( int i = 1; i <= n; i++){
        for(int j = 1; j <= n-i; j++){
             System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
             System.out.print(num + " ");
            num++;
        }
        System.out.println(" ");
    }
}    

public static void uniquEss( int n ){
          for(int i = 1; i <= n; i++){
         for(int j = 1; j <= n-i; j++){
             System.out.print(" ");
         }
         for(int j = 1; j<=i; j++){
             System.out.print(" " +j);
             
         }
         System.out.println();
     }
     }
    
public static void uniquEs( int n ){
     for(int i = 1; i <= n; i++){
         for(int j = 1; j <= n-i; j++){
             System.out.print(" ");
         }
         for(int j = 1; j<=i; j++){
             System.out.print(" " +i);
             
         }
         System.out.println();
     }
    }
    
public static void uniquE( int n ){
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
        }
        for(int j = 1;j <= i; j++){
            System.out.print(j);
        }
        for(int j = i - 1; j >= 1; j--){
            System.out.print(j);
        }
        System.out.println();
    }
}
    
public static void palinSum( int n ){
        int sum = 0;
        int rev = 0;
        while(n != 0){
            int i = n % 10;
            sum = sum + i;
            n = n/10;
        }
        System.out.print(sum);
   }

public static void palinDo( int n ){
            int orig = n;
            int sum = 0;
            int rev = 0;
            while(n!=0){
                int i = n%10;
                rev = rev*10+i;
                
                n = n/10;
            }
            if (rev == orig){
            
                System.out.print("your n is palimdrom");
              }  else{
                  System.out.print("your number is not plaindrom");
              }  
        }
        
public static void starHoll( int n ){
        for(int i = 1; i <= n; i++){
            for( int j = 1; j<=n; j++){
                 if(i == 1 || i == n || j == 1 || j == n){
                     System.out.print("* ");
             } else{
                              System.out.print("  ");
             }
            }
             System.out.println();
        }
    }
    
public static void starPatrn(int n){
        
       for(int i = 1; i <= n; i++){
           for(int j = 1; j <= n-i+1; j++){
                System.out.print(" * ");
           }
           System.out.println();
       }
     }
     
public static void starPattt(int n){
        
     for(int i = 1; i<=n; i++){
         for(int j = 1; j<=n-i; j++){
             System.out.print(" ");
         }
         for(int j = 1; j<=i; j++){
            System.out.print(" *  ");
           }   
           System.out.println();
      }
     }
    
public static void starPatt(int n){
        
      for(int i = 1; i<=n; i++){
          for(int j = 1; j<=n-i; j++){
              System.out.print(" ");
          }
          for(int j = 1; j<=i; j++){
               System.out.print("*");
          }
           System.out.println();
      }
     }
    
public static void starPat(int n){
         for(int i = 1; i<=n; i++){
             for( int j = 1; j<=i; j++){
                 System.out.print("*");
             }
             System.out.println();
         }
     }
    
    
public static void table(int n){
        
        for(int i = 1; i <= 10; i++){
           int t = n * i; 
           System.out.println(t);
         }
         
    }
    
    
 public static int factorial(int n){
         int fact = 1;
         for(int i = 1; i <= n; i++ ){
             fact = fact * i;
         }
         return fact;
     }
    
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter your num  ");
         int n = sc.nextInt();
     trgHo(n);
         
          
          
          
//          int n = sc.nextInt();
//          int evensum = 0;
//          int oddsum = 0;
//          for(int i = 1; i <= n; i++){
//              int num = sc.nextInt();
//              if(num % 2 == 0){
//                  evensum = evensum + num;
                 
//              }else{
//                  oddsum = oddsum + num;
//              }
//          }
        
        
        
//         System.out.println(evensum);
//         System.out.println(oddsum);
//     }
// }
// System.out.println("enter the value of n");
// int n = sc.nextInt();
// int evensum = 0;
// int oddsum = 0;
// int i = 0;     // this line mean how many tyms loop run
 
//   while(i < n){
//       System.out.println("enter your num  ");
//       int num = sc.nextInt();
        
//         if(num % 2 == 0){
//             evensum = evensum + num;
        
//         }else{
//             oddsum = oddsum + num;
//         }
//      i++;   // loop run like 0 1 2 3 
//     }
//     System.out.println("your odd sum is " +oddsum);
//     System.out.println("your even sum is " +evensum);

        //  System.out.println("enter the value of n");
        //  int n = sc.nextInt();
        //  int fact = 1;
        //  int i = 1;
         
        //  do{
        //      fact = fact * i;
        //      i++;
        //  }while(i <= n);
        //   System.out.println("your factorial is " +fact);
        
        
        
  }
}
  
  
