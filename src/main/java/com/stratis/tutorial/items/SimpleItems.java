package com.stratis.tutorial.items;

import com.stratis.tutorial.gui.CreativeModeTabs;

import net.minecraft.world.item.Item;

public class SimpleItems extends Item
{
     public SimpleItems(Properties properties)
     {
          super(properties);

          addCreativeTab(this);
     }

     private void addCreativeTab(Item item)
     {
          CreativeModeTabs.TUTORIAL_TAB_ITEMS_LIST.add(item.asItem());
     }
}
