package com.minimal.navigation.item;

import com.minimal.navigation.essential.Reference;

/**
 * Created by Minimal on 10/12/2016.
 */
public class ItemNote extends net.minecraft.item.Item
{
    public ItemNote()
    {
        setUnlocalizedName(Reference.ENavItems.NOTE.getUnlocalizedName());
        setRegistryName(Reference.ENavItems.NOTE.getRegistryName());
    }
}
