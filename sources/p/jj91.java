package p;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jj91 {
    public final AtomicInteger a = new AtomicInteger(0);
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final rig a(int i) {
        return (rig) this.b.get(Integer.valueOf(i));
    }
}
