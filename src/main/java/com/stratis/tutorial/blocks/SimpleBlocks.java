package com.stratis.tutorial.blocks;

import com.stratis.tutorial.items.Items;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class SimpleBlocks extends Block {
     public SimpleBlocks(Properties properties, String item)
     {
          super(properties);

          Items.ITEMS.register(item, () -> new BlockItem(asBlock(), new Item.Properties()));
     }
}
