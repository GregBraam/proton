package apexseal.proton.item.tool;

import apexseal.proton.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SteelTool implements ToolMaterial {

    public static final SteelTool INSTANCE = new SteelTool();

    @Override
    public int getDurability() {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0F;
    }

    @Override
    public float getAttackDamage() {
        return 2.0F;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.STEEL_INGOT);
    }
    
}
