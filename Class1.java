public class Class1{
    public static void main(String[] args){
     int[] a1 = {1,2,3,4,5};
     int ans = 50;
     System.out.println(ans+"found at"+search(a1,ans));
     System.out.println("Bianry seach changes added");
    }

    public static int search(int[] arr, int ans) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ans){
                return i;
            }
        }
        return -1;
    }
}