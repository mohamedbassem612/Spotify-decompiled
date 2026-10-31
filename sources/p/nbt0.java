package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nbt0 implements h0r0 {
    public final yuj a;
    public final kbt0 b;
    public final fv9 c;
    public final xfx d;
    public final pbt0 e;
    public final wpv0 f;
    public final cbr0 g;

    public nbt0(yuj yujVar, kbt0 kbt0Var, fv9 fv9Var, xfx xfxVar, pbt0 pbt0Var, wpv0 wpv0Var) {
        this.a = yujVar;
        this.b = kbt0Var;
        this.c = fv9Var;
        this.d = xfxVar;
        this.e = pbt0Var;
        this.f = wpv0Var;
        oh4 oh4Var = wpv0Var.b;
        yxe1 yxe1Var = new yxe1(oh4Var.t() ? new jx21(2131959781) : oh4Var.m() ? new jx21(2131959782) : new jx21(2131959793));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.y3(), nik1.W1, (nar0) null), new j0c0(mno1.V), new t1r0(true), new s9h1(14, oh4Var.q(), false, false), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[]{new p6e0()}, new l8t0(this, (lnm) null, (byte) 1)), apo.j(-1769866175, new x3o0(this, (byte) 25), true), new n7e0(new mbt0(this), cps0.Z0, new dgb((byte) 19)));
    }
}
