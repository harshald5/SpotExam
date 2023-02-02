import java.util.Arrays;

public class Class1{
    public static void main(String[] args){
   int[] arr = {1,2,3,4,5};
   int ans=3;
   int op = Arrays.binarySearch(arr, ans);
   if(op<0)
   System.out.println("Element not found");
   else
   System.out.println("Element  found"+op);
    }
}