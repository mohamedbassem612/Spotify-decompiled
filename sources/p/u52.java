package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u52 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nhb1 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u52(nhb1 nhb1Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = nhb1Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qti1 qti1Var = voo1.g;
        nim0 nim0Var = nim0.a;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarY = voo1.y(u291.f(nim0Var, 1.0f), qti1Var);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarA = uyn1.A(dug.f(qim0VarY, cbx.a(x340Var2).a.a.a(), er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12)), 16.0f, 12.0f, 16.0f, 16.0f);
                    mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
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
                    nhb1 nhb1Var = this.b;
                    if (nhb1Var.e) {
                        x340Var2.i0(1380521422);
                        d7e.g(0, 1, x340Var2, (qim0) null);
                        ywx0.n(nim0Var, 16.0f, x340Var2, false);
                    } else {
                        x340Var2.i0(1380597341);
                        x340Var2.r(false);
                    }
                    uwo1.e(nhb1Var.a, (qim0) null, cbx.d(x340Var2).e, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
                    op71.g(x340Var2, u291.r(nim0Var, 8.0f));
                    uwo1.e(nhb1Var.b, (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                    op71.g(x340Var2, u291.r(nim0Var, 24.0f));
                    String str = nhb1Var.d;
                    z50 z50Var = z50.c;
                    if (str == null) {
                        x340Var2.i0(1380932605);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1380932606);
                        boolean zG = x340Var2.g(iu30Var);
                        Object objT = x340Var2.T();
                        if (zG || objT == m4cVar) {
                            objT = new k52(iu30Var, (byte) 3);
                            x340Var2.s0(objT);
                        }
                        foo1.c(new gbx(z50Var, (Function0) objT), jdx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1753852936, new nl(str, (byte) 14), x340Var2), x340Var2, 0, 48, 2044);
                        ywx0.n(nim0Var, 16.0f, x340Var2, false);
                    }
                    boolean zG2 = x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new k52(iu30Var, (byte) 4);
                        x340Var2.s0(objT2);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT2), new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1345071140, new t52(nhb1Var, (byte) 0), x340Var2), x340Var2, 0, 48, 2044);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zG3 = x340Var4.g(iu30Var);
                    Object objT3 = x340Var4.T();
                    if (zG3 || objT3 == m4cVar2) {
                        objT3 = new pba1(iu30Var, (byte) 15);
                        x340Var4.s0(objT3);
                    }
                    Function0 function0 = (Function0) objT3;
                    boolean zG4 = x340Var4.g(iu30Var);
                    Object objT4 = x340Var4.T();
                    if (zG4 || objT4 == m4cVar2) {
                        objT4 = new pba1(iu30Var, (byte) 16);
                        x340Var4.s0(objT4);
                    }
                    ezn1.f(this.b, function0, (Function0) objT4, voo1.y(nim0Var, qti1Var), x340Var4, 8);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zG5 = x340Var6.g(iu30Var);
                    Object objT5 = x340Var6.T();
                    if (zG5 || objT5 == m4cVar3) {
                        objT5 = new wel1(iu30Var, (byte) 5);
                        x340Var6.s0(objT5);
                    }
                    Function0 function1 = (Function0) objT5;
                    boolean zG6 = x340Var6.g(iu30Var);
                    Object objT6 = x340Var6.T();
                    if (zG6 || objT6 == m4cVar3) {
                        objT6 = new wel1(iu30Var, (byte) 6);
                        x340Var6.s0(objT6);
                    }
                    up30.i(this.b, function1, (Function0) objT6, voo1.y(nim0Var, qti1Var), x340Var6, 8);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
