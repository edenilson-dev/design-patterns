import java.math.BigDecimal;

import br.com.loja.desconto.CalculadoradeDesconto;
import br.com.loja.orcamento.Orcamento;

public class TesteDescontos {

	public static void main (String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
		
		
		CalculadoradeDesconto calculadoradeDescontos = new CalculadoradeDesconto();
		System.out.println(calculadoradeDescontos.calcular(orcamento));
		System.out.println(calculadoradeDescontos.calcular(segundo));
	}

}
