package net.mcreator.voidsedge.procedures;

import net.minecraftforge.fml.network.NetworkHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.PacketBuffer;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.voidsedge.gui.VoidfactoryGUIGui;
import net.mcreator.voidsedge.block.VFFrameBlock;
import net.mcreator.voidsedge.block.VFCoreBlock;
import net.mcreator.voidsedge.block.NethendBlock;
import net.mcreator.voidsedge.VoidsEdgeMod;

import java.util.Map;

import io.netty.buffer.Unpooled;

public class VFTerminalOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				VoidsEdgeMod.LOGGER.warn("Failed to load dependency world for procedure VFTerminalOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				VoidsEdgeMod.LOGGER.warn("Failed to load dependency x for procedure VFTerminalOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				VoidsEdgeMod.LOGGER.warn("Failed to load dependency y for procedure VFTerminalOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				VoidsEdgeMod.LOGGER.warn("Failed to load dependency z for procedure VFTerminalOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VoidsEdgeMod.LOGGER.warn("Failed to load dependency entity for procedure VFTerminalOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == VFCoreBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == NethendBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 0), (int) y, (int) (z + 1)))).getBlock() == NethendBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 0), (int) y, (int) (z - 1)))).getBlock() == NethendBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == NethendBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == NethendBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)))).getBlock() == NethendBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)))).getBlock() == NethendBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
				&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
				|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == VFCoreBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 0), (int) y, (int) (z + 1)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 0), (int) y, (int) (z - 1)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 1)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 1)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == VFCoreBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == VFCoreBlock.block
						&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 2)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 2)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 2)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 0)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 0)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 2)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 2)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == VFCoreBlock.block
						&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 2)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 2)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 2)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == VFCoreBlock.block
						&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 2)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z - 2)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 2)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 0)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 0)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 2)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == VFCoreBlock.block
						&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == NethendBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 2)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z - 2)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 2)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block
						&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == VFFrameBlock.block) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
					NetworkHooks.openGui((ServerPlayerEntity) _ent, new INamedContainerProvider() {
						@Override
						public ITextComponent getDisplayName() {
							return new StringTextComponent("VoidfactoryGUI");
						}

						@Override
						public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
							return new VoidfactoryGUIGui.GuiContainerMod(id, inventory, new PacketBuffer(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		} else {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
		}
	}
}
