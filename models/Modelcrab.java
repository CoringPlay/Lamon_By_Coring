// Made with Blockbench 4.0.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcrab extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer R_food;
	private final ModelRenderer L_food;
	private final ModelRenderer L_hand;
	private final ModelRenderer R_hand;
	private final ModelRenderer cube_r1;

	public Modelcrab() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-3.5F, -5.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);

		R_food = new ModelRenderer(this);
		R_food.setRotationPoint(-1.5F, 22.0F, -2.5F);
		setRotationAngle(R_food, 0.7854F, 0.0F, 0.0F);
		R_food.setTextureOffset(20, 6).addBox(-1.5F, -0.8536F, -3.8536F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		R_food.setTextureOffset(16, 19).addBox(0.0F, -0.8536F, -3.8536F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		R_food.setTextureOffset(10, 18).addBox(1.5F, -0.8536F, -3.8536F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		L_food = new ModelRenderer(this);
		L_food.setRotationPoint(-2.5F, 22.0F, 2.5F);
		setRotationAngle(L_food, 0.7854F, 0.0F, 0.0F);
		L_food.setTextureOffset(4, 22).addBox(-0.5F, -0.1464F, -0.1464F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		L_food.setTextureOffset(0, 22).addBox(1.0F, -0.1464F, -0.1464F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		L_food.setTextureOffset(0, 0).addBox(2.5F, -0.1464F, -0.1464F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		L_hand = new ModelRenderer(this);
		L_hand.setRotationPoint(1.8F, 22.0F, 3.2F);
		setRotationAngle(L_hand, 0.1745F, 0.3927F, 0.0F);
		L_hand.setTextureOffset(21, 15).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		L_hand.setTextureOffset(18, 0).addBox(-1.5F, -2.0F, 2.5F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		L_hand.setTextureOffset(0, 16).addBox(-1.5F, 0.0F, 2.5F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		R_hand = new ModelRenderer(this);
		R_hand.setRotationPoint(1.8F, 22.0F, -2.7F);
		setRotationAngle(R_hand, -0.1745F, -0.3927F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.0201F, 0.0485F, -0.3656F);
		R_hand.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 3.1416F, 0.0F);
		cube_r1.setTextureOffset(0, 10).addBox(-1.5F, -2.5F, 2.5F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(20, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(10, 12).addBox(-1.5F, -0.5F, 2.5F, 3.0F, 2.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		R_food.render(matrixStack, buffer, packedLight, packedOverlay);
		L_food.render(matrixStack, buffer, packedLight, packedOverlay);
		L_hand.render(matrixStack, buffer, packedLight, packedOverlay);
		R_hand.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.R_food.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.R_hand.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.L_hand.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.L_food.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}