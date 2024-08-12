package Alcohol.dto;

public class AlcoholDTO {
	private String Country;
	private String type;
	private String name;// 이름
	private int proof; // 도수
	private int price;// 가격
	
	public AlcoholDTO() {} // 기본 생성자 

	public AlcoholDTO(
		String country,String type,	String name, int proof, int price ) {
		super();
		this.Country = country;
		this.type = type;
		this.name = name;
		this.proof = proof;
		this.price = price;
	}

	

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		this.Country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProof() {
		return proof;
	}

	public void setProof(int proof) {
		this.proof = proof;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [Country=" + Country + ", type=" + type + ", name=" + name + ", proof=" + proof + ", price="
				+ price + "]";
	}

	
	
}
