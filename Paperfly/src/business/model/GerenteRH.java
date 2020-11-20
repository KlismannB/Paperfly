package business.model;

public class GerenteRH extends Funcionario{
	private boolean allow;
		
	public GerenteRH(String nome, boolean ferias, double salario) {
			super(nome, ferias, salario);
		}
	
	public void setAllow(boolean allow) {
		this.allow = allow;
	}

	public boolean getAllow() {
		// TODO Auto-generated method stub
		return allow;
	}
	
	
}
