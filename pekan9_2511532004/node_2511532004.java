package pekan9_2511532004;

public class node_2511532004 {

	    int data_2004;
	    node_2511532004 left_2004;
	    node_2511532004 right_2004;

	    public node_2511532004(int data_2004) {
	        this.data_2004 = data_2004;
	        left_2004 = null;
	        right_2004 = null;
	    }

	    public void setLeft_2004(node_2511532004 node_2004) {
	        if (left_2004 == null)
	            left_2004 = node_2004;
	    }

	    public void setRight_2004(node_2511532004 node_2004) {
	        if (right_2004 == null)
	            right_2004 = node_2004;
	    }

	    public node_2511532004 getLeft_2004() {
	        return left_2004;
	    }

	    public node_2511532004 getRight_2004() {
	        return right_2004;
	    }

	    public int getData_2004() {
	        return data_2004;
	    }

	    public void setData_2004(int data_2004) {
	        this.data_2004 = data_2004;
	    }

	    void printPreorder_2004(node_2511532004 node_2004) {
	        if (node_2004 == null)
	            return;
	        System.out.print(node_2004.data_2004 + " ");
	        printPreorder_2004(node_2004.left_2004);
	        printPreorder_2004(node_2004.right_2004);
	    }

	    void printPostorder_2004(node_2511532004 node_2004) {
	        if (node_2004 == null)
	            return;
	        printPostorder_2004(node_2004.left_2004);
	        printPostorder_2004(node_2004.right_2004);
	        System.out.print(node_2004.data_2004 + " ");
	    }

	    void printInorder_2004(node_2511532004 node_2004) {
	        if (node_2004 == null)
	            return;
	        printInorder_2004(node_2004.left_2004);
	        System.out.print(node_2004.data_2004 + " ");
	        printInorder_2004(node_2004.right_2004);
	    }

	    public String print_2004() {
	        return this.print_2004("", true, "");
	    }

	    public String print_2004(String prefix_2004, boolean isTail_2004, String sb_2004) {
	        if (right_2004 != null) {
	            right_2004.print_2004(prefix_2004 + (isTail_2004 ? "|   " : "    "), false, sb_2004);
	        }
	        System.out.println(prefix_2004 + (isTail_2004 ? "\\-- " : "/-- ") + data_2004);
	        if (left_2004 != null) {
	            left_2004.print_2004(prefix_2004 + (isTail_2004 ? "    " : "|   "), true, sb_2004);
	        }
	        return sb_2004;
	    }
}