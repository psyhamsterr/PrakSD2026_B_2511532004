package pekan9_2511532004;

	import javax.swing.*;
	import java.awt.*;
	import java.util.*;
	import java.util.List;

	public class petakampus_2511532004 extends JFrame {

	    private Map<String, List<String>> adjList_2004;
	    private Map<String, Point> positions_2004;
	    
	    private JComboBox<String> comboStart_2004;
	    private JComboBox<String> comboGoal_2004;
	    private JTextArea areaResult_2004;
	    private JPanel panelGraph_2004;
	    
	    private List<String> visitedNodes_2004;
	    private List<String> pathFound_2004;

	    public petakampus_2511532004() {
	        adjList_2004 = new HashMap<>();
	        positions_2004 = new HashMap<>();
	        visitedNodes_2004 = new ArrayList<>();
	        pathFound_2004 = new ArrayList<>();

	        initGraphData();
	        initGUI();
	    }

	    private void initGraphData() {
	        String[] nodes = {"Rektorat", "Perpus", "FTI", "Teknik", "Ekonomi", "MIPA", "Hukum", "Gedung Kuliah", "PKM", "Masjid"};
	        for (String node : nodes) {
	            adjList_2004.put(node, new ArrayList<>());
	        }

	        positions_2004.put("Rektorat", new Point(100, 200));
	        positions_2004.put("Perpus", new Point(100, 100));
	        positions_2004.put("FTI", new Point(250, 100));
	        positions_2004.put("Teknik", new Point(400, 100));
	        positions_2004.put("Ekonomi", new Point(400, 200));
	        positions_2004.put("MIPA", new Point(400, 300));
	        positions_2004.put("Hukum", new Point(250, 300));
	        positions_2004.put("Masjid", new Point(100, 300));
	        positions_2004.put("PKM", new Point(250, 200));
	        positions_2004.put("Gedung Kuliah", new Point(550, 200));

	        addEdge("Rektorat", "Perpus");
	        addEdge("Rektorat", "PKM");
	        addEdge("Rektorat", "Masjid");
	        addEdge("Perpus", "FTI");
	        addEdge("FTI", "PKM");
	        addEdge("FTI", "Teknik");
	        addEdge("Teknik", "Ekonomi");
	        addEdge("Ekonomi", "Gedung Kuliah");
	        addEdge("Ekonomi", "PKM");
	        addEdge("MIPA", "Ekonomi");
	        addEdge("MIPA", "Hukum");
	        addEdge("MIPA", "Gedung Kuliah");
	        addEdge("Hukum", "PKM");
	        addEdge("Hukum", "Masjid");
	        addEdge("Masjid", "PKM");
	    }

	    private void addEdge(String u, String v) {
	        adjList_2004.get(u).add(v);
	        adjList_2004.get(v).add(u);
	    }

	    public void BFS(String start, String goal) {
	        resetGraph();
	        Queue<String> queue = new LinkedList<>();
	        Map<String, String> parent = new HashMap<>();
	        
	        queue.add(start);
	        visitedNodes_2004.add(start);

	        boolean found = false;
	        while (!queue.isEmpty()) {
	            String curr = queue.poll();
	            if (curr.equals(goal)) {
	                found = true;
	                break;
	            }
	            for (String neighbor : adjList_2004.get(curr)) {
	                if (!visitedNodes_2004.contains(neighbor)) {
	                    visitedNodes_2004.add(neighbor);
	                    parent.put(neighbor, curr);
	                    queue.add(neighbor);
	                }
	            }
	        }
	        if (found) {
	            String curr = goal;
	            while (curr != null) {
	                pathFound_2004.add(0, curr);
	                curr = parent.get(curr);
	            }
	        }
	        displayPath("BFS");
	    }

	    public void DFS(String start, String goal) {
	        resetGraph();
	        Stack<String> stack = new Stack<>();
	        Map<String, String> parent = new HashMap<>();
	        Set<String> visitedSet = new LinkedHashSet<>();

	        stack.push(start);

	        boolean found = false;
	        while (!stack.isEmpty()) {
	            String curr = stack.pop();
	            
	            if (!visitedSet.contains(curr)) {
	                visitedSet.add(curr);
	                visitedNodes_2004.add(curr);
	                
	                if (curr.equals(goal)) {
	                    found = true;
	                    break;
	                }
	                
	                for (String neighbor : adjList_2004.get(curr)) {
	                    if (!visitedSet.contains(neighbor) && !stack.contains(neighbor)) {
	                        parent.put(neighbor, curr);
	                        stack.push(neighbor);
	                    }
	                }
	            }
	        }
	        if (found) {
	            String curr = goal;
	            while (curr != null) {
	                pathFound_2004.add(0, curr);
	                curr = parent.get(curr);
	            }
	        }
	        displayPath("DFS");
	    }

	    public void displayGraph(Graphics g) {
	        Graphics2D g2 = (Graphics2D) g;
	        
	        g2.setColor(Color.GRAY);
	        g2.setStroke(new BasicStroke(2));
	        Set<String> drawnEdges = new HashSet<>();
	        for (String node : adjList_2004.keySet()) {
	            Point p1 = positions_2004.get(node);
	            for (String neighbor : adjList_2004.get(node)) {
	                String edgeKey = node + "-" + neighbor;
	                String edgeKeyOpp = neighbor + "-" + node;
	                if (!drawnEdges.contains(edgeKey) && !drawnEdges.contains(edgeKeyOpp)) {
	                    Point p2 = positions_2004.get(neighbor);
	                    g2.drawLine(p1.x, p1.y, p2.x, p2.y);
	                    drawnEdges.add(edgeKey);
	                }
	            }
	        }

	        if (pathFound_2004.size() > 1) {
	            g2.setColor(Color.GREEN);
	            g2.setStroke(new BasicStroke(4));
	            for (int i = 0; i < pathFound_2004.size() - 1; i++) {
	                Point p1 = positions_2004.get(pathFound_2004.get(i));
	                Point p2 = positions_2004.get(pathFound_2004.get(i + 1));
	                g2.drawLine(p1.x, p1.y, p2.x, p2.y);
	            }
	        }

	        for (String node : adjList_2004.keySet()) {
	            Point p = positions_2004.get(node);
	            
	            if (pathFound_2004.contains(node)) {
	                g2.setColor(Color.GREEN);
	            } else if (visitedNodes_2004.contains(node)) {
	                g2.setColor(Color.YELLOW);
	            } else {
	                g2.setColor(Color.CYAN);
	            }

	            g2.fillOval(p.x - 15, p.y - 15, 30, 30);
	            g2.setColor(Color.BLACK);
	            g2.drawOval(p.x - 15, p.y - 15, 30, 30);
	            g2.drawString(node, p.x - 25, p.y - 20);
	        }
	    }

	    public void displayPath(String method) {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Hasil Pencarian (").append(method).append(") :\n");
	        sb.append("Jalur : ").append(String.join(" -> ", pathFound_2004)).append("\n");
	        sb.append("Node Dikunjungi : ").append(String.join(", ", visitedNodes_2004)).append("\n");
	        sb.append("Jumlah Node Dikunjungi : ").append(visitedNodes_2004.size());
	        
	        areaResult_2004.setText(sb.toString());
	        panelGraph_2004.repaint();
	    }

	    public void resetGraph() {
	        visitedNodes_2004.clear();
	        pathFound_2004.clear();
	        if (areaResult_2004 != null) {
	            areaResult_2004.setText("Hasil Pencarian :\nJalur :\nNode Dikunjungi :\nJumlah Node Dikunjungi : 0");
	        }
	        if (panelGraph_2004 != null) {
	            panelGraph_2004.repaint();
	        }
	    }

	    private void initGUI() {
	        setTitle("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS");
	        setSize(750, 600);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setLayout(new BorderLayout(10, 10));

	        JPanel panelControl = new JPanel(new FlowLayout());
	        String[] nodes = adjList_2004.keySet().toArray(new String[0]);
	        Arrays.sort(nodes);

	        comboStart_2004 = new JComboBox<>(nodes);
	        comboGoal_2004 = new JComboBox<>(nodes);
	        
	        JButton btnBFS = new JButton("BFS");
	        JButton btnDFS = new JButton("DFS");
	        JButton btnReset = new JButton("RESET");

	        panelControl.add(new JLabel("Lokasi Awal :"));
	        panelControl.add(comboStart_2004);
	        panelControl.add(new JLabel("Lokasi Tujuan :"));
	        panelControl.add(comboGoal_2004);
	        panelControl.add(btnBFS);
	        panelControl.add(btnDFS);
	        panelControl.add(btnReset);

	        panelGraph_2004 = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                displayGraph(g);
	            }
	        };
	        panelGraph_2004.setBackground(Color.WHITE);
	        panelGraph_2004.setBorder(BorderFactory.createTitledBorder("VISUALISASI GRAPH"));

	        areaResult_2004 = new JTextArea(5, 50);
	        areaResult_2004.setEditable(false);
	        resetGraph();
	        JScrollPane scrollResult = new JScrollPane(areaResult_2004);

	        btnBFS.addActionListener(e -> {
	            String start = (String) comboStart_2004.getSelectedItem();
	            String goal = (String) comboGoal_2004.getSelectedItem();
	            BFS(start, goal);
	        });

	        btnDFS.addActionListener(e -> {
	            String start = (String) comboStart_2004.getSelectedItem();
	            String goal = (String) comboGoal_2004.getSelectedItem();
	            DFS(start, goal);
	        });

	        btnReset.addActionListener(e -> resetGraph());

	        add(panelControl, BorderLayout.NORTH);
	        add(panelGraph_2004, BorderLayout.CENTER);
	        add(scrollResult, BorderLayout.SOUTH);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            new petakampus_2511532004().setVisible(true);
	        });
	    }
	}