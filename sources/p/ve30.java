package p;

import com.google.common.collect.ForwardingMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ve30 extends ForwardingMap implements ConcurrentMap {
    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        return ((oog0) this).e.putIfAbsent(obj, obj2);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        return ((oog0) this).e.remove(obj, obj2);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public final Object replace(Object obj, Object obj2) {
        return ((oog0) this).e.replace(obj, obj2);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return ((oog0) this).e.replace(obj, obj2, obj3);
    }
}
