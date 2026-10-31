package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z3y extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3y(String str, byte b) {
        super(3);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        String str = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2046);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                boolean zY = x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18);
                j06 j06Var = x340Var4.a;
                if (!zY) {
                    x340Var4.b0();
                    return rih1Var;
                }
                fra fraVar = een.N0;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var4).a.b.a(), cqy.a);
                cvx cvxVar = cbx.b(x340Var4).b;
                cvx cvxVar2 = cbx.b(x340Var4).b;
                qim0 qim0VarY = uyn1.y(qim0VarF2, 12.0f, 12.0f);
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var4, 0);
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var4, qim0VarY);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(jw31VarA, x340Var4, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var4, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var4, lljVar3);
                nko1.F(x340Var4);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var4, lljVar4);
                esx esxVar = esx.c;
                long j = ((vex) zex.a.e).n;
                zov0 zov0Var = cbx.b(x340Var4).g;
                w0h1.a(esxVar, isl.a, u291.r(nim0Var, 16.0f), j, 0L, false, x340Var4, esx.d | 48, 48);
                cvx cvxVar3 = cbx.b(x340Var4).b;
                wnb0 wnb0VarK = c13.k(nim0Var, 16.0f, x340Var4, 1.0f, true);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var4.T);
                xos0 xos0VarM2 = x340Var4.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, wnb0VarK);
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(gfh0VarC, x340Var4, lljVar);
                nko1.H(xos0VarM2, x340Var4, lljVar2);
                x0d.q(iHashCode2, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE2, x340Var4, lljVar4);
                if (str.length() == 0) {
                    x340Var4.i0(1651720881);
                    uwo1.e(cwl1.o0(x340Var4, 2131955561), null, cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2034);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(1651943833);
                    x340Var4.r(false);
                }
                us71.k(iIntValue2 & 14, vu30Var, x340Var4, true, true);
                return rih1Var;
            case 2:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri.getClass();
                ltx ltxVar = ltx.c;
                eso1.e(uri, isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(ltxVar, ltxVar), false, false, b0kVar, 1073741872, 0, 3580);
                return rih1Var;
            case 3:
                nw31 nw31Var = (nw31) obj;
                ((Number) obj3).intValue();
                qim0 qim0VarR = u291.r(nim0Var, 12.0f);
                x340 x340Var5 = (b0k) obj2;
                Object objT = x340Var5.T();
                if (objT == fkj0.X) {
                    objT = xc10.Y0;
                    x340Var5.s0(objT);
                }
                c0p1.b(nw31Var.d(qim0VarR, (iu30) objT), x340Var5, 0);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var5).b;
                uwo1.e(this.b, nw31Var.c(nim0Var), ktd.l(nim0Var, 2.0f, x340Var5, x340Var5).j, cbx.a(x340Var5).c.c, null, null, 2, false, new zic0(1), 0, null, x340Var5, 0, 0, 1712);
                return rih1Var;
            case 4:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                uwo1.e(this.b, null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, null, null, 2, false, new zic0(1), 0, null, b0kVar2, 0, 0, 1714);
                return rih1Var;
            case 5:
                x340 x340Var6 = (b0k) obj2;
                ((Number) obj3).intValue();
                Uri uri2 = Uri.parse(str);
                jsl jslVar = new jsl(cwl1.o0(x340Var6, 2131955945));
                m4c m4cVar = fkj0.X;
                x340 x340Var7 = x340Var6;
                uvb0 uvb0Var = (crl1) x340Var7.k(t4k.u);
                boolean zG = x340Var7.g(uvb0Var);
                Object objT2 = x340Var7.T();
                if (zG || objT2 == m4cVar) {
                    yr80 yr80Var = new yr80(uvb0Var.a());
                    x340Var7.s0(yr80Var);
                    objT2 = yr80Var;
                }
                long j2 = ((yr80) objT2).a;
                wat watVar = (wat) x340Var7.k(t4k.h);
                boolean zF = x340Var7.f(j2) | x340Var7.g(watVar);
                Object objT3 = x340Var7.T();
                if (zF || objT3 == m4cVar) {
                    objT3 = d9y0.n(watVar.M0((int) (j2 >> 32)), watVar.M0((int) (j2 & 4294967295L))).a;
                    x340Var7.s0(objT3);
                }
                if (u890.j((ltl1) objT3, ltl1.d)) {
                    x340Var7.i0(-1873627862);
                    uwr uwrVar4 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var7).g;
                    x340Var7.r(false);
                    f = 88.0f;
                } else {
                    x340Var7.i0(-1873563382);
                    uwr uwrVar5 = cbx.a;
                    zov0 zov0Var3 = cbx.b(x340Var7).g;
                    x340Var7.r(false);
                    f = 64.0f;
                }
                p3v p3vVar = new p3v(f);
                h6m h6mVar = mif1.Q0;
                jmr0 jmr0VarN = i3o1.n(2131233069, x340Var6, 0);
                eso1.e(uri2, jslVar, (qim0) null, p3vVar, (zvx) null, (ecx) null, h6mVar, (tl3) null, (ColorFilter) null, new pux(jmr0VarN, jmr0VarN), false, false, x340Var6, 1073766400, 0, 3492);
                return rih1Var;
            case 6:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar6 = cbx.a;
                uwo1.e(this.b, null, cbx.d(b0kVar3).j, 0L, null, null, 0, false, null, 0, null, b0kVar3, 0, 0, 2042);
                return rih1Var;
            case 7:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar7 = cbx.a;
                uwo1.e(this.b, null, cbx.d(b0kVar4).j, cbx.a(b0kVar4).b.b, null, null, 0, false, null, 0, null, b0kVar4, 0, 0, 2034);
                return rih1Var;
            case 8:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                cjc0 cjc0Var = new cjc0(2);
                uwr uwrVar8 = cbx.a;
                uwo1.e(this.b, null, cbx.d(b0kVar5).g, 0L, null, null, 2, false, cjc0Var, 0, null, b0kVar5, 0, 0, 1722);
                return rih1Var;
            case 9:
                ((Number) obj3).intValue();
                uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            case 10:
                ((Number) obj3).intValue();
                uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    nyn1.c(str, x340Var9, 0);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar9 = cbx.a;
                uwo1.e(this.b, null, cbx.d(b0kVar6).e, cbx.a(b0kVar6).b.a, null, null, 0, false, null, 0, null, b0kVar6, 0, 0, 2034);
                return rih1Var;
            case 13:
                x340 x340Var10 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    uwr uwrVar10 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var11).n, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var11, 1572864, 0, 1722);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj3).intValue();
                uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            case 15:
                ((Number) obj3).intValue();
                uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            case 16:
                b0k b0kVar7 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar11 = cbx.a;
                uwo1.e(this.b, null, cbx.d(b0kVar7).j, cbx.a(b0kVar7).b.b, null, null, 0, false, null, 0, null, b0kVar7, 0, 0, 2034);
                return rih1Var;
            case 17:
                b0k b0kVar8 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar12 = cbx.a;
                uwo1.e(this.b, null, cbx.d(b0kVar8).h, 0L, null, null, 0, false, null, 0, null, b0kVar8, 0, 0, 2042);
                return rih1Var;
            case 18:
                b0k b0kVar9 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar13 = cbx.a;
                uwo1.e(this.b, u291.f(nim0Var, 1.0f), cbx.d(b0kVar9).h, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar9, 0, 0, 2024);
                return rih1Var;
            case 19:
                x340 x340Var12 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    uwr uwrVar14 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var13).j, 0L, null, null, 0, false, null, 0, null, x340Var13, 0, 0, 2042);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                b0k b0kVar10 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar15 = cbx.a;
                uwo1.e(this.b, null, cbx.d(b0kVar10).g, 0L, null, null, 2, false, new cjc0(1), 0, null, b0kVar10, 0, 0, 1722);
                return rih1Var;
            case 21:
                b0k b0kVar11 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.n0(2131957477, new Object[]{str}, b0kVar11), anm1.N("lp-title-text", nim0Var), null, 0L, null, null, 2, false, new zic0(2), 0, null, b0kVar11, 0, 0, 1724);
                return rih1Var;
            case 22:
                x340 x340Var14 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                gfh0 gfh0VarC2 = t1c.c(een.g, false);
                x340 x340Var15 = x340Var14;
                int iHashCode3 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM3 = x340Var15.m();
                qim0 qim0VarE3 = zr7.E(x340Var14, qim0VarF3);
                hzj.A.getClass();
                x340 x340Var16 = x340Var14;
                if (x340Var16.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                nko1.H(gfh0VarC2, x340Var14, y580.O0);
                nko1.H(xos0VarM3, x340Var14, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var14, y580.R0);
                nko1.F(x340Var14);
                nko1.H(qim0VarE3, x340Var14, y580.Y);
                uwr uwrVar16 = cbx.a;
                uwo1.e(this.b, null, cbx.d(x340Var14).e, cbx.a(x340Var14).b.a, null, null, 0, false, null, 0, null, x340Var14, 0, 0, 2034);
                x340Var16.r(true);
                return rih1Var;
            case 23:
                ((Number) obj3).intValue();
                uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            case 24:
                ((Number) obj3).intValue();
                uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            case 25:
                x340 x340Var17 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    Uri uri3 = Uri.parse(str);
                    box boxVar = box.c;
                    eso1.e(uri3, isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(boxVar, boxVar), false, false, x340Var18, 1073741872, 0, 3580);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var19 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    uwr uwrVar17 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var20).j, cbx.a(x340Var20).b.b, null, null, 2, false, new cjc0(2), 0, null, x340Var20, 1572864, 0, 1714);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var21 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    uwr uwrVar18 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var22).g, cbx.a(x340Var22).b.a, null, null, 2, false, new cjc0(2), 0, null, x340Var22, 1572864, 0, 1714);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var23 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    uwr uwrVar19 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var24).j, cbx.a(x340Var24).b.b, null, null, 0, false, null, 0, null, x340Var24, 0, 0, 2034);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            default:
                x340 x340Var25 = (b0k) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    uwr uwrVar20 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var26).g, 0L, null, null, 0, false, null, 0, null, x340Var26, 0, 0, 2042);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
        }
    }
}
