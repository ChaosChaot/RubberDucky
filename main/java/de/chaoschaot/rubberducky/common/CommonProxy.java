package de.chaoschaot.rubberducky.common;


import cpw.mods.fml.common.registry.GameRegistry;
import de.chaoschaot.rubberducky.common.lib.Strings;
import de.chaoschaot.rubberducky.common.tileentities.TileEntityRubberDuck;

public class CommonProxy {

   public final void preInitServerSide() {

   }

   public void preInitClientSide() {

   }

   public final void initServerSide() {
      registerTileEntities();
   }

   public void initClientSide() {

   }

   public final void postInitServerSide() {

   }

   public void postInitClientSide() {

   }

   private void registerTileEntities() {
      GameRegistry.registerTileEntity(TileEntityRubberDuck.class, Strings.BLOCK_RUBBER_DUCK);
   }
}
