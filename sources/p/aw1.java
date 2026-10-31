package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aw1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aw1(byte b, boolean z) {
        super(3);
        this.a = b;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        String strK;
        ez00 ez00Var;
        prl prlVar;
        byte b = this.a;
        qim0 qim0VarH = nim0.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        boolean z2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    eth.a(Boolean.valueOf(z2), u291.r(qim0VarH, 24.0f), (ni20) null, "CurationCrossfade", p4i.b, x340Var2, 27648, 4);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                uwr uwrVar2 = cbx.a;
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                klx klxVar = z2 ? klx.c : tlx.c;
                x340 x340Var4 = x340Var3;
                if (z2) {
                    x340Var4.i0(-1091921002);
                    j = cbx.a(x340Var4).c.f;
                } else {
                    x340Var4.i0(-1091919723);
                    j = cbx.a(x340Var4).c.b;
                }
                x340Var4.r(false);
                long j2 = j;
                zov0 zov0Var2 = cbx.b(x340Var3).g;
                w0h1.a(klxVar, isl.a, u291.r(qim0VarH, 24.0f), j2, 0L, false, x340Var3, 56, 48);
                return rih1Var;
            case 2:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var5 = (b0k) obj2;
                x340Var5.i0(-1823247017);
                qim0 qim0VarK = d9y0.k(qim0Var, ((Number) z95.b(z2 ? 0.2f : 1.0f, irn1.o0(0, 0, null, 7), "alpha", (iu30) null, x340Var5, 3120, 20).getValue()).floatValue());
                x340Var5.r(false);
                return qim0VarK;
            case 3:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                suo1.f(cwl1.o0(b0kVar, z2 ? 2131957335 : 2131952154), 2, null, 3, b0kVar, 24624, 12);
                return rih1Var;
            case 4:
                ifh0 ifh0Var = (ifh0) obj;
                afh0 afh0Var = (afh0) obj2;
                long j3 = ((hjl) obj3).a;
                q5t0 q5t0VarH = afh0Var.H(jjl.b(0, hjl.d(j3) ? hjl.h(j3) : Integer.MAX_VALUE, 0, hjl.e(j3) ? hjl.i(j3) : Integer.MAX_VALUE, 5));
                return ifh0Var.S(q5t0VarH.b, q5t0VarH.a, b7x.a, new nk6(q5t0VarH, z2));
            case 5:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    zkt0 zkt0Var = z2 ? zkt0.a : zkt0.b;
                    uwr uwrVar3 = cbx.a;
                    zov0 zov0Var3 = cbx.b(x340Var7).g;
                    qim0 qim0VarR = u291.r(qim0VarH, 16.0f);
                    cvx cvxVar = cbx.b(x340Var7).b;
                    wkt0.a(zkt0Var, uyn1.B(qim0VarR, 0.0f, 2.0f, 0.0f, 0.0f, 13), (ksl) null, 0L, false, x340Var7, 0, 28);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj3).intValue();
                anm1.c(this.b, (iu30) null, (qim0) null, (max) null, (idn0) null, (b0k) obj2, 48, 28);
                return rih1Var;
            case 7:
                ((Number) obj3).intValue();
                x340 x340Var8 = (b0k) obj2;
                if (z2) {
                    x340Var8.i0(-1700828309);
                    xa4.d((qim0) null, x340Var8, 0);
                } else {
                    x340Var8.i0(-1186051766);
                }
                x340Var8.r(false);
                return rih1Var;
            case 8:
                qim0 qim0Var2 = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var9 = (b0k) obj2;
                x340Var9.i0(-72689401);
                ven0 ven0VarS = v8r.s(Boolean.valueOf(z2), x340Var9);
                boolean zG = x340Var9.g(ven0VarS);
                Object objT = x340Var9.T();
                if (zG || objT == fkj0.X) {
                    objT = new p6b(ven0VarS, (byte) 0);
                    x340Var9.s0(objT);
                }
                qim0 qim0VarB = f8d1.b(qim0Var2, rih1Var, (PointerInputEventHandler) objT);
                x340Var9.r(false);
                return qim0VarB;
            case 9:
                x340 x340Var10 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    uwr uwrVar4 = cbx.a;
                    zov0 zov0Var4 = cbx.b(x340Var11).g;
                    zov0 zov0Var5 = cbx.b(x340Var11).g;
                    ouo1.x(48.0f, 48.0f, 0, x340Var11, z2);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var12 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ouo1.x(64.0f, 8.0f, 54, x340Var13, z2);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var14 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ouo1.x(28.0f, 10.0f, 54, x340Var15, z2);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj3).intValue();
                x340 x340Var16 = (b0k) obj2;
                x340Var16.i0(1692918327);
                zfv zfvVarJ = rck.j((dhg1) obj, z2, CtaType.SEE_ALL_SHOWS_FIELD_NUMBER);
                x340Var16.r(false);
                return zfvVarJ;
            case 13:
                ((Number) obj3).intValue();
                x340 x340Var17 = (b0k) obj2;
                x340Var17.i0(1360115193);
                zfv zfvVarJ2 = rck.j((dhg1) obj, z2, CtaType.SEE_ALL_SHOWS_FIELD_NUMBER);
                x340Var17.r(false);
                return zfvVarJ2;
            case 14:
                ((Number) obj3).intValue();
                x340 x340Var18 = (b0k) obj2;
                x340Var18.i0(-826612368);
                zfv zfvVarJ3 = rck.j((dhg1) obj, z2, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
                x340Var18.r(false);
                return zfvVarJ3;
            case 15:
                ((Number) obj3).intValue();
                x340 x340Var19 = (b0k) obj2;
                x340Var19.i0(-72698335);
                zfv zfvVarJ4 = rck.j((dhg1) obj, z2, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
                x340Var19.r(false);
                return zfvVarJ4;
            case 16:
                ((Number) obj3).intValue();
                x340 x340Var20 = (b0k) obj2;
                x340Var20.i0(-693637531);
                zfv zfvVarJ5 = rck.j((dhg1) obj, z2, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
                x340Var20.r(false);
                return zfvVarJ5;
            case 17:
                ((Number) obj3).intValue();
                x340 x340Var21 = (b0k) obj2;
                x340Var21.i0(-1487969365);
                zfv zfvVarJ6 = rck.j((dhg1) obj, z2, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
                x340Var21.r(false);
                return zfvVarJ6;
            case 18:
                ((Number) obj3).intValue();
                x340 x340Var22 = (b0k) obj2;
                x340Var22.i0(-272887443);
                zfv zfvVarJ7 = rck.j((dhg1) obj, z2, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
                x340Var22.r(false);
                return zfvVarJ7;
            case 19:
                ((Number) obj3).intValue();
                x340 x340Var23 = (b0k) obj2;
                x340Var23.i0(89913468);
                zfv zfvVarJ8 = rck.j((dhg1) obj, z2, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
                x340Var23.r(false);
                return zfvVarJ8;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj3).intValue();
                x340 x340Var24 = (b0k) obj2;
                x340Var24.i0(780579465);
                zfv zfvVarJ9 = rck.j((dhg1) obj, z2, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
                x340Var24.r(false);
                return zfvVarJ9;
            case 21:
                ((Number) obj3).intValue();
                x340 x340Var25 = (b0k) obj2;
                x340Var25.i0(-2003755896);
                if (z2) {
                    x340Var25.i0(-1464065811);
                    qim0VarH = l6o1.H(qim0VarH, l6o1.C(0, 0, 1, x340Var25), false, 14);
                } else {
                    x340Var25.i0(-1464064464);
                }
                x340Var25.r(false);
                x340Var25.r(false);
                return qim0VarH;
            case 22:
                x340 x340Var26 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (z2) {
                    x340 x340Var27 = x340Var26;
                    x340Var27.i0(-434885696);
                    ilx ilxVar = ilx.c;
                    uwr uwrVar5 = cbx.a;
                    w0h1.a(ilxVar, isl.a, (qim0) null, cbx.a(x340Var27).b.c, 0L, false, x340Var27, ilx.d | 48, 52);
                    x340Var27.r(false);
                } else {
                    x340 x340Var28 = x340Var26;
                    x340Var28.i0(-434693124);
                    x340Var28.r(false);
                }
                return rih1Var;
            case 23:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                ilx ilxVar2 = ilx.c;
                uwr uwrVar6 = cbx.a;
                zov0 zov0Var6 = cbx.b(b0kVar2).g;
                w0h1.a(ilxVar2, isl.a, d9y0.k(u291.r(qim0VarH, 16.0f), z2 ? 1.0f : 0.0f), cbx.a(b0kVar2).b.f, 0L, false, b0kVar2, ilx.d | 48, 48);
                return rih1Var;
            case 24:
                x340 x340Var29 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    String strO0 = cwl1.o0(x340Var30, z2 ? 2131951872 : 2131955192);
                    uwr uwrVar7 = cbx.a;
                    uwo1.e(strO0, null, cbx.d(x340Var30).g, 0L, null, null, 0, false, null, 0, null, x340Var30, 0, 0, 2042);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 25:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                ilx ilxVar3 = ilx.c;
                uwr uwrVar8 = cbx.a;
                w0h1.a(ilxVar3, isl.a, d9y0.k(qim0VarH, z2 ? 1.0f : 0.0f), cbx.a(b0kVar3).c.c, 0L, false, b0kVar3, ilx.d | 48, 48);
                return rih1Var;
            case 26:
                x340 x340Var31 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    fq7.g(this.b, (qim0) null, xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, cmi.b, x340Var32, 200064, 18);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var33 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    gio1.h(0, x340Var34, null, z2);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var35 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarN = anm1.N("go-to-profile-subtitle-test-tag", qim0VarH);
                if (z2) {
                    x340 x340Var36 = x340Var35;
                    strK = x0d.k(x340Var36, 1378336603, 2131957405, x340Var36, false);
                } else {
                    x340 x340Var37 = x340Var35;
                    strK = x0d.k(x340Var37, 1378454620, 2131957404, x340Var37, false);
                }
                uwo1.e(strK, qim0VarN, null, 0L, null, null, 0, false, null, 0, null, x340Var35, 0, 0, 2044);
                return rih1Var;
            default:
                gy50 gy50Var = gy50.b;
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = (k1r) obj2;
                k1r k1rVar = (k1r) obj3;
                if (z2) {
                    i1r i1rVar3 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                    nrl nrlVar = (i1rVar3 == null || (prlVar = (prl) i1rVar3.a) == null) ? null : prlVar.a;
                    if (!u890.j(nrlVar, irl.a) && !(nrlVar instanceof lrl)) {
                        z = false;
                    }
                }
                i1r i1rVar4 = i1rVar instanceof i1r ? i1rVar : null;
                if (!u890.j(i1rVar4 != null ? (String) i1rVar4.a : null, "1") || !z) {
                    return gy50Var;
                }
                i1r i1rVar5 = k1rVar instanceof i1r ? (i1r) k1rVar : null;
                return (i1rVar5 == null || (ez00Var = (ez00) i1rVar5.a) == null) ? gy50Var : (hy50) aw50.d1.invoke(ez00Var);
        }
    }
}
