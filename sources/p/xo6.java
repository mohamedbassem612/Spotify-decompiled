package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xo6 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xo6(String str, String str2, byte b) {
        super(3);
        this.a = b;
        this.b = str;
        this.c = str2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0k b0kVar;
        x340 x340Var;
        long j;
        Uri uri;
        byte b = this.a;
        gex0 gex0Var = h36.a;
        h2c h2cVar = h2c.a;
        n4k n4kVar = hmb0.t1;
        String str = this.c;
        qim0 qim0VarB = nim0.a;
        String str2 = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                cso1.d(Uri.parse(str), new jsl(cwl1.n0(2131952457, new Object[]{str2}, b0kVar2)), anm1.N("artistImage", qim0VarB), null, null, null, null, b0kVar2, 0, 248);
                return rih1Var;
            case 1:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA = ew31.a(gex0Var, een.N0, b0kVar3, 0);
                x340 x340Var2 = (x340) b0kVar3;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(b0kVar3, qim0VarB);
                hzj.A.getClass();
                x340 x340Var3 = (x340) b0kVar3;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(jw31VarA, b0kVar3, y580.O0);
                nko1.H(xos0VarM, b0kVar3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                nko1.F(b0kVar3);
                nko1.H(qim0VarE, b0kVar3, y580.Y);
                isl islVar = isl.a;
                if (str2 != null) {
                    x340Var3.i0(-1534647579);
                    qim0 qim0VarN = anm1.N("artwork", qim0VarB);
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(b0kVar3).f;
                    qim0 qim0VarQ = i1p1.q(qim0VarN, er31.b(4.0f));
                    ni7 ni7VarA = oi7.a(Uri.parse(str2), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar3, 0, 0, 131070);
                    zov0 zov0Var = cbx.b(b0kVar3).g;
                    eso1.h(ni7VarA, islVar, qim0VarQ, new p3v(24.0f), (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, b0kVar3, 48, 432);
                    b0kVar = b0kVar3;
                    cvx cvxVar = cbx.b(b0kVar).b;
                    op71.g(b0kVar, u291.v(qim0VarB, 8.0f));
                    x340Var3.r(false);
                } else {
                    b0kVar = b0kVar3;
                    x340Var3.i0(-1534169001);
                    x340Var3.r(false);
                }
                qim0 qim0VarN2 = anm1.N("text", qim0VarB);
                uwr uwrVar2 = cbx.a;
                uwo1.e(this.c, qim0VarN2, cbx.d(b0kVar).k, cbx.a(b0kVar).b.a, null, null, 0, false, null, 0, null, b0kVar, 0, 0, 2032);
                op71.g(b0kVar, new wnb0(1.0f, true));
                plx plxVar = plx.c;
                long j2 = cbx.a(b0kVar).b.a;
                qim0 qim0VarN3 = anm1.N("chevron", qim0VarB);
                zov0 zov0Var2 = cbx.b(b0kVar).g;
                w0h1.a(plxVar, islVar, u291.m(qim0VarN3, 16.0f), j2, 0L, false, b0kVar, plx.d | 48, 48);
                x340Var3.r(true);
                return rih1Var;
            case 2:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA2 = ew31.a(gex0Var, een.N0, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarB);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
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
                nko1.H(jw31VarA2, x340Var4, y580.O0);
                nko1.H(xos0VarM2, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE2, x340Var4, y580.Y);
                as80 as80Var = mif1.P0;
                uwr uwrVar3 = cbx.a;
                cbx.a.getClass();
                ecx ecxVarA = uwr.a();
                Uri uri2 = Uri.parse(str2);
                fwx fwxVarG = hso1.G(ltx.c, 0L, 0L, x340Var4, ltx.d, 30);
                eso1.e(uri2, isl.a, (qim0) null, new p3v(24.0f), (zvx) null, ecxVarA, as80Var, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var4, 1073741872, 0, 3476);
                cvx cvxVar2 = cbx.b(x340Var4).b;
                op71.g(x340Var4, u291.v(qim0VarB, 4.0f));
                uwo1.e(this.c, null, cbx.d(x340Var4).j, 0L, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2042);
                x340Var6.r(true);
                return rih1Var;
            case 3:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.f(bro1.k(str2, str, b0kVar4), null, null, null, null, null, 0, false, null, 0, null, null, b0kVar4, 0, 0, 4094);
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj2;
                ((Number) obj3).intValue();
                isl islVar2 = isl.a;
                if (str2 != null) {
                    x340 x340Var8 = x340Var7;
                    x340Var8.i0(-375694701);
                    eso1.h(oi7.a(Uri.parse(str2), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var8, 0, 0, 131070), islVar2, anm1.N(str2, qim0VarB), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var8, 48, 504);
                    x340Var8.r(false);
                } else {
                    x340 x340Var9 = x340Var7;
                    x340Var9.i0(-375460651);
                    qim0 qim0VarD = u291.d(qim0VarB, 1.0f);
                    uwr uwrVar4 = cbx.a;
                    long jC = cbx.a(x340Var9).a.a.c();
                    cua cuaVar2 = cbx.b(x340Var9).f;
                    qim0 qim0VarF = dug.f(qim0VarD, jC, er31.b(4.0f));
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var9.T);
                    xos0 xos0VarM3 = x340Var9.m();
                    qim0 qim0VarE3 = zr7.E(x340Var9, qim0VarF);
                    hzj.A.getClass();
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
                    nko1.H(gfh0VarC, x340Var9, y580.O0);
                    nko1.H(xos0VarM3, x340Var9, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var9, y580.R0);
                    nko1.F(x340Var9);
                    nko1.H(qim0VarE3, x340Var9, y580.Y);
                    w0h1.a(wlx.c, islVar2, anm1.N(str, h2cVar.a(qim0VarB, een.h)), cbx.a(x340Var9).b.b, 0L, false, x340Var9, wlx.d | 48, 48);
                    x340Var9.r(true);
                    x340Var9.r(false);
                }
                return rih1Var;
            case 5:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                vu30 vu30Var = (vu30) obj;
                x340 x340Var10 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                gra graVar = een.d;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var10.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var11 = x340Var10;
                boolean zY = x340Var11.Y(iIntValue & 1, (iIntValue & 19) != 18);
                j06 j06Var = x340Var11.a;
                if (zY) {
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode4 = Long.hashCode(x340Var11.T);
                    xos0 xos0VarM4 = x340Var11.m();
                    qim0 qim0VarE4 = zr7.E(x340Var11, qim0VarB);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var11.m0();
                    if (x340Var11.S) {
                        x340Var11.l(n4kVar);
                    } else {
                        x340Var11.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var11, lljVar4);
                    nko1.H(xos0VarM4, x340Var11, lljVar3);
                    x0d.q(iHashCode4, x340Var11, lljVar2, x340Var11);
                    nko1.H(qim0VarE4, x340Var11, lljVar);
                    hw61 hw61VarB = er31.b(8.0f);
                    jw31 jw31VarA3 = ew31.a(new d36(12.0f, true, new um5(false)), een.Z, x340Var11, 0);
                    int iHashCode5 = Long.hashCode(x340Var11.T);
                    xos0 xos0VarM5 = x340Var11.m();
                    qim0 qim0VarE5 = zr7.E(x340Var11, qim0VarB);
                    x340Var11.m0();
                    if (x340Var11.S) {
                        x340Var11.l(n4kVar);
                    } else {
                        x340Var11.v0();
                    }
                    nko1.H(jw31VarA3, x340Var11, lljVar4);
                    nko1.H(xos0VarM5, x340Var11, lljVar3);
                    x0d.q(iHashCode5, x340Var11, lljVar2, x340Var11);
                    nko1.H(qim0VarE5, x340Var11, lljVar);
                    x340Var11.i0(1136558876);
                    int i = 0;
                    while (i < 4) {
                        qim0 qim0VarS = u291.s(qim0VarB, 52.0f, 60.0f);
                        uwr uwrVar5 = cbx.a;
                        x340 x340Var12 = x340Var11;
                        qim0 qim0VarF2 = dug.f(qim0VarS, cbx.a(x340Var11).a.a.b(), hw61VarB);
                        avw0 avw0Var = cbx.b(x340Var12).c;
                        if (str2 != null) {
                            x340Var = x340Var12;
                            x340Var.i0(1599246246);
                            j = cbx.a(x340Var).b.d;
                            x340Var.r(false);
                        } else {
                            x340Var = x340Var12;
                            x340Var.i0(1599330535);
                            j = cbx.a(x340Var).b.b;
                            x340Var.r(false);
                        }
                        qim0 qim0VarE6 = d1u.E(1.0f, j, qim0VarF2, hw61VarB);
                        gfh0 gfh0VarC3 = t1c.c(een.h, false);
                        int iHashCode6 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM6 = x340Var.m();
                        qim0 qim0VarE7 = zr7.E(x340Var, qim0VarE6);
                        hzj.A.getClass();
                        x340Var.m0();
                        hw61 hw61Var = hw61VarB;
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC3, x340Var, lljVar4);
                        nko1.H(xos0VarM6, x340Var, lljVar3);
                        x0d.q(iHashCode6, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE7, x340Var, lljVar);
                        Character chR0 = ihc1.r0(i, str);
                        if (chR0 == null) {
                            x340Var.i0(248765769);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(248765770);
                            uwo1.e(String.valueOf(chR0.charValue()), null, cbx.d(x340Var).d, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                            x340Var.r(false);
                        }
                        x340Var.r(true);
                        i++;
                        hw61VarB = hw61Var;
                        x340Var11 = x340Var;
                        qim0VarB = qim0VarB;
                    }
                    x340 x340Var13 = x340Var11;
                    x340Var13.r(false);
                    x340Var13.r(true);
                    qim0 qim0VarK = d9y0.k(h2cVar.b(qim0VarB), 0.0f);
                    gfh0 gfh0VarC4 = t1c.c(graVar, false);
                    int iHashCode7 = Long.hashCode(x340Var13.T);
                    xos0 xos0VarM7 = x340Var13.m();
                    qim0 qim0VarE8 = zr7.E(x340Var13, qim0VarK);
                    hzj.A.getClass();
                    x340Var13.m0();
                    if (x340Var13.S) {
                        x340Var13.l(n4kVar);
                    } else {
                        x340Var13.v0();
                    }
                    nko1.H(gfh0VarC4, x340Var13, lljVar4);
                    nko1.H(xos0VarM7, x340Var13, lljVar3);
                    x0d.q(iHashCode7, x340Var13, lljVar2, x340Var13);
                    nko1.H(qim0VarE8, x340Var13, lljVar);
                    us71.k(iIntValue & 14, vu30Var, x340Var13, true, true);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var14 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar6 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var14).b;
                jw31 jw31VarA4 = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var14, 0);
                x340 x340Var15 = x340Var14;
                int iHashCode8 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM8 = x340Var15.m();
                qim0 qim0VarE9 = zr7.E(x340Var14, qim0VarB);
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
                nko1.H(jw31VarA4, x340Var14, y580.O0);
                nko1.H(xos0VarM8, x340Var14, y580.N0);
                nko1.H(Integer.valueOf(iHashCode8), x340Var14, y580.R0);
                nko1.F(x340Var14);
                nko1.H(qim0VarE9, x340Var14, y580.Y);
                if (str2 != null) {
                    x340Var16.i0(1977605255);
                    Uri uri3 = Uri.parse(str2);
                    qim0 qim0VarQ2 = i1p1.q(qim0VarB, er31.a);
                    cbx.a.getClass();
                    ecx ecxVarA2 = uwr.a();
                    zov0 zov0Var3 = cbx.b(x340Var14).g;
                    nkx nkxVar = nkx.c;
                    eso1.e(uri3, isl.a, qim0VarQ2, new p3v(24.0f), (zvx) null, ecxVarA2, (j6m) null, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, x340Var14, 1073741872, 0, 3536);
                    x340Var16.r(false);
                } else {
                    x340Var16.i0(1977987082);
                    x340Var16.r(false);
                }
                uwo1.e(cwl1.n0(2131955923, new Object[]{str}, x340Var14), null, null, cbx.a(x340Var14).b.a, null, null, 0, false, null, 0, null, x340Var14, 0, 0, 2038);
                x340Var16.r(true);
                return rih1Var;
            case 7:
                ((Number) obj3).intValue();
                x340 x340Var17 = (b0k) obj2;
                x340Var17.i0(-817068426);
                qim0 qim0VarN4 = anm1.N("feed-activity-list-row-pretitle-test-tag", qim0VarB);
                if (str != null) {
                    x340Var17.i0(336416187);
                    boolean zG = x340Var17.g(str);
                    Object objT = x340Var17.T();
                    if (zG || objT == fkj0.X) {
                        objT = new kq00(str, (byte) 15);
                        x340Var17.s0(objT);
                    }
                    qim0VarN4 = s161.b(qim0VarN4, false, (iu30) objT);
                    x340Var17.r(false);
                } else {
                    x340Var17.i0(336502832);
                    x340Var17.r(false);
                }
                qim0 qim0Var = qim0VarN4;
                x340Var17.r(false);
                uwr uwrVar7 = cbx.a;
                uwo1.e(this.b, qim0Var, cbx.d(x340Var17).j, cbx.a(x340Var17).b.b, null, null, 2, false, new zic0(1), 0, null, x340Var17, 0, 0, 1712);
                return rih1Var;
            case 8:
                x340 x340Var18 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (str2 != null) {
                    x340 x340Var19 = x340Var18;
                    x340Var19.i0(-718591386);
                    boolean zG2 = x340Var19.g(str2);
                    Object objT2 = x340Var19.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new ry40(str2, (byte) 7);
                        x340Var19.s0(objT2);
                    }
                    qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                    x340Var19.r(false);
                } else {
                    x340 x340Var20 = x340Var18;
                    x340Var20.i0(-718498851);
                    x340Var20.r(false);
                }
                qim0 qim0Var2 = qim0VarB;
                uwr uwrVar8 = cbx.a;
                uwo1.e(this.c, qim0Var2, cbx.d(x340Var18).j, cbx.a(x340Var18).b.b, null, null, 2, false, new zic0(1), 0, null, x340Var18, 0, 0, 1712);
                return rih1Var;
            case 9:
                ((Number) obj3).intValue();
                c921.g(0, str2, str, (b0k) obj2, (qim0) null);
                return rih1Var;
            case 10:
                ((Number) obj3).intValue();
                x340 x340Var21 = (b0k) obj2;
                boolean zG3 = x340Var21.g(str2);
                Object objT3 = x340Var21.T();
                if (zG3 || objT3 == fkj0.X) {
                    if (str2 == null || (uri = Uri.parse(str2)) == null) {
                        uri = Uri.EMPTY;
                    }
                    objT3 = uri;
                    x340Var21.s0(objT3);
                }
                Uri uri4 = (Uri) objT3;
                uri4.getClass();
                bmq0.a(uri4, (qim0) null, hcx.c, (String) null, this.c, 0L, 0L, false, x340Var21, 384, 234);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar9 = cbx.a;
                uwo1.e(this.b, null, cbx.d(b0kVar5).j, cbx.a(b0kVar5).b.b, null, null, 2, false, new zic0(str != null ? 1 : 2), 0, null, b0kVar5, 0, 0, 1714);
                return rih1Var;
            case grn1.d /* 12 */:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.f(bro1.k(str2, str, b0kVar6), anm1.N("title-test-tag", qim0VarB), null, null, null, null, 0, false, null, 0, null, null, b0kVar6, 0, 0, 4092);
                return rih1Var;
            default:
                vu30 vu30Var2 = (vu30) obj;
                x340 x340Var22 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var22.i(vu30Var2) ? 4 : 2;
                }
                x340 x340Var23 = x340Var22;
                boolean zY2 = x340Var23.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18);
                j06 j06Var2 = x340Var23.a;
                if (zY2) {
                    mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var23, 0);
                    int iHashCode9 = Long.hashCode(x340Var23.T);
                    xos0 xos0VarM9 = x340Var23.m();
                    qim0 qim0VarE10 = zr7.E(x340Var23, qim0VarB);
                    hzj.A.getClass();
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var23.m0();
                    if (x340Var23.S) {
                        x340Var23.l(n4kVar);
                    } else {
                        x340Var23.v0();
                    }
                    llj lljVar5 = y580.O0;
                    nko1.H(mbhVarA, x340Var23, lljVar5);
                    llj lljVar6 = y580.N0;
                    nko1.H(xos0VarM9, x340Var23, lljVar6);
                    Integer numValueOf = Integer.valueOf(iHashCode9);
                    llj lljVar7 = y580.R0;
                    nko1.H(numValueOf, x340Var23, lljVar7);
                    nko1.F(x340Var23);
                    llj lljVar8 = y580.Y;
                    nko1.H(qim0VarE10, x340Var23, lljVar8);
                    gfh0 gfh0VarC5 = t1c.c(een.d, false);
                    int iHashCode10 = Long.hashCode(x340Var23.T);
                    xos0 xos0VarM10 = x340Var23.m();
                    qim0 qim0VarE11 = zr7.E(x340Var23, qim0VarB);
                    x340Var23.m0();
                    if (x340Var23.S) {
                        x340Var23.l(n4kVar);
                    } else {
                        x340Var23.v0();
                    }
                    nko1.H(gfh0VarC5, x340Var23, lljVar5);
                    nko1.H(xos0VarM10, x340Var23, lljVar6);
                    x0d.q(iHashCode10, x340Var23, lljVar7, x340Var23);
                    nko1.H(qim0VarE11, x340Var23, lljVar8);
                    if (str2.length() == 0) {
                        x340Var23.i0(2045679432);
                        uwr uwrVar10 = cbx.a;
                        uwo1.e(this.c, null, null, cbx.a(x340Var23).b.b, null, null, 0, false, null, 0, null, x340Var23, 0, 0, 2038);
                        x340Var23.r(false);
                    } else {
                        x340Var23.i0(2045770727);
                        x340Var23.r(false);
                    }
                    us71.k(iIntValue2 & 14, vu30Var2, x340Var23, true, true);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
        }
    }
}
