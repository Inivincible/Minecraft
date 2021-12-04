package github.fmltutor.core.init.itemGroup;

import github.fmltutor.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

/**
 * @author zz
 */
public class FmltutorGroup extends ItemGroup {
    public static final FmltutorGroup FMLTUTOR_GROUP = new FmltutorGroup();
    public FmltutorGroup() {
        super("fmltutor_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.FMLTUTOR_ITEM.get());
    }
}
