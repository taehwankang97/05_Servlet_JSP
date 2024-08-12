package edu.kth.alcohol.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AlcoholDto  implements Serializable{

	private String Country;
	private String type;
	private String name;// 이름
	private int proof; // 도수
	private int price;// 가격
}
