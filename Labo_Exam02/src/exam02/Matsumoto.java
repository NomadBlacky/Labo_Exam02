package exam02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import net.miginfocom.swing.MigLayout;

public class Matsumoto extends JPanel implements ActionListener {
	static JButton in = new JButton("下に送信");
	static JTextPane textIN = new JTextPane();
	static JTextPane textOUT = new JTextPane();
	// パーツの用意

	public Matsumoto() {
		this.setLayout(new MigLayout("", "[grow]", "[][grow][][grow]"));

		this.add(new JLabel("下に送信したいメッセージを入力してください。"), "wrap,c");

		this.add(textIN, "grow,wrap");

		this.add(in, "grow,wrap");
		in.addActionListener(this);

		this.add(textOUT, "grow");
		// セット
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		textOUT.setText(textIN.getText());
		textIN.setText("");
		// アクション処理
	}

}
