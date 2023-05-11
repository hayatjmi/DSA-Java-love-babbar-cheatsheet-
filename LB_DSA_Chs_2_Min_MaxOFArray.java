// import javax.swing.plaf.synth.SynthEditorPaneUI;

import java.util.Arrays;

class pair
{
   public int min;
   public int max;
}
class MaxMin
{
    public void Maximum(int arr [],int n  )
    {
       Arrays.sort(arr);
       pair mm = new pair();
       mm.max=arr[0];
       mm.min=arr[n-1];
            
        
        System.out.println("Maximum is : "+ mm.max);
        System.out.println("Minimum is : "+ mm.min);
    }
   
    
}
public class LB_DSA_Chs_2_Min_MaxOFArray {
    public static void main(String args[])
    {
        int [] arr={1,2,3,4,5,996,7,8,0,15};
        MaxMin  M = new MaxMin();
        int n = arr.length;
        M.Maximum(arr,n);
        // M.Minimum(arr,n);

    }
}
