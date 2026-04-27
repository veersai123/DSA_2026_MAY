//Check if there are any two Equal numbers in an array at a distance less than or equal to k

//arr = [1, 2, 3, 1],k = 3
//Output: true

import java.util.*;

public class Element_distance {
    public static void main(String[] args) {
      int arr[]={1,2,3,1};
      int n=arr.length;
      int k=2;
      boolean flag=false;
      for(int i=0;i<n;i++) {
          for(int j=0;j<n;j++) {

              if(i!=j && arr[i]==arr[j]) {
                  if(Math.abs(i-j)<=k) {
                      flag=true;
                      break;
                  }
              }
          }
          if(flag) break;
      }
      System.out.println(flag);
    }
}

//=================================== HashSet ===================================
public class Element_distance {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int n=arr.length;
        int k=1;
        HashSet<Integer>st=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(st.contains(arr[i]))
            {
                System.out.println(true);
                return;
            }
            st.add(arr[i]);
            if(st.size()>k)
            {
                st.remove(arr[i-k]);
            }
        }
        System.out.println(false);
    }
}

//=============================== HASHMAP ===============================================================
public class Element_distance {
    public static void main(String[] args) {
        int arr[]={1,2,1,1,1,1};
        int n=arr.length;
        int k=1;
       HashMap<Integer,Integer>hm=new HashMap<>();

       for(int i=0;i<n;i++)
       {
           if(hm.containsKey(arr[i]))
           {
               int idx=hm.get(arr[i]);
               if(Math.abs(i-idx)<=k)
               {
                   System.out.println(true);
                   return;
               }
           }
           hm.put(arr[i],i);
       }
        System.out.println(false);
    }
}


//=============================print all pairs ================================

public class Element_distance {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int n=arr.length;
        int k=1;
        HashMap<Integer,Integer>hm=new HashMap<>();
         boolean flag=false;
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int idx=hm.get(arr[i]);
                if(Math.abs(i-idx)<=k)
                {
                    System.out.println("pair is ("+i+","+idx+")");
                    flag=true;
                }
            }
            hm.put(arr[i],i);
        }
     if(!flag) System.out.println("no pair is exist");
    }
}





//====================================== Stuck in to find maximum and minimum distance ==============================
// wrong solution
public class Element_distance {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,1,4,1};
        int n=arr.length;
        int k=6;
        int mind=Integer.MAX_VALUE;
        int maxd=Integer.MIN_VALUE;
        HashMap<Integer,Integer>hm=new HashMap<>();
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int idx=hm.get(arr[i]);
                int distance=Math.abs(i-idx);
                if(distance<=k)
                {
//                    System.out.println("pair is ("+i+","+idx+")");
                    flag=true;
                    if(distance>maxd)
                    {
                        maxd=distance;
                    }
                    if(mind>distance)
                    {
                        mind=distance;
                    }
                }
            }
            hm.put(arr[i],i);
        }
        System.out.println(mind);
        System.out.println(maxd);
        if(!flag) System.out.println("no pair is exist");
    }
}


//=========================================================================================
public class Element_distance {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,1,4,1};
        int n=arr.length;
        int k=6;
        HashMap<Integer,ArrayList<Integer>>hm=new HashMap<>();
        int maxd=Integer.MIN_VALUE;
        int mind=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
               for(int idx:hm.get(arr[i]))
               {
                   int distance=i-idx;
                   if(distance<=k)
                   {
                       maxd=Math.max(maxd,distance);
                       mind=Math.min(mind,distance);
                   }
               }
            }
            hm.putIfAbsent(arr[i],new ArrayList<>());
            hm.get(arr[i]).add(i);
        }
        System.out.println(mind);
        System.out.println(maxd);
    }
}

//work perfeclty but take O(n^2)

//===============================================================================================
public class Element_distance {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,1,4,1};
        int n=arr.length;
        int k=6;
        HashMap<Integer,Integer>first=new HashMap<>();
        HashMap<Integer,Integer>last=new HashMap<>();
        int maxd=Integer.MIN_VALUE;
        int mind=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            first.putIfAbsent(arr[i],i);
            if(last.containsKey(arr[i]))
            {
                 int idx=last.get(arr[i]);//0
                 int distance=i-idx;//2-0
                 mind=Math.min(mind,distance); //2
            }
            last.put(arr[i],i);
        }
        //maximum distance
       for(int key: first.keySet())
       {
           int distance=last.get(key)-first.get(key);
           maxd=Math.max(maxd,distance);
       }
        System.out.println(mind);
        System.out.println(maxd);
    }
}


best time complexity=O(n)




