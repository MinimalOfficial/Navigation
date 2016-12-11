package com.minimal.navigation.essential.init;

import com.minimal.navigation.item.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Minimal on 10/12/2016.
 */
public class NavItems
{
    public static ItemBase empty_note;
    public static ItemBase note;
    public static ItemBase upcomp;

    public static void init()
    {
        empty_note = register(new ItemEmptyNote("empty_note").setCreativeTab(CreativeTabs.MISC));
        note = register(new ItemNote("note").setCreativeTab(CreativeTabs.MISC));
        upcomp = register(new ItemUpComp("upcomp").setCreativeTab(CreativeTabs.MISC));
    }

    private static ItemBase register(ItemBase item)
    {
        GameRegistry.register(item);

        if (item instanceof ItemBase) {
            (item).registerItemModel();
        }

        return item;
    }
}
