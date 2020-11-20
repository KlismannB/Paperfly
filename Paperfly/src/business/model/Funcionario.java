package business.model;

public class Funcionario {
	private String Nome;
	private boolean Ferias;
	private double Salario;
	
	public Funcionario() {}
	public Funcionario(String Nome, boolean Ferias, double Salario) {
		this.Nome = Nome;
		this.Ferias = Ferias;
		this.Salario = Salario;
	}
	
	public String getNome() {return Nome;}
	public boolean estaEmFerias() {return Ferias;}
	public double getSalario() {return Salario;}

	public void setNome(String nome) {this.Nome = nome;}
	public void querFerias(boolean ferias) {this.Ferias = ferias;}
	public void setSalario(double salario) {this.Salario = salario;}
	
	public String exibeDados() {
		return ("Nome: "+ this.Nome + "\nEstá de férias: "+ this.Ferias + "\nSalario: "+ this.Salario + " reais");
	}
	
}
