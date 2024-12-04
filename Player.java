package Game;

public class Player {
	
	private String name;
	private char symbol;
	
	public Player(String someName, char someSymbol) {
		this.name = someName;
		this.symbol = someSymbol;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	
	

}
