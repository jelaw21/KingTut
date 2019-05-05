package law.gwk_tweaks;

import law.gwk_tweaks.blocks.GBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("gwk_tweaks:gblock")
    public static GBlock gBlock;

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        gBlock.initModel();
    }

}
