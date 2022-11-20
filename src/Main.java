import java.util.Scanner;

public class Main {
    static void primeNumber(int num){
        if (num==2||num==3){

            System.out.println("number =prime number");

        }
        if ((num%2!=0 && num%3!=0)&&(num%5!=0 && num%7!=0)){
            System.out.println("number =prime number");

        }
        else{
            System.out.println("not prime number");

        }
    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num=scanner.nextInt();
        primeNumber(num);



    }
}