import java.util.Scanner;
import java.io.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for k:");
        int k=sc.nextInt();
        int sum=0;
        for(int i=1;i<k;i++){
            sum+=i;
            System.out.println("sum of sequence:"+sum);
        }
    }
}