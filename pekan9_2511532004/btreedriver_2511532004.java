package pekan9_2511532004;

public class btreedriver_2511532004 {

	    public static void main(String[] args) {
	        //Membuat Pohon
	    	btree_2511532004 tree_2004 = new btree_2511532004();
	        System.out.print("Jumlah Simpul awal pohon: ");
	        System.out.println(tree_2004.countNodes_2004());
	        //menambahkan simpul data 1
	        node_2511532004 root_2004 = new node_2511532004(1);
	        //menjadikan simpul 1 sebagai root
	        tree_2004.setRoot_2004(root_2004);
	        System.out.println("Jumlah simpul jika hanya ada root");
	        System.out.println(tree_2004.countNodes_2004());
	        node_2511532004 node2_2004 = new node_2511532004(2);
	        node_2511532004 node3_2004 = new node_2511532004(3);
	        node_2511532004 node4_2004 = new node_2511532004(4);
	        node_2511532004 node5_2004 = new node_2511532004(5);
	        node_2511532004 node6_2004 = new node_2511532004(6);
	        node_2511532004 node7_2004 = new node_2511532004(7);
	        node_2511532004 node8_2004 = new node_2511532004(8);
	        node_2511532004 node9_2004 = new node_2511532004(9);
	        root_2004.setLeft_2004(node2_2004);
	        node2_2004.setLeft_2004(node4_2004);
	        node2_2004.setRight_2004(node5_2004);
	        node4_2004.setRight_2004(node8_2004);
	        root_2004.setRight_2004(node3_2004);
	        node3_2004.setLeft_2004(node6_2004);
	        node3_2004.setRight_2004(node7_2004);
	        node6_2004.setLeft_2004(node9_2004);

	        //Set root
	        tree_2004.setCurrent_2004(tree_2004.getRoot_2004());
	        System.out.println("menampilkan simpul terakhir: ");
	        System.out.println(tree_2004.getCurrent_2004().getData_2004());
	        System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
	        System.out.println(tree_2004.countNodes_2004());
	        System.out.println("InOrder: ");
	        tree_2004.printInorder_2004();
	        System.out.println("\nPreorder: ");
	        tree_2004.printPreOrder_2004();
	        System.out.println("\nPostorder : ");
	        tree_2004.printPostOrder_2004();
	        System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
	        tree_2004.print_2004();
	    }
	}