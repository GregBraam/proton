package apexseal.proton.block;

import apexseal.proton.Proton;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    // Blocks
    public static final Block TIN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F,6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());
    public static final Block TIN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());

	public static final Block COPPER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());
	public static final Block COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());

    public static final Block ZINC_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());
    public static final Block ZINC_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());

    public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());

    public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());
    public static final Block SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());

    public static final Block LITHIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());
    public static final Block LITHIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());

    public static final Block LEAD_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());
    public static final Block LEAD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());

    public static final Block ALUMINIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());
    public static final Block ALUMINIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());
    
    public static final Block BRONZE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());

    public static final Block NICKEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());
    public static final Block NICKEL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());

    public static final Block TITANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());
    public static final Block TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());

    public static final Block PLATINUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());
    public static final Block PLATINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());

    public static final Block END_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(5.0F, 9.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES,3).requiresTool());

    public static final Block NEW_METAL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());
    public static final Block NEW_METAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES,1).requiresTool());
    

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"tin_block"), TIN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"tin_ore"), TIN_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"copper_block"), COPPER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"copper_ore"), COPPER_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"zinc_block"), ZINC_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"zinc_ore"), ZINC_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"steel_block"), STEEL_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"silver_block"), SILVER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"silver_ore"), SILVER_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"lithium_block"), LITHIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"lithium_ore"), LITHIUM_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"lead_block"), LEAD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"lead_ore"), LEAD_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"aluminium_block"), ALUMINIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"aluminium_ore"), ALUMINIUM_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"bronze_block"), BRONZE_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"nickel_block"), NICKEL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"nickel_ore"), NICKEL_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"titanium_block"), TITANIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"titanium_ore"), TITANIUM_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"platinum_block"), PLATINUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"platinum_ore"), PLATINUM_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Proton.MOD_ID,"end_ore"), END_ORE);

    }
}
