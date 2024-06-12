package mrthomas20121.thermal_and_space.api;

import cofh.lib.init.tags.BlockTagsCoFH;
import cofh.lib.init.tags.ItemTagsCoFH;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Locale;

public enum ThermalOre {
    APATITE(OreTagData.APATITE, AstraStone.MOON, AstraStone.MARS, AstraStone.VENUS),
    CINNABAR(OreTagData.CINNABAR, AstraStone.MERCURY, AstraStone.MARS, AstraStone.VENUS),
    LEAD(OreTagData.LEAD, AstraStone.VENUS, AstraStone.GLACIO, AstraStone.MARS),
    NICKEL(OreTagData.NICKEL, AstraStone.MERCURY, AstraStone.MOON),
    NITER(OreTagData.NITER, AstraStone.GLACIO, AstraStone.MOON),
    RUBY(OreTagData.RUBY, AstraStone.MARS, AstraStone.VENUS, AstraStone.MOON),
    SAPPHIRE(OreTagData.SAPPHIRE, AstraStone.MERCURY, AstraStone.VENUS),
    SILVER(OreTagData.SILVER, AstraStone.MOON, AstraStone.MARS, AstraStone.MERCURY, AstraStone.VENUS),
    SULFUR(OreTagData.SULFUR, AstraStone.MARS, AstraStone.MERCURY),
    TIN(OreTagData.TIN, AstraStone.MOON, AstraStone.MERCURY, AstraStone.VENUS, AstraStone.MARS, AstraStone.GLACIO);

    private final AstraStone[] stones;
    private final OreTagData tags;

    ThermalOre(OreTagData oreTag, AstraStone... stones) {
        this.stones = stones;
        this.tags = oreTag;
    }

    public OreTagData getTags() {
        return tags;
    }

    public String getOreName(String stone) {
        return "%s_%s_ore".formatted(stone, this.name().toLowerCase(Locale.ROOT));
    }

    public TagKey<Block> getBlockTagKey() {
        return null;
    }

    public TagKey<Item> getItemTagKey() {
        return null;
    }

    public AstraStone[] getStones() {
        return stones;
    }
}
