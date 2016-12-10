package com.minimal.navigation.essential;

import com.minimal.navigation.essential.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Minimal on 24/10/2016.
 */
@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Navigation
{
    @Mod.Instance
    public static Navigation instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        NavItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {

    }
}
