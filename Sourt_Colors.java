public class Sourt_Colors {
    // class Solution {
        public void sortColors(int[] nums) {
            int l = nums.length;
            
            for(int i = 0;i<l;i++)
            {
                int min = i;
                
                for(int j = i+1; j<l;j++)
                {
                    if(nums[j]<nums[min])
                    {
                        min=j;
                    }
                }
                
                int t = nums[min];
                nums[min] = nums[i];
                nums[i] = t;
            }
        }
    }
// }
