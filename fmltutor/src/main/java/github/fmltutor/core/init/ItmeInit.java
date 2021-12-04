package github.fmltutor.core.init;

import github.fmltutor.Fmltutor;
import github.fmltutor.common.item.FmltutorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author zz
 */
public class ItmeInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Fmltutor.MODID);
    public static final RegistryObject<Item> FMLTUTOR_ITEM = ITEMS.register("fmltutor_item", ()->new FmltutorItem(new Item.Properties().group(ItemGroup.MISC)));
}
