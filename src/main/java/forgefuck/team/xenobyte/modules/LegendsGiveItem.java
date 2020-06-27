package forgefuck.team.xenobyte.modules;

import cpw.mods.fml.common.Loader;
import forgefuck.team.xenobyte.api.module.Category;
import forgefuck.team.xenobyte.api.module.CheatModule;
import forgefuck.team.xenobyte.api.module.PerformMode;
import forgefuck.team.xenobyte.api.module.PerformSource;

public class LegendsGiveItem extends CheatModule {
    public LegendsGiveItem() {
        super("LegendsGiveItem", Category.MODS, PerformMode.SINGLE);
    }

    @Override
    public void onPerform(PerformSource src) {
        utils.sendPacket("legends", (byte) 15, utils.myId(), utils.worldId(), giveSelector().givedItem());
    }

    @Override
    public String moduleDesc() {
        return "Give an item to the player.";
    }

    @Override
    public boolean isWorking() {
        return Loader.isModLoaded("legends");
    }
}