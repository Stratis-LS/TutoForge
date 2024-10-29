package com.stratis.tutorial;

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
     }
}
