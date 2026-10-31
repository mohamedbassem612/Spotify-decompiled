package p;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eg01 {
    public final WeakReference a;
    public final Map b;
    public final long c;

    public eg01(WeakReference weakReference, Map map, long j) {
        this.a = weakReference;
        this.b = map;
        this.c = j;
    }

    public final Map a() {
        return this.b;
    }

    public final WeakReference b() {
        return this.a;
    }

    public final long c() {
        return this.c;
    }
}
