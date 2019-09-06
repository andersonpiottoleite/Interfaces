
public class TesteAreaCalculavel {
	
	public static void main(String[] args) {
		AreaCalculavel ac1 = new Quadrado(10);
		
		AreaCalculavel ac2 = new Retangulo(10, 20);
		
		AreaCalculavel ac3 = new Circulo(200);
		
		
		System.out.println(ac1.calculaArea());

		System.out.println(ac2.calculaArea());
		
		System.out.println(ac3.calculaArea());
	}

}
