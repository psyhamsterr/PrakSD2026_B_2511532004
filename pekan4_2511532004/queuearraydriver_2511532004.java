package pekan4_2511532004;

public class queuearraydriver_2511532004 {
	public static void main(String[] args) {
		QueueArray_2511532004  queue = new QueueArray_2511532004(1000);
		queue.enqueue_2004(10);
		queue.enqueue_2004(20);
		queue.enqueue_2004(30);
		queue.enqueue_2004(40);
		System.out.println("item depan" + queue.front_2004());
		System.out.println("item belakang"+ queue.rear_2004);
		System.out.println("tampilkan queue");
		queue.display_2004();
		System.out.println();
		System.out.println(queue.dequeue_2511532004() + "dihapus dari queue");
		System.out.println("item depan" + queue.front_2004());
		System.out.println("item belakang"+ queue.rear_2004);
		System.out.println("tampilkan queue setelah satu data di hapus");
		queue.display_2004();
		
	
	}

}
