import java.util.*;
public class StringsEx {
    public static boolean isVowel(char ch) {
       if( ch == 'a' || ch == 'e'  || ch == 'i' ||  ch == 'o' ||  ch == 'u'  ) {
           return true;
       }
       return false;
   } 
    public static int countVovel(String input) {
        int count = 0;
        for ( int i = 0; i < input.length(); i++ ) {
            char ch = input.charAt(i);
            if ( isVowel(ch) ) {
                count++;
            }
        }
        return count;
    }
    public static String substring(String str , int si , int ei) {
        String substr = "";
        for ( int i = si; i < ei; i++ ) {
            substr += str.charAt(i);
        }
        return substr;

    }
    public static float isPathValid(String path) {
         int x = 0;
         int y = 0;
         for ( int i = 0; i < path.length(); i++ ) {
            char dir = path.charAt(i);
                if ( dir == 'S' ) {
                    y--;
                }
                else if ( dir == 'N' ) {
                    y++;
                }
                else if ( dir == 'E' ) {
                    x++;
                }
                else if ( dir == 'W' ) {
                    x--;
                }
            }
           int X2 = x * x;
            int Y2 = y * y;
            float distance = (float)Math.sqrt(X2 + Y2);
            return distance;
         }
    
    public static boolean isPalinddrome(String str) {
         for ( int i = 0; i < str.length()/2; i++ ) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        return false;
    }
}
return true;
    }
    public static void  printLetters(String str) {
        
        for ( int i = 0; i < str.length(); i++ ) {
            System.out.println(str.charAt(i));
        }

    }
    public static void main (String args[]) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String str = sc.nextLine();
        // String str1 = sc.nextLine();
        // System.out.println(str);   // this is for length of string.
        // System.out.println(str1.length());

        //  concatination means joining of two strings.
        // String firstname  = sc.next();
        // String lastname = sc.next();
        // String fullname = firstname + " " + lastname;
        // // System.out.println(fullname.charAt(0));
        // printLetters(fullname);
        // System.out.println(isPathValid(str));
        // System.out.println(substring(str, 0, 5));
        System.out.println(countVovel(str));

        sc.close();
    }
}

