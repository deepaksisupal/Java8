package map.data;

public class Document {

	String dri;
	Integer number;

	public String getDri() {
		return dri;
	}

	public void setDri(String dri) {
		this.dri = dri;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Document [dri=" + dri + ", number=" + number + "]";
	}

}
