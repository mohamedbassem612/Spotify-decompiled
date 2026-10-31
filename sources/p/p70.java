package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p70 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ lax c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ gbx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p70(String str, lax laxVar, iu30 iu30Var, gbx gbxVar) {
        super(3);
        this.b = str;
        this.c = laxVar;
        this.d = iu30Var;
        this.e = gbxVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        lax laxVar = this.c;
        String str = this.b;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                if (str == null || this.e == null) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(786871114);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(786538298);
                    gdx gdxVarS = yla.s(x340Var3);
                    max maxVarZ = mmo1.z(laxVar, x340Var3);
                    Object objT = x340Var3.T();
                    if (objT == fkj0.X) {
                        objT = ft.i;
                        x340Var3.s0(objT);
                    }
                    foo1.g(this.e, m0p1.q(s161.a(nim0Var, (iu30) objT), laxVar, iu30Var), maxVarZ, gdxVarS, (idn0) null, (vu30) null, (vu30) null, apo.r(-1808605487, new nl(str, (byte) 5), x340Var3), x340Var3, 12582912, 112);
                    x340Var3.r(false);
                }
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var4 = (b0k) obj2;
                boolean zG = x340Var4.g(str);
                Object objT2 = x340Var4.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new atp0(str, (byte) 9);
                    x340Var4.s0(objT2);
                }
                qim0 qim0VarA = s161.a(nim0Var, (iu30) objT2);
                Object objT3 = x340Var4.T();
                if (objT3 == m4cVar) {
                    objT3 = wvr0.b1;
                    x340Var4.s0(objT3);
                }
                qim0 qim0VarB = s161.b(qim0VarA, false, (iu30) objT3);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var4, qim0VarB);
                hzj.A.getClass();
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(hmb0.t1);
                } else {
                    x340Var4.v0();
                }
                nko1.H(gfh0VarC, x340Var4, y580.O0);
                nko1.H(xos0VarM, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE, x340Var4, y580.Y);
                jdx jdxVar = jdx.c;
                gdx gdxVarS2 = yla.s(x340Var4);
                max maxVarZ2 = mmo1.z(laxVar, x340Var4);
                qim0 qim0VarQ = m0p1.q(nim0Var, laxVar, iu30Var);
                gbx gbxVar = this.e;
                foo1.c(gbxVar, jdxVar, qim0VarQ, maxVarZ2, gdxVarS2, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(513843665, new mmg0(gbxVar, (byte) 2), x340Var4), x340Var4, 0, 48, 1992);
                x340Var4.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p70(String str, gbx gbxVar, lax laxVar, iu30 iu30Var) {
        super(3);
        this.b = str;
        this.e = gbxVar;
        this.c = laxVar;
        this.d = iu30Var;
    }
}
