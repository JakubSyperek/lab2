import java.util.Scanner;

public class Zad1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pięć liczb: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        int max = 0;
        if(a > max){
            a = max;
        }
        else if(b > max){
            b = max;
        }
        else if(c > max){
            c = max;
        }
        else if(d > max){
            d = max;
        }
        else if(e > max){
            e = max;
        }
        System.out.println("Największa liczba: " + max);
    }
}
