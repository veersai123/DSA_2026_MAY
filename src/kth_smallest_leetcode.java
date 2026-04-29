import java.util.*;
public class kth_smallest_leetcode{
    public static void main(String[] args) {
        int[] nums = {1, 4, 7};
        int[][] queries = {
                {0, 2, 1},
                {1, 1, 2},
                {0, 0, 3}
        };
        int[] result = kthSmallestEven(nums, queries);
        System.out.println(Arrays.toString(result));
    }
    public static int[] kthSmallestEven(int[] nums, int[][] queries) {
        int n=queries.length;
        int ans[]=new int[n];

       for(int i=0;i<n;i++)
       {
           int l=queries[i][0];//1
           int r=queries[i][1];  //1
           int k=queries[i][2];//2   //{1,4,7}

           HashSet<Integer>set=new HashSet<>();
           for(int j=l;j<=r;j++)
           {
             if(nums[j]%2==0)
             {
                 set.add(nums[j]);//4
             }
           }
           int currenteven=2;
           int count=0;
           while(true)
           {
               if(!set.contains(currenteven))
               {
                   count++; //1
                   if(count==k)
                   {
                       ans[i]=currenteven;
                       break;
                   }
               }
               currenteven+=2;

           }
       }
    return ans;
    }
}
