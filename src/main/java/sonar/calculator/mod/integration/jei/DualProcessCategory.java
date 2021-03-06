package sonar.calculator.mod.integration.jei;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IDrawableAnimated;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import sonar.core.integration.jei.IJEIHandler;
import sonar.core.integration.jei.JEICategory;
import sonar.core.integration.jei.JEICategoryV2;
import sonar.core.integration.jei.JEIHelper.RecipeMapper;
import sonar.core.recipes.RecipeObjectType;

public class DualProcessCategory extends JEICategoryV2 {

	private final IDrawable background;
	protected final IDrawableAnimated arrow;
	
	public DualProcessCategory(IGuiHelper guiHelper, IJEIHandler handler) {
		super(handler);
		ResourceLocation location = new ResourceLocation("calculator", "textures/gui/" + handler.getTextureName() + ".png");
		background = guiHelper.createDrawable(location, 34, 19, 108, 27);
		IDrawableStatic arrowDrawable = guiHelper.createDrawable(location, 177, 10, 22, 15);
		this.arrow = guiHelper.createAnimatedDrawable(arrowDrawable, 100, IDrawableAnimated.StartDirection.LEFT, false);
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	@Override
	public void drawAnimations(Minecraft minecraft) {
		arrow.draw(minecraft, 29, 5);
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, IRecipeWrapper recipeWrapper) {
		RecipeMapper mapper = new RecipeMapper(recipeWrapper);
		mapper.map(RecipeObjectType.INPUT, 0, 0, 4, 4);
		mapper.map(RecipeObjectType.OUTPUT, 0, 2, 58, 4);
		mapper.map(RecipeObjectType.OUTPUT, 1, 3, 86, 4);
		mapper.mapTo(recipeLayout.getItemStacks());
		/*
		IGuiItemStackGroup stacks = recipeLayout.getItemStacks();
		stacks.init(0, true, 4, 4);
		stacks.init(2, false, 58, 4);
		stacks.init(3, false, 86, 4);
		stacks.setFromRecipe(0, recipeWrapper.getInputs());
		stacks.setFromRecipe(2, recipeWrapper.getOutputs().get(0));
		stacks.setFromRecipe(3, recipeWrapper.getOutputs().get(1));
		*/
	}
}