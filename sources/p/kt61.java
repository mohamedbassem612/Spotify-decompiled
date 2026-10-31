package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kt61 implements h0r0 {
    public final kly0 a;
    public final cbr0 b;

    public kt61(ipq ipqVar) {
        this.a = ipqVar;
        yxe1 yxe1Var = new yxe1(new jx21(2131962114));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) yon1.g5(), nik1.X0, (v8h1) z47.r()), new pu00(true), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.b;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return ((vt61) this.a.get()).d();
    }
}
