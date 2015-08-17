package naturalphilosophy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NaturalPhilosophy.MODID, name = NaturalPhilosophy.NAME, version = NaturalPhilosophy.VERSION, dependencies = NaturalPhilosophy.DEPENDENCIES)
public class NaturalPhilosophy {

    public static final String MODID = "naturalphilosophy";
    public static final String NAME = "Natural Philosophy";
    public static final String VERSION = "$VERSION$";
    public static final String DEPENDENCIES = "required-after:dynamiclib";

    @Instance(MODID)
    public static NaturalPhilosophy instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}