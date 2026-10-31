package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x6i0 implements h0r0 {
    public final hvj a;
    public final yqg b;
    public final lrp c;
    public final b7i0 d;
    public final gal e;
    public final n6i0 f;
    public final u3i0 g;
    public final bt4 h;
    public final cbr0 i;

    public x6i0(hvj hvjVar, yqg yqgVar, lrp lrpVar, b7i0 b7i0Var, iac0 iac0Var, gal galVar, n6i0 n6i0Var, u3i0 u3i0Var, e5b0 e5b0Var, bt4 bt4Var) {
        int i;
        this.a = hvjVar;
        this.b = yqgVar;
        this.c = lrpVar;
        this.d = b7i0Var;
        this.e = galVar;
        this.f = n6i0Var;
        this.g = u3i0Var;
        this.h = bt4Var;
        iac0Var.getLifecycle().a(new v6i0(this));
        q3i0 q3i0VarB = u3i0Var.b();
        if (q3i0VarB instanceof o3i0) {
            i = 2131958444;
        } else {
            if (!(q3i0VarB instanceof p3i0) && !(q3i0VarB instanceof n3i0)) {
                eg.o();
                throw null;
            }
            i = 2131958443;
        }
        yxe1 yxe1Var = new yxe1(new jx21(i));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.i = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.P2(), nik1.Y2, (nar0) null), new s9h1(14, true, false, false), e5b0Var}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.i;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(f4p1.g(this.f), apo.j(-49228781, new otf0(this, (byte) 18), true), bno1.l());
    }
}
