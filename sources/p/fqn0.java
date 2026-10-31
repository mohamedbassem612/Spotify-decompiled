package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fqn0 implements wqn0 {
    public static final fqn0 a = new fqn0();
    public static final String b;

    static {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        b = yon1.X2().c;
    }

    public final String a() {
        return b;
    }

    public final String getUri() {
        return "spotify:now-playing-view";
    }
}
