package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n1n0 implements p1r0 {
    public final f3t a;
    public final l1n0 b = new l1n0(this);

    public n1n0(r2r r2rVar) {
        this.a = new f3t(r2rVar);
    }

    @Override // p.p1r0
    public final Object a(Class cls) {
        if (!cls.equals(d0r.class)) {
            if (cls.equals(m1n0.class)) {
                return new m1n0(this);
            }
            if (!cls.equals(f3t.class)) {
                if (cls.equals(l1n0.class)) {
                    return this.b;
                }
                return null;
            }
        }
        return this.a;
    }

    @Override // p.p1r0
    public final void b(cbr0 cbr0Var) {
        rzq rzqVarI;
        f3t f3tVar = this.a;
        r2r r2rVar = f3tVar.a;
        if (f3tVar.b != null) {
            return;
        }
        List listP = i1o1.p(cbr0Var);
        List listT = i1o1.t(cbr0Var);
        i1o1.n(cbr0Var);
        List listM = i1o1.m(cbr0Var);
        q0r q0rVarF = k1o1.f(cbr0Var);
        ggh gghVar = new ggh(listP, listT, (iu30) null, listM, (byte) 18);
        String strR = i1o1.r(cbr0Var);
        dmh1 dmh1VarA = strR == null ? r2rVar.a("android-kodiak-datasourcebuilderimpl", gghVar) : r2rVar.a(strR, gghVar);
        if (q0rVarF == null) {
            j3r j3rVar = rzq.y;
            rzqVarI = l2p1.f(dmh1VarA);
        } else {
            j3r j3rVar2 = rzq.y;
            rzqVarI = l2p1.i(dmh1VarA, q0rVarF);
        }
        if (q0rVarF != null) {
            q0r q0rVar = q0rVarF;
            rzqVarI.a(q0rVar);
            f3tVar.c = q0rVar;
        }
        if (q0rVarF != null) {
            q0rVarF.r(rzqVarI);
        }
        f3tVar.b = new yfu(rzqVarI, r2rVar.e, false, (byte) 29);
    }

    @Override // p.p1r0
    public final void dispose() {
        yfu yfuVar;
        f3t f3tVar = this.a;
        q0r q0rVar = f3tVar.c;
        if (q0rVar != null && (yfuVar = f3tVar.b) != null) {
            ((rzq) yfuVar.c).h(q0rVar);
        }
        f3tVar.c = null;
        yfu yfuVar2 = f3tVar.b;
        if (yfuVar2 != null) {
            ((rzq) yfuVar2.c).l();
        }
    }
}
