package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pje extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pje(fb91 fb91Var, boolean z, long j) {
        super(3);
        this.a = (byte) 1;
        this.d = fb91Var;
        this.b = z;
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var;
        byte b = this.a;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                khe kheVar = (khe) obj4;
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var2, 0);
                x340 x340Var3 = x340Var2;
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
                hzj.A.getClass();
                x340 x340Var4 = x340Var2;
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
                nko1.H(jw31VarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                if (z) {
                    x340Var4.i0(2809644);
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    x340Var = x340Var4;
                    wkt0.a(zkt0.a, u291.r(nim0Var, 12.0f), (ksl) null, 0L, false, x340Var2, 6, 28);
                    x340Var.r(false);
                } else {
                    x340Var = x340Var4;
                    x340Var.i0(2978780);
                    x340Var.r(false);
                }
                uwo1.e(kheVar.b, new wnb0(1.0f, true), cbx.d(x340Var2).g, this.c, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1712);
                uwo1.e(kheVar.c, (qim0) null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                x340Var.r(true);
                return rih1Var;
            case 1:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lb91 lb91Var = lb91.a;
                    Object objT = x340Var6.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(x340Var6);
                    }
                    lb91Var.a((idn0) objT, (qim0) null, (fb91) obj4, this.b, this.c, x340Var6, 0, 2);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar2 = cbx.a;
                uwo1.e((String) obj4, (qim0) null, cbx.d(b0kVar).j, this.c, new a0e1(3), (iu30) null, z ? 2 : 1, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1698);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pje(boolean z, Object obj, long j, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.d = obj;
        this.c = j;
    }
}
