package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uo50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo50(String str, qim0 qim0Var) {
        super(2);
        this.a = (byte) 8;
        this.b = str;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        float f;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        n4k n4kVar = hmb0.t1;
        String str = this.b;
        qim0 qim0Var = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                lrn1.k(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                l4p1.f(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                s9p1.h(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                y4o1.d(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 4:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarF = u291.f(dug.f(qim0Var, cbx.a(x340Var2).a.c, d4o1.a), 1.0f);
                    u85 u85Var = (erl1) x340Var2.k(szf0.b);
                    if (u85Var == null) {
                        x340Var2.i0(-241884180);
                        WeakHashMap weakHashMap = osl1.x;
                        u85Var = lhc.g(x340Var2).g;
                    } else {
                        x340Var2.i0(-241885792);
                    }
                    x340Var2.r(false);
                    qim0 qim0VarY = too1.y(qim0VarF, new bgc0(u85Var, 32));
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
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
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    if (p3v.b(qgc0.d(x340Var2), qgc0.a) < 0) {
                        x340Var2.i0(1160090428);
                        cvx cvxVar = cbx.b(x340Var2).b;
                        x340Var2.r(false);
                        f = 4.0f;
                    } else {
                        x340Var2.i0(1160091414);
                        x340Var2.r(false);
                        f = 0.0f;
                    }
                    lee1 lee1Var = cbx.d(x340Var2).j;
                    long j = cbx.a(x340Var2).b.a;
                    cjc0 cjc0Var = new cjc0(1);
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = xdc0.P0;
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarF2 = u291.f(s161.b(nim0Var, true, (iu30) objT), 1.0f);
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    cvx cvxVar4 = cbx.b(x340Var2).b;
                    uwo1.e(this.b, uyn1.A(qim0VarF2, 8.0f, 4.0f, 8.0f, f), lee1Var, j, new a0e1(3), null, 2, false, cjc0Var, 0, null, x340Var2, 0, 0, 1696);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                d0p1.d(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                dgd0.e(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                d3p1.j(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 8:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwo1.e(this.b, this.c, null, 0L, new a0e1(3), null, 2, false, new cjc0(2), 0, null, x340Var4, 0, 0, 1708);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                xto1.s(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                slk0.a(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                mp10.g(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                cbp1.d(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                dug.a(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                ows0.f(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                squ0.b(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                kkn.e(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                ijo1.i(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ijo1.j(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                ppo1.f(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                f2p1.b(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                y4o1.k(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                bwp0.c(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                rzn1.j(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                dro.i(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                qtg.e(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                up30.h(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                ujo1.h(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                myo1.n(czo1.p(1), str, (b0k) obj, qim0Var);
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM2 = x340Var6.m();
                    qim0 qim0VarE2 = zr7.E(x340Var6, qim0Var);
                    hzj.A.getClass();
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
                    nko1.H(gfh0VarC2, x340Var6, y580.O0);
                    nko1.H(xos0VarM2, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE2, x340Var6, y580.Y);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar5 = cbx.b(x340Var6).b;
                    uwo1.e(this.b, uyn1.x(nim0Var, 4.0f), cbx.d(x340Var6).k, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var6, 1572864, 0, 1720);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uo50(String str, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uo50(qim0 qim0Var, String str, byte b) {
        super(2);
        this.a = b;
        this.c = qim0Var;
        this.b = str;
    }
}
