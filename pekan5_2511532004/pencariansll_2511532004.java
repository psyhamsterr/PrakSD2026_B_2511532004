package pekan5_2511532004;

public class pencariansll_2511532004 {


	    static boolean searchKey(nodesll_2511532004 head_2004, int key_2004) {
	    	nodesll_2511532004 curr_2004 = head_2004;

	        while (curr_2004 != null) {
	            if (curr_2004.data_2004 == key_2004)
	                return true;

	            curr_2004 = curr_2004.next;
	        }

	        return false;
	    }

	    public static void traversal(nodesll_2511532004 head_2004) {
	        // mulai dari head
	    	nodesll_2511532004 curr_2004 = head_2004;

	        // telusuri sampai pointer null
	        while (curr_2004 != null) {
	            System.out.print(" " + curr_2004.data_2004);
	            curr_2004 = curr_2004.next;
	        }

	        System.out.println();
	    }

	    public static void main(String[] args) {

	    	nodesll_2511532004 head_2004 = new nodesll_2511532004(14);
	        head_2004.next = new nodesll_2511532004(21);
	        head_2004.next.next = new nodesll_2511532004(13);
	        head_2004.next.next.next = new nodesll_2511532004(30);
	        head_2004.next.next.next.next = new nodesll_2511532004(10);

	        System.out.print("Penelusuran SLL : ");
	        traversal(head_2004);

	        // data yang akan dicari
	        int key_2004 = 30;

	        System.out.print("cari data " + key_2004 + " = ");
	        if (searchKey(head_2004, key_2004))
	            System.out.println("ketemu");
	        else
	            System.out.println("tidak ada");
	    }
	}
