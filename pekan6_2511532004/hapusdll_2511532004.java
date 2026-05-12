package pekan6_2511532004;

public class hapusdll_2511532004 {


	    public static nodedll_2511532004 delHead_2004(nodedll_2511532004 head_2004) {

	        if (head_2004 == null)
	            return null;

	        nodedll_2511532004 temp_2004 = head_2004;

	        head_2004 = head_2004.next_2004;

	        if (head_2004 != null) {
	            head_2004.prev_2004 = null;
	        }

	        return head_2004;
	    }

	    public static nodedll_2511532004 delLast_2004(nodedll_2511532004 head_2004) {

	        if (head_2004 == null)
	            return null;

	        if (head_2004.next_2004 == null)
	            return null;

	        nodedll_2511532004 curr_2004 = head_2004;

	        while (curr_2004.next_2004 != null) {
	            curr_2004 = curr_2004.next_2004;
	        }

	        if (curr_2004.prev_2004 != null) {
	            curr_2004.prev_2004.next_2004 = null;
	        }

	        return head_2004;
	    }
	        public static nodedll_2511532004 delPos_2004(nodedll_2511532004 head_2004, int pos_2004) {

	            if (head_2004 == null) {
	                return head_2004;
	            }

	            nodedll_2511532004 curr_2004 = head_2004;

	            for (int i_2004 = 1; curr_2004 != null && i_2004 < pos_2004; i_2004++) {
	                curr_2004 = curr_2004.next_2004;
	            }

	            if (curr_2004 == null) {
	                return head_2004;
	            }

	            if (curr_2004.prev_2004 != null) {
	                curr_2004.prev_2004.next_2004 = curr_2004.next_2004;
	            }

	            if (curr_2004.next_2004 != null) {
	                curr_2004.next_2004.prev_2004 = curr_2004.prev_2004;
	            }

	            if (head_2004 == curr_2004) {
	                head_2004 = curr_2004.next_2004;
	            }

	            return head_2004;
	        }

	        public static void printList_2004(nodedll_2511532004 head_2004) {

	        	nodedll_2511532004 curr_2004 = head_2004;

	            while (curr_2004 != null) {
	                System.out.print(curr_2004.data_2004 + " <-> ");
	                curr_2004 = curr_2004.next_2004;
	            }

	            System.out.println();
	        }

	        public static void main(String[] args_2004) {

	        	nodedll_2511532004 head_2004 = new nodedll_2511532004(1);

	            head_2004.next_2004 = new nodedll_2511532004(2);
	            head_2004.next_2004.prev_2004 = head_2004;

	            head_2004.next_2004.next_2004 = new nodedll_2511532004(3);
	            head_2004.next_2004.next_2004.prev_2004 = head_2004.next_2004;

	            head_2004.next_2004.next_2004.next_2004 = new nodedll_2511532004(4);
	            head_2004.next_2004.next_2004.next_2004.prev_2004 = head_2004.next_2004.next_2004;

	            head_2004.next_2004.next_2004.next_2004.next_2004 = new nodedll_2511532004(5);
	            head_2004.next_2004.next_2004.next_2004.next_2004.prev_2004 =
	                    head_2004.next_2004.next_2004.next_2004;

	            System.out.print("DLL Awal : ");
	            printList_2004(head_2004);

	            System.out.print("Setelah head dihapus : ");
	            head_2004 = delHead_2004(head_2004);
	            printList_2004(head_2004);

	            System.out.print("Setelah node terakhir dihapus : ");
	            head_2004 = delLast_2004(head_2004);
	            printList_2004(head_2004);

	            System.out.print("Menghapus node ke 2 : ");
	            head_2004 = delPos_2004(head_2004, 2);

	            printList_2004(head_2004);
	        }
	    }