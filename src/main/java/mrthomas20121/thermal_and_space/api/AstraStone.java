package mrthomas20121.thermal_and_space.api;

import mrthomas20121.thermal_and_space.init.SpaceTags;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public enum AstraStone {

    GLACIO(false, new TagMatchTest(SpaceTags.glacio_ore_replaceables), 103, -2),
    MARS(true, new TagMatchTest(SpaceTags.mars_ore_replaceables), 120, -63),
    MERCURY(false, new TagMatchTest(SpaceTags.mercury_ore_replaceables), 120, -63),
    MOON(true, new TagMatchTest(SpaceTags.moon_ore_replaceables), 120, -63),
    VENUS(true, new TagMatchTest(SpaceTags.venus_ore_replaceables), 130, -63);

    private final boolean isSand;
    private final TagMatchTest tag;

    private final int minY;
    private final int maxY;

    AstraStone(boolean isSand, TagMatchTest tag, int maxY, int minY) {
        this.isSand = isSand;
        this.tag = tag;
        this.minY = minY;
        this.maxY = maxY;
    }

    public boolean isSand() {
        return isSand;
    }

    public TagMatchTest getTag() {
        return tag;
    }
}
