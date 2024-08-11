package com.ropap.tardom.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class NorscaT1Entity extends MonsterEntity implements IAnimatable {
    private final AnimationFactory factory = new AnimationFactory(this);

    public NorscaT1Entity(EntityType<? extends MonsterEntity> type, World world) {
        super(type, world);
        // Устанавливаем размеры хитбокса при создании сущности
        this.setBoundingBox(new AxisAlignedBB(this.getX() - 0.4, this.getY(), this.getZ() - 0.4,
                this.getX() + 0.4, this.getY() + 2.0, this.getZ() + 0.4));
    }

    @Override
    public void tick() {
        super.tick();
        // Обновляем размеры хитбокса каждый тик
        this.setBoundingBox(new AxisAlignedBB(this.getX() - 0.4, this.getY(), this.getZ() - 0.4,
                this.getX() + 0.4, this.getY() + 2.0, this.getZ() + 0.4));
    }

    public static AttributeModifierMap setAttributes() {
        return MonsterEntity.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.ATTACK_DAMAGE, 3.0f)
                .add(Attributes.ATTACK_SPEED, 2.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.3f).build();
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(4, new AttackGoal(this));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this, AbstractRaiderEntity.class)).setAlertOthers());
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillagerEntity.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolemEntity.class, true));
        this.goalSelector.addGoal(8, new RandomWalkingGoal(this, 0.6));
        this.goalSelector.addGoal(9, new LookAtGoal(this, PlayerEntity.class, 3.0F, 1.0F));
        this.goalSelector.addGoal(10, new LookAtGoal(this, MobEntity.class, 8.0F));
    }

    class AttackGoal extends MeleeAttackGoal {
        public AttackGoal(NorscaT1Entity entity) {
            super(entity, 1.0, false);
        }

        @Override
        protected double getAttackReachSqr(LivingEntity target) {
            if (this.mob.getVehicle() instanceof RavagerEntity) {
                float width = this.mob.getVehicle().getBbWidth() - 0.1F;
                return width * 2.0F * width * 2.0F + target.getBbWidth();
            } else {
                return super.getAttackReachSqr(target);
            }
        }
    }


    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.model.new", true)); // walk animation
            return PlayState.CONTINUE;
        }
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.model.new", true)); // idle animation
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.HOSTILE_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.HOSTILE_DEATH;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return null;
    }

    @Override
    protected float getSoundVolume() {
        return 0.2F;
    }
}
