package pekan7_2511532004;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class guimahasiswa_2511532004 extends JFrame {

    ArrayList<mahasiswa_2511532004> listMhs_2004 = new ArrayList<>();

    JTextField tfNama_2004 = new JTextField(15);
    JTextField tfNim_2004 = new JTextField(15);
    JTextField tfProdi_2004 = new JTextField(15);

    DefaultTableModel modelTabel_2004 = new DefaultTableModel(new String[]{"Nama", "NIM", "Prodi"}, 0);
    JTable tabel_2004 = new JTable(modelTabel_2004);

    JComboBox<String> cbAlgo_2004 = new JComboBox<>(new String[]{"Insertion Sort", "Selection Sort", "Bubble Sort"});
    JTextArea taProses_2004 = new JTextArea(10, 40);

    public guimahasiswa_2511532004() {
        setTitle("Sorting Mahasiswa - NIM 2004");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelInput_2004 = new JPanel(new GridLayout(4, 2, 5, 5));
        panelInput_2004.setBorder(BorderFactory.createTitledBorder("Input Data"));
        panelInput_2004.add(new JLabel("Nama:"));
        panelInput_2004.add(tfNama_2004);
        panelInput_2004.add(new JLabel("NIM:"));
        panelInput_2004.add(tfNim_2004);
        panelInput_2004.add(new JLabel("Prodi:"));
        panelInput_2004.add(tfProdi_2004);

        JButton btnTambah_2004 = new JButton("Tambah");
        JButton btnHapus_2004 = new JButton("Hapus");
        panelInput_2004.add(btnTambah_2004);
        panelInput_2004.add(btnHapus_2004);

        JPanel panelSort_2004 = new JPanel();
        panelSort_2004.add(new JLabel("Algoritma:"));
        panelSort_2004.add(cbAlgo_2004);
        JButton btnSort_2004 = new JButton("Mulai Sorting");
        panelSort_2004.add(btnSort_2004);

        taProses_2004.setEditable(false);
        JScrollPane spProses_2004 = new JScrollPane(taProses_2004);
        spProses_2004.setBorder(BorderFactory.createTitledBorder("Proses Sorting"));

        JScrollPane spTabel_2004 = new JScrollPane(tabel_2004);
        spTabel_2004.setBorder(BorderFactory.createTitledBorder("Data Mahasiswa"));

        JPanel panelTengah_2004 = new JPanel(new BorderLayout());
        panelTengah_2004.add(spTabel_2004, BorderLayout.NORTH);
        panelTengah_2004.add(spProses_2004, BorderLayout.CENTER);

        add(panelInput_2004, BorderLayout.NORTH);
        add(panelTengah_2004, BorderLayout.CENTER);
        add(panelSort_2004, BorderLayout.SOUTH);

        btnTambah_2004.addActionListener(e -> tambahData_2004());
        btnHapus_2004.addActionListener(e -> hapusData_2004());
        btnSort_2004.addActionListener(e -> mulaiSorting_2004());

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void tambahData_2004() {
        String nama_2004 = tfNama_2004.getText().trim();
        String nim_2004 = tfNim_2004.getText().trim();
        String prodi_2004 = tfProdi_2004.getText().trim();

        if (nama_2004.isEmpty() || nim_2004.isEmpty() || prodi_2004.isEmpty()) {
            JOptionPane.showMessageDialog(this, "semua field harus diisi!");
            return;
        }

        listMhs_2004.add(new mahasiswa_2511532004(nama_2004, nim_2004, prodi_2004));
        modelTabel_2004.addRow(new String[]{nama_2004, nim_2004, prodi_2004});
        tfNama_2004.setText("");
        tfNim_2004.setText("");
        tfProdi_2004.setText("");
    }

    void hapusData_2004() {
        int baris_2004 = tabel_2004.getSelectedRow();
        if (baris_2004 == -1) {
            JOptionPane.showMessageDialog(this, "pilih dulu baris yang mau dihapus!");
            return;
        }
        listMhs_2004.remove(baris_2004);
        modelTabel_2004.removeRow(baris_2004);
    }

    void mulaiSorting_2004() {
        if (listMhs_2004.isEmpty()) {
            JOptionPane.showMessageDialog(this, "data kosong!");
            return;
        }

        ArrayList<mahasiswa_2511532004> data_2004 = new ArrayList<>();
        for (mahasiswa_2511532004 m : listMhs_2004)
            data_2004.add(new mahasiswa_2511532004(m.getNama_2004(), m.getNim_2004(), m.getProdi_2004()));

        String pilihan_2004 = (String) cbAlgo_2004.getSelectedItem();
        taProses_2004.setText("");

        if (pilihan_2004.equals("Insertion Sort")) {
            insertionSort_2004(data_2004);
        } else if (pilihan_2004.equals("Selection Sort")) {
            selectionSort_2004(data_2004);
        } else {
            bubbleSort_2004(data_2004);
        }
    }

    String namaList_2004(ArrayList<mahasiswa_2511532004> list_2004) {
        String hasil_2004 = "[";
        for (int i = 0; i < list_2004.size(); i++) {
            hasil_2004 += list_2004.get(i).getNama_2004();
            if (i < list_2004.size() - 1) hasil_2004 += ", ";
        }
        return hasil_2004 + "]";
    }

    void insertionSort_2004(ArrayList<mahasiswa_2511532004> data_2004) {
        taProses_2004.append("=== INSERTION SORT ===\n");
        for (int i = 1; i < data_2004.size(); i++) {
        	mahasiswa_2511532004 kunci_2004 = data_2004.get(i);
            int j_2004 = i - 1;
            while (j_2004 >= 0 && data_2004.get(j_2004).getNama_2004().compareToIgnoreCase(kunci_2004.getNama_2004()) > 0) {
                data_2004.set(j_2004 + 1, data_2004.get(j_2004));
                j_2004--;
            }
            data_2004.set(j_2004 + 1, kunci_2004);
            taProses_2004.append("Langkah " + i + " : " + namaList_2004(data_2004) + "\n");
        }
        taProses_2004.append("Hasil akhir: " + namaList_2004(data_2004) + "\n");
    }

    void selectionSort_2004(ArrayList<mahasiswa_2511532004> data_2004) {
        taProses_2004.append("=== SELECTION SORT ===\n");
        for (int i = 0; i < data_2004.size() - 1; i++) {
            int minIdx_2004 = i;
            for (int j = i + 1; j < data_2004.size(); j++) {
                if (data_2004.get(j).getNama_2004().compareToIgnoreCase(data_2004.get(minIdx_2004).getNama_2004()) < 0)
                    minIdx_2004 = j;
            }
            mahasiswa_2511532004 tmp_2004 = data_2004.get(minIdx_2004);
            data_2004.set(minIdx_2004, data_2004.get(i));
            data_2004.set(i, tmp_2004);
            taProses_2004.append("Pass " + (i + 1) + " : " + namaList_2004(data_2004) + "\n");
        }
        taProses_2004.append("Hasil akhir: " + namaList_2004(data_2004) + "\n");
    }

    void bubbleSort_2004(ArrayList<mahasiswa_2511532004> data_2004) {
        taProses_2004.append("=== BUBBLE SORT ===\n");
        int n_2004 = data_2004.size();
        for (int i = 0; i < n_2004 - 1; i++) {
            for (int j = 0; j < n_2004 - i - 1; j++) {
                if (data_2004.get(j).getNama_2004().compareToIgnoreCase(data_2004.get(j + 1).getNama_2004()) > 0) {
                	mahasiswa_2511532004 tmp_2004 = data_2004.get(j);
                    data_2004.set(j, data_2004.get(j + 1));
                    data_2004.set(j + 1, tmp_2004);
                }
            }
            taProses_2004.append("Pass " + (i + 1) + " : " + namaList_2004(data_2004) + "\n");
        }
        taProses_2004.append("Hasil akhir: " + namaList_2004(data_2004) + "\n");
    }

    public static void main(String[] args) {
        new guimahasiswa_2511532004();
    }
}