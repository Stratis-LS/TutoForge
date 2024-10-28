package com.stratis.tutorial.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.stratis.tutorial.TutorialMain.MODID;

public class Items
{
     static String name;

     private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
     public static final RegistryObject<Item> TUTORIAL_INGOT = ITEMS.register(name ="tutorial_ingot" , () -> new SimpleItems(name));

     public Items() {}

     public static void register(IEventBus eventBus)
     {
          ITEMS.register(eventBus);
     }
}
