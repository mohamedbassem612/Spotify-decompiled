package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b4 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(String str, String str2) {
        super(2);
        this.a = (byte) 0;
        this.b = str;
        this.c = str2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        qim0 qim0VarA = nim0.a;
        String str = this.b;
        String str2 = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var;
                }
                qim0 qim0VarH = l6o1.H(bmq0.L(qim0VarA, k1o1.q(x340Var2), (g6o0) null), l6o1.C(0, 0, 1, x340Var2), false, 14);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarH);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarP);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                qim0 qim0VarF = u291.f(qim0VarA, 1.0f);
                mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                uwo1.e(this.c, (qim0) null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                rqo1.g(0, 0, x340Var2, ab80.o(qim0VarA, 16.0f, x340Var2, qim0VarA, 1.0f));
                x340Var2.r(true);
                lee1 lee1Var = cbx.d(x340Var2).j;
                long j = cbx.a(x340Var2).b.b;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                uwo1.e(this.b, uyn1.z(16.0f, 0.0f, 2, qim0VarA), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
                cvx cvxVar4 = cbx.b(x340Var2).b;
                x0d.s(qim0VarA, 16.0f, x340Var2, true);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                j2p1.b(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                s3o1.c(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                iko1.b(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarF2 = u291.f(qim0VarA, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar5 = cbx.b(x340Var4).b;
                    mbh mbhVarA3 = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var4, 0);
                    int iHashCode3 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM3 = x340Var4.m();
                    qim0 qim0VarE3 = zr7.E(x340Var4, qim0VarF2);
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
                    nko1.H(mbhVarA3, x340Var4, y580.O0);
                    nko1.H(xos0VarM3, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE3, x340Var4, y580.Y);
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var4).k, cbx.a(x340Var4).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var4, 0, 0, 1714);
                    uwo1.e(this.c, (qim0) null, cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var4, 0, 0, 1714);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                zqo1.b(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (str2 != null) {
                        x340Var6.i0(1579053984);
                        Object objT = x340Var6.T();
                        if (objT == fkj0.X) {
                            objT = nzu.Y0;
                            x340Var6.s0(objT);
                        }
                        qim0VarA = s161.a(qim0VarA, (iu30) objT);
                    } else {
                        x340Var6.i0(1579054897);
                    }
                    x340Var6.r(false);
                    uwo1.e(this.b, qim0VarA, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2044);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                iko1.d(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                j541.g(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                cqy.d(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ey00.f(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                ey00.f(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                c680.m(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                oho1.i(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                rqo1.m(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ozn1.g(0, str, str2, x340Var8, (qim0) null);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                gio1.f(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                yxo1.d(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    yxo1.d(str, str2, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                a081.a(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                crm0.o(str, str2, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 21:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    yxo1.d(str, str2, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    mbh mbhVarA4 = jbh.a(f36Var, een.Q0, x340Var14, 0);
                    int iHashCode4 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM4 = x340Var14.m();
                    qim0 qim0VarE4 = zr7.E(x340Var14, qim0VarA);
                    hzj.A.getClass();
                    if (x340Var14.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(mbhVarA4, x340Var14, y580.O0);
                    nko1.H(xos0VarM4, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE4, x340Var14, y580.Y);
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var14).h, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var14, 0, 0, 1722);
                    uwo1.e(this.c, (qim0) null, cbx.d(x340Var14).m, cbx.a(x340Var14).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var14, 0, 0, 1714);
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                o6i1.a(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                o6i1.a(str, str2, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4(byte b, int i, String str, String str2) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4(String str, String str2, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
    }
}
