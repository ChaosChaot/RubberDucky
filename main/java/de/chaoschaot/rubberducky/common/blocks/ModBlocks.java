package de.chaoschaot.rubberducky.common.blocks;


import de.chaoschaot.rubberducky.common.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

   public static Block rubberDuck;

   public static void init() {
      rubberDuck = new BlockRubberDuck(Material.cactus, Strings.BLOCK_RUBBER_DUCK);
   }
}
