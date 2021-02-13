package net.dodogang.crumbs;

import net.dodogang.ash.registry.ItemGroupBuilder;
import net.dodogang.crumbs.block.CrumbsBlocks;
import net.dodogang.crumbs.block.entity.CrumbsBlockEntityTypes;
import net.dodogang.crumbs.event.RightClickBlockHandlers;
import net.dodogang.crumbs.platform.AbstractPlatform;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Crumbs {
    public static final String MOD_ID = "crumbs";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static AbstractPlatform platform;
    public static ItemGroup itemGroup = ItemGroupBuilder.build(
            getId("item_group"),
            () -> new ItemStack(CrumbsBlocks.OAK_BUNDLED_LOG.get())
    );

    public static void init(AbstractPlatform platform) {
        Crumbs.platform = platform;

        CrumbsBlocks.register();
        CrumbsBlockEntityTypes.register();
    }

    public static void setup() {
        new RightClickBlockHandlers();
    }

    public static Identifier getId(String name) {
        return new Identifier(MOD_ID, name);
    }
}