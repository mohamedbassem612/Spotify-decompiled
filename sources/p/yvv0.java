package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yvv0 extends hab0 implements xu30 {
    public final /* synthetic */ hux a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvv0(hux huxVar, long j, String str, long j2, String str2) {
        super(3);
        this.a = huxVar;
        this.b = j;
        this.c = str;
        this.d = j2;
        this.e = str2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z = x340Var3.S;
        n4k n4kVar = hmb0.t1;
        if (z) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(jw31VarA, x340Var, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var, lljVar3);
        nko1.F(x340Var);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var, lljVar4);
        w0h1.a(this.a, isl.a, (qim0) null, this.b, 0L, false, x340Var, 56, 52);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        op71.g(x340Var, u291.v(nim0Var, 16.0f));
        wnb0 wnb0Var = new wnb0(1.0f, true);
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        int iHashCode2 = Long.hashCode(x340Var3.T);
        xos0 xos0VarM2 = x340Var3.m();
        qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, lljVar);
        nko1.H(xos0VarM2, x340Var, lljVar2);
        i3a.l(iHashCode2, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE2, x340Var, lljVar4);
        uwo1.e(this.c, (qim0) null, cbx.d(x340Var).g, this.d, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1714);
        uwo1.e(this.e, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
        x340Var3.r(true);
        x340Var3.r(true);
        return rih1.a;
    }
}
