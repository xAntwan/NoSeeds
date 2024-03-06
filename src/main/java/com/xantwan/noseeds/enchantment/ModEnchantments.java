package com.xantwan.noseeds.enchantment;

import com.xantwan.noseeds.NoSeeds;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS
            = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, NoSeeds.MOD_ID);

    public static RegistryObject<Enchantment> SEEDBEGONE =
            ENCHANTMENTS.register("seed_be_gone", () -> new SeedBeGoneEnchantment(
                    Enchantment.Rarity.COMMON, EnchantmentCategory.create("HOE", i -> i instanceof HoeItem)));

    public static RegistryObject<Enchantment> SAPLINGBEGONE =
            ENCHANTMENTS.register("sapling_be_gone", () -> new SaplingBeGoneEnchantment(
                    Enchantment.Rarity.COMMON, EnchantmentCategory.create("AXE", i -> i instanceof AxeItem)));

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
