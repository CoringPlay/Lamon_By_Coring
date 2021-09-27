// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfrosty_boat extends EntityModel<Entity> {
	private final ModelRenderer bottom;
	private final ModelRenderer front;
	private final ModelRenderer back;
	private final ModelRenderer right;
	private final ModelRenderer left;
	private final ModelRenderer paddle_left;
	private final ModelRenderer paddle_right;

	public Modelfrosty_boat() {
		textureWidth = 128;
		textureHeight = 128;

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(0.0F, 6.0F, 0.0F);
		setRotationAngle(bottom, 1.5708F, 0.0F, 0.0F);
		bottom.setTextureOffset(0, 0).addBox(-14.0F, -8.0F, -21.0F, 28.0F, 16.0F, 3.0F, 0.0F, false);

		front = new ModelRenderer(this);
		front.setRotationPoint(15.0F, 0.0F, 0.0F);
		setRotationAngle(front, 0.0F, 1.5708F, 0.0F);
		front.setTextureOffset(44, 43).addBox(-8.0F, 18.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F, false);

		back = new ModelRenderer(this);
		back.setRotationPoint(-15.0F, 0.0F, 0.0F);
		setRotationAngle(back, 0.0F, -1.5708F, 0.0F);
		back.setTextureOffset(44, 35).addBox(-9.0F, 18.0F, -1.0F, 18.0F, 6.0F, 2.0F, 0.0F, false);

		right = new ModelRenderer(this);
		right.setRotationPoint(0.0F, 0.0F, -9.0F);
		setRotationAngle(right, 0.0F, -3.1416F, 0.0F);
		right.setTextureOffset(0, 27).addBox(-14.0F, 18.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F, false);

		left = new ModelRenderer(this);
		left.setRotationPoint(0.0F, 0.0F, 9.0F);
		left.setTextureOffset(0, 19).addBox(-14.0F, 18.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F, false);

		paddle_left = new ModelRenderer(this);
		paddle_left.setRotationPoint(-2.5F, -4.0F, 9.0F);
		setRotationAngle(paddle_left, -0.3927F, 0.0F, 0.0F);
		paddle_left.setTextureOffset(22, 37).addBox(-1.0F, 18.4015F, 2.5364F, 2.0F, 2.0F, 18.0F, 0.0F, false);
		paddle_left.setTextureOffset(22, 35).addBox(-0.01F, 15.4015F, 16.5364F, 1.0F, 6.0F, 7.0F, 0.0F, false);

		paddle_right = new ModelRenderer(this);
		paddle_right.setRotationPoint(-2.5F, -4.0F, -9.0F);
		setRotationAngle(paddle_right, 2.7489F, 0.0F, 3.1416F);
		paddle_right.setTextureOffset(0, 35).addBox(-1.0F, 18.4015F, 2.5364F, 2.0F, 2.0F, 18.0F, 0.0F, false);
		paddle_right.setTextureOffset(0, 35).addBox(-0.99F, 15.4015F, 16.5364F, 1.0F, 6.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bottom.render(matrixStack, buffer, packedLight, packedOverlay);
		front.render(matrixStack, buffer, packedLight, packedOverlay);
		back.render(matrixStack, buffer, packedLight, packedOverlay);
		right.render(matrixStack, buffer, packedLight, packedOverlay);
		left.render(matrixStack, buffer, packedLight, packedOverlay);
		paddle_left.render(matrixStack, buffer, packedLight, packedOverlay);
		paddle_right.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}