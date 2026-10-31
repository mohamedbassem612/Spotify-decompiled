package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class soj0 implements i4i1 {
    public final xdn0 a;

    public soj0() {
        xdn0 xdn0VarD = xdn0.d();
        xdn0VarD.r(i4i1.C0, new a2d());
        xdn0VarD.r(st70.K, 34);
        xdn0VarD.r(jrd1.s0, toj0.class);
        xdn0VarD.r(jrd1.r0, toj0.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.a = xdn0VarD;
    }

    public final qsk l() {
        return this.a;
    }

    @Override // p.i4i1
    public final k4i1 x() {
        return k4i1.f;
    }
}
