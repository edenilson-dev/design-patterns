import java.math.BigDecimal;

import br.com.loja.imposto.CalcularImpostos;
import br.com.loja.imposto.ICMS;
import br.com.loja.orcamento.Orcamento;

public class TestImpostos {
	
	public static void main (String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalcularImpostos calculadoraImpostos = new CalcularImpostos();
		
		
		System.out.println(calculadoraImpostos.calcular(orcamento, new ICMS()));
	}
}
