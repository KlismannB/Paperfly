package business.model;
import java.util.ArrayList;

public class Gerente{
	private boolean Solicitation;
	private double NewSalary;
	ArrayList<Funcionario> ListaFunc;
	
	public Gerente(String nome, boolean ferias, double salario) {
		super();
		ListaFunc = new ArrayList<Funcionario>();
	}
	
	public ArrayList<Funcionario> getFunc(){
		return ListaFunc;
	}
	
	public void setFunc(ArrayList<Funcionario> listaFunc) {
		this.ListaFunc = listaFunc;
	}
	
	public boolean getSolicitation() {
		return Solicitation;
	}
	
	public void setSolicitation(boolean solicitation) {
		this.Solicitation = solicitation;
	}

	public double getNewSalary() {
		return NewSalary;
	}

	public void setNewSalary(double newSalary) {
		this.NewSalary = newSalary;
	}
}
