package pekan3_2511532004;
import java.util.ArrayList;

class siswa {
	String nama;
	int nim;

	siswa(String nama, int nim) {
		this.nama = nama;
		this.nim = nim;
	}

	public String toString() {
		return "Nim : " + nim + ", nama : " + nama;
	}
}

public class siswastack_2511532004 {
	private ArrayList<siswa> stack;

	public siswastack_2511532004() {
		stack = new ArrayList<>();
	}

	public void push(siswa mhs) {
		stack.add(mhs);
	}

	public siswa pop() {
		if (!isEmpty()) {
			return stack.remove(stack.size() - 1);
		}
		return null;
	}

	public siswa peek() {
		if (!isEmpty()) {
			return stack.get(stack.size() - 1);
		}
		return null;
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public void tampilkansiswa() {
		for (int i = stack.size() - 1; i >= 0; i--) {
			System.out.println(stack.get(i));
		}
	}

	public static void main(String[] args) {
		siswastack_2511532004 studentStack = new siswastack_2511532004();

		siswa mhs1 = new siswa("ali", 1);
		siswa mhs2 = new siswa("boby", 2);
		siswa mhs3 = new siswa("charles", 3);

		studentStack.push(mhs1);
		studentStack.push(mhs2);
		studentStack.push(mhs3);

		System.out.println("siswa teratas " + studentStack.peek());
		System.out.println("mengeluarkan siswa teratas dari stack " + studentStack.pop());
		System.out.println("daftar siswa setelah di pop");
		studentStack.tampilkansiswa();
	}
}