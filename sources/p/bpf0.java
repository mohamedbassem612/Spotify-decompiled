package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bpf0 implements h0r0 {
    public final qyj a;
    public final kly0 b;
    public final cbr0 c;

    public bpf0(qyj qyjVar, jly0 jly0Var) {
        this.a = qyjVar;
        this.b = jly0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{new bn70(yon1.G1("LYRICS_SHARE_SELECTOR", "lyrics/share-selector", 972, "lyrics"), nik1.S0, (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.c;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-1852811965, new mbf0(this, (byte) 4), true));
    }
}
