package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bi6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi6(float f, s6f1 s6f1Var, boolean z, iyd iydVar, tob1 tob1Var, float f2) {
        super(2);
        this.b = f;
        this.e = s6f1Var;
        this.c = z;
        this.f = iydVar;
        this.g = tob1Var;
        this.d = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj3;
                int iP = czo1.p(24585);
                fi6.b((zyq0) obj5, this.b, this.d, this.c, (Function0) obj4, qim0Var, (b0k) obj, iP);
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                byte b2 = 1;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = this.b;
                    nim0 nim0Var = nim0.a;
                    op71.g(x340Var2, u291.h(nim0Var, f));
                    s6f1 s6f1Var = (s6f1) obj5;
                    s6f1 s6f1Var2 = (s6f1Var == null || !this.c) ? null : s6f1Var;
                    if (s6f1Var2 == null) {
                        x340Var2.i0(2087647699);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(2087647700);
                        iyd iydVar = (iyd) obj4;
                        tob1 tob1Var = (tob1) obj3;
                        mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 48);
                        int iHashCode = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM = x340Var2.m();
                        qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
                        hzj.A.getClass();
                        if (x340Var2.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(hmb0.t1);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(mbhVarA, x340Var2, y580.O0);
                        nko1.H(xos0VarM, x340Var2, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                        nko1.F(x340Var2);
                        nko1.H(qim0VarE, x340Var2, y580.Y);
                        boolean zG = x340Var2.g(iydVar) | x340Var2.g(tob1Var);
                        Object objT = x340Var2.T();
                        if (zG || objT == m4cVar) {
                            objT = new cmd1(iydVar, tob1Var, (byte) 18);
                            x340Var2.s0(objT);
                        }
                        qim0 qim0VarC = i541.C(nim0Var, (iu30) objT);
                        boolean zG2 = x340Var2.g(iydVar);
                        Object objT2 = x340Var2.T();
                        if (zG2 || objT2 == m4cVar) {
                            objT2 = new j4f1(iydVar, b2);
                            x340Var2.s0(objT2);
                        }
                        bin.m(s6f1Var2, qim0VarC, (Function0) objT2, x340Var2, 0, 0);
                        op71.g(x340Var2, u291.h(nim0Var, this.d));
                        x340Var2.r(true);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi6(zyq0 zyq0Var, float f, float f2, boolean z, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.e = zyq0Var;
        this.b = f;
        this.d = f2;
        this.c = z;
        this.f = function0;
        this.g = qim0Var;
    }
}
