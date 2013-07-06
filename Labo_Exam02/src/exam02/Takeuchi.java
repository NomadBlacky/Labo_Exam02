package exam02;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;

public class Takeuchi extends JPanel {
	public Takeuchi(){
		
		this.setLayout(new MigLayout("", "[grow][]", "[grow]"));
		
		
		//PrintImageTest.
		JLabel faceLabel = new JLabel();
		ImageIcon face = new ImageIcon("./data/face.png");
	    faceLabel.setIcon(face);
		this.add(faceLabel, "cell 0 0,grow");
		
		JLabel faceLabel2 = new JLabel();
		ImageIcon face2 = new ImageIcon("./data/face.png");
	    faceLabel2.setIcon(face2);
		this.add(faceLabel2, "cell 1 0,grow");


		
	}

}
