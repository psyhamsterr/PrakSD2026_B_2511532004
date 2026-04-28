package pekan4_2511532004;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class literasiqueue_2511532004 {

    public static void main(String[] args) {
        Queue<String> q_2511532004 = new LinkedList<>();

        q_2511532004.add("praktikum");
        q_2511532004.add("Struktur");
        q_2511532004.add("data");
        q_2511532004.add("dan");
        q_2511532004.add("algortitma");

        Iterator<String> iterator = q_2511532004.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "");
        }
    }
}