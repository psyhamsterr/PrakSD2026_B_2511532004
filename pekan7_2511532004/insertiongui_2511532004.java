package pekan7_2511532004;

import java.awt.EventQueue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import javax.swing.border.EmptyBorder;

public class insertiongui_2511532004 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int[] array_2004;
	private JLabel[] labelArray_2004;
	private JButton stepButton_2004, resetButton_2004, setButton_2004;
	private JTextField inputField_2004;
	private JPanel panelArray_2004;
	private JTextArea stepArea_2004;
	
	private int i_2004 = 1, j_2004;
	private boolean sorting_2004 = false;
	private int stepCount_2004 = 1;

	/**
	 * Create the frame.
	 */
	public insertiongui_2511532004() {
	    setTitle("Insertion Sort Langkah per Langkah"); 
	    setSize(750, 400); 
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    setLocationRelativeTo(null); 
	    setLayout(new BorderLayout());
	    
	    // Panel input
	    JPanel inputPanel = new JPanel(new FlowLayout());
	    inputField_2004 = new JTextField(30); 
	    setButton_2004 = new JButton("Set Array");
	    
	    inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma) :")); 
	    inputPanel.add(inputField_2004); 
	    inputPanel.add(setButton_2004);
	    
	    // Panel array visual
	    panelArray_2004 = new JPanel();
	    panelArray_2004.setLayout(new FlowLayout());
	    
	    // Panel kontrol
	    JPanel controlPanel = new JPanel();
	    stepButton_2004 = new JButton("Langkah Selanjutnya");
	    resetButton_2004 = new JButton("Reset");
	    
	    stepButton_2004.setEnabled(false); 
	    controlPanel.add(stepButton_2004); 
	    controlPanel.add(resetButton_2004);

	    // Area teks untuk log langkah-langkah
	    stepArea_2004 = new JTextArea(8, 60);
	    stepArea_2004.setEditable(false);
	    stepArea_2004.setFont(new Font("Monospaced", Font.PLAIN, 14)); 

	    JScrollPane scrollPane_2004 = new JScrollPane(stepArea_2004);

	    add(inputPanel, BorderLayout.NORTH); 
	    add(panelArray_2004, BorderLayout.CENTER); 
	    add(controlPanel, BorderLayout.SOUTH); 
	    add(scrollPane_2004, BorderLayout.EAST);

	    // Event Set Array
	    setButton_2004.addActionListener(e -> setArrayFromInput_2004());

	    // Event Langkah Selanjutnya
	    stepButton_2004.addActionListener(e -> performStep_2004());

	    // Event Reset
	    resetButton_2004.addActionListener(e -> reset_2004());
	}


private void setArrayFromInput_2004() {

    String text_2004 = inputField_2004.getText().trim();

    if (text_2004.isEmpty())
        return;

    String[] parts_2004 = text_2004.split(",");

    array_2004 = new int[parts_2004.length];

    try {

        for (int k_2004 = 0; k_2004 < parts_2004.length; k_2004++) {

            array_2004[k_2004] = Integer.parseInt(parts_2004[k_2004].trim());
        }

    } catch (NumberFormatException e_2004) {

        JOptionPane.showMessageDialog(
            this,
            "Masukkan hanya angka yang dipisahkan dengan koma!",
            "Error",
            JOptionPane.ERROR_MESSAGE
        );

        return;
    }

    i_2004 = 1;
    stepCount_2004 = 1;
    sorting_2004 = true;

    stepButton_2004.setEnabled(true);

    stepArea_2004.setText("");

    panelArray_2004.removeAll();

    labelArray_2004 = new JLabel[array_2004.length];

    for (int k_2004 = 0; k_2004 < array_2004.length; k_2004++) {

        labelArray_2004[k_2004] = new JLabel(String.valueOf(array_2004[k_2004]));

        labelArray_2004[k_2004].setFont(new Font("Arial", Font.BOLD, 24));

        labelArray_2004[k_2004].setBorder(
            BorderFactory.createLineBorder(Color.BLACK)
        );

        labelArray_2004[k_2004].setPreferredSize(
            new Dimension(50, 50)
        );

        labelArray_2004[k_2004].setHorizontalAlignment(
            SwingConstants.CENTER
        );

        panelArray_2004.add(labelArray_2004[k_2004]);
    }

    panelArray_2004.revalidate();
    panelArray_2004.repaint();
}
private void performStep_2004() {
    if (i_2004 < array_2004.length && sorting_2004) {
        int key_2004 = array_2004[i_2004];
        j_2004 = i_2004 - 1;

        StringBuilder stepLog_2004 = new StringBuilder();
        stepLog_2004.append("Langkah ")
                    .append(stepCount_2004)
                    .append(": Memasukkan ")
                    .append(key_2004)
                    .append("\n");

        while (j_2004 >= 0 && array_2004[j_2004] > key_2004) {
            array_2004[j_2004 + 1] = array_2004[j_2004];
            j_2004--;
        }

        array_2004[j_2004 + 1] = key_2004;

        updateLabels_2004();

        stepLog_2004.append("Hasil: ")
                    .append(arrayToString_2004(array_2004))
                    .append("\n\n");

        stepArea_2004.append(stepLog_2004.toString());

        i_2004++;
        stepCount_2004++;

        if (i_2004 == array_2004.length) {
            sorting_2004 = false;
            stepButton_2004.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }
}
private void updateLabels_2004() {
    for (int k_2004 = 0; k_2004 < array_2004.length; k_2004++) {
        labelArray_2004[k_2004].setText(String.valueOf(array_2004[k_2004]));
    }
}

private void reset_2004() {
    inputField_2004.setText("");
    panelArray_2004.removeAll();
    panelArray_2004.revalidate();
    panelArray_2004.repaint();

    stepArea_2004.setText("");
    stepButton_2004.setEnabled(false);

    sorting_2004 = false;
    i_2004 = 1;
    stepCount_2004 = 1;
}

private String arrayToString_2004(int[] arr_2004) {
    StringBuilder sb_2004 = new StringBuilder();

    for (int k_2004 = 0; k_2004 < arr_2004.length; k_2004++) {
        sb_2004.append(arr_2004[k_2004]);

        if (k_2004 < arr_2004.length - 1) {
            sb_2004.append(", ");
        }
    }

    return sb_2004.toString();
}

public static void main(String[] args_2004) {
    SwingUtilities.invokeLater(() -> {
    	insertiongui_2511532004 gui_2004 = new insertiongui_2511532004();
        gui_2004.setVisible(true);
    });
}
}