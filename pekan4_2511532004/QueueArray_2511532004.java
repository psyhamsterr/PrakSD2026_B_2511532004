package pekan4_2511532004;

public class QueueArray_2511532004 {

    int front_2004, rear_2004, size_2004;
    int capacity_2004;
    int array_2004[];

    public QueueArray_2511532004(int capacity_2004) {
        this.capacity_2004 = capacity_2004;
        front_2004 = this.size_2004 = 0;
        rear_2004 = capacity_2004 - 1;
        array_2004 = new int[this.capacity_2004];
    }

    boolean isFull_2004(QueueArray_2511532004 queue_2004) {
        return (queue_2004.size_2004 == queue_2004.capacity_2004);
    }

    boolean isEmpty_2004(QueueArray_2511532004 queue_2004) {
        return (queue_2004.size_2004 == 0);
    }

    void enqueue_2004(int item_2004) {
        if (isFull_2004(this))
            return;

        this.rear_2004 = (this.rear_2004 + 1) % this.capacity_2004;
        this.array_2004[this.rear_2004] = item_2004;
        this.size_2004 = this.size_2004 + 1;

        System.out.println(item_2004 + " enqueued to queue");
    }

    int dequeue_2511532004() {
        if (isEmpty_2004(this))
            return Integer.MIN_VALUE;

        int item = this.array_2004[this.front_2004];
        this.front_2004 = (this.front_2004 + 1) % this.capacity_2004;
        this.size_2004 = this.size_2004 - 1;
        return item;
    }

    int front_2004() {
        if (isEmpty_2004(this))
            return Integer.MIN_VALUE;

        return this.array_2004[this.front_2004];
    }

    int rear_2004() {
        if (isEmpty_2004(this))
            return Integer.MIN_VALUE;

        return this.array_2004[this.rear_2004];
    }

    void display_2004() {
        int i;
        if (front_2004 == rear_2004) {
            System.out.println("\nAntrian kosong\n");
            return;
        }

        for (i = front_2004; i < rear_2004; i++) {
            System.out.print(array_2004[i] + " <--");
        }
        return;
    }
}