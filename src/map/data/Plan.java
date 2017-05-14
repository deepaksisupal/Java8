package map.data;

import java.util.List;

public class Plan {

	@Override
	public String toString() {
		return "Plan [number=" + number + ", documents=" + documents + "]";
	}

	Integer number;

	List<Document> documents;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer planCount) {
		this.number = planCount;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
}
