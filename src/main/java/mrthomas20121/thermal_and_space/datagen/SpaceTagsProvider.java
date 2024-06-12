package mrthomas20121.thermal_and_space.datagen;

import earth.terrarium.adastra.common.registry.ModBlocks;
import mrthomas20121.thermal_and_space.ThermalAndSpace;
import mrthomas20121.thermal_and_space.api.AstraStone;
import mrthomas20121.thermal_and_space.api.OreTagData;
import mrthomas20121.thermal_and_space.init.SpaceBlocks;
import mrthomas20121.thermal_and_space.init.SpaceTags;
import mrthomas20121.thermal_and_space.api.ThermalOre;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class SpaceTagsProvider {

    public static class Block extends BlockTagsProvider {

        public Block(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, ThermalAndSpace.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider pProvider) {

            this.tag(SpaceTags.glacio_ore_replaceables).add(ModBlocks.GLACIO_STONE.get());
            this.tag(SpaceTags.mars_ore_replaceables).add(ModBlocks.MARS_STONE.get());
            this.tag(SpaceTags.moon_ore_replaceables).add(ModBlocks.MOON_STONE.get());
            this.tag(SpaceTags.mercury_ore_replaceables).add(ModBlocks.MERCURY_STONE.get());
            this.tag(SpaceTags.venus_ore_replaceables).add(ModBlocks.VENUS_STONE.get());

            ThermalOre[] ores = ThermalOre.values();
            AstraStone[] stones = AstraStone.values();

            for(AstraStone stone : stones) {

                if(stone.isSand()) {
                    this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(SpaceBlocks.SAND_ORES.get(stone).get());
                    this.tag(Tags.Blocks.ORES).add(SpaceBlocks.SAND_ORES.get(stone).get());
                }

                for(ThermalOre ore: ores) {

                    this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(SpaceBlocks.ORES.get(stone).get(ore).get());

                    OreTagData tags = ore.getTags();

                    this.tag(tags.oreTag()).add(SpaceBlocks.ORES.get(stone).get(ore).get());
                    this.tag(tags.needToolsTag()).add(SpaceBlocks.ORES.get(stone).get(ore).get());
                    this.tag(Tags.Blocks.ORES).add(SpaceBlocks.ORES.get(stone).get(ore).get());
                }
            }
        }
    }

    public static class Item extends ItemTagsProvider {

        public Item(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(packOutput, pLookupProvider, blockTagsProvider.contentsGetter());
        }

        @Override
        protected void addTags(HolderLookup.Provider pProvider) {
            ThermalOre[] ores = ThermalOre.values();
            AstraStone[] stones = AstraStone.values();

            for(AstraStone stone : stones) {

                this.tag(Tags.Items.ORES).add(SpaceBlocks.SAND_ORES.get(stone).get().asItem());

                for(ThermalOre ore: ores) {
                    OreTagData tags = ore.getTags();
                    this.tag(tags.oreTagItem()).add(SpaceBlocks.ORES.get(stone).get(ore).get().asItem());
                    this.tag(Tags.Items.ORES).add(SpaceBlocks.ORES.get(stone).get(ore).get().asItem());
                }
            }
        }
    }
}
