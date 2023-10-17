package com.RAY.excraft.item;

import net.minecraft.world.item.Item;

// 空き缶
// 釣りをすると手に入る、ただの缶。
// 水や飲み物を入れることができるが、ポーションは入れられない。

/**
 * 空き缶クラス<br>
 * アイテム<br>
 * スタック数:16
 * @author RAY.
 */
public class ItemEmptyCan extends Item {
    public ItemEmptyCan() {
        super(new Properties()
                // スタック数
                .stacksTo(16)
        );
    }
}
