package exam02;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ishikawa extends JPanel {
	public Ishikawa(){
		int confirm = JOptionPane.showConfirmDialog(null, "スルー、おーけー？", "らんたいむですぅ", JOptionPane.OK_CANCEL_OPTION);
		if(confirm == JOptionPane.CANCEL_OPTION){
			throw new RuntimeException("ちゅうしですぅ");
		}
		JButton button = new JButton("えっさ！ほいさ！ですぅ");
		button.setLayout(new BoxLayout(button, BoxLayout.X_AXIS));
		button.add(new JLabel("あはははははですぅ"));
		button.add(new JTextArea());
		this.add("するーされましたーですぅ", button);
	}

}
