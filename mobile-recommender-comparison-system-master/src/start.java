import javax.swing.*;
import java.awt.event.*;

public class start implements ActionListener {
	private JFrame frameStart = new JFrame("Smart Phone Comparison System");

	private JLabel backImage = new JLabel();

	private JButton btnSearch = new JButton("Compare Phones");
	private JButton btnDevLogin = new JButton("Developer Login");
	private JButton SellerSpace = new JButton("Seller Space");


	public static void main(String[] args) {
		try {
			// UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		new start();
	}

	public start() {
		frameStart.setResizable(false);
		frameStart.setBounds(100, 100, 600, 401);
		frameStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameStart.setLocationRelativeTo(null);

		frameStart.add(backImage);
		backImage.setLayout(null);


		btnDevLogin.addActionListener(this);
		btnDevLogin.setBounds(350, 50, 180, 35);
		backImage.add(btnDevLogin);


		btnSearch.addActionListener(this);
		btnSearch.setBounds(50, 50, 180, 35);
		backImage.add(btnSearch);



		frameStart.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		frameStart.dispose();
		if (e.getSource() == btnDevLogin)
			new devLogin();

		if (e.getSource() == btnSearch)
			new search();
		


	}
}
