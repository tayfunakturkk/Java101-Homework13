package Functions.Homework3;
import java.util.Scanner;
public class FunctionsHomework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = input.nextInt();
        method(n,n,true);

    }
    static void method(int n,int temp,boolean mode){
        System.out.print(" " + temp);
        if(temp <= 0) {
            mode = false;
        }
        int k = mode ? temp - 5 : temp + 5;
        if(k <= n) {
            method(n, k, mode);
        }
    }
    


}
