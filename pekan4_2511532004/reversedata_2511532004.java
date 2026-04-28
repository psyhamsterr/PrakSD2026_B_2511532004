package pekan4_2511532004;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class reversedata_2511532004 {
	public static void main(String[] args) {
		Queue<Integer> q_2511532004 = new LinkedList<Integer>();
		q_2511532004.add(1);
		q_2511532004.add(2);
		q_2511532004.add(3);
		
		System.out.println("sebelum reverse" + q_2511532004);
		Stack<Integer> s = new Stack<Integer>();
		while (!q_2511532004.isEmpty()) {
			s.push(q_2511532004.remove());
	}
		while (!s.isEmpty()) {
			q_2511532004.add(s.pop());
		}
			System.out.println("sesudah reverse "+ q_2511532004);}
		}
