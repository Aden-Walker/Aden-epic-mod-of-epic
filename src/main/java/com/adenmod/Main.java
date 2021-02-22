package com.adenmod;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;

@Mod(Main.MOD_ID)

public class Main {
    public static Main instance;
    public static final String MOD_ID = "aemoe";
    public static final Logger LOGGER = LogManager.getLogger();

    public Main(){
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

    }

    private void setup(final FMLCommonSetupEvent event){


    }

    private void clientSetup(final FMLClientSetupEvent event){

    }

    public void onServerStarting(FMLServerStartingEvent event){

    }

}
