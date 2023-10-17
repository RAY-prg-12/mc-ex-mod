package com.RAY.excraft.main;


import com.RAY.excraft.item.ExCraftItems;
import com.RAY.excraft.tab.ExCraftTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExCraft.MOD_ID)
public class ExCraft {
    // MOD ID
    public static final String MOD_ID = "excraft";

    // コンストラクタ
    public ExCraft(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ExCraftTabs.MOD_TABS.register(bus);
        ExCraftItems.MOD_ITEMS.register(bus);
    }
}
