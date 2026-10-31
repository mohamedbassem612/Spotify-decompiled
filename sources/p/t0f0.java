package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t0f0 implements h0r0 {
    public final y0f0 a;
    public final q0f0 b;
    public final yuj c;
    public final bza0 d;
    public final jqp e;
    public final kqp f;
    public final ksk0 g;
    public final w6e0 h;

    public t0f0(y0f0 y0f0Var, q0f0 q0f0Var, yuj yujVar, bza0 bza0Var, jqp jqpVar, kqp kqpVar, ksk0 ksk0Var, w6e0 w6e0Var) {
        this.a = y0f0Var;
        this.b = q0f0Var;
        this.c = yujVar;
        this.d = bza0Var;
        this.e = jqpVar;
        this.f = kqpVar;
        this.g = ksk0Var;
        this.h = w6e0Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new jx21(2131957697));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) yon1.n3(), this.a.getViewUri(), (v8h1) this.g), new t1r0(true), new s9h1(14, true, false, false), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.c, f610.e(new p6e0[0], new oxa0(this, (lnm) null, (byte) 9)), apo.j(-1970699275, new kmd0(this, (byte) 12), true), new n7e0(new s0f0(this), new s2c0(this, (byte) 29), rh20.Y, gje0.b1));
    }
}
