package q1;

import java.util.Scanner;

public class Q1 {
    static void main() {
        Scanner scanner= new Scanner(System.in);

        System.out.println("ENTER FIRST NUMBER");
        int a = scanner.nextInt();

        System.out.println("ENTER SECOND NUMBER");
        int b = scanner.nextInt();

        System.out.println("ENTER THIRD NUMBER");
        int c = scanner.nextInt();

        int min;
        if (a>b){
            min =a;
        }else {
            if (a>c){
                min= c;
            }
            else {
                min =a;
            }
        }
        System.out.println("MIN:"+min);
    }
}
