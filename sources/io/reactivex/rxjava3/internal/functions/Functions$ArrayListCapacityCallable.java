package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.Supplier;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Functions$ArrayListCapacityCallable<T> implements Supplier<List<T>> {
    public final int a;

    public Functions$ArrayListCapacityCallable(int i) {
        this.a = i;
    }

    public final Object get() {
        return new ArrayList(this.a);
    }
}
