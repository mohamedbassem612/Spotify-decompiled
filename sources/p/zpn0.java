package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zpn0 implements wqn0 {
    public static final zpn0 a = new zpn0();
    public static final String b;

    static {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        b = yon1.G1("INTERACTIVEDJ", "interactivedj", 842, "interactivedj").c;
    }

    @Override // p.wqn0
    public final String a() {
        return b;
    }

    @Override // p.wqn0
    public final String getUri() {
        return "spotify:lexicon:your-dj";
    }
}
