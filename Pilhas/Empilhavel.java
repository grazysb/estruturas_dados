public interface Empilhavel {
	//métodos principais
	void empilhar(Object dado);
	Object espiar();			
	void atualizar(Object dado);
	Object desempilhar();		
	
	//métodos auxiliares
	boolean estaCheia();
	boolean estaVazia();
	String imprimir();
}