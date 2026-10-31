package p;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.share.audioparamstestpage.a;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mu6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mu6(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:225:0x0683  */
    /* JADX WARN: Code duplicated, block: B:232:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:234:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:235:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:242:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:243:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:245:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:247:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:253:0x070c  */
    /* JADX WARN: Code duplicated, block: B:256:0x0717  */
    public final Object invoke(Object obj, Object obj2) {
        qb7 qb7Var;
        ContextTrack contextTrack;
        String strA0;
        w58 w58VarD;
        dma1 dma1Var;
        Restrictions.RestrictionReasons restrictionReasons;
        t380 t380VarReasons;
        t380 t380VarReasons2;
        String strO0;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        int i = 2;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        Object obj3 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nu6 nu6Var = (nu6) obj3;
                    smo1.c(nu6Var.b, nu6Var.c, x340Var2, 8);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    hv6 hv6Var = (hv6) obj3;
                    wmo1.a(hv6Var.b, hv6Var.c, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    rw6 rw6Var = (rw6) obj3;
                    bno1.a(rw6Var.b, rw6Var.c, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                iz6 iz6Var = (iz6) obj3;
                return new sma1(new jpg0(new r4o(((xf4) iz6Var.c).l(), "watch-feed-entrypoint-card-artist", (iac0) iz6Var.b, (oqg) iz6Var.d, (zob1) obj, (v7l1) ((heq) iz6Var.e).a.d.Ga.get()), fz6.X), new rma1((Integer) null, 2131167033, (Integer) null, 13));
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l77 l77Var = (l77) obj3;
                    otw.c(l77Var.a, l77Var.b, (qim0) null, (ipb1) null, x340Var8, 0, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                Bundle bundle = (Bundle) obj2;
                qb7 qb7Var2 = ((yb7) ((zwg) obj3).e).d;
                String string = bundle != null ? bundle.getString("assisted_curation_selected_card_id") : null;
                qb7 qb7Var3 = (bundle == null || (qb7Var = (qb7) jhc1.t(bundle, "assisted_curation_mode", qb7.class)) == null) ? qb7Var2 : qb7Var;
                x7i1 x7i1Var = new x7i1(false, (exc0) null, (rc50) null, false, false, false, false, false, 8191);
                z6x z6xVar = z6x.a;
                fg91 fg91Var = fg91.b;
                return new rb7(qb7Var3, false, string, z6xVar, z6xVar, fg91Var, fg91Var, ofu0.a, false, false, false, false, false, false, false, true, false, z6xVar, b7x.a, x7i1Var, "");
            case 6:
                ((Number) obj2).intValue();
                aqo1.k((sfu0) obj3, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    otw.c((smp0) obj3, new t451(), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ((fp7) obj3).d((b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pto1.b(((ay7) obj3).b, x340Var12, 48);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                pto1.b((a) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                d68 d68Var = (d68) obj2;
                PlayerState playerState = d68Var.a;
                ktl ktlVar = d68Var.b;
                ne2 ne2Var = d68Var.c;
                p68 p68Var = ((m68) obj3).b;
                cn4 cn4Var = (cn4) p68Var.e;
                if (((no4) ((b0a0) p68Var.g).a.get()).B()) {
                    j380 j380VarDisallowSignals = playerState.restrictions().disallowSignals();
                    Restrictions.RestrictionReasons restrictionReasons2 = (Restrictions.RestrictionReasons) j380VarDisallowSignals.get("switch-to-audio");
                    if ((restrictionReasons2 == null || (t380VarReasons2 = restrictionReasons2.reasons()) == null || !t380VarReasons2.contains("jam-listen-along")) && ((restrictionReasons = (Restrictions.RestrictionReasons) j380VarDisallowSignals.get("switch-to-video")) == null || (t380VarReasons = restrictionReasons.reasons()) == null || !t380VarReasons.contains("jam-listen-along"))) {
                        contextTrack = (ContextTrack) playerState.track().b();
                        contextTrack.getClass();
                        strA0 = l4o1.a0(contextTrack, "context_uri");
                        if (strA0 != null || (!nhc1.Y(strA0, "spotify:room:", false) && !nhc1.Y(strA0, "spotify:list:listening-party:", false))) {
                            if (ktlVar != ktl.b || (ktlVar != ktl.c && !l4o1.P(contextTrack))) {
                                i = 1;
                            }
                            w58VarD = guo1.D(playerState, ne2Var, p68Var.a, cn4Var);
                            if (w58VarD.equals(v58.a)) {
                                return new i68(new g68(ne2Var), contextTrack.uri(), i);
                            }
                            if (w58VarD instanceof w58) {
                                dma1Var = ((in01) p68Var.d).a;
                                if (dma1Var.l(sad1.a, 0) < 3 && !dma1Var.h(sad1.b, false) && cn4Var.b()) {
                                    z = true;
                                }
                                return new i68(new h68(ne2Var, z, w58VarD.a), contextTrack.uri(), i);
                            }
                            if (!w58VarD.equals(x58.a)) {
                                eg.o();
                                return null;
                            }
                        }
                    }
                } else {
                    contextTrack = (ContextTrack) playerState.track().b();
                    contextTrack.getClass();
                    strA0 = l4o1.a0(contextTrack, "context_uri");
                    if (strA0 != null) {
                        if (ktlVar != ktl.b) {
                            i = 1;
                        } else {
                            i = 1;
                        }
                        w58VarD = guo1.D(playerState, ne2Var, p68Var.a, cn4Var);
                        if (w58VarD.equals(v58.a)) {
                            return new i68(new g68(ne2Var), contextTrack.uri(), i);
                        }
                        if (w58VarD instanceof w58) {
                            dma1Var = ((in01) p68Var.d).a;
                            if (dma1Var.l(sad1.a, 0) < 3) {
                                z = true;
                            }
                            return new i68(new h68(ne2Var, z, w58VarD.a), contextTrack.uri(), i);
                        }
                        if (!w58VarD.equals(x58.a)) {
                            eg.o();
                            return null;
                        }
                    } else {
                        if (ktlVar != ktl.b) {
                            i = 1;
                        } else {
                            i = 1;
                        }
                        w58VarD = guo1.D(playerState, ne2Var, p68Var.a, cn4Var);
                        if (w58VarD.equals(v58.a)) {
                            return new i68(new g68(ne2Var), contextTrack.uri(), i);
                        }
                        if (w58VarD instanceof w58) {
                            dma1Var = ((in01) p68Var.d).a;
                            if (dma1Var.l(sad1.a, 0) < 3) {
                                z = true;
                            }
                            return new i68(new h68(ne2Var, z, w58VarD.a), contextTrack.uri(), i);
                        }
                        if (!w58VarD.equals(x58.a)) {
                            eg.o();
                            return null;
                        }
                    }
                }
                return f68.a;
            case grn1.d /* 12 */:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uwo1.e(((pw50) obj3).f.a, null, null, 0L, null, null, 0, false, null, 0, null, x340Var14, 0, 0, 2046);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 13:
                List list = (List) obj;
                Boolean bool = (Boolean) obj2;
                if (!((eb8) obj3).c.isEmpty() && list != null && (!list.isEmpty()) && !u890.j(bool, Boolean.FALSE)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                return new jpg0(f6o1.A((maa) ((kly0) ((ur6) obj3).b).get(), null, null, 3), db8.N0);
            case 15:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                hn8 hn8Var = (hn8) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    wm8 wm8Var = hn8Var.c2;
                    if (wm8Var == null) {
                        u890.C("authorBioApiService");
                        throw null;
                    }
                    en8 en8Var = (en8) rwq.h(wm8Var.d, x340Var16, 0).getValue();
                    b4v0 b4v0Var = hn8Var.e2;
                    if (b4v0Var == null) {
                        u890.C("descriptionParsingProcess");
                        throw null;
                    }
                    boolean zI = x340Var16.i(b4v0Var);
                    Object objT = x340Var16.T();
                    if (zI || objT == m4cVar) {
                        objT = new n5(1, b4v0Var, b4v0.class, "parseAsAnnotatedString", "parseAsAnnotatedString(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString;", 0, (byte) 22);
                        x340Var16.s0(objT);
                    }
                    iu30 iu30Var = (iu30) objT;
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarO = td6.o(lhc.g(x340Var16).g, 32, nim0Var);
                    boolean zI2 = x340Var16.i(hn8Var);
                    Object objT2 = x340Var16.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new gn8(hn8Var, (byte) 2);
                        x340Var16.s0(objT2);
                    }
                    qyo1.e(en8Var, iu30Var, qim0VarO, (Function0) objT2, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 16:
                dp8 dp8Var = (dp8) obj;
                a910 a910Var = (a910) obj2;
                boolean z2 = a910Var.b;
                if (((di4) ((yu3) obj3).e).e0() && !z2) {
                    z = true;
                }
                return new ep8(dp8Var, z, a910Var.a, z2);
            case 17:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    lkx lkxVar = lkx.c;
                    uwr uwrVar = cbx.a;
                    w0h1.a(lkxVar, new jsl(cwl1.n0(2131961566, new Object[]{((u39) obj3).a}, x340Var18)), (qim0) null, cbx.a(x340Var18).b.b, 0L, false, x340Var18, lkx.d, 52);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ((t59) obj3).getClass();
                    mp10.f(h5p1.G(new ocf0(2131886206), null, null, x340Var20, 0, 62).c(), (qim0) null, false, false, (bcf0) null, Integer.MAX_VALUE, (ddf0) null, een.e, (j6m) null, x340Var20, 1572864, 0, 2080702);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    String str = (String) ((aa9) obj3).e.get(0);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str, null, cbx.d(x340Var22).g, 0L, null, null, 0, false, null, 0, null, x340Var22, 0, 0, 2042);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                ll9 ll9Var = (ll9) obj3;
                rm9 rm9Var = ll9Var.b;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zI3 = x340Var24.i(ll9Var);
                    Object objT3 = x340Var24.T();
                    if (zI3 || objT3 == m4cVar2) {
                        objT3 = new uv8(ll9Var, (byte) 5);
                        x340Var24.s0(objT3);
                    }
                    qxd0.i(rih1Var, (iu30) objT3, x340Var24);
                    ven0 ven0VarH = rwq.h(rm9Var.t, x340Var24, 0);
                    lr9 lr9Var = (lr9) ven0VarH.getValue();
                    boolean zI4 = x340Var24.i(ven0VarH) | x340Var24.i(ll9Var);
                    Object objT4 = x340Var24.T();
                    if (zI4 || objT4 == m4cVar2) {
                        objT4 = new ry5(ll9Var, ven0VarH, (lnm) null, (byte) 17);
                        x340Var24.s0(objT4);
                    }
                    qxd0.t(lr9Var, x340Var24, (vu30) objT4);
                    nl9 nl9Var = ll9Var.c;
                    String str2 = rm9Var.a.h;
                    otw.c(nl9Var, str2 == null ? "" : str2, (qim0) null, (ipb1) null, x340Var24, 0, 12);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 21:
                bm9 bm9Var = (bm9) obj;
                dm9 dm9Var = (dm9) obj2;
                float fFloatValue = ((Number) ((gm9) obj3).c.i.a.getValue()).floatValue();
                String str3 = dm9Var.a;
                String str4 = dm9Var.b;
                boolean z3 = bm9Var.b;
                return new cm9(fFloatValue, str3, str4, z3 ? dm9Var.d : dm9Var.c, bm9Var.c, z3);
            case 22:
                rn9 rn9Var = (rn9) obj2;
                jo70 jo70Var = rn9Var.a;
                String str5 = jo70Var.a;
                io70 io70Var = jo70Var.e;
                String str6 = io70Var != null ? io70Var.a : null;
                if (str6 == null) {
                    str6 = "";
                }
                List list2 = rn9Var.b.b;
                if (list2.contains(ell.d)) {
                    i = 1;
                } else if (!list2.contains(ell.b)) {
                    i = 0;
                }
                String str7 = ((rm9) ((nm1) obj3).f).a.h;
                return new qn9(str5, str6, i, str7 != null ? str7 : "");
            case 23:
                b0k b0kVar = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                io9 io9Var = (io9) obj3;
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    boolean zI5 = b0kVar2.i(io9Var);
                    Object objT5 = b0kVar2.T();
                    if (zI5 || objT5 == m4cVar3) {
                        objT5 = new uv8(io9Var, (byte) 11);
                        b0kVar2.s0(objT5);
                    }
                    qxd0.i(rih1Var, (iu30) objT5, b0kVar2);
                    lr9 lr9Var2 = (lr9) rwq.h(io9Var.b.t, b0kVar2, 0).getValue();
                    boolean zE = b0kVar2.e(lr9Var2.ordinal()) | b0kVar2.i(io9Var);
                    Object objT6 = b0kVar2.T();
                    if (zE || objT6 == m4cVar3) {
                        objT6 = new ry5(lr9Var2, io9Var, (lnm) null, (byte) 19);
                        b0kVar2.s0(objT6);
                    }
                    qxd0.t(lr9Var2, b0kVar2, (vu30) objT6);
                    h72 h72Var = io9Var.d;
                    boolean zI6 = b0kVar2.i(io9Var);
                    Object objT7 = b0kVar2.T();
                    if (zI6 || objT7 == m4cVar3) {
                        n5 n5Var = new n5(1, io9Var, io9.class, "updateOrientationProperty", "updateOrientationProperty(Lcom/spotify/byom/page/BYOMScreenOrientation;)V", 0, (byte) 26);
                        b0kVar2.s0(n5Var);
                        objT7 = n5Var;
                    }
                    iu30 iu30Var2 = (iu30) objT7;
                    boolean zI7 = b0kVar2.i(io9Var);
                    Object objT8 = b0kVar2.T();
                    if (zI7 || objT8 == m4cVar3) {
                        objT8 = new vv8(io9Var, (byte) 3);
                        b0kVar2.s0(objT8);
                    }
                    h72Var.i(0, (Function0) objT8, b0kVar2, iu30Var2, null);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            case 24:
                ts9 ts9Var = (ts9) obj2;
                return new ss9(((Number) ((gm9) obj3).c.g.a.getValue()).floatValue(), ts9Var.a, ts9Var.b, ts9Var.c, ((rs9) obj).b);
            case 25:
                x340 x340Var25 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                m4c m4cVar4 = fkj0.X;
                et9 et9Var = (et9) obj3;
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    boolean zI8 = x340Var26.i(et9Var);
                    Object objT9 = x340Var26.T();
                    if (zI8 || objT9 == m4cVar4) {
                        objT9 = new uv8(et9Var, (byte) 20);
                        x340Var26.s0(objT9);
                    }
                    qxd0.i(rih1Var, (iu30) objT9, x340Var26);
                    rm9 rm9Var2 = (rm9) et9Var.d;
                    cp31 cp31Var = (cp31) et9Var.h;
                    ven0 ven0VarH2 = rwq.h(rm9Var2.t, x340Var26, 0);
                    lr9 lr9Var3 = (lr9) ven0VarH2.getValue();
                    boolean zI9 = x340Var26.i(ven0VarH2) | x340Var26.i(et9Var);
                    Object objT10 = x340Var26.T();
                    if (zI9 || objT10 == m4cVar4) {
                        objT10 = new ry5(et9Var, ven0VarH2, (lnm) null, (byte) 22);
                        x340Var26.s0(objT10);
                    }
                    qxd0.t(lr9Var3, x340Var26, (vu30) objT10);
                    ven0 ven0VarG = rwq.g((mr20) cp31Var.b, "", null, x340Var26, 48, 2);
                    mr20 mr20Var = (mr20) cp31Var.c;
                    Boolean bool2 = Boolean.FALSE;
                    ven0 ven0VarG2 = rwq.g(mr20Var, bool2, null, x340Var26, 48, 2);
                    mr20 mr20Var2 = (mr20) cp31Var.d;
                    Boolean bool3 = Boolean.TRUE;
                    ((yu3) et9Var.g).c((bqk0) et9Var.j, (String) ven0VarG.getValue(), ((Boolean) ven0VarG2.getValue()).booleanValue(), ((Boolean) rwq.g(mr20Var2, bool3, null, x340Var26, 48, 2).getValue()).booleanValue(), ((rm9) cp31Var.a).a.h, ((Boolean) rwq.g((mr20) cp31Var.e, bool2, null, x340Var26, 48, 2).getValue()).booleanValue(), ((Boolean) rwq.g((ezc) cp31Var.f, bool3, null, x340Var26, 48, 2).getValue()).booleanValue(), ((ufc) et9Var.i).a(), (qim0) null, x340Var26, 0);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var27 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ix9 ix9Var = (ix9) obj3;
                    k4p1.b(ix9Var.a, ix9Var.b, ix9Var.c, u291.d(nim0Var, 1.0f), x340Var28, 3072);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var29 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                k0a k0aVar = (k0a) obj3;
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    maa maaVar = (maa) k0aVar.c.get();
                    m0a m0aVar = k0aVar.b;
                    otw.c(maaVar, new i0a(m0aVar.a, m0aVar.b), (qim0) null, (ipb1) null, x340Var30, 0, 12);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 28:
                float fFloatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                q2a q2aVar = (q2a) obj3;
                q2aVar.O0 = fFloatValue2;
                ha71.x(q2aVar);
                return rih1Var;
            default:
                x340 x340Var31 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                v3a v3aVar = (v3a) obj3;
                String str8 = v3aVar.d;
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    bpx bpxVar = bpx.c;
                    boolean z4 = v3aVar.c;
                    if (str8 != null) {
                        x340Var32.i0(1234848958);
                        strO0 = cwl1.n0(z4 ? 2131962890 : 2131962891, new Object[]{str8}, x340Var32);
                        x340Var32.r(false);
                    } else {
                        x340Var32.i0(1235210046);
                        strO0 = cwl1.o0(x340Var32, z4 ? 2131962888 : 2131962889);
                        x340Var32.r(false);
                    }
                    w0h1.a(bpxVar, new jsl(strO0), (qim0) null, 0L, 0L, false, x340Var32, bpx.d, 60);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mu6(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
