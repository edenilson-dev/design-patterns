package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CalculadoradeDesconto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoOrcamentoparaMaisdeCincoItens(
				new DescontoOrcamentoMaiorqueQuinhentos(
						new SemDesconto()));
		return desconto.calcular(orcamento);
	}

}
