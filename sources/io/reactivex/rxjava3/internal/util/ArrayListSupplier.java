package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ArrayListSupplier implements Supplier<List<Object>>, Function<Object, List<Object>> {
    public static final ArrayListSupplier a;
    public static final /* synthetic */ ArrayListSupplier[] b;

    static {
        ArrayListSupplier arrayListSupplier = new ArrayListSupplier("INSTANCE", 0);
        a = arrayListSupplier;
        b = new ArrayListSupplier[]{arrayListSupplier};
    }

    public static ArrayListSupplier valueOf(String str) {
        return (ArrayListSupplier) Enum.valueOf(ArrayListSupplier.class, str);
    }

    public static ArrayListSupplier[] values() {
        return (ArrayListSupplier[]) b.clone();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        return new ArrayList();
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return new ArrayList();
    }
}
