package p;

import android.util.LruCache;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lp51 extends LruCache {
    @Override // android.util.LruCache
    public final Object create(Object obj) {
        return new mp51(new TreeMap(), 0);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        return ((mp51) obj2).b;
    }
}
