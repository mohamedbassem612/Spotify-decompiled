package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ypn0 implements wqn0 {
    public static final ypn0 a = new ypn0();
    public static final String b;

    static {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        b = yon1.O1().c;
    }

    @Override // p.wqn0
    public final String a() {
        return b;
    }

    @Override // p.wqn0
    public final String getUri() {
        return "spotify:home";
    }
}
