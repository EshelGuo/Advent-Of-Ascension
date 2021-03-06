package net.tslat.aoa3.client.model.entity.boss;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class CreepModel extends EntityModel<MobEntity> {
	private final ModelRenderer body;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer body4;
	private final ModelRenderer body5;
	private final ModelRenderer body6;
	private final ModelRenderer body7;
	private final ModelRenderer body8;
	private final ModelRenderer body9;
	private final ModelRenderer body10;
	private final ModelRenderer body11;
	private final ModelRenderer body12;
	private final ModelRenderer body13;
	private final ModelRenderer body14;
	private final ModelRenderer body15;
	private final ModelRenderer body16;
	private final ModelRenderer body17;
	private final ModelRenderer body18;
	private final ModelRenderer rightArm2;
	private final ModelRenderer leftArm2;
	private final ModelRenderer leftArm3;
	private final ModelRenderer rightArm3;
	private final ModelRenderer leftArm4;
	private final ModelRenderer rightArm4;
	private final ModelRenderer leftArm5;
	private final ModelRenderer rightArm5;
	private final ModelRenderer leftArm6;
	private final ModelRenderer rightArm6;
	private final ModelRenderer head;

	public CreepModel() {
		textureWidth = 64;
		textureHeight = 64;
		(body = new ModelRenderer(this, 45, 5)).addBox(-5.0f, -1.0f, -3.0f, 1, 1, 8);
		body.setRotationPoint(9.0f, -2.0f, -1.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightArm = new ModelRenderer(this, 5, 38)).addBox(0.5f, -9.0f, -9.0f, 1, 1, 1);
		rightArm.setRotationPoint(-6.0f, 1.0f, 0.0f);
		rightArm.setTextureSize(64, 64);
		rightArm.mirror = true;
		setRotation(rightArm, 1.047198f, 0.0f, 0.0f);
		(leftArm = new ModelRenderer(this, 5, 45)).addBox(2.5f, -9.0f, -9.0f, 1, 1, 1);
		leftArm.setRotationPoint(6.0f, 1.0f, 0.0f);
		leftArm.setTextureSize(64, 64);
		leftArm.mirror = true;
		setRotation(leftArm, 1.047198f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 7, 4);
		rightLeg.setRotationPoint(-3.0f, 17.0f, 0.0f);
		rightLeg.setTextureSize(64, 64);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 7, 4);
		leftLeg.setRotationPoint(3.0f, 17.0f, 0.0f);
		leftLeg.setTextureSize(64, 64);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 16, 16)).addBox(-5.0f, 0.0f, -3.0f, 10, 19, 6);
		body2.setRotationPoint(0.0f, -2.0f, 0.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 33, 5)).addBox(-5.0f, 0.0f, 4.0f, 1, 8, 1);
		body3.setRotationPoint(9.0f, -2.0f, -1.0f);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 33, 5)).addBox(-5.0f, 0.0f, -3.0f, 1, 8, 1);
		body4.setRotationPoint(9.0f, -2.0f, -1.0f);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 33, 5)).addBox(-5.0f, 0.0f, -3.0f, 1, 8, 1);
		body5.setRotationPoint(0.0f, -2.0f, -1.0f);
		body5.setTextureSize(64, 64);
		body5.mirror = true;
		setRotation(body5, 0.0f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 45, 5)).addBox(-5.0f, -1.0f, -3.0f, 1, 1, 8);
		body6.setRotationPoint(0.0f, -2.0f, -1.0f);
		body6.setTextureSize(64, 64);
		body6.mirror = true;
		setRotation(body6, 0.0f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 54, 35)).addBox(0.0f, -1.0f, 5.0f, 1, 1, 4);
		body7.setRotationPoint(2.0f, -3.0f, -1.0f);
		body7.setTextureSize(64, 64);
		body7.mirror = true;
		setRotation(body7, 0.0f, 0.0f, 0.0f);
		(body8 = new ModelRenderer(this, 38, 5)).addBox(3.0f, 7.0f, 4.0f, 1, 1, 1);
		body8.setRotationPoint(0.0f, -2.0f, -1.0f);
		body8.setTextureSize(64, 64);
		body8.mirror = true;
		setRotation(body8, 0.0f, 0.0f, 0.0f);
		(body9 = new ModelRenderer(this, 40, 48)).addBox(-5.0f, 0.0f, 4.0f, 6, 10, 6);
		body9.setRotationPoint(2.0f, -3.0f, -1.0f);
		body9.setTextureSize(64, 64);
		body9.mirror = true;
		setRotation(body9, 0.0f, 0.0f, 0.0f);
		(body10 = new ModelRenderer(this, 40, 45)).addBox(-5.0f, -1.0f, 4.0f, 6, 1, 1);
		body10.setRotationPoint(2.0f, -3.0f, -1.0f);
		body10.setTextureSize(64, 64);
		body10.mirror = true;
		setRotation(body10, 0.0f, 0.0f, 0.0f);
		(body11 = new ModelRenderer(this, 40, 42)).addBox(-5.0f, -1.0f, 9.0f, 6, 1, 1);
		body11.setRotationPoint(2.0f, -3.0f, -1.0f);
		body11.setTextureSize(64, 64);
		body11.mirror = true;
		setRotation(body11, 0.0f, 0.0f, 0.0f);
		(body12 = new ModelRenderer(this, 54, 42)).addBox(-5.0f, -1.0f, 5.0f, 1, 1, 4);
		body12.setRotationPoint(2.0f, -3.0f, -1.0f);
		body12.setTextureSize(64, 64);
		body12.mirror = true;
		setRotation(body12, 0.0f, 0.0f, 0.0f);
		(body13 = new ModelRenderer(this, 33, 5)).addBox(-5.0f, 0.0f, 4.0f, 1, 8, 1);
		body13.setRotationPoint(0.0f, -2.0f, -1.0f);
		body13.setTextureSize(64, 64);
		body13.mirror = true;
		setRotation(body13, 0.0f, 0.0f, 0.0f);
		(body14 = new ModelRenderer(this, 38, 5)).addBox(3.0f, 1.0f, 4.0f, 1, 1, 1);
		body14.setRotationPoint(0.0f, -2.0f, -1.0f);
		body14.setTextureSize(64, 64);
		body14.mirror = true;
		setRotation(body14, 0.0f, 0.0f, 0.0f);
		(body15 = new ModelRenderer(this, 38, 5)).addBox(3.0f, 4.0f, 4.0f, 1, 1, 1);
		body15.setRotationPoint(0.0f, -2.0f, -1.0f);
		body15.setTextureSize(64, 64);
		body15.mirror = true;
		setRotation(body15, 0.0f, 0.0f, 0.0f);
		(body16 = new ModelRenderer(this, 38, 5)).addBox(-4.0f, 7.0f, 4.0f, 1, 1, 1);
		body16.setRotationPoint(0.0f, -2.0f, -1.0f);
		body16.setTextureSize(64, 64);
		body16.mirror = true;
		setRotation(body16, 0.0f, 0.0f, 0.0f);
		(body17 = new ModelRenderer(this, 38, 5)).addBox(-4.0f, 4.0f, 4.0f, 1, 1, 1);
		body17.setRotationPoint(0.0f, -2.0f, -1.0f);
		body17.setTextureSize(64, 64);
		body17.mirror = true;
		setRotation(body17, 0.0f, 0.0f, 0.0f);
		(body18 = new ModelRenderer(this, 38, 5)).addBox(-4.0f, 1.0f, 4.0f, 1, 1, 1);
		body18.setRotationPoint(0.0f, -2.0f, -1.0f);
		body18.setTextureSize(64, 64);
		body18.mirror = true;
		setRotation(body18, 0.0f, 0.0f, 0.0f);
		(rightArm2 = new ModelRenderer(this, 48, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4);
		rightArm2.setRotationPoint(-6.0f, 1.0f, 0.0f);
		rightArm2.setTextureSize(64, 64);
		rightArm2.mirror = true;
		setRotation(rightArm2, 0.0f, 0.0f, 0.0f);
		(leftArm2 = new ModelRenderer(this, 48, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4);
		leftArm2.setRotationPoint(6.0f, 1.0f, 0.0f);
		leftArm2.setTextureSize(64, 64);
		leftArm2.mirror = true;
		setRotation(leftArm2, 0.0f, 0.0f, 0.0f);
		(leftArm3 = new ModelRenderer(this, 0, 28)).addBox(0.5f, -7.0f, -10.0f, 1, 19, 1);
		leftArm3.setRotationPoint(6.0f, 1.0f, 0.0f);
		leftArm3.setTextureSize(64, 64);
		leftArm3.mirror = true;
		setRotation(leftArm3, 1.047198f, 0.0f, 0.0f);
		(rightArm3 = new ModelRenderer(this, 0, 28)).addBox(-1.5f, -7.0f, -10.0f, 1, 19, 1);
		rightArm3.setRotationPoint(-6.0f, 1.0f, 0.0f);
		rightArm3.setTextureSize(64, 64);
		rightArm3.mirror = true;
		setRotation(rightArm3, 1.047198f, 0.0f, 0.0f);
		(leftArm4 = new ModelRenderer(this, 0, 57)).addBox(-0.5f, -9.0f, -11.0f, 3, 2, 3);
		leftArm4.setRotationPoint(6.0f, 1.0f, 0.0f);
		leftArm4.setTextureSize(64, 64);
		leftArm4.mirror = true;
		setRotation(leftArm4, 1.047198f, 0.0f, 0.0f);
		(rightArm4 = new ModelRenderer(this, 0, 50)).addBox(-2.5f, -9.0f, -11.0f, 3, 2, 3);
		rightArm4.setRotationPoint(-6.0f, 1.0f, 0.0f);
		rightArm4.setTextureSize(64, 64);
		rightArm4.mirror = true;
		setRotation(rightArm4, 1.047198f, 0.0f, 0.0f);
		(leftArm5 = new ModelRenderer(this, 5, 41)).addBox(-0.5f, -11.0f, -11.0f, 3, 2, 1);
		leftArm5.setRotationPoint(6.0f, 1.0f, 0.0f);
		leftArm5.setTextureSize(64, 64);
		leftArm5.mirror = true;
		setRotation(leftArm5, 1.047198f, 0.0f, 0.0f);
		(rightArm5 = new ModelRenderer(this, 5, 34)).addBox(-2.5f, -11.0f, -11.0f, 3, 2, 1);
		rightArm5.setRotationPoint(-6.0f, 1.0f, 0.0f);
		rightArm5.setTextureSize(64, 64);
		rightArm5.mirror = true;
		setRotation(rightArm5, 1.047198f, 0.0f, 0.0f);
		(leftArm6 = new ModelRenderer(this, 5, 45)).addBox(-1.5f, -9.0f, -9.0f, 1, 1, 1);
		leftArm6.setRotationPoint(6.0f, 1.0f, 0.0f);
		leftArm6.setTextureSize(64, 64);
		leftArm6.mirror = true;
		setRotation(leftArm6, 1.047198f, 0.0f, 0.0f);
		(rightArm6 = new ModelRenderer(this, 5, 38)).addBox(-3.5f, -9.0f, -9.0f, 1, 1, 1);
		rightArm6.setRotationPoint(-6.0f, 1.0f, 0.0f);
		rightArm6.setTextureSize(64, 64);
		rightArm6.mirror = true;
		setRotation(rightArm6, 1.047198f, 0.0f, 0.0f);
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head.setRotationPoint(0.0f, 4.0f, -6.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body10.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body11.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body12.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body13.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body14.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body15.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body16.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body17.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body18.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		head.rotateAngleY = netHeadYaw / 57.295776f;
		head.rotateAngleX = headPitch / 54.11268f;
		rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f + 1.047f;
		rightArm.rotateAngleZ = 0.0f;
		rightArm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm2.rotateAngleZ = 0.0f;
		rightArm3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f + 1.047f;
		rightArm3.rotateAngleZ = 0.0f;
		rightArm4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f + 1.047f;
		rightArm4.rotateAngleZ = 0.0f;
		rightArm5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f + 1.047f;
		rightArm5.rotateAngleZ = 0.0f;
		rightArm6.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f + 1.047f;
		rightArm6.rotateAngleZ = 0.0f;
		leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f + 1.047f;
		leftArm.rotateAngleZ = 0.0f;
		leftArm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm2.rotateAngleZ = 0.0f;
		leftArm3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f + 1.047f;
		leftArm3.rotateAngleZ = 0.0f;
		leftArm4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f + 1.047f;
		leftArm4.rotateAngleZ = 0.0f;
		leftArm5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f + 1.047f;
		leftArm5.rotateAngleZ = 0.0f;
		leftArm6.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f + 1.047f;
		leftArm6.rotateAngleZ = 0.0f;
		rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
	}
}
