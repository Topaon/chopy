package sg.corporation.chopy.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@NoArgsConstructor@ToString
public class Ingredient {
	private Long id;
	private String name;
	
	public Ingredient(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
