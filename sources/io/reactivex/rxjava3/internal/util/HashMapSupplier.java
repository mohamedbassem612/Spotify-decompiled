package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Supplier;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class HashMapSupplier implements Supplier<Map<Object, Object>> {
    public static final HashMapSupplier a;
    public static final /* synthetic */ HashMapSupplier[] b;

    static {
        HashMapSupplier hashMapSupplier = new HashMapSupplier("INSTANCE", 0);
        a = hashMapSupplier;
        b = new HashMapSupplier[]{hashMapSupplier};
    }

    public static HashMapSupplier valueOf(String str) {
        return (HashMapSupplier) Enum.valueOf(HashMapSupplier.class, str);
    }

    public static HashMapSupplier[] values() {
        return (HashMapSupplier[]) b.clone();
    }

    public final Object get() {
        return new HashMap();
    }
}
