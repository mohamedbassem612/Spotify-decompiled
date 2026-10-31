package p;

import com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d0e0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0e0(LyricsFullscreenPageActivity lyricsFullscreenPageActivity, umf0 umf0Var, wjf0 wjf0Var) {
        super(2);
        this.a = (byte) 16;
        this.c = umf0Var;
        this.b = wjf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x039c  */
    public final Object invoke(Object obj, Object obj2) {
        zgx zgxVar;
        qim0 qim0VarR;
        String str;
        String str2;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        zx81 zx81Var = null;
        byte b2 = 3;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                e0e0.c((List) obj4, (j2i) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                rce0.a((tl7) obj4, (j2i) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ((doe) obj4).g((wee0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                et9 et9Var = (et9) obj4;
                aoe0 aoe0Var = (aoe0) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ng20 ng20Var = (ng20) et9Var.i;
                    boolean zI = x340Var2.i(et9Var) | x340Var2.i(aoe0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new qie0(et9Var, aoe0Var, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean zI2 = x340Var2.i(et9Var) | x340Var2.i(aoe0Var);
                    Object objT2 = x340Var2.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new qie0(et9Var, aoe0Var, (byte) 1);
                        x340Var2.s0(objT2);
                    }
                    otw.c(ng20Var, new eje0(aoe0Var, function0, (Function0) objT2), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                y7e1 y7e1Var = (y7e1) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str3 = (String) obj4;
                    boolean zI3 = x340Var4.i(y7e1Var);
                    Object objT3 = x340Var4.T();
                    if (zI3 || objT3 == fkj0.X) {
                        objT3 = new ime0(y7e1Var, (byte) 0);
                        x340Var4.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    if (ihc1.y0(str3)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    wro1.h(new gbx(new y50(str3), function1), ldx.c, (qim0) null, (max) null, yla.s(x340Var4).a(), (vzq0) null, false, (idn0) null, (ga80) null, jxi.a, x340Var4, 12582912, 6, 860);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                jap1.h((hwq0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                jap1.j((iwq0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                ebp1.d((tte0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ((gue0) obj4).a((qim0) obj3, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 9:
                ((LinkedHashSet) obj4).add(c921.s((ccs0) obj3, (String) obj, (String) obj2));
                return rih1Var;
            case 10:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                Function0 function2 = (Function0) obj3;
                j0f0 j0f0Var = (j0f0) obj4;
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                    return rih1Var;
                }
                boolean zI4 = x340Var6.i(j0f0Var);
                Object objT4 = x340Var6.T();
                if (zI4 || objT4 == m4cVar2) {
                    zgxVar = null;
                    objT4 = new q82(j0f0Var, (lnm) null, (byte) 10);
                    x340Var6.s0(objT4);
                } else {
                    zgxVar = null;
                }
                qxd0.t(rih1Var, x340Var6, (vu30) objT4);
                boolean zG = x340Var6.g(function2) | x340Var6.i(j0f0Var);
                Object objT5 = x340Var6.T();
                if (zG || objT5 == m4cVar2) {
                    objT5 = new bsc0(function2, j0f0Var, (byte) 12);
                    x340Var6.s0(objT5);
                }
                Function0 function3 = (Function0) objT5;
                i3u i3uVar = j0f0Var.f;
                hux huxVar = j0f0Var.c;
                String str4 = j0f0Var.a;
                String str5 = j0f0Var.b;
                zgx zgxVarP = yoi1.P(j0f0Var.d, function2);
                h0f0 h0f0Var = j0f0Var.e;
                mqo1.d(function3, i3uVar, huxVar, str4, str5, zgxVarP, h0f0Var != null ? yoi1.P(h0f0Var, function2) : zgxVar, x340Var6, 2359808, 0);
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                aym.e((gt40) obj4, (u8h) obj3, (b0k) obj, czo1.p(65));
                return rih1Var;
            case 12:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                p7f0 p7f0Var = (p7f0) obj4;
                x340 x340Var8 = x340Var7;
                boolean zY = x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                j06 j06Var = x340Var8.a;
                if (!zY) {
                    x340Var8.b0();
                    return rih1Var;
                }
                qim0 qim0Var = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                zsc zscVar = zex.a;
                qim0 qim0VarX = uyn1.x(dug.f(qim0VarF, ((vex) zscVar.e).c, er31.b(8.0f)), 8.0f);
                boolean z2 = p7f0Var.h;
                boolean zG2 = x340Var8.g(iu30Var);
                Object objT6 = x340Var8.T();
                if (zG2 || objT6 == fkj0.X) {
                    objT6 = new ijd0(iu30Var, (byte) 26);
                    x340Var8.s0(objT6);
                }
                qim0 qim0VarN = anm1.N("looping_video", bin.x(qim0VarX, z2, (String) null, (pm31) null, (idn0) null, (Function0) objT6, 14));
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var8, 0);
                int iHashCode = Long.hashCode(x340Var8.T);
                xos0 xos0VarM = x340Var8.m();
                qim0 qim0VarE = zr7.E(x340Var8, qim0VarN);
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
                nko1.H(mbhVarA, x340Var8, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var8, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var8, lljVar3);
                nko1.F(x340Var8);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var8, lljVar4);
                qim0 qim0VarQ = i1p1.q(u291.f(qim0Var, 1.0f), er31.b(8.0f));
                Double d = p7f0Var.g;
                if (d == null || (qim0VarR = d7e.r((float) d.doubleValue(), qim0Var, false)) == null) {
                    qim0VarR = qim0Var;
                }
                qim0 qim0VarThen = qim0VarQ.then(qim0VarR);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var8.T);
                xos0 xos0VarM2 = x340Var8.m();
                qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarThen);
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                nko1.H(gfh0VarC, x340Var8, lljVar);
                nko1.H(xos0VarM2, x340Var8, lljVar2);
                x0d.q(iHashCode2, x340Var8, lljVar3, x340Var8);
                nko1.H(qim0VarE2, x340Var8, lljVar4);
                w0h1.a(xtx.c, isl.a, d7e.r(1.0f, u291.f(qim0Var, 0.33333334f), false), f5p1.k(x340Var8, 2131102507), 0L, false, x340Var8, xtx.d | 48, 48);
                q7f0.a("read-along-looping-video", p7f0Var.d, p7f0Var.e, h2c.a.b(qim0Var), b3k1.c, true, x340Var8, 24582, 0);
                x340Var8.r(true);
                String str6 = p7f0Var.f;
                if (str6 == null || str6.length() == 0) {
                    x340Var8.i0(-147406889);
                    x340Var8.r(false);
                } else {
                    x340Var8.i0(-147739705);
                    uwo1.e(p7f0Var.f, anm1.N("looping_video_caption", uyn1.B(qim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13)), cbx.d(x340Var8).m, ((vex) zscVar.e).n, (a0e1) null, (iu30) null, 2, false, new cjc0(6), 0, (qx8) null, x340Var8, 0, 0, 1712);
                    x340Var8.r(false);
                }
                x340Var8.r(true);
                return rih1Var;
            case 13:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    ebf0 ebf0Var = (ebf0) obj4;
                    iu30 iu30Var2 = (iu30) obj3;
                    mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var10, 0);
                    int iHashCode3 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM3 = x340Var10.m();
                    qim0 qim0VarE3 = zr7.E(x340Var10, qim0VarF2);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(mbhVarA2, x340Var10, y580.O0);
                    nko1.H(xos0VarM3, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE3, x340Var10, y580.Y);
                    x340Var10.i0(1871670230);
                    int i = 0;
                    for (Object obj5 : ebf0Var.d) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        awg1 awg1Var = (awg1) obj5;
                        if (i > 0) {
                            x340Var10.i0(-733011783);
                            uwr uwrVar2 = cbx.a;
                            cvx cvxVar = cbx.b(x340Var10).b;
                            x0d.s(nim0Var, 16.0f, x340Var10, false);
                        } else {
                            x340Var10.i0(-732932981);
                            x340Var10.r(false);
                        }
                        b2u.j(awg1Var, iu30Var2, x340Var10, 0);
                        i = i2;
                    }
                    x340Var10.r(false);
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var10).b;
                    x0d.s(nim0Var, 16.0f, x340Var10, true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                b2u.j((awg1) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ((j2i) obj3).invoke((frf0) ((ven0) obj4).getValue(), x340Var12, 8);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 16:
                wjf0 wjf0Var = (wjf0) obj3;
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    otw.c((umf0) obj4, wjf0Var, (qim0) null, wpb1.C(LyricsFullscreenPageActivity.class.getName(), (umf0) obj4, wjf0Var, x340Var14, 0, 8), x340Var14, 0, 4);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    otw.c((s8a1) obj4, new m8a1(((ojf0) ((ven0) obj3).getValue()).a.d), (qim0) null, (ipb1) null, x340Var16, 0, 12);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                ven0 ven0Var = (ven0) obj3;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    otw.c((os30) obj4, new qs30(((ojf0) ven0Var.getValue()).a.d, ((ojf0) ven0Var.getValue()).Y), (qim0) null, (ipb1) null, x340Var18, 0, 12);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    j8a1 j8a1Var = (j8a1) ((umf0) obj4).d;
                    if (j8a1Var == null) {
                        x340Var20.i0(1406102028);
                        x340Var20.r(false);
                    } else {
                        x340Var20.i0(1406102029);
                        ven0 ven0Var2 = (ven0) obj3;
                        otw.c(j8a1Var, new f8a1(((ojf0) ven0Var2.getValue()).a.d, ((ojf0) ven0Var2.getValue()).Y), (qim0) null, (ipb1) null, x340Var20, 0, 12);
                        x340Var20.r(false);
                    }
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ojf0 ojf0Var = (ojf0) ((ven0) obj3).getValue();
                    vpf0 vpf0Var = ojf0Var.c;
                    xng1 xng1Var = ojf0Var.h;
                    if (vpf0Var instanceof vpf0) {
                        a9h a9hVar = vpf0Var.a;
                        if (a9hVar.a.c.isEmpty() && a9hVar.a.i.isEmpty()) {
                            x340Var22.i0(577641514);
                            x340Var22.r(false);
                        } else {
                            x340Var22.i0(576728564);
                            ss30 ss30Var = (ss30) obj4;
                            String str7 = ojf0Var.a.d;
                            boolean z3 = xng1Var instanceof xng1;
                            fef0 fef0Var = a9hVar.a;
                            String str8 = fef0Var.d;
                            def0 def0Var = (def0) o7h.s0(fef0Var.c);
                            if (def0Var == null || (str = def0Var.a) == null) {
                                str = (String) o7h.q0(a9hVar.a.i);
                            }
                            String str9 = str;
                            boolean z4 = ojf0Var.Y;
                            xng1 xng1Var2 = z3 ? xng1Var : null;
                            if (xng1Var2 != null && (str2 = xng1Var2.a) != null) {
                                Locale localeForLanguageTag = Locale.forLanguageTag(upn1.s());
                                localeForLanguageTag.getClass();
                                zx81 displayName = Locale.forLanguageTag(str2).getDisplayName(localeForLanguageTag);
                                if (displayName.length() > 0) {
                                    displayName = ((Object) eth.U(displayName.charAt(0), localeForLanguageTag)) + displayName.substring(1);
                                }
                                zx81Var = displayName;
                            }
                            otw.c(ss30Var, new us30(str7, str8, str9, zx81Var, z3, z4), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                            x340Var22.r(false);
                        }
                    } else {
                        x340Var22.i0(577641514);
                        x340Var22.r(false);
                    }
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                ven0 ven0Var3 = (ven0) obj3;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    vs30 vs30Var = (vs30) obj4;
                    String str10 = ((ojf0) ven0Var3.getValue()).a.d;
                    if ((((ojf0) ven0Var3.getValue()).O0 instanceof lfm0) && (((ojf0) ven0Var3.getValue()).O0.a instanceof zx81)) {
                        z = true;
                    }
                    otw.c(vs30Var, new xs30(str10, z), (qim0) null, (ipb1) null, x340Var24, 0, 12);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ojf0 ojf0Var2 = (ojf0) ((ven0) obj3).getValue();
                    lfm0 lfm0Var = ojf0Var2.O0;
                    lfm0 lfm0Var2 = lfm0Var instanceof lfm0 ? lfm0Var : null;
                    by81 by81Var = lfm0Var2 != null ? lfm0Var2.a : null;
                    zx81Var = by81Var instanceof zx81 ? (zx81) by81Var : null;
                    if (zx81Var != null) {
                        x340Var26.i0(-1082672745);
                        otw.c((ys30) obj4, new at30(ojf0Var2.a.d, zx81Var.a), (qim0) null, (ipb1) null, x340Var26, 0, 12);
                        x340Var26.r(false);
                    } else {
                        x340Var26.i0(-1082348888);
                        x340Var26.r(false);
                    }
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                crm0.f((tm21) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                rnf0 rnf0Var = (rnf0) obj4;
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    vef0 vef0Var = rnf0Var.d;
                    bof0.c(vef0Var, rnf0Var.a, cwl1.n0(2131957895, new Object[]{vef0Var.b}, x340Var28), u291.d(nim0Var, 1.0f), rnf0Var.g, apo.r(1096875536, new ql50((c380) obj3, b2), x340Var28), x340Var28, 199680);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                poz0.g((bff0) obj4, (Function0) obj3, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 26:
                nqs nqsVar = (nqs) obj;
                tv80 tv80Var = (tv80) obj2;
                cvg1 cvg1Var = (cvg1) obj4;
                jyf0 jyf0Var = (jyf0) obj3;
                nh91 nh91Var = jyf0Var.X;
                if (nh91Var != null) {
                    nh91Var.c(3);
                }
                ((jur) jyf0Var.d.get()).a(cvg1Var.d, cvg1Var.c, tv80Var.a.a, cvg1Var.a);
                nqsVar.a();
                return rih1Var;
            case 27:
                gzf0 gzf0Var = (gzf0) obj4;
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    dzf0 dzf0Var = (dzf0) rwq.h(gzf0Var.h, x340Var30, 0).getValue();
                    if (dzf0Var == null) {
                        x340Var30.i0(876754555);
                        x340Var30.r(false);
                    } else {
                        x340Var30.i0(876754556);
                        MainLayoutContentContainerView mainLayoutContentContainerView = (MainLayoutContentContainerView) obj3;
                        Object[] objArr = {dzf0Var.a()};
                        boolean zG3 = x340Var30.g(dzf0Var);
                        Object objT7 = x340Var30.T();
                        if (zG3 || objT7 == m4cVar3) {
                            objT7 = new fzf0(dzf0Var, (byte) 0);
                            x340Var30.s0(objT7);
                        }
                        ven0 ven0Var4 = (ven0) k5p1.s(objArr, (Function0) objT7, x340Var30, 0);
                        zob1 zob1VarA = dzf0Var.a();
                        boolean zG4 = x340Var30.g(dzf0Var) | x340Var30.g(ven0Var4);
                        Object objT8 = x340Var30.T();
                        if (zG4 || objT8 == m4cVar3) {
                            objT8 = new ezf0(dzf0Var, ven0Var4, null, (byte) 0);
                            x340Var30.s0(objT8);
                        }
                        qxd0.t(zob1VarA, x340Var30, (vu30) objT8);
                        mainLayoutContentContainerView.O0.l((Boolean) ven0Var4.getValue());
                        boolean zG5 = x340Var30.g(mainLayoutContentContainerView);
                        Object objT9 = x340Var30.T();
                        if (zG5 || objT9 == m4cVar3) {
                            objT9 = new e4f0(mainLayoutContentContainerView, (byte) 14);
                            x340Var30.s0(objT9);
                        }
                        qxd0.i(rih1Var, (iu30) objT9, x340Var30);
                        Boolean bool = (Boolean) ven0Var4.getValue();
                        if (bool == null) {
                            x340Var30.i0(-614202344);
                        } else {
                            x340Var30.i0(-614202343);
                            mainLayoutContentContainerView.z(gzf0Var, dzf0Var, bool.booleanValue(), x340Var30, 0);
                        }
                        x340Var30.r(false);
                        x340Var30.r(false);
                    }
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ((gzf0) obj4).d.b(6, apo.r(518401377, new ak10((j2i) obj3, (byte) 19), x340Var32), x340Var32);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                mue1.k((m0g0) obj4, (v0g0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0e0(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0e0(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0e0(j2i j2iVar, ven0 ven0Var) {
        super(2);
        this.a = (byte) 15;
        this.b = j2iVar;
        this.c = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0e0(ebf0 ebf0Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 13;
        this.c = ebf0Var;
        this.b = iu30Var;
    }
}
