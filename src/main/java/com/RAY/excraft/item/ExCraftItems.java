package com.RAY.excraft.item;

import com.RAY.excraft.main.ExCraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExCraftItems {

    public static final DeferredRegister<Item> MOD_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExCraft.MOD_ID);

    public static final RegistryObject<Item> EMPTY_CAN = MOD_ITEMS.register(
            "empty_can",
            ItemEmptyCan::new
    );
}
