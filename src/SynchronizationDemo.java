import java.util.Scanner;

public class MultipleCatch {

    public static void main(String args[]){
        System.out.println("enter N:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter the element:");
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the index to divide:");
        int index=sc.nextInt();
        System.out.println("enter the divisor:");
        int div=sc.nextInt();

        try{
            System.out.println(arr[index]/div);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero error");
        }
    }
}
