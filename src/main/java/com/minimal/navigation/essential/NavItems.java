package com.minimal.navigation.essential;

import com.minimal.navigation.item.ItemNote;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Minimal on 10/12/2016.
 */
public class NavItems
{
    public static Item note;

    public static void init()
    {
        note = new ItemNote();
    }

    public static void register()
    {
        GameRegistry.register(note);
    }

    public static void registerRenders()
    {
        registerRender(note);
    }

    private static void registerRender(Item item)
    {
        System.out.println(item.getRegistryName());
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getUnlocalizedName(), "inventory"));
    }
}