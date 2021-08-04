package br.com.adryan.polimorfismo;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public static void main(String[] args) {
    	
    	PessoaFisica Adryan = new PessoaFisica("12453275933");
    	System.out.println("CPF: " + Adryan.validarDocumento());
    	System.out.println("Documento: " + Adryan.gerarDocumento());
    	System.out.println("Documento formatado: " + Adryan.getDocumentoFormatado());
    	
    	PessoaJuridica Terabyte = new PessoaJuridica("18781203000128");
    	System.out.println("\nCNPJ: " + Terabyte.validarDocumento());
    	System.out.println("Documento: " + Terabyte.gerarDocumento());
    	System.out.println("Documento formatado: " + Terabyte.getDocumentoFormatado());
    	
    	System.out.println("\nSoma: " + new Soma(5, 3).calcular());
    	System.out.println("\nSubtração: " + new Subtracao(5, 3).calcular());
    	System.out.println("\nDivisão: " + new Divisao (4, 2).calcular());
    	System.out.println("\nMultiplicação : " + new Multiplicacao (5, 4).calcular());
    }
}
