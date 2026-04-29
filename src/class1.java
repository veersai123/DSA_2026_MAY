////2657. Find the Prefix Common Array of Two Arrays
////Input: A = [1,3,2,4], B = [3,1,2,4]
////Output: [0,2,3,4]
//class Solution {
//        public int[] findThePrefixCommonArray(int[] A, int[] B) {
//            HashMap<Integer,Integer>hm=new HashMap<>();
//            int count=0;
//            int n=A.length;
//            int c[]=new int [n];
//            for(int i=0;i<A.length;i++)
//            {
//                if(hm.containsKey(A[i]))
//                {
//                    count++;
//                }
//                hm.put(A[i],hm.getOrDefault(A[i],0)+1);
//                if(hm.containsKey(B[i]))
//                {
//                    count++;
//                }
//                hm.put(B[i],hm.getOrDefault(A[i],0)+1);
//                c[i]=count;
//            }
//            return c;
//        }
//}
//
////====================================================================
//
//2006. Count Number of Pairs With Absolute Difference K
//Input: nums = [1,2,2,1], k = 1
//Output: 4
//
//class Solution {
//    public int countKDifference(int[] nums, int k) {
//        HashMap<Integer,Integer>hm=new HashMap<>();
//        int c=0;
//        for(int i=0;i<nums.length;i++)
//        {
//            if(hm.containsKey(nums[i]-k))
//            {
//                c+=hm.get(nums[i]-k);
//            }
//            if(k!=0 &&hm.containsKey(nums[i]+k))
//            {
//                c+=hm.get(nums[i]+k);
//            }
//            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
//        }
//        return c;
//    }
//}