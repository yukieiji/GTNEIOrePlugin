package pers.gwyog.gtneioreplugin.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import cpw.mods.fml.common.Loader;
import gregapi.block.IBlockPlacable;
import gregapi.block.prefixblock.PrefixBlock;
import gregapi.data.CS;
import gregapi.worldgen.WorldgenOresLarge;

public class GT6OreLayerHelper{
    public static int[] weightPerWorld = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static HashMap<String, OreLayerWrapper> mapOreLayerWrapper = new HashMap<String, OreLayerWrapper>();
    public static Set<PrefixBlock> setOreNormalBasicTypes = new HashSet<PrefixBlock>();
    public static ArrayList<WorldgenOresLarge> sListNEI = new ArrayList();

    public GT6OreLayerHelper() {
    	WorldgenOresLarge tWorldGen;
    	for(int i2=0;i2<CS.ORE_ALL.length;i2++){
    		for(int i = 0; i<CS.ORE_ALL[i2].size(); i++){
    			tWorldGen = (WorldgenOresLarge) CS.ORE_ALL[i2].get(i);
            	mapOreLayerWrapper.put(tWorldGen.mCategory, new OreLayerWrapper(tWorldGen));
        	}
    	}
        Set<IBlockPlacable> setNormalOreBasicTypesTemp = new HashSet<IBlockPlacable>(CS.BlocksGT.stoneToNormalOres.values());

        for (IBlockPlacable block: setNormalOreBasicTypesTemp)
            if (block instanceof PrefixBlock)
                setOreNormalBasicTypes.add((PrefixBlock)block);
    }

    public class OreLayerWrapper {
        public String veinName;
        public short primaryMeta;
        public short secondaryMeta;
        public short betweenMeta;
        public short sporadicMeta;
        public String primaryMetaName;
        public String secondaryMetaName;
        public String betweenMetaName;
        public String sporadicMetaName;
        public String worldGenHeightRange;
        public int randomWeight;
        public boolean genOverworld = false;
        public boolean genNether = false;
        public boolean genEnd = false;
        public boolean genGt = false;
        public boolean genPfaa = false;
        public boolean genMoon = false;
        public boolean genMars = false;
        public boolean genTwilight = false;
        public boolean genErebus = false;
        public boolean genBetweenlands = false;
        public boolean genAtum = false;
        public boolean genEnvm = false;
        public boolean genDeepdark = false;
        public boolean genAether = false;
        public boolean genPlanets = false;
        public boolean genAsteroids = false;

        public OreLayerWrapper(WorldgenOresLarge worldGen) {
            this.veinName = worldGen.mCategory;
            this.primaryMeta = worldGen.mTop.mID;
            this.secondaryMeta = worldGen.mBottom.mID;
            this.betweenMeta = worldGen.mBetween.mID;
            this.sporadicMeta = worldGen.mSpread.mID;
            this.primaryMetaName = worldGen.mTop.getLocal();
            this.secondaryMetaName = worldGen.mBottom.getLocal();
            this.betweenMetaName = worldGen.mBetween.getLocal();
            this.sporadicMetaName = worldGen.mSpread.getLocal();
            this.worldGenHeightRange = worldGen.mMinY + "-" + worldGen.mMaxY;
            this.randomWeight = worldGen.mWeight;

            for(int i=0;i<GT6OreDimentionHelper.dimOreOreString.size();i++){
            	if(GT6OreDimentionHelper.dimOreOreString.get(i) == worldGen.mCategory){
            		switch(GT6OreDimentionHelper.dimNameOre.get(GT6OreDimentionHelper.dimNameOreId.get(i))){
            			case "ORE_OVERWORLD":
            				this.genOverworld = true;
            				weightPerWorld[0] += this.randomWeight;
            				break;
            			case "ORE_NETHER":
            				this.genNether = true;
            				weightPerWorld[1] += this.randomWeight;
            				break;
            			case "ORE_END":
            				this.genEnd = true;
            				weightPerWorld[2] += this.randomWeight;
            				break;
            			case "ORE_PFAA":
            				//PerFabricaAdAstra
            				if (Loader.isModLoaded("PFAAChemica")==true){
            					this.genPfaa = true;
            					weightPerWorld[3] += this.randomWeight;
            				}
            				break;
            			case "ORE_MOON":
            				//Galacticraft
            				if (Loader.isModLoaded("GalacticraftCore")==true){
            					this.genMoon = true;
            					weightPerWorld[4] += this.randomWeight;
            				}
            				break;
            			case "ORE_MARS":
            				//Galacticraft
            				if (Loader.isModLoaded("GalacticraftCore")==true){
            					this.genMars = true;
            					weightPerWorld[5] += this.randomWeight;
            				}
            				break;
            			case "ORE_TWILIGHT":
            				//TwilightForest
            				if (Loader.isModLoaded("TwilightForest")==true){
                				this.genTwilight = true;
                				weightPerWorld[6] += this.randomWeight;
            				}
            				break;
            			case "ORE_EREBUS":
            				//Erebus
            				if (Loader.isModLoaded("erebus")==true){
            					this.genErebus = true;
            					weightPerWorld[7] += this.randomWeight;
            				}
            				break;
            			case "ORE_BETWEENLANDS":
            				//The Betweenlands
            				if (Loader.isModLoaded("thebetweenlands")==true){
            					this.genBetweenlands = true;
            					weightPerWorld[8] += this.randomWeight;
            				}
            				break;
            			case "ORE_ATUM":
            				//Atum
            				if (Loader.isModLoaded("atum")==true){
            					this.genAtum = true;
            					weightPerWorld[9] += this.randomWeight;
            				}
            				break;
            			case "ORE_ENVM":
            				//Enviromine
            				if (Loader.isModLoaded("enviromine")==true){
            					this.genEnvm = true;
            					weightPerWorld[10] += this.randomWeight;
            				}
            				break;
            			case "ORE_DEEPDARK":
            				//Extra Utilities 2
            				if (Loader.isModLoaded("extrautils2")==true){
            					this.genDeepdark = true;
            					weightPerWorld[11] += this.randomWeight;
            				}
            				break;
            			case "ORE_AETHER":
            				//Aether
            				if (Loader.isModLoaded("aether")==true){
            					this.genAether = true;
            					weightPerWorld[12] += this.randomWeight;
            				}
            				break;
            			case "ORE_PLANETS":
            				//AdvancedRocketry
            				if (Loader.isModLoaded("advancedRocketry")==true){
            					this.genPlanets = true;
            					weightPerWorld[13] += this.randomWeight;
            				}
            				break;
            			case "ORE_ASTEROIDS":
            				//Galacticraft
            				if (Loader.isModLoaded("GalacticraftCore")==true){
            					this.genAsteroids = true;
            					weightPerWorld[14] += this.randomWeight;
            				}
            				break;
            			default:

            				break;
            		}
            	}
            }
        }
    }
}
