package pekan9_2511532004;
import java.util.*;

public class graphtraversal_2511532004 {



		    private Map<String, List<String>> graph_2004 = new HashMap<>();

		    // Menambahkan edge (graf tak berarah)
		    public void addEdge_2004(String node1_2004, String node2_2004) {
		        graph_2004.putIfAbsent(node1_2004, new ArrayList<>());
		        graph_2004.putIfAbsent(node2_2004, new ArrayList<>());
		        graph_2004.get(node1_2004).add(node2_2004);
		        graph_2004.get(node2_2004).add(node1_2004);
		    }

		    // Menampilkan graf awal
		    public void printGraph_2004() {
		        System.out.println("Graf Awal (Adjacency List):");
		        for (String node_2004 : graph_2004.keySet()) {
		            System.out.print(node_2004 + " -> ");
		            List<String> neighbors_2004 = graph_2004.get(node_2004);
		            System.out.println(String.join(", ", neighbors_2004));
		        }
		        System.out.println();
		    }

		    // DFS rekursif
		    public void dfs_2004(String start_2004) {
		        Set<String> visited_2004 = new HashSet<>();
		        System.out.println("Penelusuran DFS:");
		        dfsHelper_2004(start_2004, visited_2004);
		        System.out.println();
		    }

		    private void dfsHelper_2004(String current_2004, Set<String> visited_2004) {
		        if (visited_2004.contains(current_2004)) return;
		        visited_2004.add(current_2004);
		        System.out.print(current_2004 + " ");
		        for (String neighbor_2004 : graph_2004.getOrDefault(current_2004, new ArrayList<>())) {
		            dfsHelper_2004(neighbor_2004, visited_2004);
		        }
		    }

		    // BFS iteratif
		    public void bfs_2004(String start_2004) {
		        Set<String> visited_2004 = new HashSet<>();
		        Queue<String> queue_2004 = new LinkedList<>();
		        queue_2004.add(start_2004);
		        visited_2004.add(start_2004);
		        System.out.println("Penelusuran BFS:");
		        while (!queue_2004.isEmpty()) {
		            String current_2004 = queue_2004.poll();
		            System.out.print(current_2004 + " ");
		            for (String neighbor_2004 : graph_2004.getOrDefault(current_2004, new ArrayList<>())) {
		                if (!visited_2004.contains(neighbor_2004)) {
		                    queue_2004.add(neighbor_2004);
		                    visited_2004.add(neighbor_2004);
		                }
		            }
		        }
		        System.out.println();
		    }

		    // Main
		    public static void main(String[] args) {
		    	graphtraversal_2511532004 graph_2004 = new graphtraversal_2511532004();

		        // Contoh graf: A-B, A-C, B-D, B-E
		        graph_2004.addEdge_2004("A", "B");
		        graph_2004.addEdge_2004("A", "C");
		        graph_2004.addEdge_2004("B", "D");
		        graph_2004.addEdge_2004("B", "E");

		        // Cetak graf awal
		        System.out.println("Garf Awal adalah: ");
		        graph_2004.printGraph_2004();

		        // Lakukan penelusuran
		        graph_2004.dfs_2004("A");
		        graph_2004.bfs_2004("A");
		    }
		}


