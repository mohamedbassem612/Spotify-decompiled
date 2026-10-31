package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Functions$ToMapKeySelector<K, T> implements BiConsumer<Map<K, T>, T> {
    public final Function a;

    public Functions$ToMapKeySelector(Function function) {
        this.a = function;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void accept(Object obj, Object obj2) {
        ((Map) obj).put(this.a.apply(obj2), obj2);
    }
}
