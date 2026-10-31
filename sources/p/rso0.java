package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rso0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sso0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rso0(sso0 sso0Var, byte b) {
        super(2);
        this.a = b;
        this.b = sso0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        sso0 sso0Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    d36 d36Var = new d36(cbx.b(x340Var2).b.a, true, new um5(false));
                    era eraVar = een.Q0;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarX = uyn1.x(u291.z(u291.d(nim0Var, 1.0f), een.N0, 2), dsa0.m(x340Var2, 2131166804));
                    mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
                    nko1.l(x340Var2, 0);
                    op71.g(x340Var2, u291.h(nim0Var, dsa0.m(x340Var2, 2131166178)));
                    nko1.q(x340Var2, 0);
                    nko1.m(x340Var2, 0);
                    boolean zI = x340Var2.i(sso0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new qso0(sso0Var, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    nko1.p((Function0) objT, x340Var2, 0);
                    boolean zI2 = x340Var2.i(sso0Var);
                    Object objT2 = x340Var2.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new qso0(sso0Var, (byte) 1);
                        x340Var2.s0(objT2);
                    }
                    nko1.n((Function0) objT2, x340Var2, 0);
                    op71.g(x340Var2, u291.h(nim0Var, dsa0.m(x340Var2, 2131166778)));
                    nko1.o(x340Var2, 0);
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
                    nyx.a(2, (wux) null, apo.r(105414912, new rso0(sso0Var, b2), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
