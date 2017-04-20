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
                    a[in] = a[in + 1];
                    a[in + 1] = temp;
                }
            }
        }
    }

    public static int[] selectionSortAsc(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }

            int smallerNumber = a[index];
            a[index] = a[i];
            a[i] = smallerNumber;
        }
        return a;
    }

    public static int[] selectionSortDsc(int[] a) {

        for (int i = a.length - 1; i > -1; i--) {
            int index = i;
            for (int j = i - 1; j > -1; j--) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }

            int smallerNumber = a[index];
            a[index] = a[i];
            a[i] = smallerNumber;
        }
        return a;
    }

    public static int[] insertionSortAsc(int[] a) {
        int in, out;
        for (out = 1; out < a.length; out++) {
            int temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] > temp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
        return a;
    }
    
    public static int[] insertionSortDsc(int[] a) {
        int in, out;
        for (out = a.length-1; out > -1; out--) {
            int temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] > temp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
        return a;
    }

}