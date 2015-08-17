package naturalphilosophy;

import net.minecraftforge.common.config.Configuration;
import dynamics.config.game.ModStartupHelper;
import dynamics.config.properties.ConfigProcessing;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NaturalPhilosophy.MODID, name = NaturalPhilosophy.NAME, version = NaturalPhilosophy.VERSION, dependencies = NaturalPhilosophy.DEPENDENCIES)
public class NaturalPhilosophy {

    public static final String MODID = "naturalphilosophy";
    public static final String NAME = "Natural Philosophy";
    public static final String VERSION = "$VERSION$";
    public static final String PROXY_SERVER = "naturalphilosophy.server.ServerProxy";
    public static final String PROXY_CLIENT = "naturalphilosophy.client.ClientProxy";
    public static final String DEPENDENCIES = "required-after:dynamiclib@[$LIB-VERSION$,$NEXT-LIB-VERSION$)";

    @Instance(MODID)
    public static NaturalPhilosophy instance;

    @SidedProxy(clientSide = PROXY_CLIENT, serverSide = PROXY_SERVER)
    public static INaturalPhilosophyProxy proxy;

    private final ModStartupHelper startupHelper = new ModStartupHelper(MODID) {
        @Override
        protected void populateConfig(Configuration config) {
            ConfigProcessing.processAnnotations(MODID, config, Config.class);
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        startupHelper.preInit(event.getSuggestedConfigurationFile());

        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
}