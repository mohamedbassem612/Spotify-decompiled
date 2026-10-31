package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rsc1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsc1(d3k d3kVar, gdf1 gdf1Var, tob1 tob1Var) {
        super(1);
        this.a = (byte) 14;
        this.b = d3kVar;
        this.d = gdf1Var;
        this.c = tob1Var;
    }

    private final Object a(Object obj) {
        char c;
        String str;
        Object value;
        by10 by10Var = (by10) obj;
        n9i1 n9i1Var = (n9i1) this.b;
        by10Var.toString();
        int iOrdinal = by10Var.ordinal();
        if (iOrdinal == 0) {
            c = 4;
        } else if (iOrdinal == 1) {
            c = 2;
        } else if (iOrdinal != 2) {
            c = iOrdinal != 3 ? (char) 3 : (char) 1;
        } else {
            c = 5;
        }
        i8h1 i8h1Var = n9i1Var.a;
        x6h1 x6h1VarC = n9i1Var.c.b.c();
        x6h1VarC.i.add(new a7h1("topic_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        if (c == 1) {
            str = "app_issue";
        } else if (c == 2) {
            str = "offline_issue";
        } else if (c == 3) {
            str = "other_technical_issue";
        } else if (c == 4) {
            str = "playback_issue";
        } else {
            if (c != 5) {
                throw null;
            }
            str = "spotify_connect_issue";
        }
        x6h1VarC2.i.add(new a7h1("topic_item", str, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        bpb1 bpb1Var = ((w9i1) this.c).c1;
        do {
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, e9i1.b((e9i1) value, by10Var, (String) null, (String) null, (ArrayList) null, 14)));
        ((gon0) this.d).q("send_screen");
        return rih1.a;
    }

    private final Object d(Object obj) {
        String str = (String) obj;
        ymi1 ymi1VarC = ((fni1) this.b).c();
        boi1 boi1Var = (coi1) this.c;
        ymi1VarC.getClass();
        boi1 boi1Var2 = boi1Var instanceof boi1 ? boi1Var : null;
        if (boi1Var2 != null) {
            ArrayList arrayList = boi1Var2.a;
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (u890.j(((yc90) it.next()).a.getUsername(), str)) {
                    break;
                }
                i++;
            }
            yc90 yc90Var = (yc90) o7h.t0(i, arrayList);
            if (yc90Var != null) {
                i8h1 i8h1Var = ymi1VarC.a;
                sqk0 sqk0VarB = ymi1VarC.b(yc90Var, i);
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), sqk0VarB.b, r6h1.c, System.currentTimeMillis()), (xj61) null);
            }
        }
        ((iu30) this.d).invoke(new emi1(str));
        return rih1.a;
    }

    private final Object e(Object obj) {
        wfx wfxVar = ((xfx) this.b).c;
        zpr zprVar = new zpr(wfxVar.b, wfxVar.a, null, 8);
        oyi1 oyi1Var = (oyi1) this.c;
        zprVar.n(new izg1((Function0) this.d, (byte) 4));
        String str = oyi1Var.i;
        String str2 = oyi1Var.j;
        String str3 = oyi1Var.o;
        String str4 = oyi1Var.m;
        String str5 = oyi1Var.p;
        zprVar.f(new z800(str, oyi1Var.h, str3, oyi1Var.k, oyi1Var.l, str4, str5, str2));
        return (ConstraintLayout) ((g2z) zprVar.f).a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    public final Object invoke(Object obj) {
        sju sjuVar;
        tv80 tv80VarM;
        Object obj2;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        String q1hVar = null;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                return d9y0.k(eqr0.B(ern1.x((qim0) obj, new qsc1((hdn0) obj5, (byte) 0)), new lws0((tob1) obj4, (byte) 21)), ((Number) ((tob1) obj3).getValue()).floatValue());
            case 1:
                c380 c380Var = (c380) obj5;
                ((pub0) obj).P(c380Var.size(), (iu30) null, new rw11(c380Var, (byte) 20), (gv20) null, new j2i(-1466459515, new d311((byte) 5, (irp) obj4, (vu30) obj3, c380Var), true));
                return rih1Var;
            case 2:
                dnc0 dnc0Var = (dnc0) obj;
                iyq0 iyq0Var = (iyq0) obj5;
                ufr0 ufr0Var = (ufr0) obj4;
                tcr0 tcr0Var = (tcr0) obj3;
                int i = 0;
                for (Object obj6 : ufr0Var.c) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    rfr0 rfr0Var = (rfr0) obj6;
                    two1.v(dnc0Var, new ked(new zed1(rfr0Var.a, ufr0Var, i), rfr0Var, ufr0Var, i, (byte) 2), false, new ccb1(iyq0Var, tcr0Var, (byte) 23));
                    i = i2;
                }
                return rih1Var;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                i8h1 i8h1Var = ((qhd1) obj5).i;
                ouk0 ouk0Var = (ouk0) obj4;
                Integer numValueOf = Integer.valueOf(iIntValue);
                apd apdVar = (apd) o7h.t0(iIntValue, ((fpd) obj3).getItems());
                String strL = apdVar != null ? l0p1.l(apdVar) : null;
                x6h1 x6h1VarC = ouk0Var.b.c();
                x6h1VarC.i.add(new a7h1("item", (String) null, numValueOf, strL, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = ouk0Var.a;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1Var;
            case 4:
                os11 os11Var = (os11) obj;
                os11Var.r = new lvc1(gto.a, gto.b, fto.a, (byte) 26);
                os11Var.g = new mka((byte) 3);
                mmd1 mmd1Var = (mmd1) obj5;
                os11Var.k = new qld1(mmd1Var, (byte) 11);
                tgm tgmVar = new tgm((String) null, false, false, false, false, false, true, (yh10) null, false, false, 2, true, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -10369, 1);
                bap bapVar = mmd1Var.p;
                d0r d0rVar = mmd1Var.D;
                f0a f0aVar = (f0a) bapVar.a.c;
                rbq rbqVar = ((eto) f0aVar.b).z;
                c8o.l(rbqVar);
                req reqVar = ((eto) f0aVar.b).A;
                c8o.l(reqVar);
                eto etoVar = (eto) f0aVar.b;
                vgm vgmVar = etoVar.B;
                c8o.l(vgmVar);
                lik1 lik1Var = etoVar.o0;
                c8o.l(lik1Var);
                PlayOrigin playOrigin = (PlayOrigin) ((d7p) f0aVar.f).get();
                String str = etoVar.r0;
                c8o.l(str);
                mje mjeVar = new mje();
                p4p p4pVar = (p4p) ((jly0) f0aVar.i).get();
                q8n q8nVar = etoVar.E0;
                c8o.l(q8nVar);
                boolean z = etoVar.F0;
                boolean z2 = etoVar.G0;
                ks6 ks6VarX = f0aVar.x();
                jn7 jn7Var = etoVar.j0;
                qix0 qix0Var = etoVar.k0;
                c8o.l(qix0Var);
                kp5 kp5Var = new kp5(rbqVar, reqVar, vgmVar, lik1Var, playOrigin, tgmVar, d0rVar, str, mjeVar, p4pVar, q8nVar, z, z2, ks6VarX, jn7Var, qix0Var, etoVar.n0);
                y1c1 y1c1Var = (y1c1) obj4;
                iac0 iac0Var = mmd1Var.B;
                fn31.T(cto1.q(iac0Var), (o8n) null, 0, new vs0(y1c1Var, kp5Var, (lnm) null, (byte) 20), 3);
                wlr wlrVar = new wlr(vgmVar, lik1Var, tgmVar, d0rVar, str, y1c1Var, mjeVar, p4pVar.a(iac0Var, playOrigin), q8nVar, z, z2, (uq8) kp5Var.h, new hsc(kp5Var, (lnm) null, (byte) 12));
                os11Var.e = two1.q(br11.W0, w7x.a, new sdb1(mmd1Var, wlrVar, (byte) 14));
                os11Var.i = new fna(((f0a) mmd1Var.q.a.c).x().d(y1c1Var), (byte) 11);
                os11Var.h = new hke(new r0s0(ks6VarX.d(y1c1Var), (btt0) ((AtomicReference) ks6VarX.R0).updateAndGet(new ycr0(ks6VarX, y1c1Var, (byte) 3)), (zrt0) ((AtomicReference) ks6VarX.S0).updateAndGet(new ycr0(ks6VarX, y1c1Var, (byte) 2)), (byte) 16), reqVar.a(iac0Var, ks6VarX.d(y1c1Var), playOrigin), wlrVar, (mp8) obj3, str, new dt0(kp5Var, (lnm) null, (byte) 19), q8nVar);
                os11Var.j = new a2(new qld1(mmd1Var, (byte) 12), (byte) 12);
                os11Var.y = 2;
                os11Var.p = mmd1Var.u;
                os11Var.w = true;
                return rih1Var;
            case 5:
                List list = (List) obj5;
                ((kex) obj).b(list.size(), new j2i(1658481532, new nu31(list, (vu30) obj4, (vu30) obj3, (byte) 29), true), new bic1(list, (byte) 7));
                return rih1Var;
            case 6:
                jyi0 jyi0Var = (lyi0) obj;
                String str2 = ((v1j0) obj4).b;
                iu30 iu30Var = (iu30) obj5;
                if (jyi0Var.equals(eyi0.a)) {
                    iu30Var.invoke(new o0j0(str2));
                } else if (jyi0Var.equals(fyi0.a)) {
                    ((Function0) obj3).invoke();
                } else if (jyi0Var instanceof gyi0) {
                    iu30Var.invoke(new p0j0(str2, ((gyi0) jyi0Var).a));
                } else if (jyi0Var instanceof iyi0) {
                    iu30Var.invoke(new s0j0(str2));
                } else if (jyi0Var instanceof jyi0) {
                    iu30Var.invoke(new t0j0(str2, jyi0Var.a));
                } else if (jyi0Var instanceof kyi0) {
                    iu30Var.invoke(new v0j0(((kyi0) jyi0Var).a));
                } else if (jyi0Var instanceof dyi0) {
                    iu30Var.invoke(new m0j0(str2, ((dyi0) jyi0Var).a));
                } else {
                    if (!(jyi0Var instanceof hyi0)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new q0j0(str2, ((hyi0) jyi0Var).a));
                }
                return rih1Var;
            case 7:
                c380 c380Var2 = (c380) obj5;
                ((rtb0) obj).e(c380Var2.size(), new rw11(c380Var2, (byte) 27), new rw11(c380Var2, (byte) 28), new j2i(2039820996, new d311((byte) 7, (iie1) obj4, (iu30) obj3, c380Var2), true));
                return rih1Var;
            case 8:
                if (((yie1) obj) == yie1.d) {
                    ((vu30) obj5).invoke((String) obj4, (Object) null);
                } else {
                    ((Function0) obj3).invoke();
                }
                return rih1Var;
            case 9:
                c380 c380Var3 = (c380) obj5;
                ((rtb0) obj).e(c380Var3.size(), new rw11(c380Var3, (byte) 29), new vse1(c380Var3, (byte) 0), new j2i(2039820996, new d311((byte) 8, (pre1) obj4, (iu30) obj3, c380Var3), true));
                return rih1Var;
            case 10:
                xhm1 xhm1Var = (xhm1) obj;
                err0 err0Var = (hdn0) obj5;
                r6f1 r6f1Var = (r6f1) ((c380) obj4).get(err0Var.s());
                int i3 = r6f1Var.i;
                if (i3 == 0) {
                    return null;
                }
                ard1 ard1Var = ((c7f1) obj3).d;
                int iS = err0Var.s();
                rx7 rx7Var = r6f1Var.f;
                return ard1Var.c(xhm1Var, zqd1.d, iS, (rx7Var == null || (sjuVar = rx7Var.c) == null) ? null : sjuVar.c, i3);
            case 11:
                ven0 ven0Var = (ven0) obj4;
                if (obj5 != null && !((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                    try {
                        lz20.b((lz20) obj3);
                        break;
                    } catch (IllegalStateException unused) {
                    }
                }
                return rih1Var;
            case 12:
                int iIntValue2 = ((Number) obj).intValue();
                sa90 sa90Var = (sa90) obj5;
                b2u.u(iIntValue2, (j7s) sa90Var.c, (ard1) sa90Var.d, (xhm1) ((ven0) obj4).getValue());
                ((ven0) obj3).setValue(Integer.valueOf(iIntValue2));
                return rih1Var;
            case 13:
                int iIntValue3 = ((Number) obj).intValue();
                ve8 ve8Var = (ve8) obj5;
                b2u.u(iIntValue3, (j7s) ve8Var.b, (ard1) ve8Var.c, (xhm1) ((ven0) obj4).getValue());
                ((ven0) obj3).setValue(Integer.valueOf(iIntValue3));
                return rih1Var;
            case 14:
                ((kd31) obj).b(((d3k) obj5) != null ? 0.0f : ((Boolean) ((gdf1) obj3).j.getValue()).booleanValue() ? 1.0f : ((Number) ((tob1) obj4).getValue()).floatValue());
                return rih1Var;
            case 15:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                gdf1 gdf1Var = (gdf1) obj5;
                z2k1 z2k1Var = (z2k1) obj4;
                videoSurfaceView.setScaleType(b3k1.c);
                videoSurfaceView.setSupportsSurfaceView(false);
                videoSurfaceView.setUseSurfaceView(false);
                gdf1Var.c.a(videoSurfaceView);
                videoSurfaceView.setOnFirstFrameRendered(new odp0(z2k1Var, videoSurfaceView.getOnFirstFrameRendered(), gdf1Var, (ven0) obj3, (byte) 20));
                z2k1Var.b.setValue(Boolean.TRUE);
                return videoSurfaceView;
            case 16:
                rtb0 rtb0Var = (rtb0) obj;
                rtb0.c(rtb0Var, (Object) null, new j2i(-9333503, new k0c0((Uri) obj4, (byte) 4), true), 3);
                xjf1 xjf1Var = (xjf1) obj5;
                rtb0.c(rtb0Var, (Object) null, new j2i(1631179562, new vjf1(xjf1Var, (byte) 0), true), 3);
                rtb0.c(rtb0Var, (Object) null, new j2i(1203909833, new vjf1(xjf1Var, (byte) 1), true), 3);
                List list2 = xjf1Var.f;
                rtb0Var.e(list2.size(), new h501(list2, (byte) 1), new vse1(list2, (byte) 3), new j2i(802480018, new ki1(list2, (iu30) obj3, (byte) 10), true));
                return rih1Var;
            case 17:
                e261 e261Var = (e261) obj;
                ven0 ven0Var2 = (ven0) obj3;
                b261.A(e261Var, no80.c(ven0Var2) ? (String) obj5 : (String) obj4);
                if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                    e261Var.b(m161.u, new we((String) null, new aya1(ven0Var2, (byte) 13)));
                } else {
                    e261Var.b(m161.t, new we((String) null, new aya1(ven0Var2, (byte) 14)));
                }
                return rih1Var;
            case 18:
                xnf1 xnf1Var = (xnf1) obj5;
                i160 i160Var = xnf1Var.b;
                snf1 snf1Var = (snf1) obj4;
                vnf1 vnf1Var = snf1Var.m;
                y570 y570Var = (y570) obj3;
                switch (((rnf1) obj).ordinal()) {
                    case 0:
                        boolean z3 = snf1Var.h;
                        brl0 brl0Var = i160Var.l;
                        String str3 = i160Var.b;
                        i8h1 i8h1Var2 = i160Var.g;
                        if (z3) {
                            brl0Var.getClass();
                            x6h1 x6h1VarC2 = brl0Var.b.c();
                            x6h1VarC2.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC2.j = false;
                            x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                            x6h1VarC3.i.add(new a7h1("heart_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC3.j = false;
                            tv80VarM = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str3 != null ? str3 : "")), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        } else {
                            brl0Var.getClass();
                            x6h1 x6h1VarC4 = brl0Var.b.c();
                            x6h1VarC4.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC4.j = false;
                            x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                            x6h1VarC5.i.add(new a7h1("heart_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC5.j = false;
                            tv80VarM = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str3 != null ? str3 : "")), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        }
                        vku vkuVar = i160Var.m;
                        oj3 oj3Var = i160Var.i;
                        List listSingletonList = Collections.singletonList(str3);
                        String str4 = i160Var.b;
                        vkuVar.a(oj3Var.c(listSingletonList, str4, str4, z3, new gj3(27, tv80VarM)).subscribe());
                        break;
                    case 1:
                        qm30 qm30Var = new qm30(snf1Var.a, snf1Var.b, snf1Var.d, snf1Var.e, snf1Var.f, snf1Var.h, snf1Var.j);
                        i8h1 i8h1Var3 = i160Var.g;
                        brl0 brl0Var2 = i160Var.l;
                        brl0Var2.getClass();
                        x6h1 x6h1VarC6 = brl0Var2.b.c();
                        x6h1VarC6.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                        x6h1VarC7.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        tv80 tv80VarM2 = i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        lc20 lc20Var = i160Var.c;
                        mfm mfmVarA = ((i4q) lc20Var.d).a(new lik1((String) lc20Var.b));
                        wp20 wp20Var = (wp20) lc20Var.c;
                        Observable map = ((bl3) wp20Var.d).g((String) wp20Var.a).toObservable().map(new dh30(wp20Var, qm30Var, (byte) 2));
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        mfm.b(mfmVarA, map, yon1.F1(), (bjm) null, tv80VarM2, 20);
                        break;
                    case 2:
                        if (i160Var.k.c()) {
                            jtf1 jtf1Var = (jtf1) i160Var.n.getValue();
                            fn31.T(cto1.q(jtf1Var.d), jtf1Var.e, 0, new i7u0(jtf1Var, (lnm) null, (byte) 12), 2);
                        } else {
                            Iterator it = y570Var.s().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    sc70 sc70Var = (j570) ((y570) next).j().get("click");
                                    if (u890.j(sc70Var != null ? sc70Var.b.b : null, "playFromContext")) {
                                        obj2 = next;
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            y570 y570Var2 = (y570) obj2;
                            if (y570Var2 != null) {
                                Object obj7 = y570Var2.j().get("click");
                                obj7.getClass();
                                i160Var.e.a((j570) obj7, new u570("click", y570Var2, gg11.g));
                            }
                        }
                        break;
                    case 3:
                        i160Var.d.e();
                        break;
                    case 4:
                        vku vkuVar2 = xnf1Var.e;
                        zft0 zft0Var = snf1Var.g.b;
                        i8h1 i8h1Var4 = i160Var.g;
                        brl0 brl0Var3 = i160Var.l;
                        brl0Var3.getClass();
                        x6h1 x6h1VarC8 = brl0Var3.b.c();
                        x6h1VarC8.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                        x6h1VarC9.i.add(new a7h1("shuffle_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        vkuVar2.a(i160Var.f.l((tv80) null).subscribe());
                        break;
                    case 5:
                        i8h1 i8h1Var5 = i160Var.g;
                        brl0 brl0Var4 = i160Var.l;
                        brl0Var4.getClass();
                        x6h1 x6h1VarC10 = brl0Var4.b.c();
                        x6h1VarC10.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC10.j = false;
                        x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                        x6h1VarC11.i.add(new a7h1("unban_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC11.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC11.a();
                        String str5 = i160Var.b;
                        i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_dislike", 1, Collections.singletonMap("item_no_longer_disliked", str5 != null ? str5 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                        i160Var.m.a(rqt0.F(o6x.a, new j020(i160Var, (lnm) null, (byte) 22)).subscribe());
                        break;
                    case 6:
                        if (vnf1Var != null) {
                            String str6 = vnf1Var.b;
                            i160Var.getClass();
                            String str7 = (String) o7h.q0(ihc1.Q0(str6, new String[]{"?"}, 0, 6));
                            i8h1 i8h1Var6 = i160Var.g;
                            r6h1 r6h1VarB = i160Var.l.b();
                            y6h1 y6h1Var = y6h1.i;
                            x6h1 x6h1VarI = i3o1.i();
                            x6h1VarI.h = "music";
                            x6h1VarI.a = "mobile-entity-explorer-button";
                            x6h1VarI.f = "4.0.0";
                            x6h1VarI.g = "22.0.0";
                            x6h1 x6h1VarC12 = x6h1VarI.a().c();
                            x6h1VarC12.i.add(new a7h1("entity_explorer_button", (String) null, (Integer) null, str7, (String) null));
                            x6h1VarC12.j = true;
                            y6h1 y6h1VarA3 = x6h1VarC12.a();
                            k7h1 k7h1Var2 = new k7h1();
                            ((xjn) k7h1Var2).a = y6h1VarA3;
                            ((xjn) k7h1Var2).b = r6h1VarB;
                            ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                            i8h1Var6.f(k7h1Var2.a(), (Set) null);
                        } else {
                            i160Var.getClass();
                        }
                        break;
                    case 7:
                        if (vnf1Var != null) {
                            String str8 = vnf1Var.b;
                            i160Var.getClass();
                            String str9 = (String) o7h.q0(ihc1.Q0(str8, new String[]{"?"}, 0, 6));
                            i8h1 i8h1Var7 = i160Var.g;
                            r6h1 r6h1VarB2 = i160Var.l.b();
                            y6h1 y6h1Var2 = y6h1.i;
                            x6h1 x6h1VarI2 = i3o1.i();
                            x6h1VarI2.h = "music";
                            x6h1VarI2.a = "mobile-entity-explorer-button";
                            x6h1VarI2.f = "4.0.0";
                            x6h1VarI2.g = "22.0.0";
                            x6h1 x6h1VarC13 = x6h1VarI2.a().c();
                            x6h1VarC13.i.add(new a7h1("entity_explorer_button", (String) null, (Integer) null, str9, (String) null));
                            x6h1VarC13.j = true;
                            i160Var.d.a(str8, i8h1Var7.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str9 != null ? str9 : "")), x6h1VarC13.a(), r6h1VarB2, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                        } else {
                            i160Var.getClass();
                        }
                        break;
                    default:
                        eg.o();
                        return null;
                }
                return rih1Var;
            case 19:
                tv80 tv80Var = (tv80) obj;
                yt91 yt91Var = (yt91) ((ltf1) obj5).b;
                String str10 = (String) obj4;
                String str11 = (String) obj3;
                String strH0 = !nhc1.Y(str11, "spotify:playlist:", false) ? null : ihc1.H0(str11, "spotify:playlist:");
                if (strH0 != null) {
                    fn31.T((u9c0) yt91Var.d, (o8n) null, 0, new uk71(yt91Var, tv80Var, gvg.h("spotify:internal:playlist-speedcontrol:", strH0, ":", Uri.encode(str10)), (lnm) null, (byte) 26), 3);
                }
                return rih1Var;
            case 20:
                cce cceVar = ((o2g1) obj5).X0;
                e1h e1hVar = (e1h) obj4;
                fy6 fy6Var = e1hVar.b;
                int i4 = e1hVar.c;
                int iOrdinal = ((rwf1) obj).ordinal();
                if (iOrdinal == 0) {
                    String str12 = fy6Var.a;
                    i8h1 i8h1Var8 = (i8h1) cceVar.b;
                    x6h1 x6h1VarC14 = ((bqk0) cceVar.c).b.c();
                    x6h1VarC14.i.add(new a7h1("item_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC14.a();
                    Integer numValueOf2 = Integer.valueOf(i4);
                    x6h1 x6h1VarC15 = y6h1VarA4.c();
                    x6h1VarC15.i.add(new a7h1("item", (String) null, numValueOf2, str12, (String) null));
                    x6h1VarC15.j = false;
                    q1hVar = new q1h(e1hVar, i8h1Var8.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str12)), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis()), (xj61) null));
                } else if (iOrdinal == 1) {
                    String str13 = fy6Var.a;
                    i8h1 i8h1Var9 = (i8h1) cceVar.b;
                    x6h1 x6h1VarC16 = ((bqk0) cceVar.c).b.c();
                    x6h1VarC16.i.add(new a7h1("item_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC16.a();
                    Integer numValueOf3 = Integer.valueOf(i4);
                    x6h1 x6h1VarC17 = y6h1VarA5.c();
                    x6h1VarC17.i.add(new a7h1("item", (String) null, numValueOf3, str13, (String) null));
                    x6h1VarC17.j = false;
                    q1hVar = new s1h(e1hVar, i8h1Var9.m(new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC17.a(), r6h1.c, System.currentTimeMillis()), (xj61) null));
                } else if (iOrdinal == 2) {
                    String str14 = fy6Var.a;
                    i8h1 i8h1Var10 = (i8h1) cceVar.b;
                    x6h1 x6h1VarC18 = ((bqk0) cceVar.c).b.c();
                    x6h1VarC18.i.add(new a7h1("item_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    y6h1 y6h1VarA6 = x6h1VarC18.a();
                    Integer numValueOf4 = Integer.valueOf(i4);
                    x6h1 x6h1VarC19 = y6h1VarA6.c();
                    x6h1VarC19.i.add(new a7h1("item", (String) null, numValueOf4, str14, (String) null));
                    x6h1VarC19.j = false;
                    x6h1 x6h1VarC20 = x6h1VarC19.a().c();
                    x6h1VarC20.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC20.j = false;
                    q1hVar = new r1h(e1hVar, i8h1Var10.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC20.a(), r6h1.c, System.currentTimeMillis()), (xj61) null));
                }
                if (q1hVar != null) {
                    ((qka) obj3).invoke(q1hVar);
                }
                return rih1Var;
            case 21:
                eos eosVar = (eos) ((h680) obj5).c;
                boolean z4 = ((idg1) obj4).b;
                TextView textView = (TextView) ((ilh1) eosVar.b).c;
                if (z4) {
                    textView.setMaxLines(1);
                    textView.setTextAppearance(2132018004);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams.gravity = 17;
                    textView.setLayoutParams(layoutParams);
                } else {
                    textView.setMaxLines(2);
                    textView.setTextAppearance(2132018007);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams2.gravity = 80;
                    textView.setLayoutParams(layoutParams2);
                }
                pbl1 pbl1Var = (pbl1) ((ven0) obj3).getValue();
                if (pbl1Var != null) {
                    eosVar.f(pbl1Var);
                } else {
                    eosVar.f(new pbl1("", new tr80(0, 0, 1), false, false));
                }
                return rih1Var;
            case 22:
                return new q7h1((t2j0) obj5, (v6h1) ((b6h1) obj4).a((rj41) obj), (s7h1) obj3);
            case 23:
                return fn31.T((c9n) obj5, (o8n) null, 0, new vxg1((r35) obj4, (Context) obj3, (String) obj, (lnm) null, (byte) 5), 3);
            case 24:
                kvh1 kvh1Var = new kvh1(((Number) obj).intValue());
                ((iu30) obj5).invoke(kvh1Var);
                if (!kvh1Var.equals((mvh1) obj4)) {
                    ((iu30) obj3).invoke(kvh1Var);
                }
                return rih1Var;
            case 25:
                qxc0 qxc0Var = (qxc0) obj5;
                String str15 = qxc0Var.b.d;
                if (str15 == null) {
                    q1hVar = qxc0Var.b.a;
                } else {
                    q1hVar = str15.length() != 0 ? str15 : null;
                    if (q1hVar == null) {
                        q1hVar = qxc0Var.b.a;
                    }
                }
                ((drp0) ((qeh1) obj4).b).h(2, (String) obj3, q1hVar);
                return rih1Var;
            case 26:
                return a(obj);
            case 27:
                return d(obj);
            case 28:
                return e(obj);
            default:
                cvi1 cvi1Var = (dvi1) obj;
                iu30 iu30Var2 = (iu30) obj5;
                if (cvi1Var.equals(bvi1.a)) {
                    iu30Var2.invoke(mwi1.a);
                } else {
                    if (!(cvi1Var instanceof cvi1)) {
                        eg.o();
                        return null;
                    }
                    String str16 = ((h1a) obj3).a;
                    String str17 = cvi1Var.a;
                    iu30Var2.invoke(new nwi1(str17, ((t8r0) obj4).j(new vu80(str16, str17))));
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rsc1(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsc1(c380 c380Var, hdn0 hdn0Var, c7f1 c7f1Var) {
        super(1);
        this.a = (byte) 10;
        this.c = c380Var;
        this.b = hdn0Var;
        this.d = c7f1Var;
    }
}
