package com.stratis.tutorial.blocks;

import com.stratis.tutorial.items.SimpleItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.stratis.tutorial.TutorialMain.MODID;

public class Blocks
{
     public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

     public static final RegistryObject<Block> TUTORIAL_BLOCK = BLOCKS.register("tutorial_block" , () -> new SimpleBlocks(BlockBehaviour.Properties.of()
               .mapColor(MapColor.COLOR_BLACK)
               .instrument(NoteBlockInstrument.BELL)
               .requiresCorrectToolForDrops()
               .strength(4.0F, 6.0F)
               .sound(SoundType.METAL), "tutorial_block")
     );

     public static final RegistryObject<Block> TUTORIAL_BRICKS = BLOCKS.register("tutorial_bricks" , () -> new SimpleBlocks(BlockBehaviour.Properties.of()
               .mapColor(MapColor.COLOR_BLACK)
               .instrument(NoteBlockInstrument.BASEDRUM)
               .requiresCorrectToolForDrops()
               .strength(2.0F, 6.0F), "tutorial_bricks" )
     );
     public static final RegistryObject<Block> RAW_TUTORIAL_BLOCK = BLOCKS.register("raw_tutorial_block" , () -> new SimpleBlocks(BlockBehaviour.Properties.of()
               .mapColor(MapColor.COLOR_BLACK)
               .instrument(NoteBlockInstrument.BASEDRUM)
               .requiresCorrectToolForDrops()
               .strength(5.0F, 6.0F), "raw_tutorial_block")
     );

     public Blocks() {}

     public static void register(IEventBus eventBus)
     {
          BLOCKS.register(eventBus);
     }
}
