package io.github.theflamefish.tutorialmod.block.custom;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class NukeBlock extends Block {
    public NukeBlock(Properties pProperties) {
        super(pProperties);
    }

    public void explode(Level level, Entity player, float x, float y, float z) {
        level.explode(player, x, y, z, 30.0F, Level.ExplosionInteraction.TNT);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        explode(pLevel,pPlayer,pPos.getX(),pPos.getY(),pPos.getZ());

        return InteractionResult.SUCCESS;
    }
}
