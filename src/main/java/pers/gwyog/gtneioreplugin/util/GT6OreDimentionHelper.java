package pers.gwyog.gtneioreplugin.util;

import java.util.ArrayList;
import java.util.List;

import gregapi.data.CS;
import gregapi.worldgen.WorldgenObject;

public class GT6OreDimentionHelper {
	public static List<Integer> dimNameOreId = new ArrayList<Integer>();
	public static List<String> dimNameOre = new ArrayList<String>();
	public static List<String> dimOreOreString = new ArrayList<String>();
	public static final List<WorldgenObject> ORE_ALLDIMENTION[] = new List[] {CS.ORE_OVERWORLD, CS.ORE_PFAA, CS.ORE_NETHER, CS.ORE_MOON, CS.ORE_MARS, CS.ORE_TWILIGHT, CS.ORE_EREBUS, CS.ORE_BETWEENLANDS, CS.ORE_ATUM, CS.ORE_ENVM, CS.ORE_DEEPDARK, CS.ORE_AETHER, CS.ORE_END, CS.ORE_PLANETS, CS.ORE_ASTEROIDS};

	public GT6OreDimentionHelper(){
		GT6OreDimentionList();
		for(int i=0;i<ORE_ALLDIMENTION.length;i++){
			GT6OreGetCategoryByDimention(i, ORE_ALLDIMENTION[i]);
		}
	}

	public void GT6OreGetCategoryByDimention(int _i, List<WorldgenObject> dimention){
		for(int i=0;i<dimention.size();i++){
				dimNameOreId.add(_i);
				dimOreOreString.add(dimention.get(i).mCategory);
		}
	}

	public void GT6OreDimentionList(){
		dimNameOre.add("ORE_OVERWORLD");
		dimNameOre.add("ORE_PFAA");
		dimNameOre.add("ORE_NETHER");
		dimNameOre.add("ORE_MOON");
		dimNameOre.add("ORE_MARS");
		dimNameOre.add("ORE_TWILIGHT");
		dimNameOre.add("ORE_EREBUS");
		dimNameOre.add("ORE_BETWEENLANDS");
		dimNameOre.add("ORE_ATUM");
		dimNameOre.add("ORE_ENVM");
		dimNameOre.add("ORE_DEEPDARK");
		dimNameOre.add("ORE_AETHER");
		dimNameOre.add("ORE_END");
		dimNameOre.add("ORE_PLANETS");
		dimNameOre.add("ORE_ASTEROIDS");
	}
}
