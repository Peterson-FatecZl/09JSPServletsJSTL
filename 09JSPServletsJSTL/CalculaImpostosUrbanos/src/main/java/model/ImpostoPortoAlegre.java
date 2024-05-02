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
public class ImpostoPortoAlegre implements ICalculoDeImpostosUrbanos {
	private double areaTotal;
	private double areaGaragem;
	
	@Override
	public double calcularImposto() {
		double calculo = (areaTotal * 7.5) + (areaGaragem *2.5); 
		return calculo;
	}
	
}
