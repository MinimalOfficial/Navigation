package com.minimal.navigation.essential.proxy;

import com.minimal.navigation.essential.NavItems;

/**
 * Created by Minimal on 10/12/2016.
 */
public class ClientProxy extends CommonProxy
{
    @Override
    public void init()
    {
        NavItems.registerRenders();
    }
}
