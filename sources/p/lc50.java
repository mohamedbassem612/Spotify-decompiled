package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lc50 implements h0r0 {
    public final yuj a;
    public final nc50 b;
    public final ic50 c;
    public final f0b0 d;
    public final sp00 e;
    public final cbr0 f;

    public lc50(yuj yujVar, nc50 nc50Var, ic50 ic50Var, f0b0 f0b0Var, sp00 sp00Var) {
        this.a = yujVar;
        this.b = nc50Var;
        this.c = ic50Var;
        this.d = f0b0Var;
        this.e = sp00Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{new bn70(yon1.N1(), cfm0.i("spotify:graduation:view-request:", nc50Var.a(), nik1.j4), (nar0) null), new yxe1(new jx21(hon1.i(nc50Var.b()))), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, bbp1.g(this.d.a(this.b.a())), apo.j(-1156187597, new wx00(this, (byte) 21), true), new n7e0(new kc50(this), new jb50(this, (byte) 2), qs10.e, r850.X));
    }
}
