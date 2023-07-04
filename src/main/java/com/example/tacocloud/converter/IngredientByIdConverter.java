package com.example.tacocloud.converter;
import com.example.tacocloud.entity.Ingredient;
import com.example.tacocloud.entity.Ingredient.Type;
import com.example.tacocloud.repository.IngredientRepository;
import java.util.HashMap; import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
    private final IngredientRepository ingredientRepository;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepository.findById(id).orElse(null); }
}
