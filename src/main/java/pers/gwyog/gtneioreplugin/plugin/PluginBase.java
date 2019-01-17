package pers.gwyog.gtneioreplugin.plugin;

import java.awt.Rectangle;

import codechicken.lib.gui.GuiDraw;
import codechicken.nei.recipe.TemplateRecipeHandler;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.EnumChatFormatting;

public class PluginBase extends TemplateRecipeHandler {

    @Override
    public int recipiesPerPage() {
        return 1;
    }

    @Override
    public String getRecipeName() {
        return null;
    }

    @Override
    public String getGuiTexture() {
        return "gtneioreplugin:textures/gui/nei/guiBase.png";
    }

    @Override
    public void loadTransferRects() {
        int stringLength = GuiDraw.getStringWidth(EnumChatFormatting.BOLD + I18n.format("gui.nei.seeAll"));
        transferRects.add(new RecipeTransferRect(new Rectangle(getGuiWidth()-stringLength-3, 5, stringLength, 9), getOutputId()));
    }

    public String getOutputId() {
        return null;
    }

    public String getBiomeTranslated(String unlocalizedBiome) {
        return unlocalizedBiome.equals("None")? I18n.format("gtnop.biome.none.name"): unlocalizedBiome;
    }

    public String getWorldNameTranslated(boolean genOverworld, boolean genNether, boolean genEnd, boolean genGt, boolean genPfaa, boolean genMoon, boolean genMars, boolean genTwilight, boolean genErebus, boolean genBetweenlands, boolean genAtum, boolean genEnvm, boolean genDeepdark, boolean genAether, boolean genPlanets, boolean genAsteroids, boolean b, boolean c) {
        String worldNameTranslated = "";
        if (genOverworld) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", ";
            worldNameTranslated += "Ow";
        }
        if (genNether) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", ";
            worldNameTranslated += "Ne";
        }
        if (genEnd) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", ";
            worldNameTranslated += "En";
        }
        if (genMoon) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", ";
            worldNameTranslated += "Mo";
        }
        if (genMars) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", ";
            worldNameTranslated += "Ma";
        }
        if (genGt) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", ";
            worldNameTranslated += ", Gt";
        }
        if (genPfaa) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", ";
            worldNameTranslated += ", Pf";
        }
        if (genTwilight) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", ";
            worldNameTranslated += "TF";
        }
        if (genErebus) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", ";
            worldNameTranslated += "Er";
        }
        if (genBetweenlands) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", ";
            worldNameTranslated += "Be";
        }
        if (genAtum) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", ";
            worldNameTranslated += "At";
        }
        if (genEnvm) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", ";
            worldNameTranslated += "Env";
        }
        if (genDeepdark) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", ";
            worldNameTranslated += "DD";
        }
        if (genAether) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", Ae";
            worldNameTranslated += "Ae";
        }
        if (genPlanets) {
            if (!worldNameTranslated.isEmpty())
                worldNameTranslated += ", ";
            worldNameTranslated += "Pl";
        }
        return worldNameTranslated;
    }

    public int getGuiWidth() {
        return 166;
    }
}
