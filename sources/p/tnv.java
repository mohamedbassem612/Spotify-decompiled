package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tnv implements h0r0 {
    public final hvj a;
    public final vnv b;
    public final f1n0 c;
    public final ps7 d;
    public final kba e;
    public final cbr0 f;

    public tnv(hvj hvjVar, vnv vnvVar, f1n0 f1n0Var, ps7 ps7Var, kba kbaVar) {
        this.a = hvjVar;
        this.b = vnvVar;
        this.c = f1n0Var;
        this.d = ps7Var;
        this.e = kbaVar;
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{t1r0Var, s9h1Var, new bn70(yon1.n4(), nik1.J0, (nar0) null), new yxe1(new jx21(2131955175)), new hgr0(egr0.a, 0, 2)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b(this.a, f610.e(new p6e0[0], new pbg(this, (lnm) null, (byte) 14)), apo.j(367470921, new oat(this, (byte) 15), true));
    }
}
