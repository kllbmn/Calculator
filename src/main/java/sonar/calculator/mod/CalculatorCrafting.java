package sonar.calculator.mod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import sonar.calculator.mod.common.block.MaterialBlock;
import sonar.calculator.mod.common.block.MaterialBlock.Variants;
import sonar.core.SonarCore;

public class CalculatorCrafting extends Calculator {

	public static void addRecipes() {

		// reinforced tools
		addShapedOre(new ItemStack(reinforced_axe, 1), new Object[] { "RR ", "RS ", " S ", 'R', "calculatorReinforcedStone", 'S', "stickWood" });
		addShapedOre(new ItemStack(reinforced_pickaxe, 1), new Object[] { "RRR", " S ", " S ", 'R', "calculatorReinforcedStone", 'S', "stickWood" });
		addShapedOre(new ItemStack(reinforced_shovel, 1), new Object[] { " R ", " S ", " S ", 'R', "calculatorReinforcedStone", 'S', "stickWood" });
		addShapedOre(new ItemStack(reinforced_hoe, 1), new Object[] { "RR ", " S ", " S ", 'R', "calculatorReinforcedStone", 'S', "stickWood" });
		addShapedOre(new ItemStack(reinforced_sword, 1), new Object[] { " R ", " R ", " S ", 'R', "calculatorReinforcedStone", 'S', "stickWood" });

		// reinforced iron tools
		addShapedOre(new ItemStack(reinforcediron_axe, 1), new Object[] { "RR ", "RS ", " S ", 'R', reinforcediron_ingot, 'S', "stickWood" });
		addShapedOre(new ItemStack(reinforcediron_pickaxe, 1), new Object[] { "RRR", " S ", " S ", 'R', reinforcediron_ingot, 'S', "stickWood" });
		addShapedOre(new ItemStack(reinforcediron_shovel, 1), new Object[] { " R ", " S ", " S ", 'R', reinforcediron_ingot, 'S', "stickWood" });
		addShapedOre(new ItemStack(reinforcediron_hoe, 1), new Object[] { "RR ", " S ", " S ", 'R', reinforcediron_ingot, 'S', "stickWood" });
		addShapedOre(new ItemStack(reinforcediron_sword, 1), new Object[] { " R ", " R ", " S ", 'R', reinforcediron_ingot, 'S', "stickWood" });

		// redstone tools
		addShapedOre(new ItemStack(redstone_axe, 1), new Object[] { "RR ", "RS ", " S ", 'R', redstone_ingot, 'S', "stickWood" });
		addShapedOre(new ItemStack(redstone_pickaxe, 1), new Object[] { "RRR", " S ", " S ", 'R', redstone_ingot, 'S', "stickWood" });
		addShapedOre(new ItemStack(redstone_shovel, 1), new Object[] { " R ", " S ", " S ", 'R', redstone_ingot, 'S', "stickWood" });
		addShapedOre(new ItemStack(redstone_hoe, 1), new Object[] { "RR ", " S ", " S ", 'R', redstone_ingot, 'S', "stickWood" });
		addShapedOre(new ItemStack(redstone_sword, 1), new Object[] { " R ", " R ", " S ", 'R', redstone_ingot, 'S', "stickWood" });

		// enriched gold tools
		addShapedOre(new ItemStack(enrichedgold_axe, 1), new Object[] { "RR ", "RS ", " S ", 'R', enrichedgold_ingot, 'S', "stickWood" });
		addShapedOre(new ItemStack(enrichedgold_pickaxe, 1), new Object[] { "RRR", " S ", " S ", 'R', enrichedgold_ingot, 'S', "stickWood" });
		addShapedOre(new ItemStack(enrichedgold_shovel, 1), new Object[] { " R ", " S ", " S ", 'R', enrichedgold_ingot, 'S', "stickWood" });
		addShapedOre(new ItemStack(enrichedgold_hoe, 1), new Object[] { "RR ", " S ", " S ", 'R', enrichedgold_ingot, 'S', "stickWood" });
		addShapedOre(new ItemStack(enrichedgold_sword, 1), new Object[] { " R ", " R ", " S ", 'R', enrichedgold_ingot, 'S', "stickWood" });

		// weakened diamond tools
		addShapedOre(new ItemStack(weakeneddiamond_axe, 1), new Object[] { "RR ", "RS ", " S ", 'R', weakeneddiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(weakeneddiamond_pickaxe, 1), new Object[] { "RRR", " S ", " S ", 'R', weakeneddiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(weakeneddiamond_shovel, 1), new Object[] { " R ", " S ", " S ", 'R', weakeneddiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(weakeneddiamond_hoe, 1), new Object[] { "RR ", " S ", " S ", 'R', weakeneddiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(weakeneddiamond_sword, 1), new Object[] { " R ", " R ", " S ", 'R', weakeneddiamond, 'S', "stickWood" });

		// flawless diamond tools
		addShapedOre(new ItemStack(flawlessdiamond_axe, 1), new Object[] { "RR ", "RS ", " S ", 'R', flawlessdiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(flawlessdiamond_pickaxe, 1), new Object[] { "RRR", " S ", " S ", 'R', flawlessdiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(flawlessdiamond_shovel, 1), new Object[] { " R ", " S ", " S ", 'R', flawlessdiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(flawlessdiamond_hoe, 1), new Object[] { "RR ", " S ", " S ", 'R', flawlessdiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(flawlessdiamond_sword, 1), new Object[] { " R ", " R ", " S ", 'R', flawlessdiamond, 'S', "stickWood" });

		// fire diamond tools
		addShapedOre(new ItemStack(firediamond_axe, 1), new Object[] { "RR ", "RS ", " S ", 'R', firediamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(firediamond_pickaxe, 1), new Object[] { "RRR", " S ", " S ", 'R', firediamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(firediamond_shovel, 1), new Object[] { " R ", " S ", " S ", 'R', firediamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(firediamond_hoe, 1), new Object[] { "RR ", " S ", " S ", 'R', firediamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(firediamond_sword, 1), new Object[] { " R ", " R ", " S ", 'R', firediamond, 'S', "stickWood" });

		// electric diamond tools
		addShapedOre(new ItemStack(electric_axe, 1), new Object[] { "RR ", "RS ", " S ", 'R', electricDiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(electric_pickaxe, 1), new Object[] { "RRR", " S ", " S ", 'R', electricDiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(electric_shovel, 1), new Object[] { " R ", " S ", " S ", 'R', electricDiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(electric_hoe, 1), new Object[] { "RR ", " S ", " S ", 'R', electricDiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(electric_sword, 1), new Object[] { " R ", " R ", " S ", 'R', electricDiamond, 'S', "stickWood" });

		// end forged tools
		addShapedOre(new ItemStack(endforged_axe, 1), new Object[] { "RR ", "RS ", " S ", 'R', endDiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(endforged_pickaxe, 1), new Object[] { "RRR", " S ", " S ", 'R', endDiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(endforged_shovel, 1), new Object[] { " R ", " S ", " S ", 'R', endDiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(endforged_hoe, 1), new Object[] { "RR ", " S ", " S ", 'R', endDiamond, 'S', "stickWood" });
		addShapedOre(new ItemStack(endforged_sword, 1), new Object[] { " R ", " R ", " S ", 'R', endDiamond, 'S', "stickWood" });

		// calculator parts
		addShapedOre(new ItemStack(calculator_screen, 1), new Object[] { "CCC", "CRC", "CCC", 'C', "cobblestone", 'R', "dustRedstone" });
		//addShaped(new ItemStack(calculator_assembly, 1), new Object[] { "BBB", "BBB", "BBB", 'B', Blocks.stone_button });
		//addShapedOre(new ItemStack(advanced_assembly, 1), new Object[] { "A A", " D ", "A A", 'D', "gemDiamond", 'A', calculator_assembly });
		//addShapedOre(new ItemStack(atomic_module, 1), new Object[] { "A A", " D ", "A A", 'D', "gemDiamond", 'A', itemScientificCalculator });
		addShapedOre(new ItemStack(atomic_assembly, 1), new Object[] { "BAB", "AEA", "BAB", 'E', "gemEmerald", 'A', atomic_module, 'B', advanced_assembly });
		addShapedOre(new ItemStack(atomic_binder, 8), new Object[] { " A ", "ADA", " A ", 'A', "calculatorReinforcedStone", 'D', enrichedGold });

		// calculators
		addShapedOre(new ItemStack(itemInfoCalculator, 1), new Object[] { "CSC", "BAB", "CCC", 'B', Blocks.STONE_BUTTON, 'A', "dustRedstone", 'S', calculator_screen, 'C', "cobblestone" });
		addShapedOre(new ItemStack(itemCalculator, 1), new Object[] { "CSC", "BAB", "CCC", 'B', Blocks.STONE_BUTTON, 'A', calculator_assembly, 'S', calculator_screen, 'C', "cobblestone" });
		addShapedOre(new ItemStack(itemCraftingCalculator, 1), new Object[] { "CSC", "BAB", "CCC", 'B', Blocks.STONE_BUTTON, 'A', Blocks.CRAFTING_TABLE, 'S', calculator_screen, 'C', "cobblestone" });
		addShapedOre(new ItemStack(itemScientificCalculator, 1), new Object[] { "CSC", "BAB", "CAC", 'B', "calculatorReinforcedStone", 'A', calculator_assembly, 'S', calculator_screen, 'C', enrichedgold_ingot });

		addShapedOre(new ItemStack(atomicCalculator, 1), new Object[] { "DCD", "WAW", "DWD", 'D', "calculatorReinforcedStone", 'A', atomic_assembly, 'C', calculator_screen, 'W', "gemDiamond" });

		addShapedOre(new ItemStack(dynamicCalculator, 1), new Object[] { "RSR", "MAM", "RDR", 'D', "gemDiamond", 'S', advanced_assembly, 'A', atomicCalculator, 'M', atomic_module, 'R', "calculatorReinforcedStone" });

		addShapedOre(new ItemStack(itemFlawlessCalculator, 1), new Object[] { "FSF", "DAD", "FEF", 'F', flawlessdiamond, 'D', "gemDiamond", 'E', endDiamond, 'A', flawless_assembly, 'S', calculator_screen });

		// modules
		addShapedOre(new ItemStack(itemHungerModule, 1), new Object[] { "ADA", "BCB", "AEA", 'B', "gemAmethyst", 'A', shard_amethyst, 'C', Items.GOLDEN_APPLE, 'D', calculator_screen, 'E', redstone_ingot });
		addShapedOre(new ItemStack(itemHealthModule, 1), new Object[] { "ADA", "BCB", "AEA", 'B', "gemTanzanite", 'A', shard_tanzanite, 'C', atomic_binder, 'D', calculator_screen, 'E', flawlessdiamond });

		// machines
		addShapedOre(new ItemStack(powerCube, 1), new Object[] { "AAA", "ADA", "AAA", 'A', "cobblestone", 'D', Blocks.FURNACE });
		addShaped(new ItemStack(advancedPowerCube, 1), new Object[] { "AAA", "ADA", "AAA", 'A', redstone_ingot, 'D', powerCube });
		addShapedOre(new ItemStack(basicGreenhouse, 1), new Object[] { "BCB", "CAC", "BCB", 'A', new ItemStack(material_block, 1, Variants.REINFORCED_IRON.getMeta()), 'B', "calculatorReinforcedStone", 'C', enrichedgold_ingot });
		addShaped(new ItemStack(advancedGreenhouse, 1), new Object[] { "BCB", "CAC", "BCB", 'A', basicGreenhouse, 'B', weakeneddiamond, 'C', large_tanzanite });
		addShaped(new ItemStack(flawlessGreenhouse, 1), new Object[] { "BBB", "CAC", "BBB", 'A', atomic_assembly, 'B', flawlessGlass, 'C', advancedGreenhouse });
		addShaped(new ItemStack(hungerProcessor, 1), new Object[] { "ABA", "BCB", "ABA", 'A', large_amethyst, 'B', redstone_ingot, 'C', advanced_assembly });
		addShaped(new ItemStack(healthProcessor, 1), new Object[] { "ABA", "BCB", "ABA", 'A', large_tanzanite, 'B', flawlessdiamond, 'C', advanced_assembly });

		addShaped(new ItemStack(analysingChamber, 1), new Object[] { "ABA", "BCB", "ABA", 'A', new ItemStack(material_block, 1, Variants.REINFORCED_IRON.getMeta()), 'B', weakeneddiamond, 'C', advanced_assembly });
		addShaped(new ItemStack(fabricationChamber, 1), new Object[] { "   ", "C C", "ABA", 'A', new ItemStack(material_block, 1, Variants.REINFORCED_IRON.getMeta()), 'B', storageChamber, 'C', reinforcediron_ingot });
		addShapedOre(new ItemStack(atomicMultiplier, 1), new Object[] { "EAE", "DBD", "FCF", 'A', fabricationChamber, 'B', atomic_assembly, 'C', endDiamond, 'D', atomic_module, 'E', calculatorplug, 'F', "sonarStableStone" });
		
		// generators
		addShapedOre(new ItemStack(crankHandle, 1), new Object[] { "  A", "AAA", "A  ", 'A', "stickWood" });
		addShapedOre(new ItemStack(handcrankedGenerator, 1), new Object[] { "AAA", "CBC", "AAA", 'A', "stickWood", 'B', powerCube, 'C', "plankWood" });
		addShapedOre(new ItemStack(calculatorlocator, 1), new Object[] { " B ", "CAC", "DDD", 'A', calculatorplug, 'B', Blocks.BEACON, 'C', atomic_assembly, 'D', "sonarStableStone" });
		addShapedOre(new ItemStack(calculatorplug, 1), new Object[] { " B ", "CAC", "DDD", 'A', "sonarStableStone", 'B', itemEnergyModule, 'C', advanced_assembly, 'D', redstone_ingot });

		// smelting
		addShapedOre(new ItemStack(stoneSeparator, 1), new Object[] { "AAA", "BCB", "AAA", 'B', powerCube, 'A', "calculatorReinforcedStone", 'C', reinforcediron_ingot });
		addShapedOre(new ItemStack(extractionChamber, 1), new Object[] { "ABA", "BCB", "ABA", 'A', "calculatorReinforcedStone", 'B', weakeneddiamond, 'C', powerCube });
		addShaped(new ItemStack(restorationChamber, 1), new Object[] { "ABA", "BCB", "ABA", 'A', redstone_ingot, 'B', weakeneddiamond, 'C', extractionChamber });
		addShaped(new ItemStack(reassemblyChamber, 1), new Object[] { "ABA", "BCB", "ABA", 'A', enrichedGold, 'B', weakeneddiamond, 'C', extractionChamber });
		addShaped(new ItemStack(precisionChamber, 1), new Object[] { "ABA", "BCB", "ABA", 'A', new ItemStack(material_block, 1, Variants.REINFORCED_IRON.getMeta()), 'B', weakeneddiamond, 'C', extractionChamber });
		addShapedOre(new ItemStack(reinforcedFurnace, 1), new Object[] { "AAA", "ABA", "AAA", 'A', "calculatorReinforcedStone", 'B', powerCube });
		addShapedOre(new ItemStack(reinforcedChest, 1), new Object[] { "ABA", "BCB", "ABA", 'A', new ItemStack(material_block, 1, Variants.REINFORCED_IRON.getMeta()), 'B', "calculatorReinforcedStone", 'C', Blocks.CHEST });

		// item_recipes
		addShapedOre(new ItemStack(grenadecasing, 1), new Object[] { "   ", "R R", "RRR", 'R', "calculatorReinforcedStone" });
		addShaped(new ItemStack(obsidianKey, 1), new Object[] { "  B", "BBB", "A B", 'A', purifiedObsidian, 'B', enrichedgold_ingot });

		// gems
		addShapedOre(new ItemStack(large_amethyst, 1), new Object[] { "AAA", "AAA", "AAA", 'A', "gemAmethyst" });
		addShaped(new ItemStack(small_amethyst, 1), new Object[] { "AAA", "AAA", "AAA", 'A', shard_amethyst });
		addShapedOre(new ItemStack(large_tanzanite, 1), new Object[] { "AAA", "AAA", "AAA", 'A', "gemTanzanite" });
		addShaped(new ItemStack(small_tanzanite, 1), new Object[] { "AAA", "AAA", "AAA", 'A', shard_tanzanite });
		// decoration
		for(Variants variant : MaterialBlock.Variants.values()){
			addShaped(new ItemStack(material_block, 1, variant.getMeta()), new Object[] { "AAA", "AAA", "AAA", 'A', variant.getBaseItem() });
			addShapeless(new ItemStack(variant.getBaseItem(), 9), new Object[] { new ItemStack(material_block, 1, variant.getMeta()) });
		}
		/*
		addShaped(new ItemStack(material_block, 1, Variants.AMETHYST.getMeta()), new Object[] { "AAA", "AAA", "AAA", 'A', large_amethyst });
		addShapeless(new ItemStack(large_amethyst, 9), new Object[] { new ItemStack(material_block, 1, Variants.AMETHYST.getMeta()) });
		addShaped(new ItemStack(material_block, 1, Variants.TANZANITE.getMeta()), new Object[] { "AAA", "AAA", "AAA", 'A', large_tanzanite });
		addShapeless(new ItemStack(large_tanzanite, 9), new Object[] { new ItemStack(material_block, 1, Variants.TANZANITE.getMeta()) });
		addShaped(new ItemStack(material_block, 1, Variants.END_DIAMOND.getMeta()), new Object[] { "AAA", "AAA", "AAA", 'A', endDiamond });
		addShapeless(new ItemStack(endDiamond, 9), new Object[] { new ItemStack(material_block, 1, Variants.END_DIAMOND.getMeta()) });
		addShaped(new ItemStack(material_block, 1, Variants.ENRICHED_GOLD.getMeta()), new Object[] { "AAA", "AAA", "AAA", 'A', enrichedgold_ingot });
		addShapeless(new ItemStack(enrichedgold_ingot, 9), new Object[] { new ItemStack(material_block, 1, Variants.ENRICHED_GOLD.getMeta()) });
		addShaped(new ItemStack(material_block, 1, Variants.FLAWLESS_DIAMOND.getMeta()), new Object[] { "AAA", "AAA", "AAA", 'A', flawlessdiamond });
		addShapeless(new ItemStack(flawlessdiamond, 9), new Object[] { new ItemStack(material_block, 1, Variants.FLAWLESS_DIAMOND.getMeta()) });
		addShaped(new ItemStack(material_block, 1, Variants.FIRE_DIAMOND.getMeta()), new Object[] { "AAA", "AAA", "AAA", 'A', firediamond });
		addShapeless(new ItemStack(firediamond, 9), new Object[] { new ItemStack(material_block, 1, Variants.FIRE_DIAMOND.getMeta()) });
		addShaped(new ItemStack(material_block, 1, Variants.REINFORCED_IRON.getMeta()), new Object[] { "AAA", "AAA", "AAA", 'A', reinforcediron_ingot });
		addShapeless(new ItemStack(reinforcediron_ingot, 9), new Object[] { new ItemStack(material_block, 1, Variants.REINFORCED_IRON.getMeta()) });
		addShaped(new ItemStack(material_block, 1, Variants.WEAKENED_DIAMOND.getMeta()), new Object[] { "AAA", "AAA", "AAA", 'A', weakeneddiamond });
		addShapeless(new ItemStack(weakeneddiamond, 9), new Object[] { new ItemStack(material_block, 1, Variants.WEAKENED_DIAMOND.getMeta()) });
		addShaped(new ItemStack(material_block, 1, Variants.ELECTRIC_DIAMOND.getMeta()), new Object[] { "AAA", "AAA", "AAA", 'A', electricDiamond });
		addShapeless(new ItemStack(electricDiamond, 9), new Object[] { new ItemStack(material_block, 1, Variants.ELECTRIC_DIAMOND.getMeta()) });
		 */
		// tree blocks
		addShapeless(new ItemStack(amethystPlanks, 4), new Object[] { amethystLog });
		addShapeless(new ItemStack(tanzanitePlanks, 4), new Object[] { tanzaniteLog });
		addShapeless(new ItemStack(pearPlanks, 4), new Object[] { pearLog });
		addShapeless(new ItemStack(diamondPlanks, 4), new Object[] { diamondLog });
		addShaped(new ItemStack(amethystStairs, 4), new Object[] { "A  ", "AA ", "AAA", 'A', amethystPlanks });
		addShaped(new ItemStack(tanzaniteStairs, 4), new Object[] { "A  ", "AA ", "AAA", 'A', tanzanitePlanks });
		addShaped(new ItemStack(pearStairs, 4), new Object[] { "A  ", "AA ", "AAA", 'A', pearPlanks });
		addShaped(new ItemStack(diamondStairs, 4), new Object[] { "A  ", "AA ", "AAA", 'A', diamondPlanks });

		addShapedOre(new ItemStack(amethystFence, 6), new Object[] { "ASA", "ASA", "   ", 'A', amethystPlanks, 'S', "stickWood" });
		addShapedOre(new ItemStack(tanzaniteFence, 6), new Object[] { "ASA", "ASA", "   ", 'A', tanzanitePlanks, 'S', "stickWood" });
		addShapedOre(new ItemStack(pearFence, 6), new Object[] { "ASA", "ASA", "   ", 'A', pearPlanks, 'S', "stickWood" });
		addShapedOre(new ItemStack(diamondFence, 6), new Object[] { "ASA", "ASA", "   ", 'A', diamondPlanks, 'S', "stickWood" });

		//addShapedOre(new ItemStack(magneticFlux, 1), new Object[] { " D ", "RFR", "SSS", 'S', "sonarStableStone", 'R', redstone_ingot, 'F', fluxPoint, 'D', firediamond });
		addShapedOre(new ItemStack(dockingStation, 1), new Object[] { " R ", "APA", "RRR", 'R', "calculatorReinforcedStone", 'P', powerCube, 'A', calculator_assembly });
		// addShapedOre(new ItemStack(teleporter, 2), new Object[] { "SRS", "RFR", "SDS", 'R', reinforcedStoneBlock, 'S', "sonarStableStone", 'D', endDiamond, 'F', fluxPlug });
		addShaped(new ItemStack(weatherController, 1), new Object[] { "   ", "DSD", "RRR", 'S', Items.NETHER_STAR, 'D', electricDiamond, 'R', rainSensor });
		addShapedOre(new ItemStack(stoneAssimilator, 1), new Object[] { " S ", "IPI", " I ", 'P', stoneSeparator, 'I', "calculatorReinforcedStone", 'S', sickle });
		addShaped(new ItemStack(algorithmAssimilator, 1), new Object[] { " S ", "IPI", " I ", 'P', algorithmSeparator, 'I', new ItemStack(material_block, 1, Variants.REINFORCED_IRON.getMeta()), 'S', sickle });

		addShapedOre(new ItemStack(calculator_assembly, 8), new Object[] { "CBC", "BCB", "CBC", 'C', "cobblestone", 'B', Blocks.STONE_BUTTON });
		addShapedOre(new ItemStack(advanced_assembly, 4), new Object[] { "GCG", "CIC", "GCG", 'C', calculator_assembly, 'G', enrichedgold_ingot, 'I', reinforcediron_ingot });
		addShapedOre(new ItemStack(atomic_module, 4), new Object[] { "GCG", "CIC", "GCG", 'C', calculator_assembly, 'G', "gemTanzanite", 'I', "gemDiamond" });
		addShapedOre(new ItemStack(algorithmSeparator, 1), new Object[] { "BCB", "ADA", "BCB", 'A', stoneSeparator, 'B', new ItemStack(material_block, 1, Variants.REINFORCED_IRON.getMeta()), 'C', powerCube, 'D', "gemDiamond" });
		addShapedOre(new ItemStack(flawless_assembly, 1), new Object[] { "GCG", "CAC", "GCG", 'C', calculator_assembly, 'G', advanced_assembly, 'A', atomic_assembly });
	}

	public static void addShaped(ItemStack result, Object... input) {
		if (result != null && result.getItem() != null && input != null) {
			try {
				GameRegistry.addRecipe(result, input);
			} catch (Exception exception) {
				logger.error("ERROR ADDING SHAPED RECIPE: " + result);
			}
		}
	}

	public static void addShapedOre(ItemStack result, Object... input) {
		if (result != null && result.getItem() != null && input != null) {
			try {
				ShapedOreRecipe oreRecipe = new ShapedOreRecipe(result, input);
				GameRegistry.addRecipe(oreRecipe);
			} catch (Exception exception) {
				logger.error("ERROR ADDING SHAPED ORE RECIPE: " + result);
			}
		}
	}

	public static void addShapeless(ItemStack result, Object... input) {
		if (result != null && result.getItem() != null && input != null) {
			try {
				GameRegistry.addShapelessRecipe(result, input);
			} catch (Exception exception) {
				logger.error("ERROR ADDING SHAPELESS RECIPE: " + result);
			}
		}
	}
}