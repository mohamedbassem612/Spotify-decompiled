package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kph1 implements h0r0 {
    public final yuj a;
    public final mph1 b;
    public final ptf1 c;
    public final yoh1 d;
    public final gza0 e;

    public kph1(yuj yujVar, mph1 mph1Var, ptf1 ptf1Var, yoh1 yoh1Var, gza0 gza0Var) {
        this.a = yujVar;
        this.b = mph1Var;
        this.c = ptf1Var;
        this.d = yoh1Var;
        this.e = gza0Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.r3(), this.b.getViewUri(), (nar0) null), new hgr0(egr0.a, 0, 2), new ktl1(32), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[0], new l8t0(this, (lnm) null, (byte) 20)), apo.j(-1093068466, new zyf1(this, (byte) 7), true), new n7e0(new jph1(this), new wcf1(this, (byte) 27), r6x0.V0));
    }
}
