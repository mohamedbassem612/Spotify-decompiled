package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ja91 implements h0r0 {
    public final ix81 a;
    public final n59 b;
    public final cbr0 c;

    public ja91(ix81 ix81Var, n59 n59Var) {
        this.a = ix81Var;
        this.b = n59Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{new bn70(yon1.o5(), nik1.l5, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(new d781(this, (byte) 25));
    }
}
