package pekan3_2511532004;
import java.util.*;
public class nilaimaksimum_2511532004 {
	public static int max(Stack<Integer> s) {
	
		Stack<Integer> backup = new Stack<Integer>();
		int maxvalue_2511532004 = s.pop();
		backup.push(maxvalue_2511532004);
		while (!s.isEmpty()) {
			int next = s.pop();
			backup.push(next);
			maxvalue_2511532004 = Math.max(maxvalue_2511532004,  next);
			
		}
		while (!backup.isEmpty()) {
			s.push(backup.pop());
		}
		return maxvalue_2511532004;
	
}
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(70);
		s.push(12);
		s.push(20);
		System.out.println("isi stack " + s);
		System.out.println("stack teratas " +s.peek());
		System.out.println("nilai maksimum " + max(s));
	}

}
