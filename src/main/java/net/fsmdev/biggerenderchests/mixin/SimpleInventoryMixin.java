package net.fsmdev.biggerenderchests.mixin;

import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(SimpleInventory.class)
public interface SimpleInventoryMixin{
    @Accessor("size")
    @Mutable void setSize(int size);

    @Accessor("heldStacks")
    @Mutable void setStacks(DefaultedList<ItemStack> itemStacks);
}
