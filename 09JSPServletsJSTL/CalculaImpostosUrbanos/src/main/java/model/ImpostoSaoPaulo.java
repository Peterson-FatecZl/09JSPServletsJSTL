package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ImpostoSaoPaulo implements ICalculoDeImpostosUrbanos{
	private double areaTotal;
	private int numeroDeComodos;
	
	@Override
	public double calcularImposto() {
		double calculo = (areaTotal * 10)+(numeroDeComodos * 2);
		return calculo;
	}
	
}
