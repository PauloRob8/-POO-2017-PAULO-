package app;
import model.*;

public class TestePonto {
	
	public static void main(String[] args) {
		
		Ponto pontoA = new Ponto(2,-3);
		Ponto pontoB = new Ponto(4,5);
		
		System.out.println(pontoA.quadrante(pontoA.x, pontoA.y));
		System.out.println(pontoB.quadrante(pontoB.x, pontoB.y));
		
		System.out.printf("Distância = %f \n",pontoA.dinstancia(pontoA, pontoB));
		
		pontoA.mover(5,6);
		
		System.out.printf("Novas coordenadas de x e y %d,%d",pontoA.x,pontoA.y);
	}

}
