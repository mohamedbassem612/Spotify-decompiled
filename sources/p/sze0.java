package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sze0 implements h0r0 {
    public final c0f0 a;
    public final oze0 b;
    public final yuj c;
    public final bza0 d;
    public final jqp e;
    public final ksk0 f;
    public final w6e0 g;
    public final boolean h;

    public sze0(c0f0 c0f0Var, oze0 oze0Var, yuj yujVar, bza0 bza0Var, jqp jqpVar, ksk0 ksk0Var, w6e0 w6e0Var, boolean z) {
        this.a = c0f0Var;
        this.b = oze0Var;
        this.c = yujVar;
        this.d = bza0Var;
        this.e = jqpVar;
        this.f = ksk0Var;
        this.g = w6e0Var;
        this.h = z;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new jx21(2131957684));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) yon1.m3(), this.a.getViewUri(), (v8h1) this.f), new t1r0(true), new s9h1(14, true, false, false), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.c, f610.e(new p6e0[0], new oxa0(this, (lnm) null, (byte) 8)), apo.j(72003317, new kmd0(this, (byte) 11), true), new n7e0(new rze0(this), new s2c0(this, (byte) 28), ud20.Y, gje0.Z0));
    }
}
