package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pu2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu2(j2i j2iVar) {
        super(2);
        this.a = (byte) 27;
        this.b = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j2iVar.invoke(x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(0, (wux) null, apo.r(-1492553284, new pu2(j2iVar, false ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 3072, 7);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    apo.d(0, j2iVar, x340Var6);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                apo.d(czo1.p(1), j2iVar, (b0k) obj);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                fho1.f(czo1.p(7), j2iVar, (b0k) obj);
                return rih1Var;
            case 5:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    j2iVar.invoke(x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    j2iVar.invoke(x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                pto1.d(czo1.p(7), j2iVar, (b0k) obj);
                return rih1Var;
            case 8:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM = x340Var12.m();
                    qim0 qim0VarE = zr7.E(x340Var12, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(gfh0VarC, x340Var12, y580.O0);
                    nko1.H(xos0VarM, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE, x340Var12, y580.Y);
                    dv20.l(6, j2iVar, x340Var12, true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    j2iVar.invoke(x340Var14, 0);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                cuo1.g(czo1.p(7), j2iVar, (b0k) obj);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    j2iVar.invoke(x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    j2iVar.invoke(x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    j2iVar.invoke(x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    j2iVar.invoke(x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    j2iVar.invoke(x340Var24, 0);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    j2iVar.invoke(x340Var26, 6);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    j2iVar.invoke(x340Var28, 0);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    j2iVar.invoke(x340Var30, 0);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                h5p1.c(czo1.p(7), j2iVar, (b0k) obj);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                h5p1.c(czo1.p(7), j2iVar, (b0k) obj);
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                h5p1.c(czo1.p(7), j2iVar, (b0k) obj);
                return rih1Var;
            case 22:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    j2iVar.invoke(x340Var32, 0);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    j2iVar.invoke(x340Var34, 0);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    j2iVar.invoke(x340Var36, 0);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    j2iVar.invoke(x340Var38, 0);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                gfx.f(czo1.p(7), j2iVar, (b0k) obj);
                return rih1Var;
            case 27:
                x340 x340Var39 = (b0k) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var40.T);
                    xos0 xos0VarM2 = x340Var40.m();
                    qim0 qim0VarE2 = zr7.E(x340Var40, nim0Var);
                    hzj.A.getClass();
                    if (x340Var40.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var40.m0();
                    if (x340Var40.S) {
                        x340Var40.l(n4kVar);
                    } else {
                        x340Var40.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var40, y580.O0);
                    nko1.H(xos0VarM2, x340Var40, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var40, y580.R0);
                    nko1.F(x340Var40);
                    nko1.H(qim0VarE2, x340Var40, y580.Y);
                    dv20.l(0, j2iVar, x340Var40, true);
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var41 = (b0k) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var42 = x340Var41;
                if (x340Var42.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    j2iVar.invoke(x340Var42, 0);
                } else {
                    x340Var42.b0();
                }
                return rih1Var;
            default:
                x340 x340Var43 = (b0k) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                x340 x340Var44 = x340Var43;
                if (x340Var44.Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    j2iVar.invoke(x340Var44, 6);
                } else {
                    x340Var44.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pu2(j2i j2iVar, byte b) {
        super(2);
        this.a = b;
        this.b = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pu2(j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = j2iVar;
    }
}
