package chaosdog.trophymodaltarpack;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("trophymodaltarpack")
public class TrophyModAltarPack
{
    public static final Logger LOG = LogManager.getLogger();
    public static final String ID = "trophymodaltarpack";

    public TrophyModAltarPack() {
        LOG.info("Setting up Trophy Mod");
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.init(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
    }

}
