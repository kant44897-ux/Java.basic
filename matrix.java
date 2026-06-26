import java.util.*;
public class matrix {
     public static boolean searchD(int matrices[][] , int m , int n , int key ) {
        int i = n - 1; 
        int j = 0;
        while( i >= 0 && j < m ) {
            if( matrices[i][j] == key ) {
                System.out.print("key is found at"+ "(" + i +","+ j+ ")" );
                return true;
            }
            else if( key < matrices[i][j] ) {
                i--;
            }
            else {
                j++;
            }
        }
        System.out.print("key not found");
        return false;
    }
    public static boolean search(int matrices[][] , int m , int n , int key ) {
     int i = 0; 
     int j = m-1;
     while ( i < n && j >= 0) {
         if ( matrices[i][j] == key ) {
             System.out.print("key is found at"+ "(" + i +","+ j+ ")" );
             return true;
         }
         else if ( key < matrices[i][j] ) {
             j--;
         }
         else {
             i++;
         }
     }
         System.out.print("key not found");
         return false;
 }
      public static void digonalSum(int matrices[][] , int m , int n) {
        int sum = 0; 
        for ( int i = 0 ; i < n; i++ ) {
            sum += matrices[i][i];
             if( i != n - 1 - i ) {
             sum += matrices[i][n - 1 - i];
        }
        }
       
        System.out.println("Diagonal Sum: " + sum);
     }
     public static void spiral(int matrices[][] , int m , int n) {
        int startR = 0; 
        int startC = 0;
        int endR = n-1;
        int endC = m-1;

        while( startR <= endR && startC <= endC ) {
            for( int j = startC; j <= endC; j++ ) {
                System.out.println(matrices[startR][j]+ " ");
            }
            for( int i = startR + 1; i <= endR; i++ ) {
                System.out.println(matrices[i][endC]+ " ");
            }
            for( int j = endC -1; j >= startC; j-- ) {
                if( startC == endC){
                    break;
                }
                System.out.println(matrices[endR][j]+ " ");
            }
            for( int i = endR - 1; i >= startR + 1; i-- ) {
                if(startC == endC){
                    break;
                }
                System.out.println(matrices[i][startC]+ " ");
            }
            startR++;
            startC++;
            endC--;
            endR--;
        }
            System.out.println();
     }
     public static boolean searching(int matrices[][] , int key , int m , int n) {
          for( int i = 0; i < n; i++ ) {
            for( int j = 0; j < m; j++ ){
                if( matrices[i][j] == key ) {
                    System.out.println("key is found");
                    return true;
                }
               
            }
        }
        System.out.println("key is not found");
        return false;
     }
    public static void main (String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrices[][] = new int [n][m];
     int key = sc.nextInt();
  // this for input.         
        for( int i = 0; i < n; i++ ) {
            for( int j = 0; j < m; j++ ){
                matrices[i][j]= sc.nextInt();
            }
        }

 // this is for output
        for( int i = 0; i < n; i++ ) {
            for( int j = 0; j < m; j++ ){
                System.out.print(matrices[i][j] + " ");
               
            }
            System.out.println();
        }
         // digonalSum(matrices , m , n);
        // searchD(matrices , m , n , key);
        // spiral(matrices , m , n);
        sc.close();

    }
}
 
