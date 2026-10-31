package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nl extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl(String str, byte b) {
        super(2);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        goj0 goj0VarA;
        f7l1 f7l1Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        String strK = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var2).k, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2042);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(this.b, anm1.N("account-details-toggle-row-description", nim0Var), cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, new a0e1(5), null, 0, false, null, 0, null, x340Var4, 48, 0, 2016);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var6, 0, 0, 2046);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var8, 0, 0, 2030);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var10, 0, 0, 2046);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var12, 0, 0, 2046);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    eqr0.b(0, 2, strK, x340Var14, (qim0) null);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                hoj0 hoj0VarC = ((ioj0) obj2).c(f7l1.class, strK);
                sqe sqeVar = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (f7l1Var = (f7l1) goj0VarA.a) == null) ? null : f7l1Var.a;
                y6l1 y6l1Var = sqeVar instanceof y6l1 ? (y6l1) sqeVar : null;
                return new ka10(y6l1Var != null ? new b7e0("show_page:entity_explorer", y6l1Var) : c7e0.a, y6l1Var != null);
            case 8:
                ((Number) obj2).intValue();
                g9p1.l(strK, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj).intValue();
                return l1d.m(strK, ((pt1) obj2).a());
            case 10:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var16, 0, 0, 2046);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    w0h1.a(vjx.c, new jsl(strK), (qim0) null, 0L, 0L, false, x340Var18, vjx.d, 60);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var20).h, ((vex) zex.a.b).j, null, null, 0, false, null, 0, null, x340Var20, 0, 0, 2034);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var22).h, 0L, null, null, 0, false, null, 0, null, x340Var22, 0, 0, 2042);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var24, 0, 0, 2046);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var26, 0, 0, 2046);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var28, 0, 0, 2046);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    uwr uwrVar5 = cbx.a;
                    qim0 qim0VarZ = uyn1.z(cbx.b(x340Var30).b.a, 0.0f, 2, nim0Var);
                    jw31 jw31VarA = ew31.a(h36.e, een.N0, x340Var30, 0);
                    int iHashCode = Long.hashCode(x340Var30.T);
                    xos0 xos0VarM = x340Var30.m();
                    qim0 qim0VarE = zr7.E(x340Var30, qim0VarZ);
                    hzj.A.getClass();
                    if (x340Var30.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var30.m0();
                    if (x340Var30.S) {
                        x340Var30.l(n4kVar);
                    } else {
                        x340Var30.v0();
                    }
                    nko1.H(jw31VarA, x340Var30, y580.O0);
                    nko1.H(xos0VarM, x340Var30, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var30, y580.R0);
                    nko1.F(x340Var30);
                    nko1.H(qim0VarE, x340Var30, y580.Y);
                    if (strK == null) {
                        strK = x0d.k(x340Var30, 795387188, 2131952149, x340Var30, false);
                    } else {
                        x340Var30.i0(795386754);
                        x340Var30.r(false);
                    }
                    uwo1.e(strK, null, cbx.d(x340Var30).h, 0L, null, null, 0, false, null, 0, null, x340Var30, 0, 0, 2042);
                    x340Var30.r(true);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var32.T);
                    xos0 xos0VarM2 = x340Var32.m();
                    qim0 qim0VarE2 = zr7.E(x340Var32, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var32.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var32.m0();
                    if (x340Var32.S) {
                        x340Var32.l(n4kVar);
                    } else {
                        x340Var32.v0();
                    }
                    nko1.H(gfh0VarC, x340Var32, y580.O0);
                    nko1.H(xos0VarM2, x340Var32, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var32, y580.R0);
                    nko1.F(x340Var32);
                    nko1.H(qim0VarE2, x340Var32, y580.Y);
                    uwr uwrVar6 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var32).h, 0L, null, null, 0, false, null, 0, null, x340Var32, 0, 0, 2042);
                    x340Var32.r(true);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    int iHashCode3 = Long.hashCode(x340Var34.T);
                    xos0 xos0VarM3 = x340Var34.m();
                    qim0 qim0VarE3 = zr7.E(x340Var34, qim0VarF2);
                    hzj.A.getClass();
                    if (x340Var34.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var34.m0();
                    if (x340Var34.S) {
                        x340Var34.l(n4kVar);
                    } else {
                        x340Var34.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var34, y580.O0);
                    nko1.H(xos0VarM3, x340Var34, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var34, y580.R0);
                    nko1.F(x340Var34);
                    nko1.H(qim0VarE3, x340Var34, y580.Y);
                    uwr uwrVar7 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var34).h, 0L, null, null, 0, false, null, 0, null, x340Var34, 0, 0, 2042);
                    x340Var34.r(true);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                iko1.c(strK, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var36, 0, 0, 1726);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    uwr uwrVar8 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var38).h;
                    cjc0 cjc0Var = new cjc0(1);
                    Object objT = x340Var38.T();
                    if (objT == fkj0.X) {
                        objT = cv6.h;
                        x340Var38.s0(objT);
                    }
                    uwo1.e(this.b, s161.b(nim0Var, false, (iu30) objT), lee1Var, 0L, null, null, 2, false, cjc0Var, 0, null, x340Var38, 1572864, 0, 1720);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var39 = (b0k) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    cjc0 cjc0Var2 = new cjc0(1);
                    uwr uwrVar9 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var40).k, 0L, null, null, 2, false, cjc0Var2, 0, null, x340Var40, 0, 0, 1722);
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                pto1.j(strK, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 25:
                x340 x340Var41 = (b0k) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var42 = x340Var41;
                if (x340Var42.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var42, 0, 0, 1726);
                } else {
                    x340Var42.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                z8p1.j(strK, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                z8p1.j(strK, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                x340 x340Var43 = (b0k) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                x340 x340Var44 = x340Var43;
                if (x340Var44.Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    uwr uwrVar10 = cbx.a;
                    uwo1.e(this.b, u291.f(nim0Var, 1.0f), cbx.d(x340Var44).h, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var44, 0, 0, 2024);
                } else {
                    x340Var44.b0();
                }
                return rih1Var;
            default:
                x340 x340Var45 = (b0k) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                x340 x340Var46 = x340Var45;
                if (x340Var46.Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    uwr uwrVar11 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var46).j, 0L, null, null, 0, false, null, 0, null, x340Var46, 0, 0, 2042);
                } else {
                    x340Var46.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl(String str, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
    }
}
