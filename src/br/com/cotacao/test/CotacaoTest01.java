package br.com.cotacao.test;
import br.com.cotacao.dominio.Money;
import br.com.cotacao.dominio.ServicoConsulta;

import java.util.Scanner;

public class CotacaoTest01 {
    public static void main(String[] args) throws Exception {


        System.out.print("Informe a moeda que você quer saber a cotação do dia: ");
        String moedaPrincipal = new Scanner(System.in).nextLine();
        System.out.print("Qual sua moeda:");
        String moedaConvertida = new Scanner(System.in).nextLine();
        Money money = ServicoConsulta.buscaMoeda(moedaPrincipal, moedaConvertida);

        System.out.println("Moeda Principal: " + money.getCode());
        System.out.println("Moeda Convertida: " + money.getCodein());
        System.out.println("Nome: " + money.getName());
        System.out.println("Valor: " + money.getAsk());
    }
}
