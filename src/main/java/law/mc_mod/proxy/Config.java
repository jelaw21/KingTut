package law.mc_mod.proxy;

import law.mc_mod.MC_MOD;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;


public class Config {

    private static final String CATEGORY_GENERAL = "general";
    private static final String CATEGORY_DIMENSIONS = "dimnesions";

    public static boolean isThisAGoodTutorial = true;
    public static String yourRealName = "Slim";

    public static void readConfig(){
        Configuration cfg = CommonProxy.config;
        try{
            cfg.load();
            initGeneralConfig(cfg);
            initDimensionConfig(cfg);
        }catch(Exception e1){
            MC_MOD.logger.log(Level.ERROR, "Problem Loading config file!", e1);
        }finally{
            if(cfg.hasChanged()){
                cfg.save();
            }
        }
    }

    public static void initGeneralConfig(Configuration cfg){
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General Configuration");
        isThisAGoodTutorial = cfg.getBoolean("goodTutorial", CATEGORY_GENERAL, isThisAGoodTutorial, "Set to false if you don't like this tutorial");
        yourRealName = cfg.getString("realName", CATEGORY_GENERAL, yourRealName, "Set your real name here");
    }

    private static void initDimensionConfig(Configuration cfg){
        cfg.addCustomCategoryComment(CATEGORY_DIMENSIONS, "Dimension configuration");
    }


}
