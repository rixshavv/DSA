import java.util.Arrays;

public class sortColors   {

    public void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }


    public void sortColor(int[] nums){  //Dutch Flag Algo
        int start=0;
        int end=nums.length-1;
        int index=0;

        while(index<=end){
            if(nums[index]==0){
                swap(nums,index,start);
                index++;
                start++;

            }else if(nums[index]==2){
                swap(nums,index,end);
                end--;
            }else{
                index++; 

            }
        }
    }
        public static void main(String[] args) {
        sortColors sorter = new sortColors();

        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println("Before sorting: " + Arrays.toString(nums));

        sorter.sortColor(nums);

        System.out.println("After sorting:  " + Arrays.toString(nums));
        // Expected Output: [0, 0, 1, 1, 2, 2]
    }
}
    

