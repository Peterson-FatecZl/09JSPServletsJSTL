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
public class ImpostoCuritiba implements ICalculoDeImpostosUrbanos{
	private double areaTotal;
	private int idadeImovel;
	
	@Override
	public double calcularImposto() {
		double calculo = areaTotal * 5;		
		if(idadeImovel > 50) {
			calculo += idadeImovel * 3;
		}else if(idadeImovel > 20) {
			calculo += idadeImovel * 2.5;
		}else {
			calculo += idadeImovel * 2;
		}
		return calculo;
	}

}
