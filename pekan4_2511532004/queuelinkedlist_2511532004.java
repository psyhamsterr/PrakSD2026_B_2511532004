package pekan4_2511532004;
import java.util.Queue;
import java.util.LinkedList;

public class queuelinkedlist_2511532004 {
	public static void main(String[] args) {
		Queue<Integer> q_2511532004 = new LinkedList<>();
		for (int i = 0; i < 6; i++)
				q_2511532004.add(i);
				
		System.out.println("elemen antrian " + q_2511532004);
		
		int hapus = q_2511532004.remove();
		System.out.println("hapus elemen " + hapus);
		System.err.println(q_2511532004);
		
		int depan_2511532004 = q_2511532004.peek();
		System.out.println("kepala antrian = " + depan_2511532004);
		
		int banyak_2511532004 = q_2511532004.size();
		System.out.println("Size antrian = " + banyak_2511532004);
	}
}
