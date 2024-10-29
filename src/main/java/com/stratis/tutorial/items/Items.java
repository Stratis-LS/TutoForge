package com.stratis.tutorial.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.stratis.tutorial.TutorialMain.MODID;

public class Items
{
     public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

     public static final RegistryObject<Item> TUTORIAL_INGOT = ITEMS.register("tutorial_ingot" , () -> new SimpleItems(new Item.Properties()));
     public static final RegistryObject<Item> TUTORIAL_NUGGET = ITEMS.register("tutorial_nugget" , () -> new SimpleItems(new Item.Properties()));
     public static final RegistryObject<Item> RAW_TUTORIAL = ITEMS.register("raw_tutorial" , () -> new SimpleItems(new Item.Properties()));

     public Items() {}

     public static void register(IEventBus eventBus)
     {
          ITEMS.register(eventBus);
     }
}
