package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.PlayIndicatorView;
import com.spotify.playability.esperanto.proto.EsPlayability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fgs0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fgs0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        int iOrdinal;
        o7r0 o7r0Var;
        dg30 dg30Var;
        cxt0 cxt0Var;
        byte b = 0;
        int i = 2;
        switch (this.a) {
            case 0:
                lwy0 lwy0VarS = ((kb61) obj).S();
                xjb1 xjb1Var = (xjb1) this.b;
                bjx bjxVar = lwy0VarS.d;
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(xjb1Var.d);
                v5b1 v5b1Var = s4b1VarX.d;
                if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                    bjxVar.K(xjb1Var);
                } else {
                    if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f) || (iOrdinal = s4b1VarX.c.ordinal()) == 30 || iOrdinal == 171 || iOrdinal == 844 || iOrdinal == 860 || iOrdinal == 926) {
                        bjxVar.K(xjb1Var);
                    } else {
                        n57.e("This link type cannot be handled by PlayActionHandler");
                    }
                }
                ((rvy0) bjxVar.f).a(xjb1Var.a);
                return rih1.a;
            case 1:
                lwy0 lwy0VarS2 = ((kb61) obj).S();
                ez1 ez1Var = (ez1) this.b;
                c21 c21Var = lwy0VarS2.e;
                Set set2 = s4b1.f;
                String str = ez1Var.d;
                if (gz1.a[uic.x(str).c.ordinal()] == 1) {
                    ((vku) c21Var.t).a(j2h1.D((q8n) c21Var.i, new wt(c21Var, str, (lnm) null, (byte) 4)).subscribe());
                    ((l0x0) c21Var.g).p(ez1Var.b, str);
                    ((rb00) c21Var.f).a("ADD_TO_YOUR_EPISODES", ez1Var.b, ez1Var.c, ez1Var.d, ez1Var.e);
                } else {
                    n57.e("This link type cannot be handled by AddToYourEpisodesActionHandler");
                }
                ((rvy0) c21Var.h).a(ez1Var.a);
                return rih1.a;
            case 2:
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", ((ems0) this.b).a.getPackageName(), null));
                intent.addFlags(268435456);
                return intent;
            case 3:
                ((Number) obj).intValue();
                return ((xsk0) this.b).b();
            case 4:
                ((ez20) obj).d(d9y0.j(new wao0(1, (nxs0) this.b, nxs0.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0, (byte) 21)));
                return rih1.a;
            case 5:
                return new xwm0((otf1) this.b, (byte) 8);
            case 6:
                ((qtr) obj).b(new psm((ngs0) this.b, (lnm) null, (byte) 3));
                return rih1.a;
            case 7:
                cir0 cir0Var = (cir0) obj;
                mxp mxpVar = (mxp) ((c4t0) this.b).c.a.c;
                d8u d8uVar = mxpVar.a;
                switch (d8uVar.a) {
                    case 0:
                        o7r0Var = (o7r0) d8uVar.b0.get();
                        break;
                    default:
                        o7r0Var = (o7r0) d8uVar.b0.get();
                        break;
                }
                o7r0 o7r0Var2 = o7r0Var;
                c8o.l(o7r0Var2);
                lik1 lik1VarD = brt.D(mxpVar.c);
                abu abuVar = mxpVar.c;
                dbu dbuVarF = mxpVar.f();
                d8u d8uVar2 = mxpVar.a;
                switch (d8uVar2.a) {
                    case 0:
                        dg30Var = (dg30) d8uVar2.O.get();
                        break;
                    default:
                        dg30Var = (dg30) d8uVar2.O.get();
                        break;
                }
                dg30 dg30Var2 = dg30Var;
                c8o.l(dg30Var2);
                fal1 fal1VarN0 = d8uVar2.n0();
                c8o.l(fal1VarN0);
                return new g4t0(o7r0Var2, lik1VarD, abuVar, dbuVarF, dg30Var2, fal1VarN0, (j4t0) mxpVar.n2.get(), (fq10) mxpVar.i2.get(), mxpVar.m(), (i4t0) mxpVar.Z1.get(), new jxp0(new zhq0(mxpVar.f(), new twa(new khc((byte) 10, false)), (byte) 6), (byte) 4), cir0Var, (hcl1) mxpVar.i.get(), (bcl1) mxpVar.h.get(), (q9l1) mxpVar.g.get(), (v7m0) mxpVar.p0.get(), (hcl1) mxpVar.i.get(), (lxp) mxpVar.o2.get(), (q9l1) mxpVar.g.get());
            case 8:
                q8u0 q8u0Var = (q8u0) this.b;
                return new lt20(h5p1.s(q8u0Var.isActive(), q8u0Var.i(), q8u0Var.a(), new dft0((qet0) obj, null)), new ob00(3, (lnm) null, (byte) 20), (byte) 0);
            case 9:
                return new otf(rqt0.t(((clm) this.b).a, u2m.t), (byte) 3);
            case 10:
                b261.n((e261) obj, ((jsl) this.b).a);
                return rih1.a;
            case 11:
                xua0 xua0Var = (xua0) obj;
                xua0Var.a = (short) 1250;
                float[] fArr = (float[]) this.b;
                wua0 wua0VarA = xua0Var.a(Float.valueOf(fArr[1]), 250);
                ceo ceoVar = wkt0.a;
                wua0VarA.b = ceoVar;
                xua0Var.a(Float.valueOf(fArr[2]), 500).b = ceoVar;
                xua0Var.a(Float.valueOf(fArr[3]), 750).b = ceoVar;
                xua0Var.a(Float.valueOf(fArr[4]), 1000).b = ceoVar;
                return rih1.a;
            case 12:
                xiw0 xiw0Var = (xiw0) obj;
                r0s0 r0s0Var = ((PlayIndicatorView) this.b).a;
                if (!xiw0Var.equals(wiw0.b)) {
                    if (xiw0Var.equals(wiw0.d)) {
                        ((ComposeView) r0s0Var.c).setVisibility(8);
                    } else {
                        if (!xiw0Var.equals(wiw0.a) && !xiw0Var.equals(wiw0.c) && !xiw0Var.equals(wiw0.e)) {
                            eg.o();
                            return null;
                        }
                        ((ComposeView) r0s0Var.c).setVisibility(0);
                    }
                }
                return rih1.a;
            case 13:
                String str2 = ((lnt0) obj).a;
                rmt0 rmt0Var = (rmt0) this.b;
                return h5p1.s(rmt0Var.a, rmt0Var.b.a, rmt0Var.c.a(), new w63(str2, (lnm) null, (byte) 14));
            case 14:
                el9 el9Var = (el9) this.b;
                return h5p1.s(d3p1.F(el9Var.b, el9Var.c, (lnt0) obj), ((clm) el9Var.i).a, ((nwt) el9Var.t).a(), new vd2(4, (lnm) null, (byte) 22));
            case 15:
                ((View) obj).setTag(((uk00) ((u9c) this.b).e).a, Boolean.TRUE);
                return rih1.a;
            case 16:
                ((qtr) obj).b(new k1((lot0) this.b, (lnm) null, (byte) 23));
                return rih1.a;
            case 17:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 2);
                v6y0 v6y0Var = (v6y0) this.b;
                b261.E(e261Var, kbb.n(v6y0Var.c));
                if (v6y0Var.d) {
                    b261.a(e261Var);
                }
                return rih1.a;
            case 18:
                rb3 rb3Var = (rb3) this.b;
                return new hot0((String) rb3Var.c, 1, ((xyl1) ((qpj1) rb3Var.d).c).a(((cxc0) obj).f.q));
            case 19:
                rwq0.z((qtr) obj, new lpt0((dfm) this.b, b));
                return rih1.a;
            case 20:
                return new m441(new k1e0((kqt0) obj, (mqt0) this.b, (lnm) null, (byte) 21));
            case 21:
                Set set3 = (Set) obj;
                ewn0 ewn0Var = (ewn0) this.b;
                List listL1 = o7h.l1(set3);
                ctt0 ctt0Var = (ctt0) ((ynb0) ewn0Var.b).get();
                aqz aqzVarO = EsPlayability.GetLocallyPlayableRequest.o();
                aqzVarO.n(listL1);
                return new iib(yoi1.g(ctt0Var.callStream("spotify.playability.esperanto.proto.Playability", "SubscribeLocallyPlayable", aqzVarO.build()).map(qs10.Z0).map(new ekb(ewn0Var, (byte) 19)).onErrorReturnItem(new itt0(z6x.a))), set3, (byte) 10);
            case 22:
                Set set4 = (Set) obj;
                return new m9r0(((hut0) this.b).b(set4), set4, (byte) 8);
            case 23:
                ((Number) obj).intValue();
                return ((htl0) this.b).b();
            case 24:
                int iC = l1d.C(((bxt0) this.b).b);
                if (iC != 0) {
                    if (iC == 1) {
                        i = 1;
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        i = 3;
                    }
                }
                return new axt0(i, obj);
            case 25:
                int iC2 = l1d.C(((jxt0) this.b).e);
                if (iC2 == 0) {
                    cxt0Var = cxt0.b;
                } else if (iC2 == 1) {
                    cxt0Var = cxt0.a;
                } else {
                    if (iC2 != 2) {
                        eg.o();
                        return null;
                    }
                    cxt0Var = cxt0.c;
                }
                return new dxt0(cxt0Var, obj);
            case 26:
                List list = ((wsc0) obj).e;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zuc0) it.next()).c);
                }
                return arrayList.contains(((cs01) this.b).d) ? pyt0.a : pyt0.b;
            case 27:
                far farVarJ0 = ((ExoPlayer) obj).J0();
                if (farVarJ0 != null) {
                    synchronized (farVarJ0) {
                    }
                }
                ((AtomicReference) this.b).set(new loj1(farVarJ0 != null ? farVarJ0.e : 0L, farVarJ0 != null ? farVarJ0.g : 0L));
                return rih1.a;
            case 28:
                return ((lgy) this.b).h((m0u0) obj);
            default:
                a1r0.j(((xlr) this.b).a, nik1.t1.a, (String) null, (Bundle) null, false, 14);
                return rih1.a;
        }
    }
}
