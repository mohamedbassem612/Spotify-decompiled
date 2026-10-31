package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r5e implements h0r0 {
    public final a8e0 a;
    public final zwa b;
    public final lo8 c;
    public final cbr0 d;

    public r5e(a8e0 a8e0Var, zwa zwaVar, lo8 lo8Var) {
        this.a = a8e0Var;
        this.b = zwaVar;
        this.c = lo8Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131959206));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.e5(), nik1.H2, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return a8e0.b(this.a, this.b.m(), new m4d(this, (byte) 9));
    }
}
