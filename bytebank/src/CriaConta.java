

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();  //Objeto / Instância
		primeiraConta.saldo = 200; //atribuição
		System.out.println(primeiraConta.saldo); //acesso
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo); 
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);
	}

}