package backend;

import java.util.Date;

 public class Usuario {
    
    private Integer idCliente;
    private String nome;
    private String setor;
    private String senha;
    private String email;
    private String pergunta;

    public Usuario() {
    }

    public Usuario(Integer idCliente, String nome, String setor, String senha, String email, String pergunta) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = setor;
        this.senha = senha;
        this.email = email;
        this.pergunta = pergunta;
    }

   
    public Integer getidCliente() {
        return idCliente;
    }

    public void setId(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public String getPergunta() {
        return setor;
    }
	public String setPergunta() {
		// TODO Auto-generated method stub
		return null;
	}

    
    
}