package pekan5_2511532004;

public class tambahsll_2511532004 {

	    public static nodesll_2511532004 insertAtFront(nodesll_2511532004 head_2004, int value_2004) {
	    	nodesll_2511532004 new_node_2004 = new nodesll_2511532004(value_2004);
	        new_node_2004.next = head_2004;
	        return new_node_2004;
	    }

	    // fungsi menambahkan node di akhir SLL
	    public static nodesll_2511532004 insertAtEnd(nodesll_2511532004 head_2004, int value_2004) {
	        // buat sebuah node dengan sebuah nilai
	    	nodesll_2511532004 newNode_2004 = new nodesll_2511532004(value_2004);

	        // jika list kosong maka node jadi head
	        if (head_2004 == null) {
	            return newNode_2004;
	        }

	        // simpan head ke variabel sementara
	        nodesll_2511532004 last_2004 = head_2004;

	        // telusuri ke node akhir
	        while (last_2004.next != null) {
	            last_2004 = last_2004.next;
	        }

	        // ubah pointer
	        last_2004.next = newNode_2004;

	        return head_2004;
	    }

	    static nodesll_2511532004 getNode(int data_2004) {
	        return new nodesll_2511532004(data_2004);
	    }
	    static nodesll_2511532004 InsertPos(nodesll_2511532004 headNode_2004, int position_2004, int value_2004) {
	    	nodesll_2511532004 head_2004 = headNode_2004;

	        if (position_2004 < 1) {
	            System.out.println("Invalid position");
	        }

	        if (position_2004 == 1) {
	        	nodesll_2511532004 new_node_2004 = new nodesll_2511532004(value_2004);
	            new_node_2004.next = head_2004;
	            return new_node_2004;
	        } else {
	            while (position_2004-- != 0) {
	                if (position_2004 == 1) {
	                	nodesll_2511532004 newNode_2004 = getNode(value_2004);
	                    newNode_2004.next = headNode_2004.next;
	                    headNode_2004.next = newNode_2004;
	                    break;
	                }
	                headNode_2004 = headNode_2004.next;
	            }

	            if (position_2004 != 1) {
	                System.out.print("Posisi di luar jangkauan");
	            }
	        }
	        return head_2004;
	    }

	    public static void printList(nodesll_2511532004 head_2004) {
	    	nodesll_2511532004 curr_2004 = head_2004;

	        while (curr_2004.next != null) {
	            System.out.print(curr_2004.data_2004 + "-->");
	            curr_2004 = curr_2004.next;
	        }

	        if (curr_2004.next == null) {
	            System.out.print(curr_2004.data_2004);
	        }

	        System.out.println();
	    }
	    public static void main(String[] args) {

	        // buat linked list 2->3->5->6
	    	nodesll_2511532004 head_2004 = new nodesll_2511532004(2);
	        head_2004.next = new nodesll_2511532004(3);
	        head_2004.next.next = new nodesll_2511532004(5);
	        head_2004.next.next.next = new nodesll_2511532004(6);

	        // cetak list awal
	        System.out.print("Senarai berantai awal:");
	        printList(head_2004);

	        // tambahkan node baru di depan
	        System.out.print("tambah 1 simpul di depan: ");
	        int data_2004 = 1;
	        head_2004 = insertAtFront(head_2004, data_2004);

	        // cetak update list
	        printList(head_2004);

	        // tambahkan node baru di belakang
	        System.out.print("tambah 1 simpul di belakang: ");
	        int data2_2004 = 7;
	        head_2004 = insertAtEnd(head_2004, data2_2004);

	        // cetak update list
	        printList(head_2004);

	        System.out.print("tambah 1 simpul ke data 4: ");
	        int data3_2004 = 4;
	        int pos_2004 = 4;
	        head_2004 = InsertPos(head_2004, pos_2004, data3_2004);

	        // cetak update list
	        printList(head_2004);
	    }
	}