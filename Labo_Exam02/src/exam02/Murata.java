package exam02;

import java.awt.event.*;
import javax.swing.*;

import net.miginfocom.swing.MigLayout;

public class Murata extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	/* 自身のパネルにSplitPaneを載せて、上のPane(pane1)を入力、下のPane(pane2)を出力としています。
	 * 出力はJList(DefaultListModel,model)で管理しています。*/
	
	private JPanel pane1 = new JPanel(new MigLayout(
			"",
			"[][grow]",
			"[]"));
	private JButton button1 = new JButton("追加");
	private JTextField txt = new JTextField(); //pane1各種コンポーネント
	
	
	private JPanel pane2 = new JPanel(new MigLayout(
			"",
			"[grow]",
			"[grow]"));
	private JScrollPane scrPane = new JScrollPane();
	private DefaultListModel<String> model = new DefaultListModel<>();
	private JList<String> list1 = new JList<>(model);//pane2各種コンポーネント

	Murata(){
		this.setLayout(new MigLayout(
				"",
				"[grow]",
				"[grow]"));//メインパネルのレイアウト
		
		button1.addActionListener(this);
		pane1.add(button1);
		pane1.add(txt,"grow");

		scrPane.setViewportView(list1);
		pane2.add(scrPane,"grow");
		
		JSplitPane sPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,pane1,pane2);
		this.add(sPane,"grow");
	}
	public void actionPerformed(ActionEvent e){
			model.addElement(txt.getText());
	}//アクション処理、テキストフィールド内の文字列をJListに追加
}
