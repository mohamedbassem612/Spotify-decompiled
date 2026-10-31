package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k850 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ p850 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ lc20 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k850(iu30 iu30Var, p850 p850Var, lc20 lc20Var) {
        super(2);
        this.c = iu30Var;
        this.b = p850Var;
        this.d = lc20Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lc20 lc20Var = this.d;
        iu30 iu30Var = this.c;
        p850 p850Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    era eraVar = een.P0;
                    qim0 qim0VarY = voo1.y(u291.f(nim0.a, 1.0f), voo1.b);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    qim0 qim0VarN = anm1.N("graduation_education_test_tag", uyn1.B(qim0VarY, 16.0f, 0.0f, 16.0f, 16.0f, 2));
                    mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
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
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new g850(iu30Var, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    q3p1.b(6, 0, (Function0) objT, x340Var2, true);
                    int iOrdinal = p850Var.a.ordinal();
                    if (iOrdinal == 0) {
                        x340Var2.i0(1096193184);
                        j9k1.a(x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw p3d1.k(x340Var2, 1096191142, false);
                        }
                        x340Var2.i0(1096195193);
                        j9k1.j(p850Var.b, x340Var2, 0);
                        x340Var2.r(false);
                    }
                    String str = p850Var.d;
                    boolean zI = x340Var2.i(lc20Var) | x340Var2.i(p850Var) | x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new i850(lc20Var, p850Var, iu30Var, (byte) 0);
                        x340Var2.s0(objT2);
                    }
                    j9k1.e(0, str, (Function0) objT2, x340Var2);
                    op71.g(x340Var2, new wnb0(1.0f, true));
                    String strO0 = cwl1.o0(x340Var2, 2131956366);
                    String strO1 = cwl1.o0(x340Var2, 2131956365);
                    boolean z = p850Var.e;
                    boolean z2 = p850Var.f;
                    boolean zI2 = x340Var2.i(lc20Var) | x340Var2.i(p850Var) | x340Var2.g(iu30Var);
                    Object objT3 = x340Var2.T();
                    if (zI2 || objT3 == m4cVar) {
                        objT3 = new i850(lc20Var, p850Var, iu30Var, (byte) 1);
                        x340Var2.s0(objT3);
                    }
                    Function0 function0 = (Function0) objT3;
                    boolean zI3 = x340Var2.i(lc20Var) | x340Var2.i(p850Var) | x340Var2.g(iu30Var);
                    Object objT4 = x340Var2.T();
                    if (zI3 || objT4 == m4cVar) {
                        objT4 = new i850(lc20Var, p850Var, iu30Var, (byte) 2);
                        x340Var2.s0(objT4);
                    }
                    t4n1.g(strO0, strO1, z, z2, function0, (Function0) objT4, (qim0) null, false, x340Var2, 0, 192);
                    b8w b8wVar = p850Var.g;
                    if (u890.j(b8wVar, y7w.a)) {
                        x340Var2.i0(-376547606);
                        boolean zI4 = x340Var2.i(lc20Var);
                        Object objT5 = x340Var2.T();
                        if (zI4 || objT5 == m4cVar) {
                            objT5 = new j850(lc20Var, null, (byte) 0);
                            x340Var2.s0(objT5);
                        }
                        qxd0.t(rih1Var, x340Var2, (vu30) objT5);
                        boolean zI5 = x340Var2.i(lc20Var) | x340Var2.g(iu30Var);
                        Object objT6 = x340Var2.T();
                        if (zI5 || objT6 == m4cVar) {
                            objT6 = new h850(lc20Var, iu30Var, (byte) 1);
                            x340Var2.s0(objT6);
                        }
                        Function0 function1 = (Function0) objT6;
                        boolean zI6 = x340Var2.i(lc20Var) | x340Var2.g(iu30Var);
                        Object objT7 = x340Var2.T();
                        if (zI6 || objT7 == m4cVar) {
                            objT7 = new h850(lc20Var, iu30Var, (byte) 2);
                            x340Var2.s0(objT7);
                        }
                        nmn1.c((String) null, (String) null, function1, (Function0) objT7, x340Var2, 0);
                        x340Var2.r(false);
                    } else if (u890.j(b8wVar, a8w.a)) {
                        x340Var2.i0(-376033750);
                        boolean zI7 = x340Var2.i(lc20Var);
                        Object objT8 = x340Var2.T();
                        if (zI7 || objT8 == m4cVar) {
                            objT8 = new j850(lc20Var, null, (byte) 1);
                            x340Var2.s0(objT8);
                        }
                        qxd0.t(rih1Var, x340Var2, (vu30) objT8);
                        boolean zI8 = x340Var2.i(lc20Var) | x340Var2.g(iu30Var);
                        Object objT9 = x340Var2.T();
                        if (zI8 || objT9 == m4cVar) {
                            objT9 = new h850(lc20Var, iu30Var, (byte) 3);
                            x340Var2.s0(objT9);
                        }
                        Function0 function2 = (Function0) objT9;
                        boolean zI9 = x340Var2.i(lc20Var) | x340Var2.g(iu30Var);
                        Object objT10 = x340Var2.T();
                        if (zI9 || objT10 == m4cVar) {
                            objT10 = new h850(lc20Var, iu30Var, (byte) 0);
                            x340Var2.s0(objT10);
                        }
                        nmn1.c((String) null, (String) null, function2, (Function0) objT10, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        if (!u890.j(b8wVar, z7w.a)) {
                            throw p3d1.k(x340Var2, 1096230049, false);
                        }
                        x340Var2.i0(-375552940);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ujo1.c(l6o1.C(0, 0, 1, x340Var4), t3k1.t(p850Var.a), apo.r(1874876162, new k850(iu30Var, p850Var, lc20Var), x340Var4), x340Var4, 384);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k850(p850 p850Var, iu30 iu30Var, lc20 lc20Var) {
        super(2);
        this.b = p850Var;
        this.c = iu30Var;
        this.d = lc20Var;
    }
}
