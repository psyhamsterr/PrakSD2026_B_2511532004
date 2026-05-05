package pekan5_2511532004;

public class hapussll_2511532004 {


	    // fungsi untuk menghapus head
	    public static nodesll_2511532004 deleteHead_2004(nodesll_2511532004 head_2004) {

	        // jikaa sl kosong
	        if (head_2004 == null)
	            return null;

	        head_2004 = head_2004.next;

	        // return head baru
	        return head_2004;
	    }

	    // fungsi menghapus node terakhir SLL
	    public static nodesll_2511532004 removeLastNode_2004(nodesll_2511532004 head_2004) {

	        // jika list kosong, return null
	        if (head_2004 == null) {
	            return null;
	        }

	        // jika list satu node, hapus node dan return null
	        if (head_2004.next == null) {
	            return null;
	        }

	        // temukan node terakhir ke dua
	        nodesll_2511532004 secondLast_2004 = head_2004;

	        while (secondLast_2004.next.next != null) {
	            secondLast_2004 = secondLast_2004.next;
	        }

	        // hapus node terakhir
	        secondLast_2004.next = null;

	        return head_2004;
	    }
	
	public static nodesll_2511532004 deleteNode_2004(nodesll_2511532004 head_2004, int position_2004) {
		nodesll_2511532004 temp_2004 = head_2004;
		nodesll_2511532004 prev_2004 = null;

	    if (temp_2004 == null)
	        return head_2004;

	    if (position_2004 == 1) {
	        head_2004 = temp_2004.next;
	        return head_2004;
	    }

	    for (int i_2004 = 1; temp_2004 != null && i_2004 < position_2004; i_2004++) {
	        prev_2004 = temp_2004;
	        temp_2004 = temp_2004.next;
	    }

	    if (temp_2004 != null)
	        prev_2004.next = temp_2004.next;
	    else
	        System.out.println("Data tidak ada");

	    return head_2004;
	}

	// fungsi mencetak SLL
	public static void printList_2004(nodesll_2511532004 head_2004) {
		nodesll_2511532004 curr_2004 = head_2004;

	    while (curr_2004.next != null) {
	        System.out.print(curr_2004.data_2004 + " -> ");
	        curr_2004 = curr_2004.next;
	    }

	    if (curr_2004 != null) {
	        System.out.print(curr_2004.data_2004);
	    }

	    System.out.println();
	}
	public static void main(String[] args) {
		nodesll_2511532004 head_2004 = new nodesll_2511532004(1);
		head_2004.next  = new nodesll_2511532004(2);
		head_2004.next.next = new nodesll_2511532004(3);
		head_2004.next.next.next  = new nodesll_2511532004(4);
		head_2004.next.next.next.next  = new nodesll_2511532004(5);
		head_2004.next.next.next.next.next  = new nodesll_2511532004(6);
		
		System.out.println("list awal: ");
		printList_2004(head_2004);
		
		head_2004 = deleteHead_2004(head_2004);
		
		System.out.println("list setelah head di hapus");
		printList_2004(head_2004);
		head_2004 = removeLastNode_2004(head_2004);
		printList_2004(head_2004);
		
		int position = 2;
		head_2004 = deleteNode_2004(head_2004, position);
		
		System.out.println("list setelah posisi 2 di hapus: ");
		printList_2004(head_2004);
	}


}
