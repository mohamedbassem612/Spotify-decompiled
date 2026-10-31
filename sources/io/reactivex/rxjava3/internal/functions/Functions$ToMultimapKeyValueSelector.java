package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.Function;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Functions$ToMultimapKeyValueSelector<K, V, T> implements BiConsumer<Map<K, Collection<V>>, T> {
    public final Function a;
    public final Function b;
    public final Function c;

    public Functions$ToMultimapKeyValueSelector(Function function, Function function2, Function function3) {
        this.a = function;
        this.b = function2;
        this.c = function3;
    }

    public final void accept(Object obj, Object obj2) {
        Map map = (Map) obj;
        Object objApply = this.c.apply(obj2);
        Collection collection = (Collection) map.get(objApply);
        if (collection == null) {
            collection = (Collection) this.a.apply(objApply);
            map.put(objApply, collection);
        }
        collection.add(this.b.apply(obj2));
    }
}
