package controller;
import model.PlhaInt;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	public long FatPilha(int valor) throws Exception {
		PlhaInt p = new PlhaInt();
		while(valor>1) {
			p.push(valor);
			valor = valor - 1;
		}
		long fat = valor;
		while(!p.isEmpty()) {
			fat = fat*p.pop();
		}
		return fat;
	}
}
