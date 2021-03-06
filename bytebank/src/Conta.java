public class Conta {
	double saldo; //atributo
	int agencia; //atributo
	int numero; //atributo
	String titular; //atributo
	
	public void deposita(double valor) { //método
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;			
		} else {
			return false;
		}
	}
}