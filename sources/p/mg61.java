package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mg61 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mg61(j2i j2iVar, String str, String str2, long j, byte b) {
        super(3);
        this.a = b;
        this.b = j2iVar;
        this.c = str;
        this.d = str2;
        this.e = j;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n4k n4kVar = hmb0.t1;
        qim0 qim0VarB = nim0.a;
        String str = this.c;
        j2i j2iVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA = ew31.a(h36.e, een.N0, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                j2iVar.invoke(pw31.a, x340Var, 6);
                op71.g(x340Var, u291.v(qim0VarB, 8.0f));
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).j;
                cjc0 cjc0Var = new cjc0(1);
                if (str != null) {
                    x340Var3.i0(1137102781);
                    boolean zG = x340Var3.g(str);
                    Object objT = x340Var3.T();
                    if (zG || objT == fkj0.X) {
                        objT = new sc21(str, (byte) 29);
                        x340Var3.s0(objT);
                    }
                    qim0VarB = s161.b(qim0VarB, false, (iu30) objT);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(1137108108);
                    x340Var3.r(false);
                }
                uwo1.e(this.d, qim0VarB, lee1Var, this.e, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 0, 0, 1712);
                x340Var3.r(true);
                return rih1Var;
            default:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                era eraVar = een.Q0;
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var4).b;
                mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), eraVar, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarB);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA, x340Var4, y580.O0);
                nko1.H(xos0VarM2, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE2, x340Var4, y580.Y);
                j2iVar.invoke(pbh.a, x340Var4, 6);
                lee1 lee1Var2 = cbx.d(x340Var4).m;
                cjc0 cjc0Var2 = new cjc0(1);
                if (str != null) {
                    x340Var6.i0(1654806466);
                    boolean zG2 = x340Var6.g(str);
                    Object objT2 = x340Var6.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new pg61(str, (byte) 0);
                        x340Var6.s0(objT2);
                    }
                    qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(1654811793);
                    x340Var6.r(false);
                }
                uwo1.e(this.d, qim0VarB, lee1Var2, this.e, (a0e1) null, (iu30) null, 2, false, cjc0Var2, 0, (qx8) null, x340Var4, 0, 0, 1712);
                x340Var6.r(true);
                return rih1Var;
        }
    }
}
