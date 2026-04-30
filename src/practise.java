import java.util.*;

public class practise { // Capital 'P' for class name
    static class Marks implements Comparable<Marks> {
        int phy; int chem; int maths;

        Marks(int phy, int chem, int maths) {
            this.phy = phy;
            this.chem = chem;
            this.maths = maths;
        }

        @Override
        public int compareTo(Marks o) {
            // Rule 1: Physics Ascending
            if (this.phy != o.phy) {
                return this.phy - o.phy;
            }
            // Rule 2: Chemistry Descending
            else if (this.chem != o.chem) {
                return o.chem - this.chem;
            }
            // Rule 3: Maths Ascending
            else {
                return this.maths - o.maths;
            }
        }
    }

    public static void main(String[] args) {
        int N = 3;
        int phy[] = {4, 4, 1};
        int chem[] = {5, 10, 2};
        int math[] = {12, 10, 3};

        Marks[] arr = new Marks[N];

        for (int i = 0; i < N; i++) {
            arr[i] = new Marks(phy[i], chem[i], math[i]);
        }

        Arrays.sort(arr);

        // Printing with spaces for better clarity
        for (Marks m : arr) {
            System.out.println(m.phy + " " + m.chem + " " + m.maths);
        }
    }
}
notes : //https://drive.google.com/file/d/16Kur8z8ydQ_0lonwtBJLnIyAFCfL7Qea/view?usp=sharing
