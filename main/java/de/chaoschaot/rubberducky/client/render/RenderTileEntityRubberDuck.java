package de.chaoschaot.rubberducky.client.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.chaoschaot.rubberducky.client.render.models.ModelRubberDuck;
import de.chaoschaot.rubberducky.common.tileentities.TileEntityRubberDuck;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import static org.lwjgl.opengl.GL11.*;

@SideOnly(Side.CLIENT)
public class RenderTileEntityRubberDuck extends TileEntitySpecialRenderer {
   public void doRender(TileEntityRubberDuck tile, double x, double y, double z, float tick) {
      glPushMatrix();
      glTranslatef((float) x + 0.5F, (float) y + 0.5F, (float) z + 0.5F);
      glRotatef(180F, 1F, 0F, 0F);

      switch (tile.facing) {
         case NORTH:
            glRotatef(180F, 0F, 1F, 0F);
            break;
         case WEST:
            glRotatef(90F, 0F, 1F, 0F);
            break;
         case EAST:
            glRotatef(270F, 0F, 1F, 0F);
            break;
      }

      glColor3f(1.0F, 1.0F, 1.0F);

      bindTexture(ModelRubberDuck.texture);
      ModelRubberDuck.instance.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

      glPopMatrix();
   }

   @Override
   public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float tick) {
      doRender((TileEntityRubberDuck) tile, x, y, z, tick);
   }
}
