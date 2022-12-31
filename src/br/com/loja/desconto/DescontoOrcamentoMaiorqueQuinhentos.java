package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class DescontoOrcamentoMaiorqueQuinhentos extends Desconto {

	public DescontoOrcamentoMaiorqueQuinhentos(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicarDesconto(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

	
}
