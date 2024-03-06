package com.xantwan.noseeds.event;

import com.xantwan.noseeds.NoSeeds;
import com.xantwan.noseeds.NoSeedsObjects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = NoSeeds.MOD_ID)
public class ModEvents {
    private static final Logger LOGGER = LogManager.getLogger();
    @SubscribeEvent
    public static void voidSeeds(EntityItemPickupEvent event){
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getMainHandItem();
        ItemEntity entityPickedUp = event.getItem();
        String itemName = entityPickedUp.getDisplayName().getString().toLowerCase();
        int seedEnchLvl = EnchantmentHelper.getItemEnchantmentLevel(NoSeedsObjects.SEED_BE_GONE, itemInHand);
        if( itemName.contains("seed") && seedEnchLvl > 0){
            event.getItem().remove(Entity.RemovalReason.DISCARDED);
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public static void voidSaplings(EntityItemPickupEvent event){
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getMainHandItem();
        ItemEntity itemPickedUp = event.getItem();
        String itemName = itemPickedUp.getDisplayName().getString().toLowerCase();
        int sapEnchLvl = EnchantmentHelper.getItemEnchantmentLevel(NoSeedsObjects.SAPLING_BE_GONE, itemInHand);
        if( itemName.contains("sapling") && sapEnchLvl > 0){
            event.getItem().remove(Entity.RemovalReason.DISCARDED);
            event.setCanceled(true);
        }
    }
}
