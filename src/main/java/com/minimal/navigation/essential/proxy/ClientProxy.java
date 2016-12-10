package com.minimal.navigation.essential.proxy;

import com.minimal.navigation.essential.NavItems;

/**
 * Created by Minimal on 10/12/2016.
 */
public class ClientProxy implements IProxy
{
    @Override
    public void init()
    {
        NavItems.registerRenders();
    }
}
