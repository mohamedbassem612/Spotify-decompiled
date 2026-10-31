package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zw2 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw2(Object obj, boolean z, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:165:0x0558  */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        long j;
        long j2;
        boolean z;
        a7q0 a7q0Var;
        prl prlVar;
        String str;
        Object obj4;
        long j3;
        long j4;
        lee1 lee1Var;
        byte b = this.a;
        byte b2 = 5;
        n4k n4kVar = hmb0.t1;
        qim0 qim0VarB = nim0.a;
        j2i j2iVarR = null;
        rih1 rih1Var = rih1.a;
        boolean z2 = this.b;
        Object obj5 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                cqs0 cqs0Var = (cqs0) obj;
                int iIntValue = ((Number) obj3).intValue();
                qim0 qim0VarN = anm1.N("role", qim0VarB);
                x340 x340Var = (b0k) obj2;
                Object objT = x340Var.T();
                Object obj6 = objT;
                if (objT == fkj0.X) {
                    fw2 fw2Var = fw2.Y;
                    x340Var.s0(fw2Var);
                    obj6 = fw2Var;
                }
                qim0 qim0VarB2 = s161.b(qim0VarN, false, (iu30) obj6);
                uwr uwrVar = cbx.a;
                uwo1.d((af5) obj5, cbx.a(x340Var).b.b, qim0VarB2, cbx.d(x340Var).j, new a0e1(5), null, z2 ? 2 : 1, false, new cjc0(z2 ? 1 : Integer.MAX_VALUE), 0, null, cqs0Var, x340Var, 0, (iIntValue << 3) & 112, 1696);
                return rih1Var;
            case 1:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(-381597623);
                Object objT2 = x340Var2.T();
                m4c m4cVar = fkj0.X;
                Object objI = objT2;
                if (objT2 == m4cVar) {
                    objI = pzm.i(x340Var2);
                }
                lz20 lz20Var = (lz20) objI;
                Object obj7 = this.c;
                boolean zG = x340Var2.g(obj7);
                Object objT3 = x340Var2.T();
                Object obj8 = objT3;
                if (zG || objT3 == m4cVar) {
                    hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                    x340Var2.s0(hrr0VarQ);
                    obj8 = hrr0VarQ;
                }
                ven0 ven0Var = (ven0) obj8;
                qim0 qim0VarU = qxy0.u(vby0.p(qim0Var, lz20Var), (idn0) null, 3);
                boolean z3 = this.b;
                boolean zH = x340Var2.h(z3) | x340Var2.i(obj7) | x340Var2.g(ven0Var);
                Object objT4 = x340Var2.T();
                if (zH || objT4 == m4cVar) {
                    objT4 = new gh1(z3, obj7, ven0Var, lz20Var, (byte) 2);
                    x340Var2.s0(objT4);
                }
                qim0 qim0VarX = ern1.x(qim0VarU, (iu30) objT4);
                x340Var2.r(false);
                return qim0VarX;
            case 2:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = ((cia1) obj5).c;
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var2 = cbx.d(x340Var3).g;
                x340 x340Var4 = x340Var3;
                if (z2) {
                    x340Var4.i0(-389521459);
                    j = cbx.a(x340Var4).c.c;
                } else {
                    x340Var4.i0(-389520219);
                    j = cbx.a(x340Var4).b.a;
                }
                x340Var4.r(false);
                uwo1.e(str2, null, lee1Var2, j, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2034);
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    era eraVar = een.Q0;
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    lkb lkbVar = (lkb) obj5;
                    mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var6, 48);
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
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(mbhVarA, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    wkx wkxVar = wkx.c;
                    zov0 zov0Var = cbx.b(x340Var6).g;
                    qim0 qim0VarV = u291.v(qim0VarB, 24.0f);
                    zov0 zov0Var2 = cbx.b(x340Var6).g;
                    qim0 qim0VarN2 = anm1.N("bluetooth-icon", u291.h(qim0VarV, 24.0f));
                    boolean z4 = lkbVar.a;
                    w0h1.a(wkxVar, isl.a, qim0VarN2, lyg.t(z4, x340Var6), 0L, lkbVar.a, x340Var6, wkx.d | 48, 16);
                    uwo1.e((z4 || z2) ? x0d.k(x340Var6, -242898848, 2131957142, x340Var6, false) : x0d.k(x340Var6, -242897139, 2131957144, x340Var6, false), anm1.N("bluetooth-label", qim0VarB), cbx.d(x340Var6).m, lyg.t(z4, x340Var6), null, null, 2, false, new cjc0(1), 0, null, x340Var6, 1572912, 0, 1712);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (!z2) {
                    qim0VarB = f8d1.b(qim0VarB, rih1Var, mia.c);
                }
                j2i j2iVar = (j2i) obj5;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var8 = x340Var7;
                int iHashCode2 = Long.hashCode(x340Var8.T);
                xos0 xos0VarM2 = x340Var8.m();
                qim0 qim0VarE2 = zr7.E(x340Var7, qim0VarB);
                hzj.A.getClass();
                x340 x340Var9 = x340Var7;
                if (x340Var9.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar);
                } else {
                    x340Var9.v0();
                }
                nko1.H(gfh0VarC, x340Var7, y580.O0);
                nko1.H(xos0VarM2, x340Var7, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var7, y580.R0);
                nko1.F(x340Var7);
                nko1.H(qim0VarE2, x340Var7, y580.Y);
                j2iVar.invoke(x340Var7, 0);
                x340Var9.r(true);
                return rih1Var;
            case 5:
                x340 x340Var10 = (b0k) obj2;
                ((Number) obj3).intValue();
                hux huxVar = (hux) obj5;
                uwr uwrVar4 = cbx.a;
                zov0 zov0Var3 = cbx.b(x340Var10).g;
                qim0 qim0VarR = u291.r(qim0VarB, 24.0f);
                x340 x340Var11 = x340Var10;
                if (z2) {
                    x340Var11.i0(-917857909);
                    j2 = cbx.a(x340Var11).b.d;
                } else {
                    x340Var11.i0(-917856790);
                    j2 = cbx.a(x340Var11).b.b;
                }
                x340Var11.r(false);
                w0h1.a(huxVar, isl.a, qim0VarR, j2, 0L, false, x340Var10, 56, 48);
                return rih1Var;
            case 6:
                x340 x340Var12 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                igm igmVar = (igm) obj5;
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    if (z2) {
                        x340Var13.i0(561238945);
                        dro.e(0, igmVar.a, x340Var13, (qim0) null);
                    } else {
                        x340Var13.i0(561239900);
                        dro.p(0, igmVar.a, x340Var13, (qim0) null);
                    }
                    x340Var13.r(false);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 7:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                so10 so10Var = (so10) obj5;
                String str3 = so10Var.e;
                String str4 = so10Var.d;
                int i = z2 ? 3 : 1;
                long jQ = bro1.q(so10Var.f);
                String str5 = so10Var.i;
                uwr uwrVar5 = cbx.a;
                cua cuaVar = cbx.b(b0kVar).f;
                k1p1.a(str3, str4, i, null, jQ, false, new m1a(str5, er31.b(4.0f)), b0kVar, 2097152, 40);
                return rih1Var;
            case 8:
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = (k1r) obj2;
                i1r i1rVar3 = (k1r) obj3;
                if (z2) {
                    i1r i1rVar4 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                    nrl nrlVar = (i1rVar4 == null || (prlVar = (prl) i1rVar4.a) == null) ? null : prlVar.a;
                    if (u890.j(nrlVar, irl.a) || (nrlVar instanceof lrl)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                i1r i1rVar5 = i1rVar instanceof i1r ? i1rVar : null;
                if (!u890.j(i1rVar5 != null ? (String) i1rVar5.a : null, "1") || !z) {
                    return gy50.b;
                }
                i1r i1rVar6 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                if (i1rVar6 == null || (a7q0Var = (ez00) i1rVar6.a) == null) {
                    return (fy50) obj5;
                }
                y6q0 y6q0Var = a7q0Var.d;
                return new fy50(y6q0Var != null ? Double.valueOf(y6q0Var.a) : null, y6q0Var != null ? Long.valueOf(y6q0Var.b) : null, Boolean.valueOf(y6q0Var != null), 3);
            case 9:
                x340 x340Var14 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                cu70 cu70Var = (cu70) obj5;
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String str6 = cu70Var.b;
                    if (str6 == null || ihc1.y0(str6) || z2) {
                        x340Var15.i0(-1152606615);
                        x340Var15.r(false);
                    } else {
                        x340Var15.i0(-1152841285);
                        String str7 = cu70Var.b;
                        uwr uwrVar6 = cbx.a;
                        lee1 lee1Var3 = cbx.d(x340Var15).k;
                        long j5 = cbx.a(x340Var15).b.a;
                        bu70 bu70Var = cu70Var.h;
                        uwo1.e(str7, null, lee1Var3, j5, null, null, 2, false, new cjc0(bu70Var != null ? bu70Var.b : 1), 0, null, x340Var15, 1572864, 0, 1714);
                        x340Var15.r(false);
                    }
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var16 = (b0k) obj2;
                ((Number) obj3).intValue();
                y5a0 y5a0Var = (y5a0) obj5;
                if (z2) {
                    x340 x340Var17 = x340Var16;
                    x340Var17.i0(395197123);
                    y5a0Var.i(x340Var17, 0);
                    x340Var17.r(false);
                } else {
                    x340 x340Var18 = x340Var16;
                    x340Var18.i0(395243778);
                    y5a0Var.e(x340Var18, 0);
                    x340Var18.r(false);
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var19 = (b0k) obj2;
                ((Number) obj3).intValue();
                dab0 dab0Var = (dab0) obj5;
                if (!z2 || (str = dab0Var.b) == null || str.length() == 0) {
                    x340 x340Var20 = x340Var19;
                    x340Var20.i0(1038852181);
                    x340Var20.r(false);
                } else {
                    x340 x340Var21 = x340Var19;
                    x340Var21.i0(1038571321);
                    qim0 qim0VarN3 = anm1.N("labeled.switch.subtitle", qim0VarB);
                    String str8 = dab0Var.b;
                    uwr uwrVar7 = cbx.a;
                    uwo1.e(str8, qim0VarN3, cbx.d(x340Var21).j, 0L, null, null, 2, false, new zic0(1), 0, null, x340Var21, 0, 0, 1720);
                    x340Var21.r(false);
                }
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj3).intValue();
                jmb1 jmb1Var = (jmb1) obj5;
                pto1.n(jmb1Var.b.a, jmb1Var.f, z2, (b0k) obj2, 0);
                return rih1Var;
            case 13:
                qim0 qim0VarS = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var22 = (b0k) obj2;
                x340Var22.i0(1231464651);
                tob1 tob1VarB = z95.b(z2 ? 1.0f : 0.0f, irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, null, 6), "skeletonAlpha", (iu30) null, x340Var22, 3072, 20);
                if (((Number) tob1VarB.getValue()).floatValue() > 0.0f) {
                    x340Var22.i0(-1046987370);
                    long jK = f5p1.k(x340Var22, 2131103931);
                    qim0 qim0VarQ = i1p1.q(qim0VarS, (hw61) obj5);
                    boolean zF = x340Var22.f(jK) | x340Var22.i(tob1VarB);
                    Object objT5 = x340Var22.T();
                    if (zF || objT5 == fkj0.X) {
                        obj4 = objT5;
                        kuj kujVar = new kuj(jK, tob1VarB, (byte) 2);
                        x340Var22.s0(kujVar);
                        obj4 = kujVar;
                    }
                    obj4 = objT5;
                    qim0VarS = exd0.s(qim0VarQ, (iu30) obj4);
                    x340Var22.r(false);
                } else {
                    x340Var22.i0(-1046795511);
                    x340Var22.r(false);
                }
                x340Var22.r(false);
                return qim0VarS;
            case 14:
                x340 x340Var23 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    otw.c((u7j0) obj5, new t7j0(z2), (qim0) null, (ipb1) null, x340Var24, 0, 12);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var25 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    otw.c((lhd0) obj5, new khd0(z2), (qim0) null, (ipb1) null, x340Var26, 0, 12);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var27 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    otw.c((b0v0) obj5, new a0v0(z2), (qim0) null, (ipb1) null, x340Var28, 0, 12);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var29 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    k4m k4mVar = ((lfi0) obj5).j;
                    if (ufi0.a[k4mVar.ordinal()] == 1) {
                        x340Var30.i0(-1609433542);
                        x340Var30.r(false);
                    } else {
                        x340Var30.i0(-1609401611);
                        j2iVarR = apo.r(208359679, new r7e0(qim0VarB, z2, k4mVar, b2), x340Var30);
                        x340Var30.r(false);
                    }
                    if (j2iVarR == null) {
                        x340Var30.i0(401224930);
                    } else {
                        x340Var30.i0(-679793921);
                        j2iVarR.invoke(x340Var30, 0);
                    }
                    x340Var30.r(false);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var31 = (b0k) obj2;
                ((Number) obj3).intValue();
                l6p0 l6p0Var = (l6p0) obj5;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var31, 0);
                x340 x340Var32 = x340Var31;
                int iHashCode3 = Long.hashCode(x340Var32.T);
                xos0 xos0VarM3 = x340Var32.m();
                qim0 qim0VarE3 = zr7.E(x340Var31, qim0VarB);
                hzj.A.getClass();
                x340 x340Var33 = x340Var31;
                if (x340Var33.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var33.m0();
                if (x340Var33.S) {
                    x340Var33.l(n4kVar);
                } else {
                    x340Var33.v0();
                }
                nko1.H(jw31VarA, x340Var31, y580.O0);
                nko1.H(xos0VarM3, x340Var31, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var31, y580.R0);
                nko1.F(x340Var31);
                nko1.H(qim0VarE3, x340Var31, y580.Y);
                if (z2) {
                    x340Var33.i0(1640364802);
                    zkt0 zkt0Var = l6p0Var.e;
                    uwr uwrVar8 = cbx.a;
                    zov0 zov0Var4 = cbx.b(x340Var31).g;
                    wkt0.a(zkt0Var, u291.r(qim0VarB, 12.0f), (ksl) null, 0L, false, x340Var31, 0, 28);
                    cvx cvxVar2 = cbx.b(x340Var31).b;
                    op71.g(x340Var31, u291.v(qim0VarB, 6.0f));
                    x340Var33.r(false);
                } else {
                    x340Var33.i0(1640619467);
                    x340Var33.r(false);
                }
                String str9 = l6p0Var.b;
                cjc0 cjc0Var = new cjc0(1);
                if (z2) {
                    x340Var33.i0(1640809900);
                    uwr uwrVar9 = cbx.a;
                    j3 = cbx.a(x340Var31).b.c;
                    x340Var33.r(false);
                } else {
                    x340Var33.i0(1640878100);
                    uwr uwrVar10 = cbx.a;
                    j3 = cbx.a(x340Var31).b.a;
                    x340Var33.r(false);
                }
                uwo1.e(str9, null, null, j3, null, null, 2, false, cjc0Var, 0, null, x340Var31, 0, 0, 1718);
                x340Var33.r(true);
                return rih1Var;
            case 19:
                x340 x340Var34 = (b0k) obj2;
                ((Number) obj3).intValue();
                y6d1 y6d1Var = (y6d1) obj5;
                if (z2) {
                    x340 x340Var35 = x340Var34;
                    x340Var35.i0(1785265477);
                    zho1.w(0, x340Var35, null, y6d1Var.d);
                    x340Var35.r(false);
                } else {
                    x340 x340Var36 = x340Var34;
                    x340Var36.i0(1785342822);
                    zho1.k(0, x340Var36, null, y6d1Var.d);
                    x340Var36.r(false);
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var37 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarC = u291.c(qim0VarB, 1.0f);
                ws61 ws61Var = (ws61) obj5;
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                x340 x340Var38 = x340Var37;
                int iHashCode4 = Long.hashCode(x340Var38.T);
                xos0 xos0VarM4 = x340Var38.m();
                qim0 qim0VarE4 = zr7.E(x340Var37, qim0VarC);
                hzj.A.getClass();
                x340 x340Var39 = x340Var37;
                if (x340Var39.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var39.m0();
                if (x340Var39.S) {
                    x340Var39.l(n4kVar);
                } else {
                    x340Var39.v0();
                }
                nko1.H(gfh0VarC2, x340Var37, y580.O0);
                nko1.H(xos0VarM4, x340Var37, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var37, y580.R0);
                nko1.F(x340Var37);
                nko1.H(qim0VarE4, x340Var37, y580.Y);
                String strW = hso1.W(ws61Var, x340Var37);
                uwr uwrVar11 = cbx.a;
                lee1 lee1Var4 = cbx.d(x340Var37).j;
                if (z2) {
                    x340Var39.i0(1164463160);
                    j4 = cbx.a(x340Var37).b.b;
                } else {
                    x340Var39.i0(1164464344);
                    j4 = ((u7h) x340Var39.k(qgx.a)).a;
                }
                x340Var39.r(false);
                uwo1.e(strW, null, lee1Var4, j4, null, null, 0, false, null, 0, null, x340Var37, 0, 0, 2034);
                x340Var39.r(true);
                return rih1Var;
            default:
                x340 x340Var40 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                x340 x340Var41 = x340Var40;
                if (x340Var41.Y(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    otn0 otn0Var = (otn0) obj5;
                    if (z2) {
                        x340Var41.i0(-1824965830);
                        uwr uwrVar12 = cbx.a;
                        lee1Var = cbx.d(x340Var41).g;
                    } else {
                        x340Var41.i0(-1824964743);
                        uwr uwrVar13 = cbx.a;
                        lee1Var = cbx.d(x340Var41).j;
                    }
                    x340Var41.r(false);
                    otn0Var.b(lee1Var, (qim0) null, x340Var41, 0, 2);
                } else {
                    x340Var41.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw2(boolean z, Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.c = obj;
    }
}
