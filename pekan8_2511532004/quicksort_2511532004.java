package pekan8_2511532004;

public class quicksort_2511532004 {

	    static void swap_2004(int[] arr_2004, int i_2004, int j_2004)
	    {
	        int temp_2004 = arr_2004[i_2004];
	        arr_2004[i_2004] = arr_2004[j_2004];
	        arr_2004[j_2004] = temp_2004;
	    }

	    // Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
	    static void medianOfThree_2004(int[] arr_2004, int low_2004, int high_2004)
	    {
	        int mid_2004 = low_2004 + (high_2004 - low_2004) / 2;

	        // Urutkan elemen low, mid, dan high
	        if (arr_2004[low_2004] > arr_2004[mid_2004]) {
	            swap_2004(arr_2004, low_2004, mid_2004);
	        }

	        if (arr_2004[low_2004] > arr_2004[high_2004]) {
	            swap_2004(arr_2004, low_2004, high_2004);
	        }

	        if (arr_2004[mid_2004] > arr_2004[high_2004]) {
	            swap_2004(arr_2004, mid_2004, high_2004);
	        }

	        swap_2004(arr_2004, mid_2004, high_2004);
	    }

	    static int partition_2004(int[] arr_2004, int low_2004, int high_2004)
	    {
	        // Panggil fungsi medianOfThree sebelum menentukan pivot
	        medianOfThree_2004(arr_2004, low_2004, high_2004);

	        int pivot_2004 = arr_2004[high_2004]; // Sekarang arr[high] sudah berisi nilai median
	        int i_2004 = (low_2004 - 1);

	        for (int j_2004 = low_2004; j_2004 <= high_2004 - 1; j_2004++) {
	            // Jika elemen saat ini lebih kecil dari atau sama dengan pivot
	            if (arr_2004[j_2004] < pivot_2004) {
	                // Increment indeks elemen yang lebih kecil
	                i_2004++;
	                swap_2004(arr_2004, i_2004, j_2004);
	            }
	        }

	        swap_2004(arr_2004, i_2004 + 1, high_2004);
	        return (i_2004 + 1);
	    }

	    static void quicksort_2511532004(int[] arr_2004, int low_2004, int high_2004)
	    {
	        if (low_2004 < high_2004) {
	            int pi_2004 = partition_2004(arr_2004, low_2004, high_2004);
	            quicksort_2511532004(arr_2004, low_2004, pi_2004 - 1);
	            quicksort_2511532004(arr_2004, pi_2004 + 1, high_2004);
	        }
	    }

	    public static void printArr_2004(int[] arr_2004)
	    {
	        for (int i_2004 = 0; i_2004 < arr_2004.length; i_2004++) {
	            System.out.print(arr_2004[i_2004] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args_2004)
	    {
	        int[] arr_2004 = { 10, 7, 8, 9, 1, 5 };
	        int N_2004 = arr_2004.length;

	        System.out.println("Data sebelum diurutkan: ");
	        printArr_2004(arr_2004);

	        quicksort_2511532004(arr_2004, 0, N_2004 - 1);

	        System.out.print("Data Terurut quicksort: ");
	        printArr_2004(arr_2004);
	    }
	}