package br.com.caelum.contas.main;


import java.io.PrintStream;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.javafx.api.main.OlaMundo;
import br.com.caelum.javafx.api.main.SistemaBancario;
import br.com.caelum.javafx.api.main.TelaDeContas;

public class TestaJar {
	public static void main(String[] args) {
//		OlaMundo.main(args);
//		TelaDeContas.main(args);
		SistemaBancario.mostraTela(true);
	}
}
