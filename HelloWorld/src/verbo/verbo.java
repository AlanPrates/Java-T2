package verbo;

public class verbo {
	private String radical, sufixo;
	

	public verbo(String _radical, String _sufixo) {
		super();
		this.radical = _radical;
		this.sufixo = _sufixo;
	}

	public void conjugar() {
		System.out.println(" Eu "+radical+"0");
		System.out.println(" Eu "+radical+"as");
		System.out.println(" Eu "+radical+"a");
		System.out.println(" Eu "+radical+"amos");
		System.out.println(" Eu "+radical+"ais");
		System.out.println(" Eu "+radical+"am");

	}

	public String getRadical() {
		return radical;
	}

	public void setRadical(String radical) {
		this.radical = radical;
	}

	public String getSufixo() {
		return sufixo;
	}

	public void setSufixo(String sufixo) {
		this.sufixo = sufixo;
	}
}