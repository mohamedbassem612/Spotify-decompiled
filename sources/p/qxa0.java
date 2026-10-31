package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qxa0 implements h0r0 {
    public final lls0 a;
    public final hvj b;
    public final rmc1 c;
    public final kyj d;
    public final rvr0 e;
    public final haa0 f;
    public final qmc1 g;
    public final boolean h;

    public qxa0(lls0 lls0Var, hvj hvjVar, rmc1 rmc1Var, kyj kyjVar, rvr0 rvr0Var, haa0 haa0Var, qmc1 qmc1Var, boolean z) {
        this.a = lls0Var;
        this.b = hvjVar;
        this.c = rmc1Var;
        this.d = kyjVar;
        this.e = rvr0Var;
        this.f = haa0Var;
        this.g = qmc1Var;
        this.h = z;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.m2(), nik1.A3, (nar0) null), new t1r0(true), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        if (this.c.a() instanceof xxa0) {
            return this.d.a(apo.j(-561378714, new bt70(this, (byte) 17), true), new dx81(new pxa0(this), new hu90(this, (byte) 20), ak20.f, jqa0.X));
        }
        return this.b.a(f610.e(new p6e0[0], new oxa0(this, (lnm) null, (byte) 0)), apo.j(182592929, new yy80(this, (byte) 14), true), new xvj(oui.b, (j2i) null, (j2i) null, false, 62));
    }
}
