package com.stratis.tutorial;

import com.stratis.tutorial.blocks.Blocks;
import com.stratis.tutorial.items.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TutorialMain.MODID)
public class TutorialMain
{
     public static final String MODID = "tutorial";

     public TutorialMain()
     {
          IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
          MinecraftForge.EVENT_BUS.register(this);

          Items.register(modEventBus);
          Blocks.register(modEventBus);
     }
}
