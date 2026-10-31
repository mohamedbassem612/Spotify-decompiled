package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class w2g {
    public static final nex a;
    public static final nex b;

    static {
        nex nexVar = new nex(8);
        a = nexVar;
        b = nexVar;
    }

    public static final qex a(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(2052523371);
        r3g r3gVar = (r3g) x340Var.k(t3g.a);
        ven0 ven0VarS = v8r.s(Boolean.valueOf(z), x340Var);
        if (r3gVar == null) {
            nex nexVar = z ? b : a;
            x340Var.r(false);
            return nexVar;
        }
        boolean zG = x340Var.g(r3gVar);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            long j = u7h.b;
            long j2 = u7h.f;
            g8y0 g8y0Var = new g8y0(ven0VarS, (byte) 15);
            objT = new oex(19, new tv51(g8y0Var, j2, j, (byte) 0), new tv51(g8y0Var, r3gVar.a, r3gVar.b, (byte) 1), (vu30) null, 8);
            x340Var.s0(objT);
        }
        qex qexVar = (qex) objT;
        x340Var.r(false);
        return qexVar;
    }

    public static final qex b(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        r3g r3gVar = (r3g) x340Var.k(t3g.a);
        boolean zG = x340Var.g(r3gVar);
        oex oexVar = b;
        boolean zG2 = zG | x340Var.g(oexVar);
        Object objT = x340Var.T();
        if (zG2 || objT == fkj0.X) {
            if (r3gVar != null) {
                oexVar = new oex(1, (vu30) null, new q9j0((byte) 22, r3gVar.a), (vu30) null, 10);
            }
            x340Var.s0(oexVar);
            objT = oexVar;
        }
        return (qex) objT;
    }
}
