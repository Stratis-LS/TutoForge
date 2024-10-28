/** // Création des Models Json --- A NE PAS BUILD DANS LE JAR ---
package com.stratis.tutorial.assets;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Models
{
     public static void item_generated(String name)
     {
          File file = new File("D:/Script/Mod/TutoForge/src/main/resources/assets/tutorial/models/item/" + name + ".json");

          if (!file.exists())
          {
               try
               {
                    file.createNewFile();
                    FileWriter writer = new FileWriter(file);
                    BufferedWriter buffer = new BufferedWriter(writer);
                    buffer.write("{\n" +
                              "\t\"parent\": \"item/generated\",\n" +
                              "\t\"textures\": {\n" +
                              "\t\t\"layer0\": \"tutorial:item/" + name + "\"\n" +
                              "\t}\n" +
                              "}");
                    buffer.close();
                    writer.close();
               }
               catch (IOException event)
               {
                    event.printStackTrace();
               }
          }
     }
}**/
