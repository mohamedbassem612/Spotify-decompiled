package p;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h9x implements AutoCloseable {
    public static final h9x a = new h9x();
    public static final AtomicInteger b = new AtomicInteger(0);

    @Override // java.lang.AutoCloseable
    public final void close() {
        b.set(0);
    }
}
