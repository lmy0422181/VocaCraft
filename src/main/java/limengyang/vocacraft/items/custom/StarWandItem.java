package limengyang.vocacraft.items.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class StarWandItem extends SwordItem{
	private static final int MAX_USE_TIME = 600;
	private static final int PARTICLE_SPAWN_INTERVAL = 5;

	public StarWandItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
		super(toolMaterial, attackDamage, attackSpeed, settings);
	}

	@Override
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.BOW;
	}

	@Override
	public int getMaxUseTime(ItemStack stack) {
		return MAX_USE_TIME;
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		ItemStack itemStack = user.getStackInHand(hand);
		user.setCurrentHand(hand);
		if (!world.isClient()) {
			user.heal(4.0F);
			user.getItemCooldownManager().set(this, 20 * 3);
		}
		return TypedActionResult.consume(itemStack);
	}

	@Override
	public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
		if (world.isClient && user instanceof PlayerEntity) {
			for (int i = 0; i < 3; i++) {
				world.addParticle(ParticleTypes.HEART,
						user.getX() + (world.random.nextDouble() - 0.5) * 2.0,
						user.getY() + 1.0 + world.random.nextDouble(),
						user.getZ() + (world.random.nextDouble() - 0.5) * 2.0,
						0, 0.1, 0);
			}

			for (int i = 0; i < 5; i++) {
				world.addParticle(ParticleTypes.END_ROD,
						user.getX() + (world.random.nextDouble() - 0.5) * 3.0,
						user.getY() + 0.5 + world.random.nextDouble() * 1.5,
						user.getZ() + (world.random.nextDouble() - 0.5) * 3.0,
						(world.random.nextDouble() - 0.5) * 0.1,
						world.random.nextDouble() * 0.1,
						(world.random.nextDouble() - 0.5) * 0.1);
			}
		}
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(stack, world, entity, slot, selected);

		if (world.isClient && selected && entity instanceof PlayerEntity) {
			PlayerEntity player = (PlayerEntity) entity;

			if (world.getTime() % PARTICLE_SPAWN_INTERVAL == 0) {
				for (int i = 0; i < 2; i++) {
					world.addParticle(ParticleTypes.END_ROD,
							player.getX() + (world.random.nextDouble() - 0.5) * 2.0,
							player.getY() + world.random.nextDouble() * 2.0,
							player.getZ() + (world.random.nextDouble() - 0.5) * 2.0,
							(world.random.nextDouble() - 0.5) * 0.05,
							world.random.nextDouble() * 0.05,
							(world.random.nextDouble() - 0.5) * 0.05);
				}
			}
		}
	}

	@Override
	public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
		tooltip.add(Text.translatable("tooltip.vocacraft.star_wand"));
	}
}
