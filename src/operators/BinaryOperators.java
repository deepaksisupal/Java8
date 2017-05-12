package operators;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class BinaryOperators {

	public static void main (String[] args){
		BinaryOperator<BigDecimal> toPercentage = (amount, totalAmount) -> amount.divide(totalAmount).multiply(BigDecimal.valueOf(100));
		System.out.println(toPercentage.apply(BigDecimal.valueOf(20), BigDecimal.valueOf(100)));
	}
}
