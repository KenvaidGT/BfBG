package com.ropap.tardom.entity.custom;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;

import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.EnumSet;

public class NorscaT1Entity extends MonsterEntity implements IAnimatable {
    private final AnimationFactory factory = new AnimationFactory(this);


    public NorscaT1Entity(EntityType<? extends MonsterEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected float getStandingEyeHeight(Pose pose, EntitySize size) {
        return 1.74F;
    }

    public static AttributeModifierMap createAttributes() {
        return MonsterEntity.createMonsterAttributes().add(Attributes.MOVEMENT_SPEED, 0.3499999940395355).add(Attributes.FOLLOW_RANGE, 12.0).add(Attributes.MAX_HEALTH, 24.0).add(Attributes.ATTACK_DAMAGE, 5.0).build();
    }

    @Override
    public EntitySize getDimensions(Pose pose) {
        return EntitySize.scalable(0.6F, 1.95F);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new AttackGoal(this));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this, new Class[]{AbstractRaiderEntity.class})).setAlertOthers(new Class[0]));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, PlayerEntity.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, AbstractVillagerEntity.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, IronGolemEntity.class, true));
        this.goalSelector.addGoal(8, new RandomWalkingGoal(this, 0.6));
        this.goalSelector.addGoal(9, new LookAtGoal(this, PlayerEntity.class, 3.0F, 1.0F));
        this.goalSelector.addGoal(10, new LookAtGoal(this, MobEntity.class, 8.0F));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }



    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.walk", true)); // Анимация ходьбы
            return PlayState.CONTINUE;
        }
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.walk", true)); // Анимация покоя
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

    class AttackGoal extends MeleeAttackGoal {
        public AttackGoal(NorscaT1Entity p_i50577_2_) {
            super(p_i50577_2_, 1.0, false);
        }

        protected double getAttackReachSqr(LivingEntity p_179512_1_) {
            if (this.mob.getVehicle() instanceof RavagerEntity) {
                float lvt_2_1_ = this.mob.getVehicle().getBbWidth() - 0.1F;
                return (double)(lvt_2_1_ * 2.0F * lvt_2_1_ * 2.0F + p_179512_1_.getBbWidth());
            } else {
                return super.getAttackReachSqr(p_179512_1_);
            }
        }
    }

}
