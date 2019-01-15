package pers.gwyog.gtneioreplugin.plugin;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import pers.gwyog.gtneioreplugin.GTNEIOrePlugin;
import pers.gwyog.gtneioreplugin.plugin.gregtech6.PluginGT6VeinStat;

public class NEIPluginConfig implements IConfigureNEI {

    @Override
    public String getName() {
        return "GregTech Ore Plugin";
    }

    @Override
    public String getVersion() {
        return GTNEIOrePlugin.VERSION;
    }

    @Override
    public void loadConfig() {
        if (GTNEIOrePlugin.GTVersion.equals("GT5")) {

        }
        else {
            PluginGT6VeinStat pluginGT6VeinStat = new PluginGT6VeinStat();
            API.registerRecipeHandler(pluginGT6VeinStat);
            API.registerUsageHandler(pluginGT6VeinStat);
        }
    }

}
