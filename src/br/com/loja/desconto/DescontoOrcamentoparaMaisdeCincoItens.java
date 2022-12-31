package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class DescontoOrcamentoparaMaisdeCincoItens extends Desconto{

	public DescontoOrcamentoparaMaisdeCincoItens(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
	
	@Override
	public boolean deveAplicarDesconto(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

	
}
