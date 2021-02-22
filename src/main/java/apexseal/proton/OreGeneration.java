package apexseal.proton;

import apexseal.proton.block.ModBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGeneration {

    private static ConfiguredFeature<?,?> TIN_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.TIN_ORE.getDefaultState(), 14)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 63))).spreadHorizontally().repeat(20);
    private static ConfiguredFeature<?,?> COPPER_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.COPPER_ORE.getDefaultState(), 14)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 63))).spreadHorizontally().repeat(22);
    private static ConfiguredFeature<?,?> ALUMINIUM_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), ModBlocks.ALUMINIUM_ORE.getDefaultState(),25)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(53,53,70))).spreadHorizontally().repeat(4);
    

    public static void registerOreGeneration(){
        RegistryKey<ConfiguredFeature<?,?>> tinOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Proton.MOD_ID,"tin_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,tinOreOverworld.getValue(),TIN_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),GenerationStep.Feature.UNDERGROUND_ORES,tinOreOverworld);

		RegistryKey<ConfiguredFeature<?,?>> copperOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Proton.MOD_ID,"copper_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,copperOreOverworld.getValue(),COPPER_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, copperOreOverworld);

        RegistryKey<ConfiguredFeature<?,?>> aluminiumOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Proton.MOD_ID,"aluminium_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,aluminiumOreOverworld.getValue(),ALUMINIUM_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, aluminiumOreOverworld);
    }
}
