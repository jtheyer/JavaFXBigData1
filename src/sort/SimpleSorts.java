/**
 *Sorts w/ a Big-O time of n*n  So...
 *  O(n*n) //basically has loop inside a loop; sort time it takes respective to elements inside
 *  Generally...If possible use javaSorts, possibly combined with an insertion 
 *  sort or simple sort algorithm.
 * 
 * @author 55heyerjt01
 */
package sort;

public class SimpleSorts {

    public static void bubbleSort(int[] a, String direction) {
        int out, in;
        for (out = a.length - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1] && direction.equalsIgnoreCase("A")
                        || a[in] < a[in + 1] && direction.equalsIgnoreCase("D")) {
                    int temp = a[in];
                    a[in] = a [in+1];
                    a[in +1] = temp;
                }
            }
        }
    }

}
