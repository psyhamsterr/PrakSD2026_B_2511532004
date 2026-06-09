package pekan9_2511532004;

public class btree_2511532004 {

	    private node_2511532004 root_2004;
	    private node_2511532004 currentNode_2004;

	    public btree_2511532004() {
	        root_2004 = null;
	    }

	    public boolean search_2004(int data_2004) {
	        return search_2004(root_2004, data_2004);
	    }

	    private boolean search_2004(node_2511532004 node_2004, int data_2004) {
	        if (node_2004.getData_2004() == data_2004)
	            return true;
	        if (node_2004.getLeft_2004() != null)
	            if (search_2004(node_2004.getLeft_2004(), data_2004))
	                return true;
	        if (node_2004.getRight_2004() != null)
	            if (search_2004(node_2004.getRight_2004(), data_2004))
	                return true;
	        return false;
	    }

	    public void printInorder_2004() {
	        root_2004.printInorder_2004(root_2004);
	    }

	    public void printPreOrder_2004() {
	        root_2004.printPreorder_2004(root_2004);
	    }

	    public void printPostOrder_2004() {
	        root_2004.printPostorder_2004(root_2004);
	    }

	    public node_2511532004 getRoot_2004() {
	        return root_2004;
	    }

	    public boolean isEmpty_2004() {
	        return root_2004 == null;
	    }

	    public int countNodes_2004() {
	        return countNodes_2004(root_2004);
	    }

	    private int countNodes_2004(node_2511532004 node_2004) {
	        int count_2004 = 1;
	        if (node_2004 == null) {
	            return 0;
	        } else {
	            count_2004 += countNodes_2004(node_2004.getLeft_2004());
	            count_2004 += countNodes_2004(node_2004.getRight_2004());
	            return count_2004;
	        }
	    }

	    public void print_2004() {
	        root_2004.print_2004();
	    }

	    public node_2511532004 getCurrent_2004() {
	        return currentNode_2004;
	    }

	    public void setCurrent_2004(node_2511532004 node_2004) {
	        this.currentNode_2004 = node_2004;
	    }

	    public void setRoot_2004(node_2511532004 root_2004) {
	        this.root_2004 = root_2004;
	    }
	}