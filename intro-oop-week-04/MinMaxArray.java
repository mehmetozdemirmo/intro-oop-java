public class MinMaxArray {
    public static void main(String[] args) {
        int nums[]=new int[5];
        //int nums[] ={90,91,92,93,94,97};
        int min,max;

        nums[0] = 90;
        nums[1] = 91;
        nums[2] = 92;
        nums[3] = 93;
        nums[4] = 94;
        min=max=nums[0];
        //for(int i=1;i<nums.length;i++)
        for (int i=1;i<5;i++){
            if (nums[i]<min) min=nums[i];
            if (nums[i]>max) max=nums[i];
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
