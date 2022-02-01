package net.chaosdog.trophymodaltarpack;

import net.chaosdog.trophymodaltarpack.TrophyModAltarPack;
import net.chaosdog.trophymodaltarpack.Utils;
import net.chaosdog.trophymodaltarpack.block.TrophyBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, TrophyModAltarPack.ID);
    private static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, TrophyModAltarPack.ID);

    public static final RegistryObject<Block> BRONZE_TROPHY_BLOCK = Utils.regBlockWithItem(BLOCKS, ITEMS, "bronze_trophy_block", new TrophyBlock(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SILVER_TROPHY_BLOCK = Utils.regBlockWithItem(BLOCKS, ITEMS, "silver_trophy_block", new TrophyBlock(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GOLD_TROPHY_BLOCK = Utils.regBlockWithItem(BLOCKS, ITEMS, "gold_trophy_block", new TrophyBlock(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)), ItemGroup.BUILDING_BLOCKS);

    public static void init(IEventBus eventbus) {
        TrophyModAltarPack.LOG.info("Setting up blocks");
        // register the registries
        BLOCKS.register(eventbus);
        ITEMS.register(eventbus);
    }
}
