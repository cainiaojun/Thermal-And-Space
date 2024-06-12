package mrthomas20121.thermal_and_space.api;

import cofh.lib.init.tags.BlockTagsCoFH;
import cofh.lib.init.tags.ItemTagsCoFH;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public record OreTagData(TagKey<Block> oreTag, TagKey<Block> needToolsTag, TagKey<Item> oreTagItem) {

    public static OreTagData APATITE = create(BlockTagsCoFH.ORES_APATITE, BlockTags.NEEDS_IRON_TOOL, ItemTagsCoFH.ORES_APATITE);
    public static OreTagData CINNABAR = create(BlockTagsCoFH.ORES_CINNABAR, BlockTags.NEEDS_IRON_TOOL, ItemTagsCoFH.ORES_CINNABAR);
    public static OreTagData LEAD = create(BlockTagsCoFH.ORES_LEAD, BlockTags.NEEDS_IRON_TOOL, ItemTagsCoFH.ORES_LEAD);
    public static OreTagData NICKEL = create(BlockTagsCoFH.ORES_NICKEL, BlockTags.NEEDS_IRON_TOOL, ItemTagsCoFH.ORES_NICKEL);
    public static OreTagData NITER = create(BlockTagsCoFH.ORES_NITER, BlockTags.NEEDS_IRON_TOOL, ItemTagsCoFH.ORES_NITER);
    public static OreTagData RUBY = create(BlockTagsCoFH.ORES_RUBY, BlockTags.NEEDS_IRON_TOOL, ItemTagsCoFH.ORES_RUBY);
    public static OreTagData SAPPHIRE = create(BlockTagsCoFH.ORES_SAPPHIRE, BlockTags.NEEDS_IRON_TOOL, ItemTagsCoFH.ORES_SAPPHIRE);
    public static OreTagData SILVER = create(BlockTagsCoFH.ORES_SILVER, BlockTags.NEEDS_IRON_TOOL, ItemTagsCoFH.ORES_SILVER);
    public static OreTagData SULFUR = create(BlockTagsCoFH.ORES_SULFUR, BlockTags.NEEDS_IRON_TOOL, ItemTagsCoFH.ORES_SULFUR);
    public static OreTagData TIN = create(BlockTagsCoFH.ORES_TIN, BlockTags.NEEDS_IRON_TOOL, ItemTagsCoFH.ORES_TIN);

    private static OreTagData create(TagKey<Block> oreTag, TagKey<Block> needToolsTag, TagKey<Item> oreTagItem) {
        return new OreTagData(oreTag, needToolsTag, oreTagItem);
    }
}
