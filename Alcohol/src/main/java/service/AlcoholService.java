package alcohol.service;

import java.util.ArrayList;
import java.util.List;

import alcohol.dto.AlcoholDTO;

public class AlcoholService {

	private List<AlcoholDTO> AlcoholList = new ArrayList<AlcoholDTO>();

	public AlcoholService() {
		AlcoholList.add(new AlcoholDTO("중국", "고량주", "연태고량주", 80, 12000));
		AlcoholList.add(new AlcoholDTO("멕시코", "데킬라", "아네호 1800", 75, 18000));
		AlcoholList.add(new AlcoholDTO("미국", "럼", "바카디", 80, 12000));
		AlcoholList.add(new AlcoholDTO("프랑스", "꼬냑", "XO", 70, 100000));
		AlcoholList.add(new AlcoholDTO("스코틀랜드", "위스키", "몽키숄더", 80, 45000));
		AlcoholList.add(new AlcoholDTO("한국", "소주", "새로", 24, 1650));
		AlcoholList.add(new AlcoholDTO("스페인", "와인", "이자디 크리안자 리오하", 28, 60000));
		AlcoholList.add(new AlcoholDTO("미국", "맥주", "쿠어스 라이트", 8, 2000));

	}

	public List<AlcoholDTO> selectAll() {

		return AlcoholList;
	}

	public List<AlcoholDTO> selectType(String type) {
		List<AlcoholDTO> searchList = new ArrayList<AlcoholDTO>();
		for (AlcoholDTO alcohol : AlcoholList) {
			if (alcohol.getType().contains(type)) {
				searchList.add(alcohol);
			}
		}

		return searchList;

		
	}

	public List<AlcoholDTO> selectName(String name) {
		List<AlcoholDTO> searchList = new ArrayList<AlcoholDTO>();
		for (AlcoholDTO alcohol : AlcoholList) {
			if (alcohol.getName().contains(name)) {
				searchList.add(alcohol);
			}
		}

		return searchList;
	}

	public List<AlcoholDTO> selectCountury(String country) {
		List<AlcoholDTO> searchList = new ArrayList<AlcoholDTO>();
		for (AlcoholDTO alcohol : AlcoholList) {
			if (alcohol.getCountry().contains(country)) {
				searchList.add(alcohol);
			}
		}

		return searchList;
	}
	public List<AlcoholDTO> selectPrice(int min, int max){
		List<AlcoholDTO> searchList = new ArrayList<AlcoholDTO>();
		for(AlcoholDTO alcohol : AlcoholList) {
			int price = alcohol.getPrice();
			if(price >= min && price <= max) {
				searchList.add(alcohol);
			}
		}
		return searchList;
	}
	public boolean addAlcohol(AlcoholDTO newAlcohol) {
		return AlcoholList.add(newAlcohol);
	}

	public String removeAlcohol(String name) {
	    for (AlcoholDTO alcohol : AlcoholList) {
	        if (alcohol.getName().equals(name)) {
	            AlcoholList.remove(alcohol);
	            return name;
	        }
	    }
	    return null;
	}
}
