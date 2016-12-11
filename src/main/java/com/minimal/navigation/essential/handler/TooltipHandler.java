package com.minimal.navigation.essential.handler;

import com.minimal.navigation.essential.init.NavItems;
import com.minimal.navigation.item.ItemNote;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Minimal on 11/12/2016.
 */
public class TooltipHandler
{
    @SubscribeEvent
    public void tooltip(ItemTooltipEvent e)
    {
        ItemStack item = e.getItemStack();

        if(item.getItem() == NavItems.empty_note)
        {
            e.getToolTip().add("No position saved.");
        }
        if(item.getItem() == NavItems.note)
        {
            e.getToolTip().add("-Position-");
            e.getToolTip().add("X: " + ItemNote.x);
            e.getToolTip().add("Y: " + ItemNote.y);
            e.getToolTip().add("Z: " + ItemNote.z);
        }
    }
}
