package com.xantwan.noseeds.enchantment;

import com.xantwan.noseeds.NoSeeds;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS
            = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, NoSeeds.MOD_ID);

    public static RegistryObject<Enchantment> SEEDBEGONE =
            ENCHANTMENTS.register("seed_be_gone", () -> new SeedBeGoneEnchantment(
                    Enchantment.Rarity.COMMON, EnchantmentType.create("HOE", i -> i instanceof HoeItem)));

    public static RegistryObject<Enchantment> SAPLINGBEGONE =
            ENCHANTMENTS.register("sapling_be_gone", () -> new SaplingBeGoneEnchantment(
                    Enchantment.Rarity.COMMON, EnchantmentType.create("AXE", i -> i instanceof AxeItem)));

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
