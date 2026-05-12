package pekan6_2511532004;

public class penelusurandll_2511532004 {


	    static void forwardTraversal_2004(nodedll_2511532004 head_2004) {

	    	nodedll_2511532004 curr_2004 = head_2004;

	        while (curr_2004 != null) {

	            System.out.print(curr_2004.data_2004 + " <----> ");

	            curr_2004 = curr_2004.next_2004;
	        }

	        System.out.println();
	    }

	    static void backwardTraversal_2004(nodedll_2511532004 tail_2004) {

	    	nodedll_2511532004 curr_2004 = tail_2004;

	        while (curr_2004 != null) {

	            System.out.print(curr_2004.data_2004 + " <----> ");

	            curr_2004 = curr_2004.prev_2004;
	        }

	        System.out.println();
	    }
	
	
	public static void main(String[] args) {
		nodedll_2511532004 head_2004 = new nodedll_2511532004(1);
		nodedll_2511532004 second_2004 = new nodedll_2511532004(2);
		nodedll_2511532004 third_2004 = new nodedll_2511532004(3);
		
		head_2004.next_2004 = second_2004;
		second_2004.prev_2004 = head_2004;
		second_2004.next_2004 = third_2004;
		third_2004.prev_2004 = second_2004;
		
		System.out.println("penelusuran maju: ");
		forwardTraversal_2004(head_2004);
		
		System.out.println("penelusuran mundur: ");
		backwardTraversal_2004(third_2004);
	}
	
}