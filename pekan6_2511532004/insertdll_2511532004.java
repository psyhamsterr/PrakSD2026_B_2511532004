package pekan6_2511532004;

public class insertdll_2511532004 {



	    static nodedll_2511532004 insertBegin_2004(nodedll_2511532004 head_2004, int data_2004) {

	    	nodedll_2511532004 new_node_2004 = new nodedll_2511532004(data_2004);

	        new_node_2004.next_2004 = head_2004;

	        if (head_2004 != null)
	            head_2004.prev_2004 = new_node_2004;

	        return new_node_2004;
	    }

	    public static nodedll_2511532004 insertEnd_2004(nodedll_2511532004 head_2004, int newData_2004) {

	    	nodedll_2511532004 newNode_2004 = new nodedll_2511532004(newData_2004);

	        if (head_2004 == null)
	            head_2004 = newNode_2004;

	        else {
	        	nodedll_2511532004 curr_2004 = head_2004;

	            while (curr_2004.next_2004 != null) {
	                curr_2004 = curr_2004.next_2004;
	            }

	            curr_2004.next_2004 = newNode_2004;
	            newNode_2004.prev_2004 = curr_2004;
	        }

	        return head_2004;
	    }
	    public static nodedll_2511532004 insertAtPosition_2004(nodedll_2511532004 head_2004, int pos_2004, int new_data_2004) {

	    	nodedll_2511532004 new_node_2004 = new nodedll_2511532004(new_data_2004);

	        if (pos_2004 == 1) {
	            new_node_2004.next_2004 = head_2004;

	            if (head_2004 != null) {
	                head_2004.prev_2004 = new_node_2004;
	            }

	            head_2004 = new_node_2004;
	            return head_2004;
	        }

	        nodedll_2511532004 curr_2004 = head_2004;

	        for (int i_2004 = 1; i_2004 < pos_2004 - 1 && curr_2004 != null; i_2004++) {
	            curr_2004 = curr_2004.next_2004;
	        }

	        if (curr_2004 == null) {
	            System.out.println("Posisi tidak ada");
	            return head_2004;
	        }

	        new_node_2004.prev_2004 = curr_2004;
	        new_node_2004.next_2004 = curr_2004.next_2004;

	        curr_2004.next_2004 = new_node_2004;

	        if (new_node_2004.next_2004 != null) {
	            new_node_2004.next_2004.prev_2004 = new_node_2004;
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

	    	nodedll_2511532004 head_2004 = new nodedll_2511532004(2);

	        head_2004.next_2004 = new nodedll_2511532004(3);
	        head_2004.next_2004.prev_2004 = head_2004;

	        head_2004.next_2004.next_2004 = new nodedll_2511532004(5);
	        head_2004.next_2004.next_2004.prev_2004 = head_2004.next_2004;

	        int data_2004 = 1;

	        System.out.print("DLL Awal : ");
	        printList_2004(head_2004);

	        head_2004 = insertBegin_2004(head_2004, 1);

	        System.out.print("Setelah ditambah di awal : ");
	        printList_2004(head_2004);

	        int dataAkhir_2004 = 6;

	        head_2004 = insertEnd_2004(head_2004, dataAkhir_2004);

	        printList_2004(head_2004);

	        System.out.print("Tambah node 4 di posisi 4 : ");

	        int pos_2004 = 4;
	        int dataPos_2004 = 4;

	        head_2004 = insertAtPosition_2004(head_2004, pos_2004, dataPos_2004);

	        printList_2004(head_2004);
	    }
}
