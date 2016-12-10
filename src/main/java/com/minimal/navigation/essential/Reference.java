package com.minimal.navigation.essential;

/**
 * Created by Minimal on 10/12/2016.
 */
public class Reference
{
    // MOD AND PROXIES
    public static final String MODID = "navigation";
    public static final String NAME = "Navigation";
    public static final String CLIENT = "com.minimal.navigation.essential.proxy.ClientProxy";
    public static final String SERVER = "com.minimal.navigation.essential.proxy.CommonProxy";

    // VERSION
    public static final String MAJOR = "0";
    public static final String MINOR = "0";
    public static final String BUILD = "1";
    public static final String STATE = "prealpha";
    public static final String VERSION = MAJOR + "." + MINOR + "." + BUILD + "-" + STATE;

    public static enum ENavItems
    {
        NOTE("note", "Note");

        private String unlocalizedName;
        private String registryName;

        ENavItems(String unlocalizedName, String registryName)
        {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName()
        {
            return unlocalizedName;
        }

        public String getRegistryName()
        {
            return registryName;
        }
    }
}
