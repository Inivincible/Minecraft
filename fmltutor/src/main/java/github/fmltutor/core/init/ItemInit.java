package github.fmltutor.core.init;

import github.fmltutor.Fmltutor;
import github.fmltutor.common.item.FmltutorItem;
import github.fmltutor.core.init.itemGroup.FmltutorGroup;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * MC物品注册
 * @author zz
 */
public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Fmltutor.MODID);
    public static final RegistryObject<Item> FMLTUTOR_ITEM = ITEMS.register("fmltutor_item",
            () -> new FmltutorItem(new Item.Properties().group(FmltutorGroup.FMLTUTOR_GROUP)));
}
