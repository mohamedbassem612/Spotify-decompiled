package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uud1 implements h0r0 {
    public final kly0 a;
    public final yuj b;
    public final std1 c;
    public final rud1 d;
    public final cbr0 e;

    public uud1(tsq tsqVar, yuj yujVar, std1 std1Var, rud1 rud1Var) {
        this.a = tsqVar;
        this.b = yujVar;
        this.c = std1Var;
        this.d = rud1Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131963105));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.w5(), nik1.R6, (nar0) null), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(f610.e(new p6e0[0], new l8t0(this, (lnm) null, (byte) 16)), apo.j(-721077141, new nsb1(this, (byte) 10), true), new n7e0(new tud1(this), ppd1.d, a4x0.R0), j1p1.y());
    }
}
