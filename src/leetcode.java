//2131. Longest Palindrome by Concatenating Two Letter Words

import java.util.HashMap;
//["ab","ty","yt","lc","cl","ab"]

class leetcode {
//    public static int longestPalindrome(String[] words) {
//     int len=0;
//     int n= words.length;
//     boolean used[]=new boolean[n];
//     for(int i=0;i<n;i++) //{"ty","xy","aa","yt",};
//     {
//         if(used[i]) continue;
//        String el=words[i];
//        String rev=""+el.charAt(1)+el.charAt(0);
//        for(int j=i+1;j<n;j++)
//        {
//            if(rev.equals(words[j]))
//            {
//                len+=4;
//                used[i]=true;
//                used[j]=true;
//                break;
//            }
//        }
//     }
//     for(int i=0;i<n;i++) {
//            if(!used[i] && words[i].charAt(0)==words[i].charAt(1)) {
//                  len+=2;
//                  break;
//            }
//        }
//     return len;
//    }
    //{ll,ty,yt,yt,xx,ll}=> {ll-2,yt-2,ty-1,xx-1}=>{ll-0,yt-0,ty-0,xx-1}

public static int longestPalindrome(String[] words) {
    class Solution {
        public int longestPalindrome(String[] words) {
            int len = 0;
            HashMap<String, Integer> hm = new HashMap<>();
            for (String w : words) {
                hm.put(w, hm.getOrDefault(w, 0) + 1);
            }

            boolean centralUsed = false;

            for (String key : hm.keySet()) {
                int count = hm.get(key);
                if (count == 0) continue;

                String rev = "" + key.charAt(1) + key.charAt(0);

                if (!key.equals(rev)) {
                    if (hm.containsKey(rev)) {
                        int pair = Math.min(count, hm.get(rev));
                        len += pair * 4; // Yahan theek hai
                        hm.put(key, 0);
                        hm.put(rev, 0);
                    }
                } else {
                    len += (count / 2) * 4;

                    if (count % 2 == 1) {
                        centralUsed = true;
                    }
                    hm.put(key, 0);
                }
            }
            if (centralUsed) {
                len += 2;
            }

            return len;

        }
    }
}
    public static void main(String[] args) {
//        String []words = {"ab","ty","yt","lc","cl","ab"};
//        String []words = {"ty","xy","yt","aa"};
        String []words = {"ll","yt","yt","ty","ll"};
        System.out.println( longestPalindrome(words));
    }
}