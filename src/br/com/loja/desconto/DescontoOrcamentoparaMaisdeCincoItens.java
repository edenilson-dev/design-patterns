package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class DescontoOrcamentoparaMaisdeCincoItens extends Desconto{

	public DescontoOrcamentoparaMaisdeCincoItens(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		return proximo.calcular(orcamento);
	}
	
}
