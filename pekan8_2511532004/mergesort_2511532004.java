package pekan8_2511532004;

public class mergesort_2511532004 {


	    void merge_2004(int arr_2004[], int l_2004, int m_2004, int r_2004) {

	        int n1_2004 = m_2004 - l_2004 + 1;
	        int n2_2004 = r_2004 - m_2004;

	        /* Create temp arrays */
	        int L_2004[] = new int[n1_2004];
	        int R_2004[] = new int[n2_2004];

	        /* Copy data to temp arrays */
	        for (int i_2004 = 0; i_2004 < n1_2004; ++i_2004)
	            L_2004[i_2004] = arr_2004[l_2004 + i_2004];

	        for (int j_2004 = 0; j_2004 < n2_2004; ++j_2004)
	            R_2004[j_2004] = arr_2004[m_2004 + 1 + j_2004];

	        int i_2004 = 0, j_2004 = 0;

	        /* Initial index of merged subarray array */
	        int k_2004 = l_2004;

	        while (i_2004 < n1_2004 && j_2004 < n2_2004) {
	            if (L_2004[i_2004] <= R_2004[j_2004]) {
	                arr_2004[k_2004] = L_2004[i_2004];
	                i_2004++;
	            } else {
	                arr_2004[k_2004] = R_2004[j_2004];
	                j_2004++;
	            }
	            k_2004++;
	        }

	        /* Copy remaining elements of L[] if any */
	        while (i_2004 < n1_2004) {
	            arr_2004[k_2004] = L_2004[i_2004];
	            i_2004++;
	            k_2004++;
	        }

	        /* Copy remaining elements of R[] if any */
	        while (j_2004 < n2_2004) {
	            arr_2004[k_2004] = R_2004[j_2004];
	            j_2004++;
	            k_2004++;
	        }
	    }
	    void sort(int arr_2004[], int l_2004, int r_2004) {
	        if (l_2004 < r_2004) {

	            // Find the middle point
	            int m_2004 = (l_2004 + r_2004) / 2;

	            // Sort first and second halves
	            sort(arr_2004, l_2004, m_2004);
	            sort(arr_2004, m_2004 + 1, r_2004);

	            // Merge the sorted halves
	            merge_2004(arr_2004, l_2004, m_2004, r_2004);
	        }
	    }

	    // A utility function to print array of size n
	    static void printArray(int arr_2004[]) {
	        int n_2004 = arr_2004.length;

	        for (int i_2004 = 0; i_2004 < n_2004; ++i_2004)
	            System.out.print(arr_2004[i_2004] + " ");

	        System.out.println();
	    }

	    public static void main(String args_2004[]) {

	        int arr_2004[] = {12, 11, 13, 5, 6, 7};

	        System.out.println("Sebelum terurut");
	        printArray(arr_2004);

	        mergesort_2511532004 ob_2004 = new mergesort_2511532004();
	        ob_2004.sort(arr_2004, 0, arr_2004.length - 1);

	        System.out.println("\nSesudah Terurut menggunakan Merge Sort");
	        printArray(arr_2004);
	    }}