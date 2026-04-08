package pekan3_2511532004;
import java.util.*;
public class stackarray_2511532004 {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];
	boolean isEmpty_2511532004() {
		return (top<0);
			}
	stackarray_2511532004(){
		top = -1;
	}
	boolean push_2511532004(int x) {
		if (top >= (MAX -1)) {
			System.out.println("stack overflow");
			return true;
		}
		else {
			a[++top] = x;
			System.out.println(x + " dimasukkan kedalam stack");
			return false;
		}
	}
	int pop_2511532004() {
		if (top<0) {
			System.out.println("stackunderflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	int peek_2511532004() {
		if (top<0) {
			System.out.println("stack underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
	void print_2511532004() {
		for (int i = top;i>-1;i--) {
			System.out.println(" " + a[i]);
		}
	}
	
	
}
