package frontend;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TelaLogin {
	
	String login;
	String senha;
	
	public void window() {
	
		CriarPergunta criarPergunta = new CriarPergunta();
	
		JFrame jframe = new JFrame("Login");
	
	
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(1280,720);
		jframe.setBackground(Color.WHITE);
		
		
		
		JPanel top = (JPanel) jframe.getContentPane();
		top.setLayout(new GridLayout(6,1));
		
		
		
		JLabel email = new JLabel("EMAIL");
		top.add(email);
		
		
		JTextField campoEmail = new JTextField();
		top.add(campoEmail);
		
		
		JLabel senha = new JLabel("SENHA");
		top.add(senha);
				
		
		JTextField campoSenha = new JTextField();
		top.add(campoSenha);
		
		
		JButton entrar = new JButton("Entrar");
		entrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				cadastrarUsuario.cadastro(campoNome.getText(), campoEmail.getText(), campoSenha.getText());
				
//				JOptionPane.showMessageDialog(entrar, "Usuario Cadastrado");
//				jframe.setVisible(false);
				
//				login = 
				
				
				
				
				
				jframe.setVisible(false);
						
				
				criarPergunta.window();
				
			}
			
		});
				
		top.add(entrar);
		
		
		JLabel esqueceuSenha = new JLabel("Esqueci minha senha");
		top.add(esqueceuSenha);

		
		
		jframe.setVisible(true);
		
		
	}

}
