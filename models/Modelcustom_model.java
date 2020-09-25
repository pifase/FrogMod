// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer left_foot;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer right_foot;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer left_thigh;
	private final ModelRenderer right_thigh;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer head;
	private final ModelRenderer right_ear;
	private final ModelRenderer left_ear;
	private final ModelRenderer tail;
	private final ModelRenderer nose;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 32;

		left_foot = new ModelRenderer(this);
		left_foot.setRotationPoint(-3.0F, 15.5F, 6.2F);
		left_foot.setTextureOffset(26, 24).addBox(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 6.0F, -0.2F);
		left_foot.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.7854F, 0.0F);
		bone3.setTextureOffset(26, 24).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 6.0F, -0.2F);
		left_foot.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -0.7854F, 0.0F);
		bone4.setTextureOffset(26, 24).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		right_foot = new ModelRenderer(this);
		right_foot.setRotationPoint(3.0F, 15.5F, 6.2F);
		right_foot.setTextureOffset(8, 24).addBox(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		right_foot.addChild(bone);
		setRotationAngle(bone, 0.0F, -0.7854F, 0.0F);
		bone.setTextureOffset(8, 24).addBox(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		right_foot.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.7854F, 0.0F);
		bone2.setTextureOffset(8, 24).addBox(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		left_thigh = new ModelRenderer(this);
		left_thigh.setRotationPoint(-3.0F, 17.0F, 4.5F);
		left_thigh.setTextureOffset(16, 15).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);

		right_thigh = new ModelRenderer(this);
		right_thigh.setRotationPoint(3.0F, 17.0F, 4.5F);
		right_thigh.setTextureOffset(30, 15).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.0F, 9.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-3.0F, 17.0F, -1.0F);
		left_arm.setTextureOffset(8, 15).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(3.0F, 17.0F, -1.0F);
		right_arm.setTextureOffset(0, 15).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 16.0F, -1.0F);
		head.setTextureOffset(32, 0).addBox(-2.5F, -4.0F, -5.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(32, 0).addBox(-2.5F, -1.0F, -4.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(32, 0).addBox(1.5F, -5.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(32, 0).addBox(-3.5F, -5.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(0.0F, 16.0F, -1.0F);

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(0.0F, 16.0F, -1.0F);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 16.25F, 9.0F);

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, 16.0F, -1.0F);

	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		left_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		right_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		left_thigh.render(matrixStack, buffer, packedLight, packedOverlay);
		right_thigh.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		right_ear.render(matrixStack, buffer, packedLight, packedOverlay);
		left_ear.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		nose.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}