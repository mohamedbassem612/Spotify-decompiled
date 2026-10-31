package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vvf0 implements h0r0 {
    public final yuj a;
    public final qvf0 b;
    public final yvf0 c;
    public final svf0 d;

    public vvf0(yuj yujVar, qvf0 qvf0Var, yvf0 yvf0Var, svf0 svf0Var) {
        this.a = yujVar;
        this.b = qvf0Var;
        this.c = yvf0Var;
        this.d = svf0Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.E2(), this.c.getViewUri(), (nar0) null), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.j(rih1.a), apo.j(-1710362276, new kmd0(this, (byte) 18), true), new n7e0(new uvf0(this), new mbf0(this, (byte) 7), xi10.N0, dvf0.c));
    }
}
