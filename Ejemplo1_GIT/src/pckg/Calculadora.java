package pckg;

public class Calculadora {
	
	private Integer discrepancia;
	
	// sumar
	public double add(double number1, double number2) {
		return number1 + number2;
	}

	// restar
	public double subtract(double number1, double number2) {
		return number1 - number2;
	}

	// multiplicar
	public double multiply(double number1, double number2) {
		return number1 * number2;
	}

	// dividir
	public double divide(double number1, double number2) {
		return number1 / number2;
	}
	
	// random
	public double random(double min, double max) {
		return min + (Math.random() * ((max - min) + 1));
	}

	// comparar
	public boolean greaterThan(double number1, double number2) {
		if (number1 > number2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean lowerThan(double number1, double number2) {
		if (number1 < number2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equalTo(double number1, double number2) {
		if (number1 == number2) {
			return true;
		} else {
			return false;
		}
	}
}
