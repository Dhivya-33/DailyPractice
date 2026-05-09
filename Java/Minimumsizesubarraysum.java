import java.util.*;
public class Minimumsizesubarraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int sum=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        if(arr[i]==target){
            System.out.print("1");
            return;
        }
        while(arr[i]<target){
            sum+=arr[i];
            count++;
            if(sum==target){
                min=Math.min(min,count);
            }else{
                i++;
            }
        }
        System.out.println(min);
    }
}
