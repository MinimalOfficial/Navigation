package com.minimal.navigation.essential.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Minimal on 10/12/2016.
 */
public class NavCrafting
{
    public static void init()
    {
        GameRegistry.addShapelessRecipe(new ItemStack(NavItems.note, 3), new Object[]{Items.PAPER});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.PAPER, 1), new Object[]{NavItems.note, NavItems.note, NavItems.note});
    }
}
