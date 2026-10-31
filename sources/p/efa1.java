package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class efa1 implements h0r0 {
    public final qyj a;
    public final cbr0 b;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public efa1(qyj qyjVar) {
        this.a = qyjVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = new cbr0(new dbr0[]{new bn70(yon1.s5(), nik1.K6.b("spotify:internal:songdna:unavailable"), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.b;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(dkj.b);
    }
}
