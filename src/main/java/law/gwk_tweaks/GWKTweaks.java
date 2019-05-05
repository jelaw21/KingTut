package law.gwk_tweaks;

import law.gwk_tweaks.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = GWKTweaks.MOD_ID,
        name = GWKTweaks.MOD_NAME,
        version = GWKTweaks.VERSION
)
public class GWKTweaks {

    public static final String MOD_ID = "gwk_tweaks";
    public static final String MOD_NAME = "GWK Tweaks";
    public static final String VERSION = "0.0.1";

    @SidedProxy(clientSide = "law.gwk_tweaks.proxy.ClientProxy", serverSide = "law.gwk_tweaks.proxy.ServerProxy")
    public static CommonProxy proxy;

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */

    @Mod.Instance(MOD_ID)
    public static GWKTweaks INSTANCE;

    public static Logger logger;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}
