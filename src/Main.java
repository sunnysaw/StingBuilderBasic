/*
Question : Given a string , the task is to toggle all the characters of the string
           that is to convert upper case to lower case and vice versa.
______________________________________________________________________________________
Test case :
I/O = PhysICS
O/P = PhYSics
 */
// Wrong code :
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        System.out.println("First printing the original string given by use : " + str);
        System.out.println("Now, Printing the toggle characters : ");
        for (int i = 0; i < str.length(); i++){
            boolean flag = true;
            char ch = str.charAt(i);
            if (ch == ' ')continue;
            int asci = (int)ch;
            if(flag == true){
                asci += 32;
                char dh = (char) asci;
                str.setCharAt(i,dh);
            }
            else {
                asci -= 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);

            }
            System.out.println(str);
        }
    }

}