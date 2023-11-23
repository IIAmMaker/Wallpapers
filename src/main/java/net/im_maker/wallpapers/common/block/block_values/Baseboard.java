package net.im_maker.wallpapers.common.block.block_values;

import net.minecraft.util.StringRepresentable;

public enum Baseboard implements StringRepresentable {
    NONE("none"),
    DRIPSTONE("dripstone"),
    QUARTZ("quartz"),
    GOLD("gold"),
    PRISMARINE("prismarine"),
    RED_PAINTED_PLANKS("red_painted_planks"),
    ORANGE_PAINTED_PLANKS("orange_painted_planks"),
    YELLOW_PAINTED_PLANKS("yellow_painted_planks"),
    LIME_PAINTED_PLANKS("lime_painted_planks"),
    GREEN_PAINTED_PLANKS("green_painted_planks"),
    LIGHT_BLUE_PAINTED_PLANKS("light_blue_painted_planks"),
    CYAN_PAINTED_PLANKS("cyan_painted_planks"),
    BLUE_PAINTED_PLANKS("blue_painted_planks"),
    PURPLE_PAINTED_PLANKS("purple_painted_planks"),
    MAGENTA_PAINTED_PLANKS("magenta_painted_planks"),
    PINK_PAINTED_PLANKS("pink_painted_planks"),
    BROWN_PAINTED_PLANKS("brown_painted_planks"),
    BLACK_PAINTED_PLANKS("black_painted_planks"),
    GRAY_PAINTED_PLANKS("gray_painted_planks"),
    LIGHT_GRAY_PAINTED_PLANKS("light_gray_painted_planks"),
    WHITE_PAINTED_PLANKS("white_painted_planks");


    private final String name;

    Baseboard(String name) {
        this.name = name;
    }

    @Override
    public String getSerializedName() {
        return name;
    }
}
