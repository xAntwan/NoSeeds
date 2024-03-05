package com.xantwan.noseeds.enchantment;


import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class SaplingBeGoneEnchantment extends Enchantment {
    protected SaplingBeGoneEnchantment(Rarity pRarity, EnchantmentType pCategory, EquipmentSlotType... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }


    public int getMinCost(int level) {
        return 1 + level * 10;
    }

    public int getMaxCost(int level) {
        return this.getMinCost(level) + 5;
    }
    @Override
    public int getMaxLevel() {
        return 1;
    }

}
