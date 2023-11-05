package sg.corporation.chopy.entity;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@NoArgsConstructor@ToString
public class Shoplist {
	private Long id;
	private String name;
	
	private List<Recipe> recipes;
}