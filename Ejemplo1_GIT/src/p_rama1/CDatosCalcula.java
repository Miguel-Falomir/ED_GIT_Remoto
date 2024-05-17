package p_rama1;

public class CDatosCalcula {
	private Integer var1;
	private Integer num2;
	private Integer num3;
	private Integer resultado;
	
	public CDatosCalcula() {
		
	}
	public CDatosCalcula(	Integer num1,
							Integer num2,
							Integer num3,
							Integer resultado
							){
		this.var1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.resultado = resultado;
	}

	public Integer getNum1() {
		return var1;
	}
	public void setNum1(Integer num1) {
		this.var1 = num1;
	}

	public Integer getNum2() {
		return num2;
	}
	public void setNum2(Integer num2) {
		this.num2 = num2;
	}

	public Integer getNum3() {
		return num3;
	}
	public void setNum3(Integer num3) {
		this.num3 = num3;
	}

	public Integer getResultado() {
		return resultado;
	}
	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}
	
}
