package pekan3_2511532004;
import java.util.*;

public class latihanstack_2511532004 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(42);
		s.push(-3);
		s.push(12);
		System.out.println("nilai stack= " + s);
		System.out.println("nilai pop = " + s.pop());
		System.out.println("nilai stack setelah pop= " + s);
		System.out.println("nilai peek " + s.peek());
		System.out.println("nilai stack setelah peek= " + s);
	}

}
