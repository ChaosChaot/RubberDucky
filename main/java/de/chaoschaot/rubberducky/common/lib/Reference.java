package de.chaoschaot.rubberducky.common.lib;

import me.jezza.oc.api.configuration.Config;

public class Reference {
    public static final String MOD_ID = "rubberducky";
    public static final String MOD_IDENTIFIER = MOD_ID + ":";
    public static final String MOD_VERSION = "0.1";
    public static final String MOD_NAME = "Rubber Ducky Mod";
    public static final String CLIENT_PROXY_CLASS = "de.chaoschaot.rubberducky.client.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "de.chaoschaot.rubberducky.common.CommonProxy";


    @Config.ConfigBoolean(category = "General", comment = "This is just an example config")
    public static boolean SOME_CONFIG_VALUE = false;
}
