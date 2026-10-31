package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.concertcampaignview.v1.CtaType;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kf2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf2(x47 x47Var, boolean z) {
        super(2);
        this.a = (byte) 20;
        this.c = x47Var;
        this.b = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        String strU;
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        byte b = this.a;
        u5j1 u5j1Var = d4o1.a;
        n4k n4kVar = hmb0.t1;
        qim0 qim0VarF = nim0.a;
        rih1 rih1Var = rih1.a;
        boolean z6 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Integer num = (Integer) obj3;
                    if (z6) {
                        x340Var2.i0(1180335474);
                        if (num == null) {
                            z = false;
                            strU = x0d.k(x340Var2, -1901585853, 2131952063, x340Var2, false);
                        } else {
                            z = false;
                            if (num.intValue() == 0) {
                                strU = x0d.k(x340Var2, -1901580448, 2131952064, x340Var2, false);
                            } else {
                                x340Var2.i0(-1901574980);
                                strU = cwl1.U(2131820565, num.intValue(), new Object[]{num}, x340Var2);
                                x340Var2.r(false);
                            }
                        }
                        x340Var2.r(z);
                    } else {
                        x340Var2.i0(1180954079);
                        if (num == null) {
                            strU = x0d.k(x340Var2, -1901565851, 2131952062, x340Var2, false);
                        } else if (num.intValue() == 0) {
                            strU = x0d.k(x340Var2, -1901561406, 2131952066, x340Var2, false);
                        } else {
                            x340Var2.i0(-1901556885);
                            strU = cwl1.U(2131820564, num.intValue(), new Object[]{num}, x340Var2);
                            x340Var2.r(false);
                        }
                        x340Var2.r(false);
                    }
                    String str2 = strU;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str2, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2018);
                    if (z6) {
                        x340Var2.i0(1003940112);
                        uwo1.e(ydh.g(cbx.b(x340Var2).b.a, 2131952070, x340Var2, x340Var2, qim0VarF), null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2018);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1004264930);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                c380 c380Var = ((aa9) obj3).e;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (z6) {
                    x340Var4.i0(-1854504647);
                    uwr uwrVar2 = cbx.a;
                    long j2 = cbx.a(x340Var4).c.g;
                    ye5 ye5Var = new ye5();
                    ye5Var.g((String) c380Var.get(1));
                    try {
                        int iO = ye5Var.o(new zma1(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                        try {
                            ye5Var.g(" • ");
                            ye5Var.k(iO);
                        } catch (Throwable th) {
                            ye5Var.k(iO);
                            throw th;
                        }
                    } catch (NoSuchMethodError unused) {
                        ye5Var.g(" • ");
                    }
                    af5 af5VarP = ye5Var.p();
                    uwr uwrVar3 = cbx.a;
                    uwo1.f(af5VarP, null, cbx.d(x340Var4).g, null, null, null, 0, false, null, 0, null, null, x340Var4, 0, 0, 4090);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-1853945872);
                    String str3 = (String) c380Var.get(1);
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(str3, null, cbx.d(x340Var4).g, 0L, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2042);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                e9p1.e((vhd0) obj3, z6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ((rwj) obj3).g(z6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((txj) obj3).c(z6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    ann annVar = (ann) obj3;
                    if (!z6) {
                        annVar = null;
                    }
                    if (annVar == null) {
                        x340Var6.i0(-887462397);
                        z2 = false;
                        x340Var6.r(false);
                        str = null;
                    } else {
                        z2 = false;
                        x340Var6.i0(-887462396);
                        String strW = ldo.w(annVar.d, annVar.e, x340Var6);
                        x340Var6.r(false);
                        str = strW;
                    }
                    if (str == null) {
                        x340Var6.i0(-887394197);
                        x340Var6.r(z2);
                    } else {
                        x340Var6.i0(-887394196);
                        uwr uwrVar5 = cbx.a;
                        uwo1.e(str, null, cbx.d(x340Var6).m, cbx.a(x340Var6).b.b, null, null, 0, false, null, 0, null, x340Var6, 0, 0, 2034);
                        x340Var6.r(false);
                    }
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                kuo1.g(z6, (los) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                boolean zY = x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                j06 j06Var = x340Var8.a;
                if (zY) {
                    qim0 qim0VarB = u291.B(qim0VarF, (gra) null, 3);
                    gra graVar = een.h;
                    xn10 xn10Var = (xn10) obj3;
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM = x340Var8.m();
                    qim0 qim0VarE = zr7.E(x340Var8, qim0VarB);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var8, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var8, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var8, lljVar3);
                    nko1.F(x340Var8);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var8, lljVar4);
                    uwr uwrVar6 = cbx.a;
                    cua cuaVar = cbx.b(x340Var8).f;
                    qim0 qim0VarC = u291.c(u291.f(i1p1.q(qim0VarF, er31.b(8.0f)), 1.0f), 0.7f);
                    cbx.a.getClass();
                    ecx ecxVar = (ecx) uwr.j.getValue();
                    Uri uri = Uri.parse(xn10Var.d);
                    as80 as80Var = mif1.P0;
                    isl islVar = isl.a;
                    eso1.e(uri, islVar, qim0VarC, (p3v) null, (zvx) null, ecxVar, as80Var, (tl3) null, (ColorFilter) null, (qux) null, true, false, x340Var8, 48, 6, 2968);
                    if (z6) {
                        x340Var8.i0(-351912587);
                        qim0 qim0VarQ = i1p1.q(u291.B(qim0VarF, (gra) null, 3), er31.a);
                        zsc zscVar = zex.a;
                        qim0 qim0VarF2 = dug.f(qim0VarQ, ((vex) zscVar.b).b, u5j1Var);
                        cvx cvxVar = cbx.b(x340Var8).b;
                        qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
                        gfh0 gfh0VarC2 = t1c.c(graVar, false);
                        int iHashCode2 = Long.hashCode(x340Var8.T);
                        xos0 xos0VarM2 = x340Var8.m();
                        qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarX);
                        x340Var8.m0();
                        if (x340Var8.S) {
                            x340Var8.l(n4kVar);
                        } else {
                            x340Var8.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var8, lljVar);
                        nko1.H(xos0VarM2, x340Var8, lljVar2);
                        x0d.q(iHashCode2, x340Var8, lljVar3, x340Var8);
                        nko1.H(qim0VarE2, x340Var8, lljVar4);
                        zov0 zov0Var = cbx.b(x340Var8).g;
                        w0h1.a(xpx.c, islVar, u291.r(qim0VarF, 32.0f), ((vex) zscVar.b).a, 0L, false, x340Var8, xpx.d | 48, 48);
                        z3 = true;
                        x340Var8.r(true);
                        x340Var8.r(false);
                    } else {
                        z3 = true;
                        x340Var8.i0(-351312923);
                        x340Var8.r(false);
                    }
                    x340Var8.r(z3);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x340Var10.b0();
                } else if (z6) {
                    x340Var10.i0(733816504);
                    xto1.e(null, 1, 0L, 0L, x340Var10, 48, 13);
                    x340Var10.r(false);
                } else {
                    x340Var10.i0(733909783);
                    w0h1.a(qpx.c, new jsl(((Context) obj3).getString(2131963099)), (qim0) null, 0L, 0L, false, x340Var10, qpx.d, 60);
                    x340Var10.r(false);
                }
                return rih1Var;
            case 9:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    fra fraVar = een.N0;
                    if (!z6) {
                        qim0VarF = u291.f(qim0VarF, 1.0f);
                    }
                    s950 s950Var = (s950) obj3;
                    jw31 jw31VarA = ew31.a(h36.e, fraVar, x340Var12, 0);
                    int iHashCode3 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM3 = x340Var12.m();
                    qim0 qim0VarE3 = zr7.E(x340Var12, qim0VarF);
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
                    nko1.H(jw31VarA, x340Var12, y580.O0);
                    nko1.H(xos0VarM3, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE3, x340Var12, y580.Y);
                    t4n1.f(0, x340Var12, (qim0) null, s950Var.b);
                    String strO0 = cwl1.o0(x340Var12, 2131956396);
                    uwr uwrVar7 = cbx.a;
                    uwo1.e(strO0, null, cbx.d(x340Var12).h, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var12, 0, 0, 2026);
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    gra graVar2 = een.h;
                    boolean zH = x340Var14.h(z6);
                    Object objT = x340Var14.T();
                    if (zH || objT == fkj0.X) {
                        objT = new mj10((byte) 7, z6);
                        x340Var14.s0(objT);
                    }
                    qim0 qim0VarR = u291.r(s161.b(qim0VarF, false, (iu30) objT), 24.0f);
                    long j3 = ((id01) obj3).a;
                    cr31 cr31Var = er31.a;
                    qim0 qim0VarF3 = dug.f(qim0VarR, j3, cr31Var);
                    float f = yy51.c;
                    long j4 = yy51.b;
                    qim0 qim0VarE4 = d1u.E(f, u7h.b(j4, 0.2f, 0.0f, 0.0f, 0.0f, 14), qim0VarF3, cr31Var);
                    gfh0 gfh0VarC3 = t1c.c(graVar2, false);
                    int iHashCode4 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM4 = x340Var14.m();
                    qim0 qim0VarE5 = zr7.E(x340Var14, qim0VarE4);
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
                    nko1.H(gfh0VarC3, x340Var14, y580.O0);
                    nko1.H(xos0VarM4, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE5, x340Var14, y580.Y);
                    if (z6) {
                        x340Var14.i0(1280273027);
                        w0h1.a(ilx.c, isl.a, u291.r(qim0VarF, 12.0f), j4, 0L, false, x340Var14, ilx.d | 3120, 48);
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(1280544463);
                        x340Var14.r(false);
                    }
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                lmt0.j((ew90) obj3, z6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    u7n0.m(z6, (r9u0) obj3, (qim0) null, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                r4o1.d(z6, (tah0) obj3, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 14:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                zri0 zri0Var = (zri0) obj3;
                x340 x340Var18 = x340Var17;
                if (!x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x340Var18.b0();
                } else if (z6) {
                    x340Var18.i0(1329554331);
                    xto1.s(0, zri0Var.d, x340Var18, null);
                    x340Var18.r(false);
                } else {
                    x340Var18.i0(1329655825);
                    xto1.m(zri0Var.a, zri0Var.b, zri0Var.c, zri0Var.d, null, false, x340Var18, 0, 48);
                    x340Var18.r(false);
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                zxo1.m(z6, (x8t0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                bft0 bft0Var = (bft0) obj3;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    gwt0 gwt0Var = bft0Var.a;
                    if (gwt0Var.equals(awt0.a)) {
                        x340Var20.i0(-1086164486);
                        uwr uwrVar8 = cbx.a;
                        xto1.e(null, 0, cbx.a(x340Var20).b.a, 0L, x340Var20, 0, 11);
                        x340Var20.r(false);
                    } else {
                        boolean z7 = gwt0Var instanceof yvt0;
                        isl islVar2 = isl.a;
                        if (z7 || (gwt0Var instanceof zvt0) || (gwt0Var instanceof xvt0) || (gwt0Var instanceof bwt0) || (gwt0Var instanceof vvt0) || (gwt0Var instanceof uvt0) || (gwt0Var instanceof wvt0)) {
                            x340Var20.i0(-1086151266);
                            if (z6 && bft0Var.b == 1) {
                                x340Var20.i0(689114813);
                                w0h1.a(pox.c, islVar2, (qim0) null, 0L, 0L, true, x340Var20, pox.d | 196656, 28);
                                z4 = false;
                                x340Var20.r(false);
                            } else {
                                x340Var20.i0(689228831);
                                w0h1.a(xpx.c, islVar2, (qim0) null, 0L, 0L, true, x340Var20, xpx.d | 196656, 28);
                                z4 = false;
                                x340Var20.r(false);
                            }
                            x340Var20.r(z4);
                        } else if (gwt0Var.equals(cwt0.a)) {
                            x340Var20.i0(-1086140939);
                            w0h1.a(spx.c, islVar2, (qim0) null, 0L, 0L, false, x340Var20, spx.d | 48, 60);
                            x340Var20.r(false);
                        } else {
                            if (!(gwt0Var instanceof dwt0) && !gwt0Var.equals(fwt0.a)) {
                                throw p3d1.k(x340Var20, -1086166591, false);
                            }
                            x340Var20.i0(-1086136748);
                            w0h1.a(xpx.c, islVar2, (qim0) null, 0L, 0L, false, x340Var20, xpx.d | 48, 60);
                            x340Var20.r(false);
                        }
                    }
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                bqn1.f((y7e1) obj3, z6, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 18:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    knx knxVar = (hux) obj3;
                    if (knxVar == null) {
                        knxVar = knx.c;
                    }
                    knx knxVar2 = knxVar;
                    if (z6) {
                        x340Var22.i0(330825385);
                        uwr uwrVar9 = cbx.a;
                        j = cbx.a(x340Var22).b.c;
                        z5 = false;
                    } else {
                        z5 = false;
                        x340Var22.i0(330826625);
                        uwr uwrVar10 = cbx.a;
                        j = cbx.a(x340Var22).b.a;
                    }
                    x340Var22.r(z5);
                    w0h1.a(knxVar2, isl.a, (qim0) null, j, 0L, false, x340Var22, 56, 52);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    elz0 elz0Var = (elz0) obj3;
                    hlz0.b(elz0Var.a, elz0Var.b, z6, x340Var24, 0);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                boolean zY2 = x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2);
                j06 j06Var2 = x340Var26.a;
                if (zY2) {
                    wat watVar = (wat) x340Var26.k(t4k.h);
                    yae1 yae1VarQ = d5p1.q(0, x340Var26, 1);
                    float fU0 = watVar.U0();
                    if (fU0 < 1.0f) {
                        fU0 = 1.0f;
                    }
                    float fM = dsa0.m(x340Var26, 2131166902) * fU0;
                    ((x47) obj3).getClass();
                    float f2 = fM * 1.0f;
                    int i = z6 ? 2 : 1;
                    uwr uwrVar11 = cbx.a;
                    float fD = lq01.d(yae1VarQ, watVar, cbx.d(x340Var26).k, i);
                    float fD2 = lq01.d(yae1VarQ, watVar, cbx.d(x340Var26).j, 1);
                    qim0 qim0VarV = u291.v(qim0VarF, f2);
                    era eraVar = een.P0;
                    f36 f36Var = h36.c;
                    mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var26, 0);
                    int iHashCode5 = Long.hashCode(x340Var26.T);
                    xos0 xos0VarM5 = x340Var26.m();
                    qim0 qim0VarE6 = zr7.E(x340Var26, qim0VarV);
                    hzj.A.getClass();
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var26.m0();
                    if (x340Var26.S) {
                        x340Var26.l(n4kVar);
                    } else {
                        x340Var26.v0();
                    }
                    llj lljVar5 = y580.O0;
                    nko1.H(mbhVarA, x340Var26, lljVar5);
                    llj lljVar6 = y580.N0;
                    nko1.H(xos0VarM5, x340Var26, lljVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode5);
                    llj lljVar7 = y580.R0;
                    nko1.H(numValueOf2, x340Var26, lljVar7);
                    nko1.F(x340Var26);
                    llj lljVar8 = y580.Y;
                    nko1.H(qim0VarE6, x340Var26, lljVar8);
                    lq01.b(u291.s(qim0VarF, f2, fM), x340Var26, 0);
                    qim0 qim0VarB2 = uyn1.B(u291.f(qim0VarF, 1.0f), 0.0f, dsa0.m(x340Var26, 2131166904), 0.0f, 0.0f, 13);
                    mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var26, 0);
                    int iHashCode6 = Long.hashCode(x340Var26.T);
                    xos0 xos0VarM6 = x340Var26.m();
                    qim0 qim0VarE7 = zr7.E(x340Var26, qim0VarB2);
                    x340Var26.m0();
                    if (x340Var26.S) {
                        x340Var26.l(n4kVar);
                    } else {
                        x340Var26.v0();
                    }
                    nko1.H(mbhVarA2, x340Var26, lljVar5);
                    nko1.H(xos0VarM6, x340Var26, lljVar6);
                    x0d.q(iHashCode6, x340Var26, lljVar7, x340Var26);
                    nko1.H(qim0VarE7, x340Var26, lljVar8);
                    x340Var26.i0(157414297);
                    for (int i2 = 0; i2 < i; i2++) {
                        lq01.c(fD / i, 0, x340Var26);
                    }
                    x340Var26.r(false);
                    op71.g(x340Var26, u291.h(qim0VarF, dsa0.m(x340Var26, 2131166903)));
                    lq01.c(fD2, 0, x340Var26);
                    x340Var26.r(true);
                    x340Var26.r(true);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                u4p1.p(z6, (q1v) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((su61) obj3).a(z6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                j3z j3zVar = (j3z) obj3;
                return new jpg0(j3zVar.b.a(new hyn(2, 2, 4, false, this.b), j3zVar.d, new epb1((zob1) obj)), rz71.Z);
            case 24:
                ((Number) obj2).intValue();
                y2o1.m((zsb1) obj3, z6, (b0k) obj, czo1.p(71));
                return rih1Var;
            case 25:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    kte1 kte1Var = (kte1) obj3;
                    jw31 jw31VarA2 = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var28, 0);
                    int iHashCode7 = Long.hashCode(x340Var28.T);
                    xos0 xos0VarM7 = x340Var28.m();
                    qim0 qim0VarE8 = zr7.E(x340Var28, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var28.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var28.m0();
                    if (x340Var28.S) {
                        x340Var28.l(n4kVar);
                    } else {
                        x340Var28.v0();
                    }
                    nko1.H(jw31VarA2, x340Var28, y580.O0);
                    nko1.H(xos0VarM7, x340Var28, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode7), x340Var28, y580.R0);
                    nko1.F(x340Var28);
                    nko1.H(qim0VarE8, x340Var28, y580.Y);
                    bby bbyVarE = xay.e(2, irn1.o0(100, 60, null, 4));
                    pxg1 pxg1VarO0 = irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, null, 6);
                    era eraVar2 = een.R0;
                    fq7.f(!z6, (qim0) null, bbyVarE.a(xay.b(pxg1VarO0, eraVar2, (iu30) null, 12)), xay.f(2, irn1.o0(100, 0, null, 6)).a(xay.i(irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, null, 6), eraVar2, (iu30) null, 12)), (String) null, apo.r(1945122570, new bxb1(kte1Var, (byte) 25), x340Var28), x340Var28, 1572870, 18);
                    uqe1 uqe1Var = kte1Var.b;
                    if (uqe1Var == null) {
                        x340Var28.i0(-1125046530);
                        x340Var28.r(false);
                    } else {
                        x340Var28.i0(-1125046529);
                        rje1.f(uqe1Var, 16.0f, x340Var28, 8);
                        x340Var28.r(false);
                    }
                    x340Var28.r(true);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 26:
                return t5p1.j(new c1v0(((uvf1) obj3).e.b((String) obj, z6 ? (ymd0) obj2 : null), (byte) 7), 3);
            case 27:
                ((Number) obj2).intValue();
                czo1.e(z6, (x0j1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    qim0 qim0VarF4 = u291.f(qim0VarF, 1.0f);
                    uwr uwrVar12 = cbx.a;
                    cbx.a.getClass();
                    qim0 qim0VarF5 = hno1.f(qim0VarF4, uwr.d());
                    long j5 = cbx.a(x340Var30).a.d;
                    if (!z6) {
                        qim0VarF5 = anm1.N("videoplayer_highlighted_foreground", exd0.s(qim0VarF5, new vfe1((byte) 8, j5)));
                    }
                    qim0 qim0VarF6 = dug.f(qim0VarF5, cbx.a(x340Var30).a.c, u5j1Var);
                    VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj3;
                    gfh0 gfh0VarC4 = t1c.c(een.h, false);
                    int iHashCode8 = Long.hashCode(x340Var30.T);
                    xos0 xos0VarM8 = x340Var30.m();
                    qim0 qim0VarE9 = zr7.E(x340Var30, qim0VarF6);
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
                    nko1.H(gfh0VarC4, x340Var30, y580.O0);
                    nko1.H(xos0VarM8, x340Var30, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode8), x340Var30, y580.R0);
                    nko1.F(x340Var30);
                    nko1.H(qim0VarE9, x340Var30, y580.Y);
                    boolean zI = x340Var30.i(videoSurfaceView);
                    Object objT2 = x340Var30.T();
                    if (zI || objT2 == fkj0.X) {
                        objT2 = new mc81(videoSurfaceView, (byte) 1);
                        x340Var30.s0(objT2);
                    }
                    dm5.a((iu30) objT2, u291.d(qim0VarF, 1.0f), (iu30) null, x340Var30, 0, 4);
                    x340Var30.r(true);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            default:
                atj1 atj1Var = (atj1) obj;
                mtj1 mtj1Var = (mtj1) obj2;
                return new btj1(2, (z6 || mtj1Var.a || !((pe) ((ywv0) obj3).d).b(4)) ? false : true, atj1Var.b, atj1Var.a, mtj1Var.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf2(Object obj, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf2(Object obj, boolean z, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf2(ann annVar, boolean z, ldo ldoVar) {
        super(2);
        this.a = (byte) 5;
        this.c = annVar;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf2(gdx gdxVar, boolean z, kte1 kte1Var) {
        super(2);
        this.a = (byte) 25;
        this.b = z;
        this.c = kte1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf2(boolean z, Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf2(boolean z, Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf2(boolean z, wux wuxVar, id01 id01Var) {
        super(2);
        this.a = (byte) 10;
        this.b = z;
        this.c = id01Var;
    }
}
