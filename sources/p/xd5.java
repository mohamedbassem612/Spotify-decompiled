package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xd5 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd5(float f, int i) {
        super(3);
        this.c = f;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        float f = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(1887186184);
                float fX0 = (1.0f - f) * ((wat) x340Var.k(t4k.h)).X0(32.0f);
                int iC = l1d.C(i);
                if (iC != 0) {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    fX0 = -fX0;
                }
                qim0 qim0VarD = i541.D(qim0Var, 0.0f, 0.0f, 0.0f, 0.0f, fX0, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1044463);
                x340Var.r(false);
                return qim0VarD;
            default:
                i2c i2cVar = (i2c) obj;
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (i > 0) {
                    x340 x340Var3 = x340Var2;
                    x340Var3.i0(193876341);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var3).b;
                    int iC2 = (int) ((i2cVar.c() + 4.0f) / 14.0f);
                    if (i > iC2) {
                        i = iC2;
                    }
                    if (i > 2) {
                        i = 2;
                    }
                    if (i > 0) {
                        x340Var3.i0(194142352);
                        String strO0 = cwl1.o0(x340Var3, 2131963930);
                        qim0 qim0VarB = uyn1.B(i2cVar.a(nim0.a, een.e), 0.0f, zjy.p(0.0f, new p3v(24.0f - ((((i - 1) * 4.0f) + (10.0f * i)) / 2.0f))).a, 0.0f, 0.0f, 13);
                        boolean zG = x340Var3.g(strO0);
                        Object objT = x340Var3.T();
                        if (zG || objT == fkj0.X) {
                            objT = new bek1(strO0, (byte) 14);
                            x340Var3.s0(objT);
                        }
                        qim0 qim0VarB2 = s161.b(qim0VarB, false, (iu30) objT);
                        mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.Q0, x340Var3, 0);
                        int iHashCode = Long.hashCode(x340Var3.T);
                        xos0 xos0VarM = x340Var3.m();
                        qim0 qim0VarE = zr7.E(x340Var3, qim0VarB2);
                        hzj.A.getClass();
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
                        nko1.H(mbhVarA, x340Var3, y580.O0);
                        nko1.H(xos0VarM, x340Var3, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                        nko1.F(x340Var3);
                        nko1.H(qim0VarE, x340Var3, y580.Y);
                        x340Var3.i0(-687603780);
                        for (int i2 = 0; i2 < i; i2++) {
                            y9g1.c(f, 0, x340Var3, (qim0) null);
                        }
                        us71.m(x340Var3, false, true, false);
                    } else {
                        x340Var3.i0(194908269);
                        x340Var3.r(false);
                    }
                    x340Var3.r(false);
                } else {
                    x340 x340Var4 = x340Var2;
                    x340Var4.i0(194914221);
                    x340Var4.r(false);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd5(int i, float f) {
        super(3);
        this.b = i;
        this.c = f;
    }
}
