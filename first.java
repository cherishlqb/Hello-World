package experment1;

import java.util.Arrays;

public class first {
    //数组逆序
    public static void turn(int[] nums){
        for(int i=0,j=nums.length-1;i<j;i++,j--){
            int temps = nums[i];
            nums[i] = nums[j];
            nums[j] = temps;
        }
    }

    public static void main(String[] args) {
        int[] sums = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(sums));
        turn(sums);
        System.out.println(Arrays.toString(sums));
    }
}
