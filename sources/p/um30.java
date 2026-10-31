package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class um30 implements h0r0 {
    public final a8e0 a;
    public final String b;
    public final sm30 c;
    public final g1w d;
    public final cbr0 e;

    public um30(a8e0 a8e0Var, String str, sm30 sm30Var, g1w g1wVar) {
        this.a = a8e0Var;
        this.b = str;
        this.c = sm30Var;
        this.d = g1wVar;
        yxe1 yxe1Var = new yxe1(new jx21(2131963339));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.F1(), nik1.f60p.b(str), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return a8e0.b(this.a, bbp1.g(this.c.a(this.b).firstOrError()), new s20(this, (byte) 28));
    }
}
