package law.gwk_tweaks.blocks;

import law.gwk_tweaks.GWKTweaks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GBlock extends Block {

    public GBlock(){
        super(Material.CLAY);
        setTranslationKey(GWKTweaks.MOD_ID + ".gblock");
        setRegistryName("gblock");
    }

    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
