package frontend;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CriarPergunta {
	
	public void window() {
		
		JFrame jframe = new JFrame("Faça sua pegunta!");
		
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(1280,720);
		jframe.setBackground(Color.WHITE);
		
		
		JPanel top = (JPanel) jframe.getContentPane();
		top.setLayout(new GridLayout(6,1));
		
		
		JLabel comunidade = new JLabel("Comunidade High5system");
		top.add(comunidade);
		
		
		JLabel conectese = new JLabel("Conecte-se com a nossa comunidade, faça perguntas e encontre soluções.");
		top.add(conectese);
		
		
		JTextField campoPergunta = new JTextField();
		top.add(campoPergunta);
		
		
		JLabel setor = new JLabel("SETOR");
		top.add(setor);
		
		
		JComboBox boxSetor = new JComboBox();
		top.add(boxSetor);
		
		
		JButton enviar = new JButton("Enviar");
		
		enviar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				JOptionPane.showMessageDialog(enviar, "Pergunta Enviada!");
				
				
				
			}
			
		});
		
		top.add(enviar);
		
		
		jframe.setVisible(true);
		
		
	}
	

}
