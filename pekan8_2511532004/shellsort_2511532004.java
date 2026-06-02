package pekan8_2511532004;

public class shellsort_2511532004 {


	    public static void shellSort(int[] A_2004) {
	        int n_2004 = A_2004.length;
	        int gap_2004 = n_2004 / 2;

	        while (gap_2004 > 0) {
	            for (int i_2004 = gap_2004; i_2004 < n_2004; i_2004++) {
	                int temp_2004 = A_2004[i_2004];
	                int j_2004 = i_2004;

	                while (j_2004 >= gap_2004 && A_2004[j_2004 - gap_2004] > temp_2004) {
	                    A_2004[j_2004] = A_2004[j_2004 - gap_2004];
	                    j_2004 = j_2004 - gap_2004;
	                }

	                A_2004[j_2004] = temp_2004;
	            }

	            gap_2004 = gap_2004 / 2;
	        }
	    }

	    public static void main(String[] args_2004) {
	        int[] data_2004 = {3, 10, 4, 6, 0, 9, 7, 2, 1, 5};

	        System.out.print("Sebelum : ");
	        printArray(data_2004);

	        shellSort(data_2004);

	        System.out.print("Sesudah (Shell Sort) : ");
	        printArray(data_2004);
	    }

	    public static void printArray(int[] arr_2004) {
	        for (int i_2004 : arr_2004) {
	            System.out.print(i_2004 + " ");
	        }
	        System.out.println();
	    }
	}