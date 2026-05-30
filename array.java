import java.util.*;

public class ArraysCC {

         
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
