package sg.corporation.chopy.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.corporation.chopy.entity.Ingredient;
import sg.corporation.chopy.util.MyOracleConnector;

@RestController
@RequestMapping(value= "/api-chopy/ingredient")
public class IngredientRestCtrl {
	
	@GetMapping("/{id}")
	public Ingredient getIngredientById(@PathVariable("id") Long id) {
		Ingredient ingredient = new Ingredient(id, "Mon nouvel ingrédient");
		return ingredient;
	}
	
	@GetMapping("")
	public Ingredient getAllIngredient(){
		return new Ingredient(4l, "Un nouvel ingrédient avec l'id 4");
	}
	
	@GetMapping("/recipe/{id}")
	public String getRecipe(@PathVariable(name = "id") int id){
		return MyOracleConnector.getRecipeWithId(id);
	}
}