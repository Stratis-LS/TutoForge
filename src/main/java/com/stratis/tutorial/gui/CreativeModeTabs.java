package com.stratis.tutorial.gui;

import com.stratis.tutorial.TutorialMain;
import com.stratis.tutorial.blocks.Blocks;
import com.stratis.tutorial.items.Items;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class CreativeModeTabs
{
     public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMain.MODID);

     public static final List<Item> TUTORIAL_TAB_ITEMS_LIST = new ArrayList<>();
     public static final List<Block> TUTORIAL_TAB_BLOCKS_LIST = new ArrayList<>();

     public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB_ITEMS = CREATIVE_MODE_TABS.register("tutorial_tab_items", () -> CreativeModeTab
               .builder()
               .icon(() -> new ItemStack(Items.TUTORIAL_INGOT.get()))
               .title(Component.translatable("creative_mode_tab.tutorial_tab_items"))
               .displayItems((parameters, output) ->
               {
                    TUTORIAL_TAB_ITEMS_LIST.forEach(itemLike -> output.accept(itemLike.asItem()));
               })
               .build());

     public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB_BLOCKS = CREATIVE_MODE_TABS.register("tutorial_tab_blocks", () -> CreativeModeTab
               .builder()
               .icon(() -> new ItemStack(Blocks.TUTORIAL_BLOCK.get()))
               .title(Component.translatable("creative_mode_tab.tutorial_tab_blocks"))
               .displayItems((parameters, output) ->
               {
                    TUTORIAL_TAB_BLOCKS_LIST.forEach(itemLike -> output.accept(itemLike.asItem()));
               })
               .build());

     public CreativeModeTabs() {}

     public static void register(IEventBus eventBus)
     {
          CREATIVE_MODE_TABS.register(eventBus);
     }
}
