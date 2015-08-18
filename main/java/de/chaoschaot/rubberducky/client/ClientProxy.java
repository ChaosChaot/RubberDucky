package de.chaoschaot.rubberducky.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.chaoschaot.rubberducky.client.render.RenderTileEntityRubberDuck;
import de.chaoschaot.rubberducky.common.CommonProxy;
import de.chaoschaot.rubberducky.common.tileentities.TileEntityRubberDuck;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

   @Override
   public void preInitClientSide() {

   }

   @Override
   public void initClientSide() {
      super.initClientSide();
      ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRubberDuck.class, new RenderTileEntityRubberDuck());
   }

   @Override
   public void postInitClientSide() {
      super.postInitClientSide();
   }
}
