package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dnp0 implements h0r0 {
    public final ix81 a;
    public final n59 b;
    public final cbr0 c;

    public dnp0(ix81 ix81Var, n59 n59Var) {
        this.a = ix81Var;
        this.b = n59Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{new bn70((n6r0) yon1.f4(), nik1.c2, (v8h1) fbp1.q()), new fja(gvn0.d), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(new cnp0(this, (byte) 0));
    }
}
