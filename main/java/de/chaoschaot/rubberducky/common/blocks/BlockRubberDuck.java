package de.chaoschaot.rubberducky.common.blocks;

import de.chaoschaot.rubberducky.RubberDucky;
import de.chaoschaot.rubberducky.common.tileentities.TileEntityRubberDuck;
import me.jezza.oc.common.blocks.BlockAbstractModel;
import me.jezza.oc.common.interfaces.ITileProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockRubberDuck extends BlockAbstractModel implements ITileProvider {

   public BlockRubberDuck(Material material, String name) {
      super(material, name);
      setHardness(2.0F);
      setResistance(5.0F);
      setStepSound(soundTypeWood);

      setCreativeTab(RubberDucky.creativeTab);

      textureReg = true;
      setBlockTextureName(""); // TODO: blockparticles
   }

   @Override
   public TileEntity createNewTileEntity(World world, int i) {
      return new TileEntityRubberDuck();
   }
}
