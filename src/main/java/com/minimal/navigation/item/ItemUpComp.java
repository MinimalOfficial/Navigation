package com.minimal.navigation.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemCompass;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by Minimal on 10/12/2016.
 */
public class ItemUpComp extends ItemBase
{
    public ItemUpComp(String name)
    {
        super(name);
        this.addPropertyOverride(new ResourceLocation("angle"), new IItemPropertyGetter()
        {
            @Override
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                return 0;
            }
        });
    }
}
