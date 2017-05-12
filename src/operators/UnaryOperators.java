package operators;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;

public class UnaryOperators {

	public static void main (String[] args){
		
		UnaryOperator<BigDecimal> percentageToAmount = bd -> bd.multiply(BigDecimal.valueOf(100));
		
		System.out.println(percentageToAmount.apply(BigDecimal.valueOf(0.20)));
	}
}
