package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qfg0 implements h0r0 {
    public final yuj a;
    public final sfg0 b;
    public final n2b0 c;
    public final hfg0 d;
    public final o3e0 e;

    public qfg0(yuj yujVar, sfg0 sfg0Var, n2b0 n2b0Var, hfg0 hfg0Var, o3e0 o3e0Var) {
        this.a = yujVar;
        this.b = sfg0Var;
        this.c = n2b0Var;
        this.d = hfg0Var;
        this.e = o3e0Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.j3(), this.b.a(), (nar0) null), new pu00(true), new t1r0(true), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[0], new oxa0(this, (lnm) null, (byte) 11)), apo.j(-259211967, new kmd0(this, (byte) 24), true), new n7e0(new pfg0(this), new mbf0(this, (byte) 18), sl10.Q0));
    }
}
