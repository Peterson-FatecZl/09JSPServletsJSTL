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
public class ImpostoBeloHorizonte implements ICalculoDeImpostosUrbanos{
	private double areaTotal;
	private int numeroDeQuartos;
	
	@Override
	public double calcularImposto() {
		double calculo = (areaTotal * 7) + (numeroDeQuartos * 4);
		return calculo;
	}

}
