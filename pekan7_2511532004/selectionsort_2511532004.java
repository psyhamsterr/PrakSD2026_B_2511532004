package pekan7_2511532004;

public class selectionsort_2511532004 {

	    public static void selectionsort_2511532004(int[] arr_2004) {
	        int n_2004 = arr_2004.length;
	        for (int i_2004 = 0; i_2004 < n_2004; i_2004++) {
	            int minIndex_2004 = i_2004;
	            for (int j_2004 = i_2004 + 1; j_2004 < n_2004; j_2004++) {
	                if (arr_2004[j_2004] < arr_2004[minIndex_2004]) {
	                    minIndex_2004 = j_2004;
	                }
	            }

	            int temp_2004 = arr_2004[i_2004];
	            arr_2004[i_2004] = arr_2004[minIndex_2004];
	            arr_2004[minIndex_2004] = temp_2004;
	        }
	    }

	    public static void main(String[] args_2004) {

	        int arr_2004[] = {23, 78, 45, 8, 32, 56, 1};

	        int n_2004 = arr_2004.length;

	        System.out.print("array yang belum terurut:\n");

	        for (int i_2004 = 0; i_2004 < n_2004; i_2004++) {

	            System.out.print(arr_2004[i_2004] + " ");
	        }
	        System.out.println("");

	        selectionsort_2511532004(arr_2004);

	        System.out.print("array yang terurut:\n");

	        for (int i_2004 = 0; i_2004 < n_2004; i_2004++) {
	            System.out.print(arr_2004[i_2004] + " ");
	        }
	        System.out.println("");
	    }
	}
