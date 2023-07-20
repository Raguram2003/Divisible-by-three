import java.util.Scanner;


public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size: ");
        int size = sc.nextInt();
        System.out.println("enter the array elements: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(findDivBy3(arr,size));
    }
    public static int findDivBy3(int[] arr,int size){
        int sum=0;
        for(int i=0;i<size;i++) {
            sum = sum + (arr[i] % 3);
        }
        return sum%3;
    }
}

