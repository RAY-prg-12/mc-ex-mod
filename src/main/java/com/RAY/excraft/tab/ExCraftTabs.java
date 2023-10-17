package com.RAY.excraft.tab;

import com.RAY.excraft.main.ExCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ExCraftTabs {
    // クリエイティブタブの親…？
    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExCraft.MOD_ID);
    public static final RegistryObject<CreativeModeTab> EX_MATERIAL = MOD_TABS.register("ex_material",
            ()->{
                return CreativeModeTab.builder()
                        .icon(()->new ItemStack(Items.IRON_INGOT))
                        .title(Component.translatable("itemGroup.ex_material"))

                        .displayItems((param,output)->{
                            for(Item item : ExMaterial.items){
                                output.accept(item);
                            }
                        })
                        .build();
            });
}
