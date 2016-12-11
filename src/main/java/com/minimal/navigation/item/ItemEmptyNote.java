package com.minimal.navigation.item;

import com.minimal.navigation.essential.init.NavItems;
import com.minimal.navigation.item.ItemBase;
import com.minimal.navigation.item.ItemNote;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.util.ArrayList;

/**
 * Created by Minimal on 11/12/2016.
 */
public class ItemEmptyNote extends ItemBase
{
    public ArrayList<ItemNote> notes;
    public int currentId = 0;

    public ItemEmptyNote(String name)
    {
        super(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack is, World w, EntityPlayer p, EnumHand h)
    {
        currentId = currentId + ItemNote.lastSavedid;
        ItemStack note = new ItemStack(NavItems.note, 1);
        notes.add(currentId, note);
        System.out.println(p.posX);
        System.out.println(p.posY);
        System.out.println(p.posZ);
        notes.get(currentId).x = p.posX;
        notes.get(currentId).y  = p.posY;
        notes.get(currentId).z  = p.posZ;
        --is.stackSize;
        return ActionResult.newResult(EnumActionResult.SUCCESS, note);
    }

    public void getX()
    {

    }
}
