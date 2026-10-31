package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xb60 implements h0r0 {
    public final hvj a;
    public final zb60 b;
    public final hjp c;
    public final kjp d;
    public final pf60 e;
    public final of60 f;
    public final cbr0 g;

    public xb60(hvj hvjVar, zb60 zb60Var, hjp hjpVar, kjp kjpVar, pf60 pf60Var, of60 of60Var) {
        this.a = hvjVar;
        this.b = zb60Var;
        this.c = hjpVar;
        this.d = kjpVar;
        this.e = pf60Var;
        this.f = of60Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{new bn70(yon1.v2(), nik1.B4.b(v1p1.i(zb60Var.a())), new nar0(e9k.y()))}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b(this.a, f610.e(new p6e0[0], new pbg(this, (lnm) null, (byte) 26)), apo.j(2145846715, new gn50(this, (byte) 11), true));
    }
}
