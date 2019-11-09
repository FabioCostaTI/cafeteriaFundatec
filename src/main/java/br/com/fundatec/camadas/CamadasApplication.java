package br.com.fundatec.camadas;

import br.com.fundatec.camadas.presentation.CafeteriaInterface;

public class CamadasApplication {

	public static void main(String[] args) {
		CafeteriaInterface cafeteriaInterface = new CafeteriaInterface();
		cafeteriaInterface.mostrarTelaInicial();
		cafeteriaInterface.criarPedido();
		cafeteriaInterface.mostrarPedidos();
	}

}
