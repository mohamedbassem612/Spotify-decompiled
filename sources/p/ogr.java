package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.CastDevice;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.download.esperanto.proto.EsDownload$GetMediaHandleIdResponse;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.freshness.FreshnessBadgeView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.endless.uiusecases.changesegmentbutton.ChangeSegmentButton;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import com.spotify.nowplaying.uiusecases.closebutton.CloseButtonNowPlaying;
import com.spotify.nowplaying.uiusecases.contextmenubutton.ContextMenuButtonNowPlaying;
import com.spotify.nowplaying.uiusecases.nextbutton.NextButtonNowPlaying;
import com.spotify.nowplaying.uiusecases.pager.TrackCarouselNowPlaying;
import com.spotify.nowplaying.uiusecases.previousbutton.PreviousButtonNowPlaying;
import com.spotify.nowplaying.uiusecases.seekbar.TrackSeekbarNowPlaying;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ogr implements qiw, k1q0, Function, r9r, jrn0, sh, cy81, nv30, yu30 {
    public final /* synthetic */ byte a;
    public final Object b;

    public ogr(xfx xfxVar) {
        this.a = (byte) 24;
        jd11 jd11Var = rc11.a;
        String strO = jd11Var.b(ver.class).o();
        strO.getClass();
        mmr0 mmr0Var = new mmr0(strO, new dwx(xfxVar, (byte) 4));
        String strO2 = jd11Var.b(yir.class).o();
        strO2.getClass();
        mmr0 mmr0Var2 = new mmr0(strO2, new dwx(xfxVar, (byte) 5));
        String strO3 = jd11Var.b(CloseButtonNowPlaying.class).o();
        strO3.getClass();
        mmr0 mmr0Var3 = new mmr0(strO3, new dwx(xfxVar, (byte) 6));
        String strO4 = jd11Var.b(zpr.class).o();
        strO4.getClass();
        mmr0 mmr0Var4 = new mmr0(strO4, new dwx(xfxVar, (byte) 7));
        String strO5 = jd11Var.b(ContextMenuButtonNowPlaying.class).o();
        strO5.getClass();
        mmr0 mmr0Var5 = new mmr0(strO5, new dwx(xfxVar, (byte) 8));
        String strO6 = jd11Var.b(ChangeSegmentButton.class).o();
        strO6.getClass();
        mmr0 mmr0Var6 = new mmr0(strO6, new dwx(xfxVar, (byte) 9));
        String strO7 = jd11Var.b(fcs.class).o();
        strO7.getClass();
        mmr0 mmr0Var7 = new mmr0(strO7, new dwx(xfxVar, (byte) 10));
        String strO8 = jd11Var.b(NextButtonNowPlaying.class).o();
        strO8.getClass();
        mmr0 mmr0Var8 = new mmr0(strO8, new dwx(xfxVar, (byte) 11));
        String strO9 = jd11Var.b(PreviousButtonNowPlaying.class).o();
        strO9.getClass();
        mmr0 mmr0Var9 = new mmr0(strO9, new dwx(xfxVar, (byte) 12));
        String strO10 = jd11Var.b(eos.class).o();
        strO10.getClass();
        mmr0 mmr0Var10 = new mmr0(strO10, new dwx(xfxVar, (byte) 0));
        String strO11 = jd11Var.b(tps.class).o();
        strO11.getClass();
        mmr0 mmr0Var11 = new mmr0(strO11, new dwx(xfxVar, (byte) 1));
        String strO12 = jd11Var.b(TrackCarouselNowPlaying.class).o();
        strO12.getClass();
        mmr0 mmr0Var12 = new mmr0(strO12, new dwx(xfxVar, (byte) 2));
        String strO13 = jd11Var.b(TrackSeekbarNowPlaying.class).o();
        strO13.getClass();
        this.b = sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, mmr0Var6, mmr0Var7, mmr0Var8, mmr0Var9, mmr0Var10, mmr0Var11, mmr0Var12, new mmr0(strO13, new dwx(xfxVar, (byte) 3))});
    }

    public Object B(dub0 dub0Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        cht chtVar = (cht) this.b;
        chtVar.getClass();
        kf30 kf30Var = dub0Var.e;
        sb.append(chtVar.F("package"));
        String strN = chtVar.n(n8p1.x(lf30.f(kf30Var.a)));
        if (strN.length() > 0) {
            sb.append(" ");
            sb.append(strN);
        }
        if (chtVar.a.n()) {
            sb.append(" in context of ");
            chtVar.M(dub0Var.d, sb, false);
        }
        return rih1.a;
    }

    public /* bridge */ /* synthetic */ Object C(ov30 ov30Var, Object obj) {
        M(ov30Var, (StringBuilder) obj);
        return rih1.a;
    }

    public Object D(ezq0 ezq0Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        cht chtVar = (cht) this.b;
        chtVar.getClass();
        kf30 kf30Var = ezq0Var.f;
        sb.append(chtVar.F("package-fragment"));
        String strN = chtVar.n(n8p1.x(lf30.f(kf30Var.a)));
        if (strN.length() > 0) {
            sb.append(" ");
            sb.append(strN);
        }
        if (chtVar.a.n()) {
            sb.append(" in ");
            chtVar.M(ezq0Var.x1(), sb, false);
        }
        return rih1.a;
    }

    public Object F(vdy0 vdy0Var, Object obj) {
        ((cht) this.b).R(vdy0Var, (StringBuilder) obj);
        return rih1.a;
    }

    public Object G(xdg xdgVar, Object obj) {
        xdg xdgVarB;
        boolean z = xdgVar.e1;
        StringBuilder sb = (StringBuilder) obj;
        cht chtVar = (cht) this.b;
        chtVar.getClass();
        chtVar.w(sb, xdgVar, null);
        fht fhtVar = chtVar.a;
        ce0 ce0Var = fhtVar.o;
        mma0[] mma0VarArr = fht.Y;
        mma0 mma0Var = mma0VarArr[13];
        boolean z2 = (((Boolean) ((sgp0) ce0Var).a).booleanValue() || xdgVar.H1().o() != 2) && chtVar.d0(xdgVar.getVisibility(), sb);
        chtVar.G(xdgVar, sb);
        ce0 ce0Var2 = fhtVar.P;
        mma0 mma0Var2 = mma0VarArr[40];
        boolean z3 = ((Boolean) ((sgp0) ce0Var2).a).booleanValue() || !z || z2;
        if (z3) {
            sb.append(chtVar.F("constructor"));
        }
        beg begVarK = xdgVar.k();
        ce0 ce0Var3 = fhtVar.A;
        mma0 mma0Var3 = mma0VarArr[25];
        if (((Boolean) ((sgp0) ce0Var3).a).booleanValue()) {
            if (z3) {
                sb.append(" ");
            }
            chtVar.M(begVarK, sb, true);
            chtVar.Z(xdgVar.getTypeParameters(), sb, false);
        }
        chtVar.c0(xdgVar.F(), xdgVar.Y(), sb);
        ce0 ce0Var4 = fhtVar.q;
        mma0 mma0Var4 = mma0VarArr[15];
        if (((Boolean) ((sgp0) ce0Var4).a).booleanValue() && !z && (xdgVarB = begVarK.B()) != null) {
            List listF = xdgVarB.F();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listF) {
                tsi1 tsi1Var = (tsi1) obj2;
                if (!tsi1Var.y1() && tsi1Var.X == null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(chtVar.F("this"));
                sb.append(o7h.y0(arrayList, ", ", "(", ")", aht.c, 24));
            }
        }
        ce0 ce0Var5 = fhtVar.A;
        mma0 mma0Var5 = fht.Y[25];
        if (((Boolean) ((sgp0) ce0Var5).a).booleanValue()) {
            chtVar.e0(sb, xdgVar.getTypeParameters());
        }
        return rih1.a;
    }

    public jhm I(String str) {
        return new jhm("sts_edit_item", xmx.c, (fhm) null, 2131962959, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(rnv.P0, new kov(str, (byte) 1)), new wrs(this, str, (byte) 25)), 244);
    }

    public ys11 J(lik1 lik1Var, d0r d0rVar, try tryVar, au11 au11Var, Function0 function0) {
        o3r o3rVarM;
        uqs uqsVar = (uqs) this.b;
        zs11 zs11Var = (zs11) uqsVar.d;
        uny unyVar = (uny) uqsVar.e;
        fns fnsVar = igu.a;
        hvy hvyVar = new hvy(new xzq(new hho(pyf0.a, d0rVar), auy.N0), (byte) 0);
        nty ntyVar = new nty(unyVar.b(lik1Var, function0), (byte) 2);
        o27 o27Var = new o27(2, 2, (l1d) null);
        if (uqsVar.a) {
            o3r o3rVar = e4r.a;
            o3rVarM = w3p1.o(new l4r(jd0.a, 2, ywq.Q0, new j4r(ywq.S0), ywq.R0), ywq.T0);
        } else {
            o3r o3rVar2 = e4r.a;
            l4r l4rVar = new l4r(jd0.r, 2, ywq.U0, new j4r(ywq.a1), ywq.V0);
            jd0 jd0Var = jd0.s;
            o3rVarM = w3p1.m(l4rVar, new l4r(jd0Var, 2, ywq.W0, new j4r(ywq.b1), ywq.X0), new l4r(jd0Var, 2, ywq.Y0, new j4r(ywq.c1), ywq.Z0), zrj.b1);
        }
        o3r o3rVar3 = o3rVarM;
        o3r o3rVarA = e4r.a(uqsVar.b);
        smc0 smc0VarN = k4p1.n();
        jd11 jd11Var = rc11.a;
        smc0VarN.add(new l4r(new wlu(jd11Var.b(jo70.class)), 2, d4r.U0, new j4r(d4r.P0), d4r.V0));
        smc0VarN.add(new l4r(new xv00(jd11Var.b(xkk1.class)), 2, d4r.W0, new j4r(d4r.Q0), d4r.X0));
        smc0VarN.add(new l4r(new xv00(jd11Var.b(hll.class)), 2, d4r.Y0, new j4r(d4r.R0), d4r.Z0));
        smc0VarN.add(new l4r(pwc0.r, 2, d4r.a1, new j4r(d4r.S0), d4r.b1));
        return zs11Var.a(d0rVar, new ls11((ds11) null, (ds11) null, (ds11) null, (ds11) null, hvyVar, ntyVar, (qrk) null, (iu30) null, (iu30) null, tryVar, au11Var, 2, o27Var, (gye1) null, npc1.a, qb2.a, (rru) null, false, o3rVar3, o3rVarA, (o3r) null, (o3r) null, new o3r(k4p1.k(smc0VarN), d4r.T0, false), (o3r) null, (cv11) null, (y5z) null, (bnw0) null, new bt11(true), 0, (o3r) null, -40132145, 503), (nu11) null);
    }

    public CastDevice K(String str) {
        Object next;
        tor torVar = (tor) this.b;
        String str2 = (String) torVar.e.get(str);
        bpb1 bpb1VarB = torVar.a.i;
        if (bpb1VarB == null) {
            bpb1VarB = gio1.b(z6x.a);
        }
        Iterator it = ((Iterable) bpb1VarB.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((pr31) next).a, str2));
        pr31 pr31Var = (pr31) next;
        if (pr31Var == null) {
            Logger.d("CastBasic->%s", new Object[]{"No cast route found for connectStateIdentifier: ".concat(str)});
            return null;
        }
        Bundle bundle = pr31Var.k;
        if (bundle != null) {
            return CastDevice.F(bundle);
        }
        return null;
    }

    public int L(String str) {
        xfa1 xfa1VarI = d7p1.i((rps) this.b, str);
        if (xfa1VarI.equals(xfa1.a)) {
            return 1;
        }
        if (xfa1VarI.equals(xfa1.b)) {
            return 2;
        }
        if (xfa1VarI.equals(xfa1.c)) {
            return 3;
        }
        eg.o();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x019b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a5  */
    public void M(ov30 ov30Var, StringBuilder sb) {
        String strU;
        boolean z;
        boolean z2;
        cht chtVar = (cht) this.b;
        fht fhtVar = chtVar.a;
        fht fhtVar2 = chtVar.a;
        if (!chtVar.p()) {
            ce0 ce0Var = fhtVar2.g;
            mma0[] mma0VarArr = fht.Y;
            mma0 mma0Var = mma0VarArr[5];
            if (!((Boolean) ((sgp0) ce0Var).a).booleanValue()) {
                chtVar.z(sb, ov30Var.g0());
                chtVar.w(sb, ov30Var, null);
                chtVar.d0(ov30Var.getVisibility(), sb);
                chtVar.J(ov30Var, sb);
                ce0 ce0Var2 = fhtVar2.T;
                mma0 mma0Var2 = mma0VarArr[44];
                if (((Boolean) ((sgp0) ce0Var2).a).booleanValue()) {
                    chtVar.H(ov30Var, sb);
                }
                chtVar.P(ov30Var, sb);
                ce0 ce0Var3 = fhtVar2.T;
                mma0 mma0Var3 = mma0VarArr[44];
                if (((Boolean) ((sgp0) ce0Var3).a).booleanValue()) {
                    if (ov30Var.isOperator()) {
                        Collection collectionL = ov30Var.l();
                        if (!collectionL.isEmpty()) {
                            Iterator it = collectionL.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((ov30) it.next()).isOperator()) {
                                        ce0 ce0Var4 = fhtVar2.O;
                                        mma0 mma0Var4 = fht.Y[39];
                                        if (!((Boolean) ((sgp0) ce0Var4).a).booleanValue()) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (ov30Var.isInfix()) {
                        Collection collectionL2 = ov30Var.l();
                        if (!collectionL2.isEmpty()) {
                            Iterator it2 = collectionL2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((ov30) it2.next()).isInfix()) {
                                        ce0 ce0Var5 = fhtVar2.O;
                                        mma0 mma0Var5 = fht.Y[39];
                                        if (!((Boolean) ((sgp0) ce0Var5).a).booleanValue()) {
                                            z2 = false;
                                        }
                                    }
                                }
                            }
                        }
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    chtVar.K(sb, ov30Var.A(), "tailrec");
                    chtVar.K(sb, ov30Var.isSuspend(), "suspend");
                    chtVar.K(sb, ov30Var.isInline(), "inline");
                    chtVar.K(sb, z2, "infix");
                    chtVar.K(sb, z, "operator");
                } else {
                    chtVar.K(sb, ov30Var.isSuspend(), "suspend");
                }
                chtVar.G(ov30Var, sb);
                if (chtVar.s()) {
                    if (ov30Var.j0()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (ov30Var.m0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(chtVar.F("fun"));
            sb.append(" ");
            chtVar.Z(ov30Var.getTypeParameters(), sb, true);
            rob0 rob0VarL = ov30Var.L();
            if (rob0VarL != null) {
                chtVar.w(sb, rob0VarL, ag5.RECEIVER);
                sb.append(chtVar.D(rob0VarL.getType(), false));
                sb.append(".");
            }
        }
        chtVar.M(ov30Var, sb, true);
        chtVar.c0(ov30Var.F(), ov30Var.Y(), sb);
        chtVar.S(ov30Var, sb);
        a8b0 returnType = ov30Var.getReturnType();
        ce0 ce0Var6 = fhtVar.l;
        mma0[] mma0VarArr2 = fht.Y;
        mma0 mma0Var6 = mma0VarArr2[10];
        if (!((Boolean) ((sgp0) ce0Var6).a).booleanValue()) {
            ce0 ce0Var7 = fhtVar.k;
            mma0 mma0Var7 = mma0VarArr2[9];
            if (((Boolean) ((sgp0) ce0Var7).a).booleanValue() || returnType == null) {
                sb.append(": ");
                if (returnType == null) {
                    strU = "[NULL]";
                } else {
                    strU = chtVar.U(returnType);
                }
                sb.append(strU);
            } else {
                ajn0 ajn0Var = g6b0.e;
                if (!g6b0.E(returnType, rfb1.d)) {
                    sb.append(": ");
                    if (returnType == null) {
                        strU = "[NULL]";
                    } else {
                        strU = chtVar.U(returnType);
                    }
                    sb.append(strU);
                }
            }
        }
        chtVar.e0(sb, ov30Var.getTypeParameters());
    }

    public void N(rdy0 rdy0Var, StringBuilder sb, String str) {
        cht chtVar = (cht) this.b;
        ce0 ce0Var = chtVar.a.H;
        mma0 mma0Var = fht.Y[32];
        int iOrdinal = ((sdy0) ((sgp0) ce0Var).a).ordinal();
        if (iOrdinal == 0) {
            chtVar.H(rdy0Var, sb);
            sb.append(str.concat(" for "));
            chtVar.R(rdy0Var.i, sb);
        } else if (iOrdinal == 1) {
            M(rdy0Var, sb);
        } else {
            if (iOrdinal == 2) {
                return;
            }
            eg.o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    public Object apply(Object obj) throws Throwable {
        byte b = this.a;
        int i = 1;
        Object obj2 = this.b;
        switch (b) {
            case 9:
                zsq0 zsq0Var = (atq0) obj;
                if (zsq0Var instanceof zsq0) {
                    return ((u9c) obj2).l((c481) zsq0Var.a);
                }
                if (zsq0Var instanceof xsq0) {
                    throw ((xsq0) zsq0Var).a;
                }
                eg.o();
                return null;
            case 12:
                return ((hys) obj2).b.b(((th61) obj).a).map(rbc.Z0).firstOrError();
            case 18:
                EsDownload$GetMediaHandleIdResponse esDownload$GetMediaHandleIdResponse = (EsDownload$GetMediaHandleIdResponse) obj;
                ArrayList arrayList = new ArrayList();
                l811 l811Var = (l811) obj2;
                if (!l811Var.a) {
                    l811Var.a = true;
                    arrayList.add(new eoh0(esDownload$GetMediaHandleIdResponse.n()));
                }
                if (esDownload$GetMediaHandleIdResponse.hasStatus()) {
                    int i2 = exu.a[esDownload$GetMediaHandleIdResponse.o().ordinal()];
                    if (i2 == -1) {
                        i = 2;
                    } else if (i2 != 1) {
                        if (i2 != 2) {
                            i = 3;
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    eg.o();
                                    return null;
                                }
                                i = 2;
                            }
                        } else {
                            i = 2;
                        }
                    }
                    arrayList.add(new foh0(i));
                }
                return Observable.fromIterable(arrayList);
            case 20:
                return ((bkv) obj2).a.c().g((spq0) obj, true).ignoreElement();
            default:
                g9u0 g9u0Var = (g9u0) obj;
                return ((ruz) obj2).d(ResumeCommand.builder().options(CommandOptions.builder().systemInitiated(g9u0Var.b).build()).resumeOrigin(PauseResumeOrigin.builder(g9u0Var.a).build()).build());
        }
    }

    public Object b(Object obj, ajm0 ajm0Var) {
        ((cht) this.b).M(ajm0Var, (StringBuilder) obj, true);
        return rih1.a;
    }

    public ov30 build() {
        return (lhz) this.b;
    }

    public Object e(pa paVar, Object obj) {
        ((cht) this.b).X(paVar, (StringBuilder) obj, true);
        return rih1.a;
    }

    public Object i(tsi1 tsi1Var, Object obj) {
        ((cht) this.b).b0(tsi1Var, true, (StringBuilder) obj, true);
        return rih1.a;
    }

    public Object k(fey0 fey0Var, Object obj) {
        N(fey0Var, (StringBuilder) obj, "setter");
        return rih1.a;
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        xau xauVarW = ((twa) ((wf2) this.b).b).w(s4b1VarX, intent.getExtras(), gg.l(intent));
        if (xauVarW == null) {
            return crn0.a;
        }
        Uri uri = s4b1VarX.a;
        return new hrn0(c4t0.class, new xau(xauVarW.a, xauVarW.b, sqg0.K("presentAsOverlay", xauVarW.c), xauVarW.d, xauVarW.e, xauVarW.f, xauVarW.g, xauVarW.h, xauVarW.i, xauVarW.t, xauVarW.X, xauVarW.Y), u890.j(uri != null ? uri.getQueryParameter("presentAsOverlay") : null, "true") ? new c6w0(1, true, (hd5) null, 12) : a6w0.a);
    }

    public Object p(wim0 wim0Var, Object obj) {
        xdg xdgVarB;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        cht chtVar = (cht) this.b;
        fht fhtVar = chtVar.a;
        boolean z = wim0Var.e0() == 4;
        if (!chtVar.p()) {
            chtVar.z(sb, wim0Var.T());
            chtVar.w(sb, wim0Var, null);
            if (!z) {
                chtVar.d0(wim0Var.getVisibility(), sb);
            }
            if ((wim0Var.e0() != 2 || wim0Var.o() != 4) && (!ktd.b(wim0Var.e0()) || wim0Var.o() != 1)) {
                chtVar.I(sb, wim0Var.o(), cht.t(wim0Var));
            }
            chtVar.H(wim0Var, sb);
            chtVar.K(sb, chtVar.o().contains(dht.INNER) && wim0Var.j(), "inner");
            chtVar.K(sb, chtVar.o().contains(dht.DATA) && wim0Var.p0(), "data");
            chtVar.K(sb, chtVar.o().contains(dht.INLINE) && wim0Var.isInline(), "inline");
            chtVar.K(sb, chtVar.o().contains(dht.VALUE) && wim0Var.p(), "value");
            chtVar.K(sb, chtVar.o().contains(dht.FUN) && wim0Var.W(), "fun");
            if (wim0Var.U()) {
                str = "companion object";
            } else {
                int iC = l1d.C(wim0Var.e0());
                if (iC == 0) {
                    str = "class";
                } else if (iC == 1) {
                    str = "interface";
                } else if (iC == 2) {
                    str = "enum class";
                } else if (iC == 3) {
                    str = "enum entry";
                } else if (iC == 4) {
                    str = "annotation class";
                } else {
                    if (iC != 5) {
                        eg.o();
                        return null;
                    }
                    str = "object";
                }
            }
            sb.append(chtVar.F(str));
        }
        if (iht.k(wim0Var)) {
            ce0 ce0Var = fhtVar.G;
            mma0 mma0Var = fht.Y[31];
            if (((Boolean) ((sgp0) ce0Var).a).booleanValue()) {
                if (chtVar.p()) {
                    sb.append("companion object");
                }
                cht.T(sb);
                n9r n9rVarK = wim0Var.k();
                if (n9rVarK != null) {
                    sb.append("of ");
                    sb.append(chtVar.L(n9rVarK.getName(), false));
                }
            }
            if (chtVar.s() || !u890.j(wim0Var.getName(), moa1.b)) {
                if (!chtVar.p()) {
                    cht.T(sb);
                }
                sb.append(chtVar.L(wim0Var.getName(), true));
            }
        } else {
            if (!chtVar.p()) {
                cht.T(sb);
            }
            chtVar.M(wim0Var, sb, true);
        }
        if (!z) {
            List listN = wim0Var.n();
            chtVar.Z(listN, sb, false);
            chtVar.x(wim0Var, sb);
            if (!ktd.b(wim0Var.e0())) {
                ce0 ce0Var2 = fhtVar.i;
                mma0 mma0Var2 = fht.Y[7];
                if (((Boolean) ((sgp0) ce0Var2).a).booleanValue() && (xdgVarB = wim0Var.B()) != null) {
                    sb.append(" ");
                    chtVar.w(sb, xdgVarB, null);
                    chtVar.d0(xdgVarB.getVisibility(), sb);
                    sb.append(chtVar.F("constructor"));
                    chtVar.c0(xdgVarB.F(), xdgVarB.Y(), sb);
                }
            }
            ce0 ce0Var3 = fhtVar.x;
            mma0 mma0Var3 = fht.Y[22];
            if (!((Boolean) ((sgp0) ce0Var3).a).booleanValue() && !g6b0.F(wim0Var.m())) {
                Collection collectionD = wim0Var.g().d();
                if (!collectionD.isEmpty() && (collectionD.size() != 1 || !g6b0.y((a8b0) collectionD.iterator().next()))) {
                    cht.T(sb);
                    sb.append(": ");
                    o7h.x0(collectionD, sb, ", ", (String) null, (String) null, new bht(chtVar, (byte) 1), 60);
                }
            }
            chtVar.e0(sb, listN);
        }
        return rih1.a;
    }

    public boolean r(View view) {
        m8v m8vVar = (m8v) this.b;
        if (!m8v.j(view) || m8vVar.f(view) == 2) {
            return false;
        }
        m8vVar.b(view);
        return true;
    }

    public Object s(rob0 rob0Var, Object obj) {
        ((StringBuilder) obj).append(rob0Var.getName());
        return rih1.a;
    }

    public Object u(jit jitVar, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        cht chtVar = (cht) this.b;
        chtVar.getClass();
        chtVar.w(sb, jitVar, null);
        chtVar.d0(jitVar.g, sb);
        chtVar.H(jitVar, sb);
        sb.append(chtVar.F("typealias"));
        sb.append(" ");
        chtVar.M(jitVar, sb, true);
        chtVar.Z(jitVar.n(), sb, false);
        chtVar.x(jitVar, sb);
        sb.append(" = ");
        sb.append(chtVar.U(jitVar.y1()));
        return rih1.a;
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                xik xikVar = (xik) obj;
                zmr zmrVar = (zmr) obj2;
                String str = xikVar.d;
                String str2 = xikVar.e;
                String str3 = xikVar.f;
                e93 e93Var = zmrVar.e;
                String strI = str2 != null ? xcg1.i(str, ", ", str2) : str;
                TextView textView = (TextView) e93Var.V0;
                textView.setMovementMethod(null);
                if (str3 == null || str3.length() == 0) {
                    textView.setText(strI);
                } else {
                    SpannableString spannableString = new SpannableString(strI);
                    int iS = zmrVar.s(2130968787);
                    spannableString.setSpan(new ForegroundColorSpan(iS), 0, str.length(), 33);
                    spannableString.setSpan(new ymr(zmrVar, str3, iS), 0, str.length(), 33);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    textView.setText(spannableString);
                }
                break;
            case 3:
            default:
                z800 z800Var = (z800) obj;
                z800Var.getClass();
                g2z g2zVar = (g2z) ((zpr) obj2).f;
                if (z800Var.e == null || z800Var.d == null) {
                    ((CalendarIconView) g2zVar.c).setVisibility(8);
                } else {
                    ((CalendarIconView) g2zVar.c).setVisibility(0);
                    ((CalendarIconView) g2zVar.c).c(new xwc(124, (Integer) null, (Integer) null, z800Var.d, z800Var.e, false));
                }
                break;
            case 4:
                lan lanVar = (lan) obj;
                jnq jnqVar = (jnq) obj2;
                r4u r4uVar = (r4u) jnqVar.b;
                if (lanVar instanceof jan) {
                    ((r4u) jnqVar.a).e(lanVar);
                    r4uVar.e(0);
                } else if (!(lanVar instanceof kan)) {
                    eg.o();
                } else {
                    r4uVar.e(8);
                }
                break;
            case 5:
                String str4 = (String) obj;
                srr srrVar = (srr) obj2;
                h72 h72Var = srrVar.a;
                wdm wdmVar = srrVar.b;
                y0o y0oVar = new y0o(srrVar, wdmVar, (byte) 17);
                MotionLayout motionLayout = (MotionLayout) wdmVar.b;
                ArtworkView artworkView = (ArtworkView) wdmVar.c;
                if (str4 == null || str4.length() == 0) {
                    motionLayout.C(2131431062).v(artworkView.getId(), 8);
                    motionLayout.C(2131428642).v(artworkView.getId(), 8);
                } else {
                    motionLayout.C(2131431062).v(artworkView.getId(), 0);
                    motionLayout.C(2131428642).v(artworkView.getId(), 0);
                }
                artworkView.n(y0oVar);
                artworkView.h(new x07(new g07(str4), true));
                if (str4 == null || str4.length() == 0) {
                    h360.a(h72Var, (MotionLayout) wdmVar.b, (TextView) wdmVar.Z);
                    ((BehaviorRetainingAppBarLayout) h72Var.b).setBackgroundColor(srrVar.c);
                }
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                FreshnessBadgeView freshnessBadgeView = (FreshnessBadgeView) ((d520) ((odr) obj2).c).g;
                bool.getClass();
                freshnessBadgeView.setVisibility(bool.booleanValue() ? 0 : 8);
                break;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 8:
                int i = hsl1Var.a.i(519).b;
                uhs uhsVar = (uhs) obj;
                h72 h72Var = uhsVar.d;
                h360.d(h72Var, i);
                ConstraintLayout constraintLayout = (ConstraintLayout) uhsVar.e.a;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop() + i, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) h72Var.g;
                WeakHashMap weakHashMap = b8k1.a;
                r7k1.c(collapsingToolbarLayout, (k1q0) null);
                break;
            default:
                if (hsl1Var.a.u(8)) {
                    ((zus) obj).d();
                }
                break;
        }
        return hsl1Var;
    }

    public Object y(zdy0 zdy0Var, Object obj) {
        N(zdy0Var, (StringBuilder) obj, "getter");
        return rih1.a;
    }

    public void z() {
        oly olyVar = (oly) this.b;
        boolean z = olyVar.k;
        ParagraphView paragraphView = olyVar.m;
        if (paragraphView == null) {
            u890.C("headerView");
            throw null;
        }
        paragraphView.setVisibility(z ? 4 : 0);
        ParagraphView paragraphView2 = olyVar.n;
        if (paragraphView2 == null) {
            u890.C("subtitleView");
            throw null;
        }
        paragraphView2.setVisibility(z ? 4 : 0);
        ArrayList<biy> arrayList = (ArrayList) olyVar.p;
        if (arrayList == null) {
            u890.C("itemViews");
            throw null;
        }
        for (biy biyVar : arrayList) {
            ImageView imageView = biyVar.a;
            if (z) {
                imageView.setVisibility(8);
                biyVar.b.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                biyVar.b.setVisibility(0);
            }
        }
    }

    public nv30 A() {
        return this;
    }

    public nv30 H() {
        return this;
    }

    public nv30 f() {
        return this;
    }

    public nv30 j() {
        return this;
    }

    public nv30 n() {
        return this;
    }

    public nv30 o() {
        return this;
    }

    public nv30 w() {
        return this;
    }

    public nv30 E(rob0 rob0Var) {
        return this;
    }

    public nv30 a(List list) {
        return this;
    }

    public nv30 c(int i) {
        return this;
    }

    public nv30 d(ajn0 ajn0Var) {
        return this;
    }

    public nv30 g(fg5 fg5Var) {
        return this;
    }

    public nv30 h(lht lhtVar) {
        return this;
    }

    public nv30 m(n9r n9rVar) {
        return this;
    }

    public nv30 q(int i) {
        return this;
    }

    public nv30 t(a8b0 a8b0Var) {
        return this;
    }

    public ogr(Activity activity, bvw bvwVar) {
        this.a = (byte) 22;
        this.b = activity;
    }

    public /* synthetic */ ogr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
