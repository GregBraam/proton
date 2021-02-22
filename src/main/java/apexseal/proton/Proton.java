package apexseal.proton;

import apexseal.proton.block.ModBlocks;
import apexseal.proton.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Proton implements ModInitializer {

	public static final String MOD_ID = "proton";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier("proton","proton_item_group"),() -> new ItemStack(Blocks.IRON_BLOCK));	

	@Override
	public void onInitialize() {

		ModItems.registerItems();
		ModBlocks.registerBlocks();
		OreGeneration.registerOreGeneration();

	}
}
