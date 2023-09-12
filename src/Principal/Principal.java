package Principal;

import javax.swing.JOptionPane;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor para calcular o fatorial"));
		FatorialController fc = new FatorialController();
		System.out.println("O fatorial de "+n+" é "+fc.FatPilha(n));

	}

}
