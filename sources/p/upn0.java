package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class upn0 implements wqn0 {
    public static final upn0 a = new upn0();
    public static final String b;

    static {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        b = yon1.G1("BROWSE", "browse", 248, "browse").c;
    }

    public final String a() {
        return b;
    }

    public final String getUri() {
        return "spotify:browse";
    }
}
