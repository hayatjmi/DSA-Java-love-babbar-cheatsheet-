class ReverseArray
{  
    public int [] reverse (int[] arr,int start ,int end)
    { 
         while(start<end)
         {
             int temp = arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;
         }
         return arr;
    }
}
public class LB_DSA_ChS_1_ReverseARRAy {
    public static void main(String[] args) {
        ReverseArray RA = new ReverseArray();
        int [] arr ={1,2,3,4,5,6};
        
        int [] result= RA.reverse(arr,0,5);
        for(int i : result)
        {
            System.out.println(i);
        }
      


    }
}
