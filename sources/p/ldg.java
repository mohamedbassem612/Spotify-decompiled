package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ldg implements h0r0 {
    public final a8e0 a;
    public final cce b;
    public final cce c;
    public final cbr0 d;

    public ldg(mdg mdgVar, a8e0 a8e0Var, cce cceVar, cce cceVar2) {
        this.a = a8e0Var;
        this.b = cceVar;
        this.c = cceVar2;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.L3(), nik1.I.b(mdgVar.a()), (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(f610.e(new p6e0[0], new pbg(this, (lnm) null, (byte) 1)), new syf(this, (byte) 6), new u7r0(a4p1.n(), null, null, false, false, 126));
    }
}
