package de.chaoschaot.rubberducky;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * rubberduck - ChaosChaot
 * Created using Tabula 4.1.1
 */
public class new_rubberduck extends ModelBase {
    public ModelRenderer BodyMain;
    public ModelRenderer WingLeft;
    public ModelRenderer WingRight;
    public ModelRenderer Foot;
    public ModelRenderer Back;
    public ModelRenderer Tail;
    public ModelRenderer TailII;
    public ModelRenderer Head;
    public ModelRenderer Front;
    public ModelRenderer Top;
    public ModelRenderer HeadRight;
    public ModelRenderer HeadLeft;
    public ModelRenderer HeadTop;
    public ModelRenderer HeadBeak;

    public new_rubberduck() {
        this.textureWidth = 35;
        this.textureHeight = 19;
        this.Tail = new ModelRenderer(this, 15, 7);
        this.Tail.setRotationPoint(1.0F, -0.3F, 4.0F);
        this.Tail.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.WingLeft = new ModelRenderer(this, 0, 7);
        this.WingLeft.setRotationPoint(-0.7F, 1.0F, 0.5F);
        this.WingLeft.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Back = new ModelRenderer(this, 16, 4);
        this.Back.setRotationPoint(0.5F, 0.0F, 3.5F);
        this.Back.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
        this.HeadTop = new ModelRenderer(this, 18, 11);
        this.HeadTop.setRotationPoint(0.5F, -0.1F, 0.4F);
        this.HeadTop.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.Foot = new ModelRenderer(this, 12, 0);
        this.Foot.setRotationPoint(0.5F, 2.5F, 0.5F);
        this.Foot.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.Front = new ModelRenderer(this, 24, 0);
        this.Front.setRotationPoint(0.5F, -0.5F, -0.5F);
        this.Front.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
        this.HeadRight = new ModelRenderer(this, 12, 11);
        this.HeadRight.setRotationPoint(-0.3F, 0.7F, 0.8F);
        this.HeadRight.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.TailII = new ModelRenderer(this, 15, 9);
        this.TailII.setRotationPoint(1.5F, -0.6F, 4.3F);
        this.TailII.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Head = new ModelRenderer(this, 0, 11);
        this.Head.setRotationPoint(0.5F, -2.3F, -1.5F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.HeadLeft = new ModelRenderer(this, 12, 15);
        this.HeadLeft.setRotationPoint(2.3F, 0.7F, 0.8F);
        this.HeadLeft.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.BodyMain = new ModelRenderer(this, 0, 0);
        this.BodyMain.setRotationPoint(-2.0F, 2.0F, 0.0F);
        this.BodyMain.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
        this.HeadBeak = new ModelRenderer(this, 18, 14);
        this.HeadBeak.setRotationPoint(0.5F, 1.7F, -0.7F);
        this.HeadBeak.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.WingRight = new ModelRenderer(this, 7, 7);
        this.WingRight.setRotationPoint(3.7F, 1.0F, 0.6F);
        this.WingRight.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Top = new ModelRenderer(this, 23, 5);
        this.Top.setRotationPoint(0.5F, -0.5F, 0.5F);
        this.Top.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.BodyMain.addChild(this.Tail);
        this.BodyMain.addChild(this.WingLeft);
        this.BodyMain.addChild(this.Back);
        this.Head.addChild(this.HeadTop);
        this.BodyMain.addChild(this.Foot);
        this.BodyMain.addChild(this.Front);
        this.Head.addChild(this.HeadRight);
        this.BodyMain.addChild(this.TailII);
        this.BodyMain.addChild(this.Head);
        this.Head.addChild(this.HeadLeft);
        this.Head.addChild(this.HeadBeak);
        this.BodyMain.addChild(this.WingRight);
        this.BodyMain.addChild(this.Top);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.BodyMain.render(f5);
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
