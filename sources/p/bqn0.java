package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bqn0 implements wqn0 {
    public static final bqn0 a = new bqn0();
    public static final String b;

    static {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        b = yon1.G1("JAM_PARTICIPANTSETTINGSSHEET", "jam/participantsettingssheet", 866, "jam").c;
    }

    @Override // p.wqn0
    public final String a() {
        return b;
    }

    @Override // p.wqn0
    public final String getUri() {
        return "spotify:jam:settings";
    }
}
