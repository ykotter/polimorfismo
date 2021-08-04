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
    	System.out.println(Adryan.validarDocumento());
    	System.out.println(Adryan.gerarDocumento());
    	System.out.println(Adryan.getDocumentoFormatado());
    	
    	PessoaJuridica Terabyte = new PessoaJuridica("079939730001");
    	System.out.println(Terabyte.validarDocumento());
    	System.out.println(Terabyte.gerarDocumento());
    	System.out.println(Terabyte.getDocumentoFormatado());
    	
    	System.out.println(new Soma(5, 3).calcular());
    	System.out.println(new Subtracao(5, 3).calcular());
    	System.out.println(new Divisao (4, 2).calcular());
    	System.out.println(new Multiplicacao (5, 4).calcular());
    }
}
