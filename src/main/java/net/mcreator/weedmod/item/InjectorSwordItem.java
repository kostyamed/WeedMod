
package net.mcreator.weedmod.item;

import net.minecraft.entity.ai.attributes.Attributes;

@WeedmodModElements.ModElement.Tag
public class InjectorSwordItem extends WeedmodModElements.ModElement {

	@ObjectHolder("weedmod:injector_sword")
	public static final Item block = null;

	public InjectorSwordItem(WeedmodModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("injector_sword"));
	}

}
