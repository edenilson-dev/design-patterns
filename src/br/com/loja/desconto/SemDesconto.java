package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto{

	public SemDesconto() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	@Override
	public boolean deveAplicarDesconto(Orcamento orcamento) {
		return true;
	}

	
}
