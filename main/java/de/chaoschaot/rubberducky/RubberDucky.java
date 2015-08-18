package de.chaoschaot.rubberducky;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.chaoschaot.rubberducky.common.CommonProxy;
import de.chaoschaot.rubberducky.common.blocks.ModBlocks;
import de.chaoschaot.rubberducky.common.lib.Reference;
import me.jezza.oc.client.CreativeTabSimple;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, dependencies = "required-after:Forge@[10.13.4.1448,);required-after:OmnisCore@[0.0.6,);")
public class RubberDucky {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static Logger log;
    public static CreativeTabSimple creativeTab = new CreativeTabSimple(Reference.MOD_ID);


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        log = LogManager.getLogger(Reference.MOD_NAME.replaceAll(" ", ""));

        proxy.preInitServerSide();
        proxy.preInitClientSide();

        ModBlocks.init();
        //ModItems.init();

        creativeTab.setIcon(ModBlocks.rubberDuck);

        //ModItems.initRecipes();
        //ModBlocks.initRecipes();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.initServerSide();
        proxy.initClientSide();

        //proxy.registerTileEntities();
        //NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInitServerSide();
        proxy.postInitClientSide();
    }
}
