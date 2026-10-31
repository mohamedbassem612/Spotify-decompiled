package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vsg1 implements h0r0 {
    public final yuj a;
    public final tsg1 b;
    public final k4q0 c;
    public final u3q0 d;
    public final a4q0 e;
    public final htr f;
    public final cbr0 g;

    public vsg1(yuj yujVar, tsg1 tsg1Var, k4q0 k4q0Var, u3q0 u3q0Var, a4q0 a4q0Var, htr htrVar) {
        this.a = yujVar;
        this.b = tsg1Var;
        this.c = k4q0Var;
        this.d = u3q0Var;
        this.e = a4q0Var;
        this.f = htrVar;
        yxe1 yxe1Var = new yxe1(new jx21(2131963397));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.f3(), nik1.M5, (nar0) null), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[0], new e4b(this, (lnm) null, (byte) 4)), goj.a, new n7e0(new usg1(this), lbg1.X, mgx0.T0));
    }
}
