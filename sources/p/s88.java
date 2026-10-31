package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s88 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s88(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (x340Var.g(aqb0Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 147) != 146)) {
                    ija ijaVar = (ija) ((ArrayList) obj5).get(iIntValue);
                    x340Var2.i0(1988367490);
                    ouo1.a(ijaVar, anm1.N("BenefitsRow" + iIntValue, nim0Var), x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                gpb0 gpb0Var = (gpb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (x340Var3.g(gpb0Var) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    jf50 jf50Var = (jf50) ((ArrayList) obj5).get(iIntValue3);
                    x340Var4.i0(-1688663219);
                    if50.a(jf50Var, d7e.r(1.0f, u291.f(nim0Var, 1.0f), false), x340Var4, 0);
                    x340Var4.r(false);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (x340Var5.g(aqb0Var2) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var5.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i3 & 1, (i3 & 147) != 146)) {
                    String str = (String) ((h290) obj5).get(iIntValue5);
                    x340Var6.i0(1539267232);
                    d36 d36Var = new d36(8.0f, true, new um5(false));
                    qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 32.0f, 0.0f, 24.0f, 12.0f, 2);
                    jw31 jw31VarA = ew31.a(d36Var, een.Z, x340Var6, 0);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(hmb0.t1);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(jw31VarA, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    uwr uwrVar = cbx.a;
                    uwo1.e("•", (qim0) null, cbx.d(x340Var6).j, cbx.a(x340Var6).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 6, 0, 2034);
                    uwo1.e(str, anm1.N("ExplanationRow" + iIntValue5, nim0Var), cbx.d(x340Var6).j, cbx.a(x340Var6).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2032);
                    x340Var6.r(true);
                    x340Var6.r(false);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
