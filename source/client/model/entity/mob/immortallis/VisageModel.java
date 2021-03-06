package net.tslat.aoa3.client.model.entity.mob.immortallis;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class VisageModel extends EntityModel<MobEntity> {
	private final ModelRenderer body;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm2;
	private final ModelRenderer leftArm2;
	private final ModelRenderer leftArm3;
	private final ModelRenderer rightArm3;
	private final ModelRenderer leftArm4;
	private final ModelRenderer rightArm4;
	private final ModelRenderer rightArm5;
	private final ModelRenderer leftArm5;
	private final ModelRenderer head;
	private final ModelRenderer head2;
	private final ModelRenderer head3;
	private final ModelRenderer head4;
	private final ModelRenderer head5;
	private final ModelRenderer head6;
	private final ModelRenderer head7;
	private final ModelRenderer head8;
	private final ModelRenderer head9;
	private final ModelRenderer head10;
	private final ModelRenderer head11;
	private final ModelRenderer head12;
	private final ModelRenderer head13;
	private final ModelRenderer head14;
	private final ModelRenderer head15;
	private final ModelRenderer head16;
	private final ModelRenderer head17;
	private final ModelRenderer head18;
	private final ModelRenderer head19;

	public VisageModel() {
		super(RenderType::getEntityTranslucent);
		textureWidth = 64;
		textureHeight = 32;
		(body = new ModelRenderer(this, 36, 11)).addBox(-4.0f, 0.0f, -3.0f, 8, 15, 6);
		body.setRotationPoint(0.0f, 4.0f, 0.0f);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightArm = new ModelRenderer(this, 42, 0)).addBox(-3.0f, -3.0f, -3.0f, 5, 4, 6);
		rightArm.setRotationPoint(-6.0f, 6.0f, 0.0f);
		rightArm.setTextureSize(64, 32);
		rightArm.mirror = true;
		setRotation(rightArm, 0.0f, 0.0f, 0.0f);
		(leftArm = new ModelRenderer(this, 42, 0)).addBox(-2.0f, -3.0f, -3.0f, 5, 4, 6);
		leftArm.setRotationPoint(6.0f, 6.0f, 0.0f);
		leftArm.setTextureSize(64, 32);
		leftArm.mirror = true;
		setRotation(leftArm, 0.0f, 0.0f, 0.0f);
		(rightArm2 = new ModelRenderer(this, 17, 16)).addBox(0.0f, 13.0f, -6.0f, 2, 1, 6);
		rightArm2.setRotationPoint(-6.0f, 6.0f, 0.0f);
		rightArm2.setTextureSize(64, 32);
		rightArm2.mirror = true;
		setRotation(rightArm2, 0.0f, 0.0f, 0.0f);
		(leftArm2 = new ModelRenderer(this, 17, 16)).addBox(2.0f, 13.0f, -6.0f, 2, 1, 6);
		leftArm2.setRotationPoint(6.0f, 6.0f, 0.0f);
		leftArm2.setTextureSize(64, 32);
		leftArm2.mirror = true;
		setRotation(leftArm2, 0.0f, 0.0f, 0.0f);
		(leftArm3 = new ModelRenderer(this, 17, 23)).addBox(-2.0f, 13.0f, 0.0f, 6, 1, 2);
		leftArm3.setRotationPoint(6.0f, 6.0f, 0.0f);
		leftArm3.setTextureSize(64, 32);
		leftArm3.mirror = true;
		setRotation(leftArm3, 0.0f, 0.0f, 0.0f);
		(rightArm3 = new ModelRenderer(this, 17, 23)).addBox(-4.0f, 13.0f, 0.0f, 6, 1, 2);
		rightArm3.setRotationPoint(-6.0f, 6.0f, 0.0f);
		rightArm3.setTextureSize(64, 32);
		rightArm3.mirror = true;
		setRotation(rightArm3, 0.0f, 0.0f, 0.0f);
		(leftArm4 = new ModelRenderer(this, 17, 16)).addBox(-2.0f, 13.0f, -6.0f, 2, 1, 6);
		leftArm4.setRotationPoint(6.0f, 6.0f, 0.0f);
		leftArm4.setTextureSize(64, 32);
		leftArm4.mirror = true;
		setRotation(leftArm4, 0.0f, 0.0f, 0.0f);
		(rightArm4 = new ModelRenderer(this, 17, 16)).addBox(-4.0f, 13.0f, -6.0f, 2, 1, 6);
		rightArm4.setRotationPoint(-6.0f, 6.0f, 0.0f);
		rightArm4.setTextureSize(64, 32);
		rightArm4.mirror = true;
		setRotation(rightArm4, 0.0f, 0.0f, 0.0f);
		(rightArm5 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 1.0f, -2.0f, 4, 12, 4);
		rightArm5.setRotationPoint(-6.0f, 6.0f, 0.0f);
		rightArm5.setTextureSize(64, 32);
		rightArm5.mirror = true;
		setRotation(rightArm5, 0.0f, 0.0f, 0.0f);
		(leftArm5 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 1.0f, -2.0f, 4, 12, 4);
		leftArm5.setRotationPoint(6.0f, 6.0f, 0.0f);
		leftArm5.setTextureSize(64, 32);
		leftArm5.mirror = true;
		setRotation(leftArm5, 0.0f, 0.0f, 0.0f);
		(head = new ModelRenderer(this, 7, 4)).addBox(4.0f, -4.0f, -4.0f, 1, 1, 1);
		head.setRotationPoint(0.0f, 4.0f, 0.0f);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 16, 26)).addBox(0.0f, 1.0f, -8.0f, 5, 1, 5);
		head2.setRotationPoint(0.0f, 4.0f, 0.0f);
		head2.setTextureSize(64, 32);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 0, 5)).addBox(4.0f, -3.0f, -3.0f, 1, 1, 4);
		head3.setRotationPoint(0.0f, 4.0f, 0.0f);
		head3.setTextureSize(64, 32);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 0, 5)).addBox(4.0f, -5.0f, 1.0f, 1, 2, 1);
		head4.setRotationPoint(0.0f, 4.0f, 0.0f);
		head4.setTextureSize(64, 32);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 7, 4)).addBox(4.0f, -5.0f, -3.0f, 1, 1, 1);
		head5.setRotationPoint(0.0f, 4.0f, 0.0f);
		head5.setTextureSize(64, 32);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 30, 5)).addBox(3.0f, -5.0f, -2.0f, 1, 1, 3);
		head6.setRotationPoint(0.0f, 4.0f, 0.0f);
		head6.setTextureSize(64, 32);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 0, 0)).addBox(4.0f, -6.0f, -2.0f, 1, 1, 3);
		head7.setRotationPoint(0.0f, 4.0f, 0.0f);
		head7.setTextureSize(64, 32);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 30, 0)).addBox(-4.0f, -5.0f, -2.0f, 1, 1, 3);
		head8.setRotationPoint(0.0f, 4.0f, 0.0f);
		head8.setTextureSize(64, 32);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 0, 5)).addBox(-5.0f, -3.0f, -3.0f, 1, 1, 4);
		head9.setRotationPoint(0.0f, 4.0f, 0.0f);
		head9.setTextureSize(64, 32);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 7, 4)).addBox(-5.0f, -4.0f, -4.0f, 1, 1, 1);
		head10.setRotationPoint(0.0f, 4.0f, 0.0f);
		head10.setTextureSize(64, 32);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 7, 4)).addBox(-5.0f, -5.0f, -3.0f, 1, 1, 1);
		head11.setRotationPoint(0.0f, 4.0f, 0.0f);
		head11.setTextureSize(64, 32);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		(head12 = new ModelRenderer(this, 0, 0)).addBox(-5.0f, -6.0f, -2.0f, 1, 1, 3);
		head12.setRotationPoint(0.0f, 4.0f, 0.0f);
		head12.setTextureSize(64, 32);
		head12.mirror = true;
		setRotation(head12, 0.0f, 0.0f, 0.0f);
		(head13 = new ModelRenderer(this, 0, 5)).addBox(-5.0f, -5.0f, 1.0f, 1, 2, 1);
		head13.setRotationPoint(0.0f, 4.0f, 0.0f);
		head13.setTextureSize(64, 32);
		head13.mirror = true;
		setRotation(head13, 0.0f, 0.0f, 0.0f);
		(head14 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -9.0f, 8, 4, 12);
		head14.setRotationPoint(0.0f, 4.0f, 0.0f);
		head14.setTextureSize(64, 32);
		head14.mirror = true;
		setRotation(head14, 0.0f, 0.0f, 0.0f);
		(head15 = new ModelRenderer(this, 16, 17)).addBox(4.0f, -1.0f, -6.0f, 1, 2, 1);
		head15.setRotationPoint(0.0f, 4.0f, 0.0f);
		head15.setTextureSize(64, 32);
		head15.mirror = true;
		setRotation(head15, 0.0f, 0.0f, 0.0f);
		(head16 = new ModelRenderer(this, 16, 26)).addBox(-5.0f, 1.0f, -8.0f, 5, 1, 5);
		head16.setRotationPoint(0.0f, 4.0f, 0.0f);
		head16.setTextureSize(64, 32);
		head16.mirror = true;
		setRotation(head16, 0.0f, 0.0f, 0.0f);
		(head17 = new ModelRenderer(this, 16, 17)).addBox(4.0f, -1.0f, -8.0f, 1, 2, 1);
		head17.setRotationPoint(0.0f, 4.0f, 0.0f);
		head17.setTextureSize(64, 32);
		head17.mirror = true;
		setRotation(head17, 0.0f, 0.0f, 0.0f);
		(head18 = new ModelRenderer(this, 16, 17)).addBox(-5.0f, -1.0f, -6.0f, 1, 2, 1);
		head18.setRotationPoint(0.0f, 4.0f, 0.0f);
		head18.setTextureSize(64, 32);
		head18.mirror = true;
		setRotation(head18, 0.0f, 0.0f, 0.0f);
		(head19 = new ModelRenderer(this, 16, 17)).addBox(-5.0f, -1.0f, -8.0f, 1, 2, 1);
		head19.setRotationPoint(0.0f, 4.0f, 0.0f);
		head19.setTextureSize(64, 32);
		head19.mirror = true;
		setRotation(head19, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head10.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head11.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head12.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head13.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head14.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head15.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head16.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head17.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head18.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head19.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm.rotateAngleZ = 0.0f;
		rightArm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm2.rotateAngleZ = 0.0f;
		rightArm3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm3.rotateAngleZ = 0.0f;
		rightArm4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm4.rotateAngleZ = 0.0f;
		rightArm5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm5.rotateAngleZ = 0.0f;
		leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm.rotateAngleZ = 0.0f;
		leftArm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm2.rotateAngleZ = 0.0f;
		leftArm3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm3.rotateAngleZ = 0.0f;
		leftArm4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm4.rotateAngleZ = 0.0f;
		leftArm5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm5.rotateAngleZ = 0.0f;
	}
}
