package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fkv {
    public final six0 a;
    public final cyu b;
    public final dv00 c;
    public rzq d;
    public rhg0 e;

    public fkv(six0 six0Var, cyu cyuVar, dv00 dv00Var) {
        this.a = six0Var;
        this.b = cyuVar;
        this.c = dv00Var;
    }

    public final void a() {
        rzq rzqVar = this.d;
        if (rzqVar != null) {
            rzqVar.l();
        }
        this.d = null;
    }

    public final rzq b() {
        rzq rzqVar = this.d;
        if (rzqVar != null) {
            return rzqVar;
        }
        j3r j3rVar = rzq.y;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        rzq rzqVarF = l2p1.f(new w1k(this.c, this.a.a(yon1.A3(), (4 & 2) == 0, (4 & 4) == 0), cyu.b(this.b)));
        this.e = crn1.k(rzqVarF);
        this.d = rzqVarF;
        return rzqVarF;
    }
}
