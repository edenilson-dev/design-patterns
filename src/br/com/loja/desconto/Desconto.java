package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;
	
	public Desconto (Desconto proximo){
		this.proximo = proximo;
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicarDesconto(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}

	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	public abstract boolean deveAplicarDesconto(Orcamento orcamento);
	
}
