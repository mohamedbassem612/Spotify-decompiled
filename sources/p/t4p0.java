package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t4p0 implements s4p0 {
    public final wnh1 a;
    public final wnh1 b;
    public final wnh1 c;
    public final mir0 d;
    public final wnh1 e;

    public t4p0(c2r0 c2r0Var) {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        uba ubaVarD = c2r0Var.d(yon1.X2(), nik1.p1.a());
        this.a = ubaVarD;
        this.b = ubaVarD;
        this.c = ubaVarD;
        this.d = new mir0(ubaVarD.a());
        this.e = ubaVarD;
    }

    public final mir0 c() {
        return this.d;
    }

    public final i8h1 d() {
        return this.a;
    }

    public final l6h1 e() {
        return this.b;
    }

    public final n7h1 f() {
        return this.c;
    }
}
