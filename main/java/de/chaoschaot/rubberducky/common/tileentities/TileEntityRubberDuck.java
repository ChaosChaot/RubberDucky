package de.chaoschaot.rubberducky.common.tileentities;

import de.chaoschaot.rubberducky.common.util.Util;
import me.jezza.oc.common.interfaces.IBlockNotifier;
import me.jezza.oc.common.tile.TileAbstract;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityRubberDuck extends TileAbstract implements IBlockNotifier {


   public ForgeDirection facing;

   public TileEntityRubberDuck() {
      facing = ForgeDirection.SOUTH;
   }

   @Override
   public void updateEntity() {
      super.updateEntity();
   }

   @Override
   public void onBlockRemoval(World world, int x, int y, int z) {

   }

   @Override
   public void onBlockAdded(EntityLivingBase entityLivingBase, World world, int x, int y, int z, ItemStack itemStack) {
      facing = Util.getViewDirectionOfEntity(entityLivingBase).getOpposite();
   }

   @Override
   public void onNeighbourBlockChanged(World world, int x, int y, int z, Block block) {

   }

   @Override
   public void onNeighbourTileChanged(IBlockAccess world, int x, int y, int z, int tileX, int tileY, int tileZ) {

   }

   @Override
   public void writeToNBT(NBTTagCompound tag) {
      super.writeToNBT(tag);
      Util.getModNBTTag(tag, true).setByte("rubberDuckFacing", (byte) facing.ordinal());
   }

   @Override
   public void readFromNBT(NBTTagCompound tag) {
      super.readFromNBT(tag);
      facing = ForgeDirection.getOrientation(Util.getModNBTTag(tag, false).getByte("rubberDuckFacing"));
   }
}
