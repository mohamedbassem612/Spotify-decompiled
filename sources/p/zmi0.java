package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zmi0 implements h0r0 {
    public final lo8 a;
    public final ge8 b;
    public final wpv0 c;
    public final w6e0 d;
    public final w6e0 e;
    public final cbr0 f;

    public zmi0(a8e0 a8e0Var, fad0 fad0Var, lo8 lo8Var, ge8 ge8Var, wpv0 wpv0Var) {
        this.a = lo8Var;
        this.b = ge8Var;
        this.c = wpv0Var;
        this.d = a8e0Var.a(bbp1.g(fad0Var.e()), new ymi0(this, (byte) 0), new u7r0(a4p1.v(new e491[]{z391.a, new xmi0()}), null, null, false, false, 126));
        this.e = a8e0.b(a8e0Var, bbp1.g(fad0Var.f()), new ymi0(this, (byte) 1));
        yxe1 yxe1Var = new yxe1(new jx21(2131958500));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.x3(), nik1.O1, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.c.b.z() ? this.e : this.d;
    }
}
