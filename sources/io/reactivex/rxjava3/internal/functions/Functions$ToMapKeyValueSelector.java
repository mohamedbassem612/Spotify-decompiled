package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Functions$ToMapKeyValueSelector<K, V, T> implements BiConsumer<Map<K, V>, T> {
    public final Function a;
    public final Function b;

    public Functions$ToMapKeyValueSelector(Function function, Function function2) {
        this.a = function;
        this.b = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void accept(Object obj, Object obj2) {
        ((Map) obj).put(this.b.apply(obj2), this.a.apply(obj2));
    }
}
