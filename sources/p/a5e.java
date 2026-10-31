package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a5e extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xpw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a5e(xpw xpwVar, byte b) {
        super(5);
        this.a = b;
        this.b = xpwVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws Throwable {
        qim0 qim0VarB;
        switch (this.a) {
            case 0:
                z4e z4eVar = (z4e) obj2;
                x340 x340Var = (b0k) obj4;
                ((Number) obj5).intValue();
                List list = z4eVar.a;
                int iC = l1d.C(z4eVar.b);
                nim0 nim0Var = nim0.a;
                Throwable th = null;
                if (iC == 0) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-370435612);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarT = l6o1.t(uyn1.z(16.0f, 0.0f, 2, qim0VarF), l6o1.C(0, 0, 1, x340Var2), 14);
                    x340Var2.r(false);
                    qim0VarB = qim0VarT;
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var, 2066258528, false);
                    }
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-370234887);
                    x340Var3.r(false);
                    qim0VarB = u291.B(nim0Var, (gra) null, 3);
                }
                qim0 qim0VarN = anm1.N("categories_element", qim0VarB);
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
                x340 x340Var4 = x340Var;
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
                hzj.A.getClass();
                x340 x340Var5 = x340Var;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(hmb0.t1);
                } else {
                    x340Var5.v0();
                }
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                x340Var5.i0(675815022);
                int i = 0;
                for (Object obj6 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        Throwable th2 = th;
                        p7h.T();
                        throw th2;
                    }
                    v8e v8eVar = (v8e) obj6;
                    o8e o8eVar = new o8e(z4eVar.c, v8eVar.a, v8eVar.b);
                    int i3 = i;
                    Throwable th3 = th;
                    otw.c(this.b, o8eVar, (qim0) null, (ipb1) null, x340Var, 0, 12);
                    if (i3 < list.size() - 1) {
                        x340Var5.i0(133922222);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar2 = cbx.b(x340Var).b;
                        op71.g(x340Var, u291.v(nim0Var, 6.0f));
                        x340Var5.r(false);
                    } else {
                        x340Var5.i0(134000063);
                        x340Var5.r(false);
                    }
                    th = th3;
                    i = i2;
                }
                x340Var5.r(false);
                x340Var5.r(true);
                return rih1.a;
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                rih1 rih1Var = rih1.a;
                if (zBooleanValue) {
                    otw.c(this.b, rih1Var, (qim0) null, (ipb1) null, b0kVar, 48, 12);
                }
                return rih1Var;
        }
    }
}
