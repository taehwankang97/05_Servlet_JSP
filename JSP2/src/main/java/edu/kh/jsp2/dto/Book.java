package edu.kh.jsp2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter + setter + toSting
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	private String title;
	private String writer;
	private int price;
}
