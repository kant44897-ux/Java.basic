import java.util.*;
public class ArraysCC {
         
public static int trapRainW(int n , int are[]){
   int lmax[] = new int[n];
   int rmax[] = new int[n];

   lmax[0] = are[0];
   for( int i = 1; i < n; i++){
   lmax[i] = Math.max(are[i] , lmax[i-1]);
      }
    rmax[n-1] = are[n-1];
    for( int i = n-2; i >= 0; i--){
    rmax[i] = Math.max(are[i] , rmax[i + 1]);
    }
    int tp = 0; 
    for( int i = 0; i < n; i++){
    int wl = Math.min(lmax[i], rmax[i]);
    tp = tp + wl - are[i];
    }
    return tp;
    }
public static void kadanS(int n , int are[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            currSum = currSum + are[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
                System.out.println(currSum);
            }
        }
           System.out.println("max sum = " + maxSum);
    }
public static void sumPri(int n , int are[]){
         int currSum = 0;
          int maxSum = Integer.MIN_VALUE;
          int prifix[] = new int[n];
           prifix[0] = are[0];
         for( int i = 1; i < n; i++){
          prifix[i] = prifix[i-1] + are[i];
         }
          for( int i = 0; i < n; i++){
            for( int j = i; j < n; j++){

                currSum =  i == 0 ? prifix[j]: prifix[j] - prifix[i-1]; 

                 if( currSum > maxSum ){
               maxSum = currSum;
              }
        }
           
     }
     System.out.println("max sum = " + maxSum);
 }        

public static void maxsubareSum(int n , int are[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for( int i = 0; i < n; i++){
        for( int j = i; j < n; j++){
            currSum = 0;
          for( int k = i; k <= j; k++){
            currSum = currSum + are[k];
          }
        System.out.println(currSum);
           if( currSum > maxSum ){
               maxSum = currSum;
     }
        }
    }
    System.out.println("max sum = " + maxSum);
}
public static void subare(int n , int are[]){
   for( int i = 0; i < n; i++){ //. i is for start
    for( int j = i; j < n; j++){ // j is for end 
       for( int k = i; k < j; k++){
        System.out.print(are[k] + " " );
       }
       System.out.println();
    }
   }
}
         
public static void pairs(int n , int are[]){
    for(int i = 0; i < n; i++){
        int curr = are[i];
        for(int j = i + 1; j < n; j++){
       System.out.print("(" + curr + "," + are[j] + ")" );
      }
      System.out.println();
    }
}         
public static void reVr(int n , int are[]){
    int fst = 0;
    int lst = n-1;
    while(fst < lst){
        int temp = are[lst];
        are[lst] = are[fst];
        are[fst] = temp;

        fst++;
        lst--;
        
        }
        System.out.println("reverse is" );
        for(int i = 0; i < n; i++){
            System.out.println(are[i] + " ");
    }
 }
         
public static int smallest(int n , int are[] ){
     int small = Integer.MAX_VALUE;
     for(int i = 1; i < n; i++){
        if(small > are[i]){
            small = are[i];
        }
     }
     return small;
 }
public static int largest(int n , int are[] ){
        int large = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
           if(large < are[i]){
            large = are[i];
           }
        }
        return large;
    }
           
public static boolean biaSer(int n, int are[], int tar) {

        int lo = 0;
        int hi = n - 1;

        while (lo <= hi) {

            int mid = (lo + hi) / 2;

            if (are[mid] > tar) {
                hi = mid - 1;
            }

            else if (are[mid] < tar) {
                lo = mid + 1;
            }

            else {
                return true;
            }
        }

        return false;
    }



 public static boolean lineSer(int n, int are[], int tar) {

        for (int i = 0; i < n; i++) {

            if (tar == are[i]) {
                return true;
            }
        }

        return false;
    }

public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int are[] = new int[n];

        for (int i = 0; i < n; i++) {
            are[i] = sc.nextInt();
        }

        int tar = sc.nextInt();

        boolean isPresent = lineSer(n, are, tar);

        if (isPresent == true) {
            System.out.println("tar is present");
        }

        else {
            System.out.println("sorry not found");
        }

        sc.close();
    }
}
