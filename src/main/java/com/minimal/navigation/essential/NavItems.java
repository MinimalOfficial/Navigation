package com.minimal.navigation.essential;

import com.minimal.navigation.item.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Minimal on 10/12/2016.
 */
public class NavItems
{
    public static ItemBase note;

    public static void init()
    {
        note = register(new ItemBase("note").setCreativeTab(CreativeTabs.MISC));
    }

    private static <i extends Item> i register(i item) {
        GameRegistry.register(item);

        if (item instanceof ItemBase) {
            ((ItemBase)item).registerItemModel();
        }

        return item;
    }
}
