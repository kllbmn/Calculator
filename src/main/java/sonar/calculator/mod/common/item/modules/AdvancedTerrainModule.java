package sonar.calculator.mod.common.item.modules;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import sonar.calculator.mod.CalculatorConfig;

public class AdvancedTerrainModule extends BaseTerrainModule {

	public AdvancedTerrainModule() {
		super(CalculatorConfig.getInteger("Advanced Terrain Module"), 500, 500);
		super.replacable = new Block[] { Blocks.GRASS, Blocks.DIRT, Blocks.STONE, Blocks.GRAVEL, Blocks.SAND, Blocks.COBBLESTONE };
		maxStackSize = 1;
	}

}
