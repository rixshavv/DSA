class JumpGame {
    public boolean canJump(int[] nums) {
        int arr_size=nums.length;
        int maxreach=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxreach){
                return false;
            }else{
                maxreach=Math.max(maxreach,i+nums[i]); //did i+ as we have traversed the previous elements earlier 
            }
        }
            return true;
        }
    }

