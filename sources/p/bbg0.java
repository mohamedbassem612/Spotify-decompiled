package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bbg0 implements h0r0 {
    public final hvj a;
    public final lzn0 b;
    public final gbg0 c;
    public final nwa d;
    public final e2b0 e;
    public final n2b0 f;
    public final mag0 g;
    public final ncg0 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final sb40 l;
    public final boolean m;

    public bbg0(hvj hvjVar, lzn0 lzn0Var, gbg0 gbg0Var, nwa nwaVar, e2b0 e2b0Var, n2b0 n2b0Var, mag0 mag0Var, ncg0 ncg0Var, boolean z, boolean z2, boolean z3, sb40 sb40Var, boolean z4) {
        this.a = hvjVar;
        this.b = lzn0Var;
        this.c = gbg0Var;
        this.d = nwaVar;
        this.e = e2b0Var;
        this.f = n2b0Var;
        this.g = mag0Var;
        this.h = ncg0Var;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = sb40Var;
        this.m = z4;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.i3(), this.c.b(), (nar0) null), new hgr0(egr0.a, 0, 2), new t1r0(true), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        boolean zY = cpn1.y(this.c.a(), this.i);
        hvj hvjVar = this.a;
        return zY ? hvjVar.a(f610.e(new p6e0[0], new yag0(this, (lnm) null, (byte) 1)), apo.j(2006167781, new zag0(this, (byte) 1), true), new xvj((xu30) null, apo.j(-309544581, new abg0(this, (byte) 1), true), (j2i) null, false, 61)) : hvjVar.a(f610.e(new p6e0[0], new yag0(this, (lnm) null, (byte) 0)), apo.j(-1174187520, new zag0(this, (byte) 0), true), new xvj((xu30) null, apo.j(584390330, new abg0(this, (byte) 0), true), (j2i) null, false, 61));
    }
}
