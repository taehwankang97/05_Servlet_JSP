package edu.kh.TodoListdto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Todo implements Serializable{
	
	private String title;
	private String detail;
	private boolean complete;
 	private LocalDateTime regDate;

}
