package entities;

/*
 * Diante disto, este trabalho consiste em propor a implementação de um simples 
 * projeto em Java de um sistema para compra de ingresso de cinema. O sistema deverá solicitar: 
 * o filme de uma lista pré-definida por vocês mesmo; a sessão do filme; e a quantidade 
 * de ingressos inteira (R$ 32) e meia (R$16), 
 * exibindo o total a pagar. Em seguida mostre sua solução para seus colegas!
 */

public class Entrance {	
	
	private String name;
	private double price;
	private String session;
	
	public Entrance(String name, int price, String session) {
		this.name = name;
		if (price == 0) this.price = 32.00;
		else if (price == 1) this.price = 16.00;
		this.session = session;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}
	
}
