package net.tslat.aoa3.client.model.entity.mob.abyss;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class WebReaperModel extends EntityModel<MobEntity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leftArm1;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer leftArm2;
	private final ModelRenderer rightArm1;
	private final ModelRenderer rightArm2;
	private final ModelRenderer leftArm3;
	private final ModelRenderer rightArm3;
	private final ModelRenderer leftArm4;
	private final ModelRenderer rightArm4;
	private final ModelRenderer leftArm5;
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
	private final ModelRenderer body19;
	private final ModelRenderer body20;
	private final ModelRenderer body21;
	private final ModelRenderer body22;
	private final ModelRenderer rightArm5;
	private final ModelRenderer rightArm6;
	private final ModelRenderer rightArm7;
	private final ModelRenderer rightArm8;
	private final ModelRenderer rightArm9;
	private final ModelRenderer rightArm10;
	private final ModelRenderer leftArm6;
	private final ModelRenderer rightArm11;

	public WebReaperModel() {
		textureWidth = 256;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -14.0f, -4.0f, 8, 14, 8);
		head.setRotationPoint(0.0f, -19.0f, 0.0f);
		head.setTextureSize(256, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 84, 2)).addBox(-4.0f, 9.0f, -2.0f, 8, 1, 2);
		body.setRotationPoint(0.0f, -19.0f, -2.0f);
		body.setTextureSize(256, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(leftArm1 = new ModelRenderer(this, 51, 4)).addBox(1.0f, 30.0f, -2.0f, 1, 6, 1);
		leftArm1.setRotationPoint(7.0f, -15.0f, 0.0f);
		leftArm1.setTextureSize(256, 64);
		leftArm1.mirror = true;
		setRotation(leftArm1, 0.0f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 127, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 14, 4);
		rightLeg.setRotationPoint(-3.0f, 10.0f, 0.0f);
		rightLeg.setTextureSize(256, 64);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 127, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 14, 4);
		leftLeg.setRotationPoint(3.0f, 10.0f, 0.0f);
		leftLeg.setTextureSize(256, 64);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 91, 16)).addBox(-5.0f, 0.0f, -2.0f, 10, 8, 4);
		body2.setRotationPoint(0.0f, 2.0f, 0.0f);
		body2.setTextureSize(256, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 36, 47)).addBox(-5.0f, 1.0f, -2.0f, 8, 10, 4);
		body3.setRotationPoint(1.0f, -9.0f, 0.0f);
		body3.setTextureSize(256, 64);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(leftArm2 = new ModelRenderer(this, 167, 4)).addBox(3.0f, -2.0f, 0.0f, 4, 28, 0);
		leftArm2.setRotationPoint(7.0f, -15.0f, 0.0f);
		leftArm2.setTextureSize(256, 64);
		leftArm2.mirror = true;
		setRotation(leftArm2, 0.0f, 0.0f, 0.0f);
		(rightArm1 = new ModelRenderer(this, 116, 36)).addBox(-1.0f, -5.0f, -13.0f, 2, 3, 2);
		rightArm1.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightArm1.setTextureSize(256, 64);
		rightArm1.mirror = true;
		setRotation(rightArm1, 0.3490659f, 0.0f, 0.0f);
		(rightArm2 = new ModelRenderer(this, 40, 16)).addBox(-4.0f, 26.0f, -2.0f, 5, 4, 4);
		rightArm2.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightArm2.setTextureSize(256, 64);
		rightArm2.mirror = true;
		setRotation(rightArm2, 0.0f, 0.0f, 0.0f);
		(leftArm3 = new ModelRenderer(this, 40, 16)).addBox(-1.0f, 26.0f, -2.0f, 5, 4, 4);
		leftArm3.setRotationPoint(7.0f, -15.0f, 0.0f);
		leftArm3.setTextureSize(256, 64);
		leftArm3.mirror = true;
		setRotation(leftArm3, 0.0f, 0.0f, 0.0f);
		(rightArm3 = new ModelRenderer(this, 40, 4)).addBox(-4.0f, 30.0f, -2.0f, 1, 4, 1);
		rightArm3.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightArm3.setTextureSize(256, 64);
		rightArm3.mirror = true;
		setRotation(rightArm3, 0.0f, 0.0f, 0.0f);
		(leftArm4 = new ModelRenderer(this, 40, 4)).addBox(-1.0f, 30.0f, -2.0f, 1, 4, 1);
		leftArm4.setRotationPoint(7.0f, -15.0f, 0.0f);
		leftArm4.setTextureSize(256, 64);
		leftArm4.mirror = true;
		setRotation(leftArm4, 0.0f, 0.0f, 0.0f);
		(rightArm4 = new ModelRenderer(this, 40, 4)).addBox(0.0f, 30.0f, -2.0f, 1, 4, 1);
		rightArm4.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightArm4.setTextureSize(256, 64);
		rightArm4.mirror = true;
		setRotation(rightArm4, 0.0f, 0.0f, 0.0f);
		(leftArm5 = new ModelRenderer(this, 40, 4)).addBox(3.0f, 30.0f, -2.0f, 1, 4, 1);
		leftArm5.setRotationPoint(7.0f, -15.0f, 0.0f);
		leftArm5.setTextureSize(256, 64);
		leftArm5.mirror = true;
		setRotation(leftArm5, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 209, 31)).addBox(10.0f, -0.5f, -1.5f, 20, 1, 1);
		body4.setRotationPoint(-1.0f, -18.0f, 7.0f);
		body4.setTextureSize(256, 64);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, -1.919862f);
		(body5 = new ModelRenderer(this, 67, 2)).addBox(-5.0f, 2.0f, -2.0f, 1, 9, 2);
		body5.setRotationPoint(0.0f, -20.0f, -2.0f);
		body5.setTextureSize(256, 64);
		body5.mirror = true;
		setRotation(body5, 0.0f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 67, 2)).addBox(4.0f, 2.0f, -2.0f, 1, 9, 2);
		body6.setRotationPoint(0.0f, -20.0f, -2.0f);
		body6.setTextureSize(256, 64);
		body6.mirror = true;
		setRotation(body6, 0.0f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 79, 7)).addBox(-4.0f, 3.0f, -1.0f, 8, 7, 1);
		body7.setRotationPoint(0.0f, -20.0f, -2.0f);
		body7.setTextureSize(256, 64);
		body7.mirror = true;
		setRotation(body7, 0.0f, 0.0f, 0.0f);
		(body8 = new ModelRenderer(this, 84, 2)).addBox(-4.0f, 2.0f, -2.0f, 8, 1, 2);
		body8.setRotationPoint(0.0f, -20.0f, -2.0f);
		body8.setTextureSize(256, 64);
		body8.mirror = true;
		setRotation(body8, 0.0f, 0.0f, 0.0f);
		(body9 = new ModelRenderer(this, 4, 24)).addBox(-6.0f, 0.0f, -2.0f, 8, 5, 6);
		body9.setRotationPoint(2.0f, -19.0f, 4.0f);
		body9.setTextureSize(256, 64);
		body9.mirror = true;
		setRotation(body9, 0.0f, 0.0f, 0.0f);
		(body10 = new ModelRenderer(this, 209, 31)).addBox(10.0f, -0.5f, -1.5f, 20, 1, 1);
		body10.setRotationPoint(-1.0f, -15.0f, 7.0f);
		body10.setTextureSize(256, 64);
		body10.mirror = true;
		setRotation(body10, 0.0f, 0.0f, -2.617994f);
		(body11 = new ModelRenderer(this, 208, 25)).addBox(0.0f, -1.0f, -2.0f, 20, 2, 2);
		body11.setRotationPoint(-1.0f, -15.0f, 7.0f);
		body11.setTextureSize(256, 64);
		body11.mirror = true;
		setRotation(body11, 0.0f, 0.0f, -2.617994f);
		(body12 = new ModelRenderer(this, 208, 25)).addBox(0.0f, -1.0f, -2.0f, 20, 2, 2);
		body12.setRotationPoint(-1.0f, -18.0f, 7.0f);
		body12.setTextureSize(256, 64);
		body12.mirror = true;
		setRotation(body12, 0.0f, 0.0f, -1.919862f);
		(body13 = new ModelRenderer(this, 152, 35)).addBox(-26.0f, -27.0f, -1.0f, 52, 27, 0);
		body13.setRotationPoint(0.0f, -15.0f, 7.0f);
		body13.setTextureSize(256, 64);
		body13.mirror = true;
		setRotation(body13, 0.0f, 0.0f, 0.0f);
		(body14 = new ModelRenderer(this, 208, 25)).addBox(0.0f, -1.0f, -2.0f, 20, 2, 2);
		body14.setRotationPoint(1.0f, -18.0f, 7.0f);
		body14.setTextureSize(256, 64);
		body14.mirror = true;
		setRotation(body14, 0.0f, 0.0f, -1.22173f);
		(body15 = new ModelRenderer(this, 209, 31)).addBox(10.0f, -0.5f, -1.5f, 20, 1, 1);
		body15.setRotationPoint(1.0f, -18.0f, 7.0f);
		body15.setTextureSize(256, 64);
		body15.mirror = true;
		setRotation(body15, 0.0f, 0.0f, -1.22173f);
		(body16 = new ModelRenderer(this, 1, 36)).addBox(-6.0f, 0.0f, -2.0f, 12, 12, 4);
		body16.setRotationPoint(0.0f, -20.0f, 0.0f);
		body16.setTextureSize(256, 64);
		body16.mirror = true;
		setRotation(body16, 0.0f, 0.0f, 0.0f);
		(body17 = new ModelRenderer(this, 208, 25)).addBox(0.0f, -1.0f, -2.0f, 20, 2, 2);
		body17.setRotationPoint(-4.0f, -19.0f, 7.0f);
		body17.setTextureSize(256, 64);
		body17.mirror = true;
		setRotation(body17, 0.0f, 0.0f, -2.268928f);
		(body18 = new ModelRenderer(this, 209, 31)).addBox(10.0f, -0.5f, -1.5f, 20, 1, 1);
		body18.setRotationPoint(-4.0f, -19.0f, 7.0f);
		body18.setTextureSize(256, 64);
		body18.mirror = true;
		setRotation(body18, 0.0f, 0.0f, -2.268928f);
		(body19 = new ModelRenderer(this, 208, 25)).addBox(0.0f, -1.0f, -2.0f, 20, 2, 2);
		body19.setRotationPoint(1.0f, -15.0f, 7.0f);
		body19.setTextureSize(256, 64);
		body19.mirror = true;
		setRotation(body19, 0.0f, 0.0f, -0.5235988f);
		(body20 = new ModelRenderer(this, 209, 31)).addBox(10.0f, -0.5f, -1.5f, 20, 1, 1);
		body20.setRotationPoint(1.0f, -15.0f, 7.0f);
		body20.setTextureSize(256, 64);
		body20.mirror = true;
		setRotation(body20, 0.0f, 0.0f, -0.5235988f);
		(body21 = new ModelRenderer(this, 208, 25)).addBox(0.0f, -1.0f, -2.0f, 20, 2, 2);
		body21.setRotationPoint(4.0f, -19.0f, 7.0f);
		body21.setTextureSize(256, 64);
		body21.mirror = true;
		setRotation(body21, 0.0f, 0.0f, -0.8726646f);
		(body22 = new ModelRenderer(this, 209, 31)).addBox(10.0f, -0.5f, -1.5f, 20, 1, 1);
		body22.setRotationPoint(4.0f, -19.0f, 7.0f);
		body22.setTextureSize(256, 64);
		body22.mirror = true;
		setRotation(body22, 0.0f, 0.0f, -0.8726646f);
		(rightArm5 = new ModelRenderer(this, 154, 4)).addBox(-7.0f, -2.0f, 0.0f, 4, 28, 0);
		rightArm5.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightArm5.setTextureSize(256, 64);
		rightArm5.mirror = true;
		setRotation(rightArm5, 0.0f, 0.0f, 0.0f);
		(rightArm6 = new ModelRenderer(this, 82, 28)).addBox(-3.0f, 1.0f, -15.0f, 3, 32, 3);
		rightArm6.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightArm6.setTextureSize(256, 64);
		rightArm6.mirror = true;
		setRotation(rightArm6, 0.3490659f, 0.0f, 0.0f);
		(rightArm7 = new ModelRenderer(this, 95, 40)).addBox(-4.0f, -2.0f, -16.0f, 5, 3, 5);
		rightArm7.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightArm7.setTextureSize(256, 64);
		rightArm7.mirror = true;
		setRotation(rightArm7, 0.3490659f, 0.0f, 0.0f);
		(rightArm8 = new ModelRenderer(this, 116, 36)).addBox(-4.0f, -5.0f, -13.0f, 2, 3, 2);
		rightArm8.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightArm8.setTextureSize(256, 64);
		rightArm8.mirror = true;
		setRotation(rightArm8, 0.3490659f, 0.0f, 0.0f);
		(rightArm9 = new ModelRenderer(this, 116, 36)).addBox(-1.0f, -5.0f, -16.0f, 2, 3, 2);
		rightArm9.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightArm9.setTextureSize(256, 64);
		rightArm9.mirror = true;
		setRotation(rightArm9, 0.3490659f, 0.0f, 0.0f);
		(rightArm10 = new ModelRenderer(this, 116, 36)).addBox(-4.0f, -5.0f, -16.0f, 2, 3, 2);
		rightArm10.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightArm10.setTextureSize(256, 64);
		rightArm10.mirror = true;
		setRotation(rightArm10, 0.3490659f, 0.0f, 0.0f);
		(leftArm6 = new ModelRenderer(this, 64, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 28, 4);
		leftArm6.setRotationPoint(7.0f, -15.0f, 0.0f);
		leftArm6.setTextureSize(256, 64);
		leftArm6.mirror = true;
		setRotation(leftArm6, 0.0f, 0.0f, 0.0f);
		(rightArm11 = new ModelRenderer(this, 64, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 28, 4);
		rightArm11.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightArm11.setTextureSize(256, 64);
		rightArm11.mirror = true;
		setRotation(rightArm11, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
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
		body19.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body20.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body21.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body22.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm10.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm11.render(matrix, buffer, light, overlay, red, green, blue, alpha);
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
		rightArm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f + 0.349f;
		rightArm1.rotateAngleZ = 0.0f;
		rightArm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm2.rotateAngleZ = 0.0f;
		rightArm3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm3.rotateAngleZ = 0.0f;
		rightArm4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm4.rotateAngleZ = 0.0f;
		rightArm5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm5.rotateAngleZ = 0.0f;
		rightArm6.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f + 0.349f;
		rightArm6.rotateAngleZ = 0.0f;
		rightArm7.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f + 0.349f;
		rightArm7.rotateAngleZ = 0.0f;
		rightArm8.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f + 0.349f;
		rightArm8.rotateAngleZ = 0.0f;
		rightArm9.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f + 0.349f;
		rightArm9.rotateAngleZ = 0.0f;
		rightArm10.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f + 0.349f;
		rightArm10.rotateAngleZ = 0.0f;
		rightArm11.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm11.rotateAngleZ = 0.0f;
		leftArm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm1.rotateAngleZ = 0.0f;
		leftArm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm2.rotateAngleZ = 0.0f;
		leftArm3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm3.rotateAngleZ = 0.0f;
		leftArm4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm4.rotateAngleZ = 0.0f;
		leftArm5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm5.rotateAngleZ = 0.0f;
		leftArm6.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm6.rotateAngleZ = 0.0f;
		rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
	}
}
