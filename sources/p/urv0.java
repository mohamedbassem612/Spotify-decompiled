package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class urv0 implements h0r0 {
    public final bsv0 a;
    public final asv0 b;
    public final kyp c;
    public final rrv0 d;
    public final cbr0 e;

    public urv0(gx81 gx81Var, bsv0 bsv0Var, asv0 asv0Var, kyp kypVar, rrv0 rrv0Var) {
        this.a = bsv0Var;
        this.b = asv0Var;
        this.c = kypVar;
        this.d = rrv0Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131960272));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) yon1.f4(), nik1.b2, (v8h1) fbp1.q()), new t1r0(true), new fja(gvn0.d), new j0c0(mno1.W), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        this.d.f();
        return gx81.a(new srv0(this, (byte) 0), new dx81(new trv0(this), new srv0(this, (byte) 1), new lfb((byte) 20)));
    }
}
