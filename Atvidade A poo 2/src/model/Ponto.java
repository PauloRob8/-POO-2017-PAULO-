package model;

public class Ponto {
	
	public int x;
	public int y;
	
	public Ponto(int coordenadax,int coordenaday) {
		this.x = coordenadax;
		this.y = coordenaday;
	}
	
	public double dinstancia(Ponto A,Ponto B) {
		return Math.sqrt(Math.pow(B.x - A.x,2) + Math.pow(B.y - A.y,2));
	}
	
	public String quadrante(int x,int y) {
		if(x >= 0 & y >= 0)
			return "Pertence ao 1º quadrante";
		else if(x < 0 & y >= 0)
			return "Pertence ao 2º quadrante";
		else if(x >= 0 & y < 0)
			return "Pertence ao 4º quadrante";
		else if(x < 0 & y < 0)
			return "Pertence ao 3º quadrante";
		else
			return "Não pertence a nenhum quadrante";
	}
	
	public void mover(int novoX,int novoY) {
		this.x = novoX;
		this.y = novoY;
	}

}
