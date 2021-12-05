package github.fmltutor.common.item.food;

import github.fmltutor.core.init.itemGroup.FmltutorGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FmltutorFood extends Item {
    private static final Food FOOD = (new Food.Builder())
            //饱腹度
            .saturation(5)
            //鸡腿值
            .hunger(10)
            //赋予药水效果
            .effect(() -> new EffectInstance(Effects.JUMP_BOOST, 3 * 20, 5), 0.50F)
            .build();

    public FmltutorFood() {
        super(new Properties().group(FmltutorGroup.FMLTUTOR_GROUP).food(FOOD));
    }
}
