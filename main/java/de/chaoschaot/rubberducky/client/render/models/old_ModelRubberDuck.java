package de.chaoschaot.rubberducky.client.render.models;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.chaoschaot.rubberducky.common.lib.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * QED - ChaosChaot
 * Created using Tabula 4.1.1
 */
@SideOnly(Side.CLIENT)
public class old_ModelRubberDuck extends ModelBase {

   public static final old_ModelRubberDuck instance = new old_ModelRubberDuck();
   public static final ResourceLocation texture = new ResourceLocation(Reference.MOD_IDENTIFIER + "textures/models/rubberduck_obsidian.png");

   public ModelRenderer BodyI;
   public ModelRenderer BodyII;
   public ModelRenderer BodyIII;
   public ModelRenderer End;
   public ModelRenderer Head;
   public ModelRenderer HeadII;
   public ModelRenderer HeadIII;

   public old_ModelRubberDuck() {
      this.textureWidth = 10;
      this.textureHeight = 4;
      this.End = new ModelRenderer(this, 0, 0);
      this.End.setRotationPoint(-0.2F, 20.300000000000047F, 1.2F);
      this.End.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
      this.BodyII = new ModelRenderer(this, 0, 0);
      this.BodyII.setRotationPoint(0.0F, 21.200000000000063F, 0.3F);
      this.BodyII.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
      this.BodyIII = new ModelRenderer(this, 0, 0);
      this.BodyIII.setRotationPoint(0.0F, 22.000000000000078F, 0.5F);
      this.BodyIII.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
      this.HeadII = new ModelRenderer(this, 0, 0);
      this.HeadII.setRotationPoint(1.0F, 19.80000000000004F, 1.0F);
      this.HeadII.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
      this.Head = new ModelRenderer(this, 0, 0);
      this.Head.setRotationPoint(1.3F, 20.000000000000043F, 0.8F);
      this.Head.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
      this.HeadIII = new ModelRenderer(this, 0, 0);
      this.HeadIII.setRotationPoint(2.2F, 20.700000000000053F, 1.0F);
      this.HeadIII.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
      this.BodyI = new ModelRenderer(this, 0, 0);
      this.BodyI.setRotationPoint(0.0F, 20.700000000000053F, 0.5F);
      this.BodyI.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
   }

   @Override
   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      GL11.glPushMatrix();
      GL11.glTranslatef(this.End.offsetX, this.End.offsetY, this.End.offsetZ);
      GL11.glTranslatef(this.End.rotationPointX * f5, this.End.rotationPointY * f5, this.End.rotationPointZ * f5);
      GL11.glScaled(0.4D, 0.9D, 0.8D);
      GL11.glTranslatef(-this.End.offsetX, -this.End.offsetY, -this.End.offsetZ);
      GL11.glTranslatef(-this.End.rotationPointX * f5, -this.End.rotationPointY * f5, -this.End.rotationPointZ * f5);
      this.End.render(f5);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef(this.BodyII.offsetX, this.BodyII.offsetY, this.BodyII.offsetZ);
      GL11.glTranslatef(this.BodyII.rotationPointX * f5, this.BodyII.rotationPointY * f5, this.BodyII.rotationPointZ * f5);
      GL11.glScaled(1.0D, 0.8D, 0.8D);
      GL11.glTranslatef(-this.BodyII.offsetX, -this.BodyII.offsetY, -this.BodyII.offsetZ);
      GL11.glTranslatef(-this.BodyII.rotationPointX * f5, -this.BodyII.rotationPointY * f5, -this.BodyII.rotationPointZ * f5);
      this.BodyII.render(f5);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef(this.BodyIII.offsetX, this.BodyIII.offsetY, this.BodyIII.offsetZ);
      GL11.glTranslatef(this.BodyIII.rotationPointX * f5, this.BodyIII.rotationPointY * f5, this.BodyIII.rotationPointZ * f5);
      GL11.glScaled(1.0D, 0.5D, 1.0D);
      GL11.glTranslatef(-this.BodyIII.offsetX, -this.BodyIII.offsetY, -this.BodyIII.offsetZ);
      GL11.glTranslatef(-this.BodyIII.rotationPointX * f5, -this.BodyIII.rotationPointY * f5, -this.BodyIII.rotationPointZ * f5);
      this.BodyIII.render(f5);
      GL11.glPopMatrix();
      this.HeadII.render(f5);
      GL11.glPushMatrix();
      GL11.glTranslatef(this.Head.offsetX, this.Head.offsetY, this.Head.offsetZ);
      GL11.glTranslatef(this.Head.rotationPointX * f5, this.Head.rotationPointY * f5, this.Head.rotationPointZ * f5);
      GL11.glScaled(0.7D, 1.0D, 0.7D);
      GL11.glTranslatef(-this.Head.offsetX, -this.Head.offsetY, -this.Head.offsetZ);
      GL11.glTranslatef(-this.Head.rotationPointX * f5, -this.Head.rotationPointY * f5, -this.Head.rotationPointZ * f5);
      this.Head.render(f5);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef(this.HeadIII.offsetX, this.HeadIII.offsetY, this.HeadIII.offsetZ);
      GL11.glTranslatef(this.HeadIII.rotationPointX * f5, this.HeadIII.rotationPointY * f5, this.HeadIII.rotationPointZ * f5);
      GL11.glScaled(1.0D, 0.3D, 1.0D);
      GL11.glTranslatef(-this.HeadIII.offsetX, -this.HeadIII.offsetY, -this.HeadIII.offsetZ);
      GL11.glTranslatef(-this.HeadIII.rotationPointX * f5, -this.HeadIII.rotationPointY * f5, -this.HeadIII.rotationPointZ * f5);
      this.HeadIII.render(f5);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef(this.BodyI.offsetX, this.BodyI.offsetY, this.BodyI.offsetZ);
      GL11.glTranslatef(this.BodyI.rotationPointX * f5, this.BodyI.rotationPointY * f5, this.BodyI.rotationPointZ * f5);
      GL11.glScaled(1.0D, 0.5D, 1.0D);
      GL11.glTranslatef(-this.BodyI.offsetX, -this.BodyI.offsetY, -this.BodyI.offsetZ);
      GL11.glTranslatef(-this.BodyI.rotationPointX * f5, -this.BodyI.rotationPointY * f5, -this.BodyI.rotationPointZ * f5);
      this.BodyI.render(f5);
      GL11.glPopMatrix();
   }

   /**
    * This is a helper function from Tabula to set the rotation of model parts
    */
   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
      modelRenderer.rotateAngleX = x;
      modelRenderer.rotateAngleY = y;
      modelRenderer.rotateAngleZ = z;
   }
}
