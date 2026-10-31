package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jws0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gxs0 b;
    public final /* synthetic */ qpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jws0(gxs0 gxs0Var, qpl qplVar, byte b) {
        super(2);
        this.a = b;
        this.b = gxs0Var;
        this.c = qplVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 21;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        qpl qplVar = this.c;
        gxs0 gxs0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    era eraVar = een.Q0;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarX = uyn1.x(nim0Var, 8.0f);
                    mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
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
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    cyo1.a(gxs0Var.d, null, 32.0f, 0.0f, apo.r(1039227588, new n1r0(qplVar, (byte) 21), x340Var2), x340Var2, 24576, 10);
                    String str = qplVar.b;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var2).k, 0L, new a0e1(3), null, 2, false, new cjc0(2), 0, null, x340Var2, 0, 0, 1704);
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
                    era eraVar2 = een.Q0;
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarB = uyn1.B(nim0Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    mbh mbhVarA2 = jbh.a(f36Var, eraVar2, x340Var4, 0);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(mbhVarA2, x340Var4, y580.O0);
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    cyo1.a(gxs0Var.d, uyn1.x(nim0Var2, 8.0f), 32.0f, 0.0f, apo.r(-637299654, new ukm0(qplVar, gxs0Var, b2), x340Var4), x340Var4, 24576, 8);
                    String str2 = qplVar.b;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str2, uyn1.z(8.0f, 0.0f, 2, u291.f(nim0Var2, 1.0f)), cbx.d(x340Var4).k, 0L, new a0e1(3), null, 2, false, new cjc0(2), 0, null, x340Var4, 0, 0, 1704);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
