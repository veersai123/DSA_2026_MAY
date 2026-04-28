public class gcd {
    public static void main(String[] args) {
        int n1=10;
        int n2=32;
        int on1=n1;
        int on2=n2;
        while(n1%n2!=0)
        {
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd=n2;

        //lcm*gcd=a*b
        //lcm=a*b/gcd
        int lcm=(on1*on2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
