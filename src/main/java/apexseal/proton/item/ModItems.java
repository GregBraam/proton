package apexseal.proton.item;

import apexseal.proton.block.ModBlocks;
import apexseal.proton.item.armor.SteelArmour;
import apexseal.proton.item.tool.SteelAxe;
import apexseal.proton.item.tool.SteelPickaxe;
import apexseal.proton.item.tool.SteelTool;
import apexseal.proton.Proton;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final ArmorMaterial steelArmourMaterial = new SteelArmour();

    //Items
    public static final Item TIN_INGOT = new Item(new Item.Settings().group(Proton.ITEM_GROUP));
	public static final Item COPPER_INGOT = new Item(new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item ZINC_INGOT = new Item(new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item STEEL_INGOT = new Item(new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item SILVER_INGOT = new Item(new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item LITHIUM_INGOT = new Item(new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item LEAD_INGOT = new Item(new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item ALUMINIUM_INGOT = new Item(new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item BRONZE_INGOT = new Item(new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item NICKEL_INGOT = new Item(new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item TITANIUM_INGOT = new Item(new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item PLATINUM_INGOT = new Item(new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item END_SHARD = new Item(new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item END_INGOT = new Item(new Item.Settings().group(Proton.ITEM_GROUP));

    //Block items
    public static final BlockItem TIN_BLOCK = new BlockItem(ModBlocks.TIN_BLOCK, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final BlockItem TIN_ORE = new BlockItem(ModBlocks.TIN_ORE, new Item.Settings().group(Proton.ITEM_GROUP));

    public static final BlockItem COPPER_BLOCK = new BlockItem(ModBlocks.COPPER_BLOCK, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final BlockItem COPPER_ORE = new BlockItem(ModBlocks.COPPER_ORE, new Item.Settings().group(Proton.ITEM_GROUP));

    public static final BlockItem ZINC_BLOCK = new BlockItem(ModBlocks.ZINC_BLOCK, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final BlockItem ZINC_ORE = new BlockItem(ModBlocks.ZINC_ORE, new Item.Settings().group(Proton.ITEM_GROUP));

    public static final BlockItem STEEL_BLOCK = new BlockItem(ModBlocks.STEEL_BLOCK, new Item.Settings().group(Proton.ITEM_GROUP));

    public static final BlockItem SILVER_BLOCK = new BlockItem(ModBlocks.SILVER_BLOCK, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final BlockItem SILVER_ORE = new BlockItem(ModBlocks.SILVER_ORE, new Item.Settings().group(Proton.ITEM_GROUP));

    public static final BlockItem LITHIUM_BLOCK = new BlockItem(ModBlocks.LITHIUM_BLOCK, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final BlockItem LITHIUM_ORE = new BlockItem(ModBlocks.LITHIUM_ORE, new Item.Settings().group(Proton.ITEM_GROUP));

    public static final BlockItem LEAD_BLOCK = new BlockItem(ModBlocks.LEAD_BLOCK, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final BlockItem LEAD_ORE = new BlockItem(ModBlocks.LEAD_ORE, new Item.Settings().group(Proton.ITEM_GROUP));

    public static final BlockItem ALUMINIUM_BLOCK = new BlockItem(ModBlocks.ALUMINIUM_BLOCK, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final BlockItem ALUMINIUM_ORE = new BlockItem(ModBlocks.ALUMINIUM_ORE, new Item.Settings().group(Proton.ITEM_GROUP));

    public static final BlockItem BRONZE_BLOCK = new BlockItem(ModBlocks.BRONZE_BLOCK, new Item.Settings().group(Proton.ITEM_GROUP));

    public static final BlockItem NICKEL_BLOCK = new BlockItem(ModBlocks.NICKEL_BLOCK, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final BlockItem NICKEL_ORE = new BlockItem(ModBlocks.NICKEL_ORE, new Item.Settings().group(Proton.ITEM_GROUP));

    public static final BlockItem TITANIUM_BLOCK = new BlockItem(ModBlocks.TITANIUM_BLOCK, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final BlockItem TITANIUM_ORE = new BlockItem(ModBlocks.TITANIUM_ORE, new Item.Settings().group(Proton.ITEM_GROUP));

    public static final BlockItem PLATINUM_BLOCK = new BlockItem(ModBlocks.PLATINUM_BLOCK, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final BlockItem PLATINUM_ORE = new BlockItem(ModBlocks.PLATINUM_ORE, new Item.Settings().group(Proton.ITEM_GROUP));

    public static final BlockItem END_ORE = new BlockItem(ModBlocks.END_ORE, new Item.Settings().group(Proton.ITEM_GROUP));

    //Armour

    public static final Item STEEL_HELMET = new ArmorItem(steelArmourMaterial, EquipmentSlot.HEAD, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item STEEL_CHESTPLATE = new ArmorItem(steelArmourMaterial, EquipmentSlot.CHEST, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item STEEL_LEGGINGS = new ArmorItem(steelArmourMaterial, EquipmentSlot.LEGS, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final Item STEEL_BOOTS = new ArmorItem(steelArmourMaterial, EquipmentSlot.FEET, new Item.Settings().group(Proton.ITEM_GROUP));
    
    //Tools

    public static final ToolItem STEEL_SWORD = new SwordItem(SteelTool.INSTANCE, 5, -2.4F, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final ToolItem STEEL_PICKAXE = new SteelPickaxe(SteelTool.INSTANCE, 1, -2.8F, new Item.Settings().group(Proton.ITEM_GROUP));
    public static final ToolItem STEEL_AXE = new SteelAxe(SteelTool.INSTANCE, 7, -3.0F, new Item.Settings().group(Proton.ITEM_GROUP));

    public static void registerItems(){
        //Registering items
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"tin_ingot"), TIN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"copper_ingot"), COPPER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"zinc_ingot"), ZINC_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"steel_ingot"), STEEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"lithium_ingot"), LITHIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"lead_ingot"), LEAD_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"aluminium_ingot"), ALUMINIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"bronze_ingot"), BRONZE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"nickel_ingot"), NICKEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"titanium_ingot"), TITANIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"platinum_ingot"), PLATINUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"end_shard"), END_SHARD);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"end_ingot"), END_INGOT);

        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"steel_helmet"), STEEL_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"steel_chestplate"), STEEL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"steel_leggings"), STEEL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"steel_boots"), STEEL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"steel_sword"), STEEL_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"steel_pickaxe"), STEEL_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"steel_axe"), STEEL_AXE);

        //Registering block items
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"tin_block"), TIN_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"tin_ore"), TIN_ORE);

        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"copper_block"), COPPER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"copper_ore"), COPPER_ORE);

        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"zinc_block"), ZINC_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"zinc_ore"), ZINC_ORE);

        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"steel_block"), STEEL_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"silver_block"), SILVER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"silver_ore"), SILVER_ORE);

        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"lithium_block"), LITHIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"lithium_ore"), LITHIUM_ORE);

        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"lead_block"), LEAD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"lead_ore"), LEAD_ORE);

        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"aluminium_block"), ALUMINIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"aluminium_ore"), ALUMINIUM_ORE);

        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"bronze_block"), BRONZE_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"nickel_block"), NICKEL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"nickel_ore"), NICKEL_ORE);

        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"titanium_block"), TITANIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"titanium_ore"), TITANIUM_ORE);

        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"platinum_block"), PLATINUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"platinum_ore"), PLATINUM_ORE);

        Registry.register(Registry.ITEM, new Identifier(Proton.MOD_ID,"end_ore"), END_ORE);

    }
    
}
