package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lqn0 implements wqn0 {
    public static final lqn0 a = new lqn0();
    public static final String b;

    static {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        b = yon1.G1("RECENTLYPLAYED", "recentlyplayed", 1630, "recentlyplayed").c;
    }

    public final String a() {
        return b;
    }

    public final String getUri() {
        return "spotify:recently-played";
    }
}
