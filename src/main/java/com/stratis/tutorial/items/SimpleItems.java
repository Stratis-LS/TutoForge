package com.stratis.tutorial.items;

// import com.stratis.tutorial.assets.Models;
import net.minecraft.world.item.Item;

public class SimpleItems extends Item
{
     public SimpleItems(String name)
     {
          super(new Item.Properties());

          // Models.item_generated(name); // Création des models Json --- A NE PAS BUILD DANS LE JAR ---
     }
}
