package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qll implements h0r0 {
    public final yuj a;
    public final nll b;
    public final q59 c;
    public final sll d;
    public final cbr0 e;

    public qll(yuj yujVar, nll nllVar, q59 q59Var, sll sllVar) {
        this.a = yujVar;
        this.b = nllVar;
        this.c = q59Var;
        this.d = sllVar;
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{t1r0Var, s9h1Var, yxe1Var, new bn70(yon1.U0(), nik1.g0.b(sllVar.getUri()), (nar0) null), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[0], new pbg(this, (lnm) null, (byte) 5)), apo.j(-652467771, new zee(this, (byte) 29), true), new n7e0(new pll(this), yzj.X0, new ypa((byte) 3, false)));
    }
}
