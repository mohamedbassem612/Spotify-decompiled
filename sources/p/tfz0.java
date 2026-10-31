package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tfz0 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ r6v d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ ven0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfz0(float f, int i, String str, r6v r6vVar, iu30 iu30Var, ven0 ven0Var) {
        super(3);
        this.a = f;
        this.b = i;
        this.c = str;
        this.d = r6vVar;
        this.e = iu30Var;
        this.f = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        gra graVar = een.h;
        h2c h2cVar = h2c.a;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarD = u291.D(h2cVar.a(nim0Var, graVar), (era) null, 3);
        float f = this.a;
        qim0 qim0VarH = u291.h(qim0VarD, f);
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        Object objT = x340Var3.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = lcz0.i;
            x340Var3.s0(objT);
        }
        iu30 iu30Var = (iu30) objT;
        int i = this.b;
        boolean zE = x340Var3.e(l1d.C(i));
        String str = this.c;
        boolean zG = zE | x340Var3.g(str);
        Object objT2 = x340Var3.T();
        if (zG || objT2 == m4cVar) {
            objT2 = new rfz0(i, str, (byte) 0);
            x340Var3.s0(objT2);
        }
        dm5.a(iu30Var, (qim0) null, (iu30) objT2, x340Var, 6, 2);
        qim0 qim0VarR = u291.r(h2cVar.a(nim0Var, een.i), f + 12.0f);
        iu30 iu30Var2 = this.e;
        boolean zG2 = x340Var3.g(iu30Var2);
        Object objT3 = x340Var3.T();
        ven0 ven0Var = this.f;
        if (zG2 || objT3 == m4cVar) {
            objT3 = new sfz0(iu30Var2, ven0Var, null, (byte) 0);
            x340Var3.s0(objT3);
        }
        xu30 xu30Var = (xu30) objT3;
        boolean zG3 = x340Var3.g(iu30Var2);
        Object objT4 = x340Var3.T();
        if (zG3 || objT4 == m4cVar) {
            objT4 = new sfz0(iu30Var2, ven0Var, null, (byte) 1);
            x340Var3.s0(objT4);
        }
        t1c.a(k6v.b(qim0VarR, this.d, qqq0.a, false, null, false, xu30Var, (xu30) objT4, false, 156), x340Var, 0);
        x340Var3.r(true);
        return rih1.a;
    }
}
