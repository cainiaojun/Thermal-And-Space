package mrthomas20121.thermal_and_space.datagen;

import cofh.lib.init.data.BlockStateProviderCoFH;
import mrthomas20121.thermal_and_space.ThermalAndSpace;
import mrthomas20121.thermal_and_space.api.AstraStone;
import mrthomas20121.thermal_and_space.init.SpaceBlocks;
import mrthomas20121.thermal_and_space.api.ThermalOre;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SpaceBlockStateProvider extends BlockStateProviderCoFH {

    public SpaceBlockStateProvider(PackOutput gen, ExistingFileHelper existingFileHelper) {
        super(gen, ThermalAndSpace.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ThermalOre[] ores = ThermalOre.values();
        AstraStone[] stones = AstraStone.values();

        for(AstraStone stone : stones) {

            if(stone.isSand()) {
                // oil shale
                this.simpleBlock(SpaceBlocks.SAND_ORES.get(stone));
            }

            for(ThermalOre ore: ores) {
                // other ores
                this.simpleBlock(SpaceBlocks.ORES.get(stone).get(ore));
            }
        }
    }
}
