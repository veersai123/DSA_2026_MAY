
//We are given an Array of Numbers. We have to find and print any Number with Maximum Frequency and Minimum Frequency.
//        Example Testcase:-
//        Arr = [3, 2, 3, 2, 4, 3]
//
//        Frequencies of Elements of Array are:-
//        [3 - 3,2 - 2,4 - 1]
//        Maximum Frequency:- Element is 3, Frequency is 3
//        Minimum Frequency:- Element is 4, Frequency is 1
//


//=============================== Brute force =====================================
//public class Main {
//    public static void main(String[] args) {
//
//        int arr[]={3,2,1,2,3,1,4,1};
//        int n= arr.length;
//
//        int minf=n;
//        int maxf=0;
//
//        int maxe=-1;
//        int mine=-1;
//
//        for(int i=0;i<n;i++)
//        {    boolean visited=false;
//            for(int k=0;k<i;k++)
//            {
//                 if(arr[i]==arr[k])
//                 {
//                     visited=true;
//                     break;
//                 }
//            }
//            if(visited)continue;
//            int count=0;
//            for(int j=0;j<n;j++)
//            {
//                if(arr[i]==arr[j]) count++;
//
//            }
//            if(count>maxf) {
//                maxf=count;
//                maxe=arr[i];
//            }
//            if(minf>count) {
//                minf=count;
//                mine=arr[i];
//            }
//        }
//        System.out.println("maxe=> "+maxe+" maxf=>"+maxf);
//        System.out.println("mine=> "+mine+" minf=>"+minf);
//    }
//}

//=============================== Optimized =======================================

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int arr[]={3,2,1,2,3,1,4,1};
        int n= arr.length;
        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int minf= Integer.MAX_VALUE;
        int maxf=0;

        int maxe=-1;
        int mine=-1;

        for(Map.Entry<Integer,Integer>el: hm.entrySet())
        {
            int f= el.getValue();
            int element=el.getKey();

            if(f>maxf)
            {
                maxf=f;
                maxe=element;
            }
            if(minf>f)
            {
                minf=f;
                mine=element;
            }
        }

    }
}