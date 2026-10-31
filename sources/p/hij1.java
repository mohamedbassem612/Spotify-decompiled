package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.voting.proto.v1.PremiumUpsell;
import com.spotify.voting.proto.v1.VotingAvailable;
import com.spotify.voting.proto.v1.VotingAvailableVotesUsed;
import com.spotify.voting.proto.v1.VotingClosed;
import com.spotify.voting.proto.v1.VotingPlaylistData;
import com.spotify.voting.proto.v1.VotingPreRelease;
import com.spotify.voting.proto.v1.VotingResults;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import j$.time.ZoneId;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hij1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hij1(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:297:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0308 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x030a  */
    /* JADX WARN: Code duplicated, block: B:57:0x030c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0317  */
    /* JADX WARN: Code duplicated, block: B:61:0x0319  */
    /* JADX WARN: Code duplicated, block: B:63:0x031c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x032a  */
    /* JADX WARN: Code duplicated, block: B:73:0x033a  */
    /* JADX WARN: Code duplicated, block: B:78:0x034c  */
    public final Object invoke(Object obj) {
        spq0 spq0VarTrack;
        ContextTrack contextTrack;
        mmr0 mmr0VarM;
        int i;
        nwk1 nwk1Var;
        String strN;
        Intent intent;
        lls0 lls0Var;
        String string;
        String str;
        String string2;
        int length;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        byte b = this.a;
        String str2 = "";
        float f = 0.0f;
        char c = ' ';
        int i4 = 6;
        float f2 = 1.0f;
        boolean z3 = false;
        int i5 = 0;
        z3 = false;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                uwm0 uwm0Var = ((iij1) obj3).h;
                return uwm0Var.a((String) obj, new dvg0(uwm0Var, (Integer) obj2, (byte) 23));
            case 1:
                nm nmVar = nm.R0;
                e821 e821Var = (e821) obj3;
                hx7 hx7Var = (hx7) e821Var.c;
                z5h1 z5h1Var = (z5h1) e821Var.a;
                CompositeDisposable compositeDisposable = new CompositeDisposable();
                int iOrdinal = ((h331) obj).ordinal();
                if (iOrdinal == 0) {
                    hx7Var.b().doOnSuccess(nmVar).ignoreElement().subscribe();
                    z5h1Var.a(ex7.b);
                    compositeDisposable.dispose();
                    z3 = true;
                } else if (iOrdinal == 1) {
                    hx7Var.b().doOnSuccess(nmVar).ignoreElement().subscribe();
                    String strT = pro1.t("videoPodcastsDownloadAudioOnly");
                    z5h1Var.a(new fx7(strT));
                    ((lzn0) e821Var.b).h(strT);
                    compositeDisposable.dispose();
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    z5h1Var.a(dx7.b);
                    compositeDisposable.dispose();
                }
                ((ohd) obj2).resumeWith(Boolean.valueOf(z3));
                return rih1Var;
            case 2:
                elb0 elb0Var = (elb0) obj;
                long jA = nho1.A(elb0Var);
                drr0 drr0Var = (drr0) obj3;
                drr0Var.t(Float.intBitsToFloat((int) (nho1.l(elb0Var).e() & 4294967295L)));
                ((hdn0) obj2).t((int) (drr0Var.s() - Float.intBitsToFloat((int) (jA & 4294967295L))));
                return rih1Var;
            case 3:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                a7j1 a7j1Var = (a7j1) obj3;
                b3k1 b3k1Var = (b3k1) obj2;
                videoSurfaceView.setSupportsSurfaceView(a7j1Var != null);
                if (!videoSurfaceView.getSupportsSurfaceView()) {
                    videoSurfaceView.setUseSurfaceView(false);
                }
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(b3k1Var);
                if (a7j1Var != null) {
                    videoSurfaceView.d(a7j1Var.b, a7j1Var.c);
                }
                return videoSurfaceView;
            case 4:
                PlayerState playerState = (PlayerState) obj;
                return Boolean.valueOf(((v65) ((kly0) obj3).get()).e() || (((guj1) ((jb3) obj2).h).h && playerState != null && (spq0VarTrack = playerState.track()) != null && (contextTrack = (ContextTrack) spq0VarTrack.h()) != null && l4o1.X(contextTrack) && l4o1.Z(contextTrack)));
            case 5:
                tii0 tii0Var = (tii0) obj;
                mey0 mey0Var = tii0Var.c;
                String str3 = mey0Var.b;
                thi0 thi0Var = (thi0) obj3;
                qvj1 qvj1Var = (qvj1) obj2;
                smc0 smc0VarN = k4p1.n();
                x360 x360Var = mey0Var.e;
                if (x360Var != null && (mmr0VarM = qvj1Var.e.m(x360Var)) != null) {
                    smc0VarN.add(new hg51((xpw) mmr0VarM.a, mmr0VarM.b, qvj1Var.f.b));
                }
                smc0VarN.add(new hg51(thi0Var, mey0.a(mey0Var), 0));
                return new ig51(str3, k4p1.k(smc0VarN), new muh1(tii0Var, (byte) 23));
            case 6:
                e261 e261Var = (e261) obj;
                String str4 = ((oxj1) obj3).h;
                b261.n(e261Var, str4 == null ? "" : str4);
                b261.s(e261Var, ((Boolean) ((ven0) obj2).getValue()).booleanValue());
                return rih1Var;
            case 7:
                rtb0 rtb0Var = (rtb0) obj;
                czj1 czj1Var = (czj1) obj3;
                c380 c380Var = czj1Var.b;
                rtb0Var.e(c380Var.size(), new vse1(c380Var, (byte) 11), new vse1(c380Var, (byte) 12), new j2i(2039820996, new d311((byte) 12, czj1Var.c, (pzj1) obj2, c380Var), true));
                if (c380Var.isEmpty() && (i = czj1Var.e) > 0) {
                    rtb0.b(rtb0Var, i, (iu30) null, xqj.b, 6);
                }
                return rih1Var;
            case 8:
                n8b1 n8b1Var = (n8b1) obj3;
                n8b1 n8b1Var2 = (n8b1) obj2;
                return ((xa5) obj).a(hm5.P(xay.o(n8b1Var, ayj1.U0).a(xay.e(2, n8b1Var2)), xay.s(n8b1Var, ayj1.V0).a(xay.f(2, n8b1Var2))), hm5.h(2, (vu30) null));
            case 9:
                ek2 ek2Var = new ek2((hdn0) obj2, (byte) 23);
                iac0 iac0Var = (iac0) obj3;
                iac0Var.getLifecycle().a(ek2Var);
                return new zxg1(iac0Var, ek2Var, (byte) 5);
            case 10:
                rtb0 rtb0Var2 = (rtb0) obj;
                c380 c380Var2 = (c380) obj3;
                rtb0Var2.e(c380Var2.size(), (iu30) null, new vse1(c380Var2, (byte) 13), new j2i(802480018, new sf1(c380Var2, (byte) 4), true));
                c1k1 c1k1Var = (c1k1) obj2;
                if (c1k1Var.h) {
                    rtb0.c(rtb0Var2, (Object) null, new j2i(-757496602, new g2j1(c1k1Var, (byte) 16), true), 3);
                }
                return rih1Var;
            case 11:
                uoa uoaVar = (uoa) obj2;
                u8d1 u8d1Var = (u8d1) obj3;
                int iC = l1d.C(u8d1Var.e);
                if (iC == 0) {
                    uoaVar.h(new o2u0(u8d1Var.d.toString(), 14, (Map) null), new oot0(0L, 0L, false, false, (hu7) null, (tne1) null, false, 247));
                } else if (iC == 1) {
                    uoaVar.f();
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    uoaVar.u();
                }
                return rih1Var;
            case 12:
                return new kcf1((iu30) obj3, (r091) obj2);
            case 13:
                return new zxg1((iac0) obj3, (r6k1) obj2, (byte) 7);
            case 14:
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) obj;
                if (((n6k1) obj3).b) {
                    ffj1 ffj1Var = (ffj1) obj2;
                    ffj1Var.a = videoSurfaceView2;
                    Boolean bool = ffj1Var.d;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            xtm0 xtm0Var = (xtm0) ffj1Var.c.getValue();
                            xtm0Var.f = videoSurfaceView2;
                            videoSurfaceView2.setBufferingThrobberEnabled(false);
                            r091 r091Var = xtm0Var.e;
                            if (r091Var != null) {
                                r091Var.i(videoSurfaceView2);
                            }
                        } else {
                            ((k0t) ffj1Var.b.getValue()).c(new x500(videoSurfaceView2, null));
                        }
                    }
                }
                return rih1Var;
            case 15:
                ((Number) obj).intValue();
                return (r6h1) ((iu30) obj3).invoke((r6h1) obj2);
            case 16:
                ((f3h1) ((csj1) obj3).b).c(((Number) obj).intValue(), (op80) null, (Function0) obj2);
                return rih1Var;
            case 17:
                return new zxg1((zeu) obj3, (ven0) obj2, (byte) 8);
            case 18:
                bih1 bih1Var = (bih1) ((rb3) obj3).d;
                String str5 = (String) ((cxc0) obj).f.q.get("voting_playlist_data");
                String str6 = (String) obj2;
                if (str5 == null) {
                    return new owk1();
                }
                VotingPlaylistData votingPlaylistDataT = VotingPlaylistData.t(Base64.decode(str5, 0));
                votingPlaylistDataT.getClass();
                ZoneId zoneId = (ZoneId) bih1Var.c;
                Locale locale = (Locale) bih1Var.b;
                int iN = votingPlaylistDataT.n();
                int i6 = iN == 0 ? -1 : iwk1.a[l1d.C(iN)];
                if (i6 == 1) {
                    VotingAvailable votingAvailableO = votingPlaylistDataT.o();
                    lwk1 lwk1Var = new lwk1(votingAvailableO.s().p(), votingAvailableO.s().getTitle(), votingAvailableO.s().getSubtitle());
                    qwk1 qwk1Var = new qwk1(votingAvailableO.q(), jap1.q(votingAvailableO.r(), locale, zoneId), votingAvailableO.s().n(), votingAvailableO.n(), true);
                    PremiumUpsell premiumUpsellP = votingAvailableO.p();
                    nwk1Var = new nwk1(lwk1Var, qwk1Var, !premiumUpsellP.equals(PremiumUpsell.n()) ? new pwk1(premiumUpsellP.getTitle(), premiumUpsellP.p(), premiumUpsellP.o(), str6) : null, 1, str6);
                } else {
                    if (i6 == 2) {
                        VotingPreRelease votingPreReleaseR = votingPlaylistDataT.r();
                        return new nwk1(new lwk1(votingPreReleaseR.o().p(), votingPreReleaseR.o().getTitle(), votingPreReleaseR.o().getSubtitle()), new qwk1("", "", votingPreReleaseR.o().n(), null, false), 2);
                    }
                    if (i6 == 3) {
                        VotingAvailableVotesUsed votingAvailableVotesUsedP = votingPlaylistDataT.p();
                        lwk1 lwk1Var2 = new lwk1(votingAvailableVotesUsedP.q().p(), votingAvailableVotesUsedP.q().getTitle(), votingAvailableVotesUsedP.q().getSubtitle());
                        qwk1 qwk1Var2 = new qwk1("", "", votingAvailableVotesUsedP.q().n(), votingAvailableVotesUsedP.n(), (votingAvailableVotesUsedP.r() || (strN = votingAvailableVotesUsedP.n()) == null || strN.length() == 0) ? false : true);
                        PremiumUpsell premiumUpsellP2 = votingAvailableVotesUsedP.p();
                        nwk1Var = new nwk1(lwk1Var2, qwk1Var2, !premiumUpsellP2.equals(PremiumUpsell.n()) ? new pwk1(premiumUpsellP2.getTitle(), premiumUpsellP2.p(), premiumUpsellP2.o(), str6) : null, 3, str6);
                    } else if (i6 == 4) {
                        VotingClosed votingClosedQ = votingPlaylistDataT.q();
                        nwk1Var = new nwk1(new lwk1(votingClosedQ.r().p(), votingClosedQ.r().getTitle(), votingClosedQ.r().getSubtitle()), new qwk1(votingClosedQ.p(), jap1.q(votingClosedQ.q(), locale, zoneId), votingClosedQ.r().n(), votingClosedQ.n(), false), 4);
                    } else {
                        if (i6 != 5) {
                            return new owk1();
                        }
                        VotingResults votingResultsS = votingPlaylistDataT.s();
                        nwk1Var = new nwk1(new kwk1(votingResultsS.p().p(), votingResultsS.p().getTitle()), new qwk1("", "", votingResultsS.p().n(), votingResultsS.n(), true), null, 5, str6);
                    }
                }
                return nwk1Var;
            case 19:
                String str7 = (String) obj;
                j0l1 j0l1Var = (j0l1) obj3;
                return j0l1Var.d.length() > 0 ? rqt0.F(o6x.a, new vxg1((zsc) obj2, str7, j0l1Var, (lnm) null, (byte) 25)).flatMap(new hdn1(str7, (byte) 12)) : Single.just(str7);
            case 20:
                return new zxg1((iac0) obj3, (d8l1) obj2, (byte) 9);
            case 21:
                float fFloatValue = ((Number) obj).floatValue();
                ((tfx0) obj3).c.t(yoi1.o(fFloatValue, 0.0f, 1.0f));
                ((iu30) ((ven0) obj2).getValue()).invoke(Float.valueOf(fFloatValue));
                return rih1Var;
            case 22:
                dr60 dr60Var = (dr60) obj;
                dr60Var.setHorizontalFocusPercentage((Float) obj3);
                ((iu30) obj2).invoke(dr60Var);
                return rih1Var;
            case 23:
                DrawScope drawScope = (DrawScope) obj;
                ldl1 ldl1Var = (ldl1) obj3;
                float fX0 = drawScope.X0(ldl1Var.b);
                float fX1 = drawScope.X0(ldl1Var.c);
                float fX2 = drawScope.X0(ldl1Var.d);
                float f3 = fX1 + fX0;
                int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (drawScope.j() >> 32)) / f3);
                float[] fArr = (float[]) obj2;
                int length2 = fArr.length;
                if (iIntBitsToFloat > length2) {
                    iIntBitsToFloat = length2;
                }
                int length3 = fArr.length - iIntBitsToFloat;
                float f4 = 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / 2.0f;
                int i7 = 0;
                while (i7 < iIntBitsToFloat) {
                    char c2 = c;
                    float f5 = f4;
                    float fIntBitsToFloat2 = ((Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fX2) * yoi1.o(fArr[length3 + i7], f, f2)) + fX2;
                    float f6 = fX0 / f5;
                    DrawScope.g0(drawScope, ldl1Var.a, (((long) Float.floatToRawIntBits(i7 * f3)) << c2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - (fIntBitsToFloat2 / f5))) & 4294967295L), (((long) Float.floatToRawIntBits(fX0)) << c2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << c2) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (DrawStyle) null, 0.0f, 0, 240);
                    i7++;
                    f4 = f5;
                    c = c2;
                    f = 0.0f;
                    f2 = 1.0f;
                }
                return rih1Var;
            case 24:
                DrawScope drawScope2 = (DrawScope) obj;
                pmg1 pmg1Var = (pmg1) obj2;
                float f7 = pmg1Var.h;
                long jB = u7h.b(qmg1.a, 0.8f, 0.0f, 0.0f, 0.0f, 14);
                int iOrdinal2 = ((ijf1) obj3).ordinal();
                if (iOrdinal2 == 0) {
                    float f8 = pmg1Var.f;
                    float f9 = pmg1Var.e;
                    float f10 = f8 - f9;
                    if (f10 < f7) {
                        float f11 = f7 - f10;
                        DrawScope.d0(drawScope2, jB, (((long) Float.floatToRawIntBits((pmg1Var.a + f9) - f11)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)))) & 4294967295L), 0.0f, (phc1) null, (ColorFilter) null, 120);
                    }
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    if (f7 > 0.0f) {
                        DrawScope.d0(drawScope2, jB, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)))) & 4294967295L), 0.0f, (phc1) null, (ColorFilter) null, 120);
                    }
                }
                return rih1Var;
            case 25:
                rr40 rr40Var = (rr40) obj;
                String str8 = (String) ((jme) obj2).b;
                igl1 igl1Var = (igl1) obj3;
                rku rkuVar = igl1Var.k;
                l8s l8sVar = igl1Var.b;
                zym0 zym0Var = igl1Var.d;
                hhr hhrVar = igl1Var.g;
                boolean zEquals = rr40Var.equals(rr40.a);
                b7x b7xVar = b7x.a;
                if (zEquals) {
                    String strF = f4i1.f("https://play.google.com/store/apps/details?id=", zym0Var.a, "&referrer=utm_source%3Dspotify_app%26utm_campaign%3Dwear_activation_2024");
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-wear-app-onboarding-notification";
                    x6h1VarI.f = "2.0.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.e = str8;
                    y6h1 y6h1VarA = x6h1VarI.a();
                    i8h1 i8h1Var = hhrVar.a;
                    x6h1 x6h1VarC = y6h1VarA.c();
                    x6h1VarC.i.add(new a7h1("open_google_play_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", strF)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    igl1Var.a(nhl1.c);
                    String str9 = igl1Var.j;
                    if (str9 != null) {
                        rkuVar.b(l8sVar.a(str9).subscribe());
                    }
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + zym0Var.a + "&referrer=utm_source%3Dspotify_app%26utm_campaign%3Dwear_activation_2024"));
                    intent2.setFlags(337641472);
                    intent2.setPackage("com.android.vending");
                    igl1Var.e.startActivity(intent2);
                } else {
                    if (!rr40Var.equals(rr40.b)) {
                        eg.o();
                        return null;
                    }
                    y6h1 y6h1Var2 = y6h1.i;
                    x6h1 x6h1VarI2 = i3o1.i();
                    x6h1VarI2.h = "music";
                    x6h1VarI2.a = "mobile-wear-app-onboarding-notification";
                    x6h1VarI2.f = "2.0.0";
                    x6h1VarI2.g = "22.0.0";
                    x6h1VarI2.e = str8;
                    y6h1 y6h1VarA2 = x6h1VarI2.a();
                    i8h1 i8h1Var2 = hhrVar.a;
                    x6h1 x6h1VarC2 = y6h1VarA2.c();
                    x6h1VarC2.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    String str10 = igl1Var.j;
                    if (str10 != null) {
                        rkuVar.b(l8sVar.a(str10).subscribe());
                    }
                }
                return rih1Var;
            case 26:
                Uri uri = Uri.parse(((Uri) obj3).getQueryParameter("returnUrl"));
                nkl1 nkl1Var = (nkl1) obj2;
                Context context = nkl1Var.a;
                g341 g341Var = nkl1Var.b;
                pbk1 pbk1Var = nkl1Var.c;
                xye1 xye1Var = nkl1Var.d;
                if (uri != null) {
                    String string3 = uri.toString();
                    Set set = s4b1.f;
                    if (uic.x(string3).c != blc0.o6) {
                        intent = (Intent) pbk1Var.a(context, uri.toString()).b;
                    } else {
                        Set set2 = i3i1.a;
                        if (!uri.isHierarchical() || uri.getQueryParameter("sp_req_login_token") == null) {
                            lls0Var = new lls0(o7h.i0(i3i1.a, uri.getScheme()) && o7h.i0(i3i1.b, uri.getHost()) && !ihc1.h0(uri.toString(), "notoken", false), uri, (byte) 29);
                        } else {
                            Uri.Builder builder = new Uri.Builder();
                            builder.scheme(uri.getScheme());
                            builder.authority(uri.getAuthority());
                            builder.path(uri.getPath());
                            builder.fragment(uri.getFragment());
                            URI uriCreate = URI.create(uri.toString());
                            Charset charset = nne.a;
                            ArrayList arrayList = new ArrayList();
                            String query = uriCreate.getQuery();
                            query.getClass();
                            if (query.length() > 0) {
                                Iterator it = ihc1.Q0(query, new String[]{"&"}, 0, 6).iterator();
                                while (it.hasNext()) {
                                    List listQ0 = ihc1.Q0((String) it.next(), new String[]{"="}, i5, i4);
                                    String str11 = (String) o7h.t0(i5, listQ0);
                                    if (str11 != null) {
                                        int length4 = str11.length() - 1;
                                        int i8 = i5;
                                        while (true) {
                                            it = it;
                                            if (i5 <= length4) {
                                                boolean z4 = u890.q(str11.charAt(i8 == 0 ? i5 : length4), 32) <= 0;
                                                if (i8 == 0) {
                                                    if (z4) {
                                                        i5++;
                                                    } else {
                                                        i8 = 1;
                                                    }
                                                } else if (z4) {
                                                    length4--;
                                                }
                                            }
                                        }
                                        string = str11.subSequence(i5, length4 + 1).toString();
                                        if (string == null) {
                                        }
                                        str = (String) o7h.t0(1, listQ0);
                                        if (str != null) {
                                            length = str.length() - 1;
                                            z = false;
                                            i2 = 0;
                                            while (true) {
                                                str2 = str2;
                                                if (i2 > length) {
                                                    if (z) {
                                                        i3 = length;
                                                    } else {
                                                        i3 = i2;
                                                    }
                                                    if (u890.q(str.charAt(i3), 32) <= 0) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    if (z) {
                                                        if (!z2) {
                                                            length--;
                                                        }
                                                    } else if (z2) {
                                                        i2++;
                                                    } else {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            string2 = str.subSequence(i2, length + 1).toString();
                                            if (string2 == null) {
                                            }
                                            if (string.length() == 0) {
                                                arrayList.add(new mmr0(i1o1.k(string, charset), i1o1.k(string2, charset)));
                                            }
                                            it = it;
                                            str2 = str2;
                                            i5 = 0;
                                            i4 = 6;
                                        } else {
                                            str2 = str2;
                                        }
                                        string2 = str2;
                                        if (string.length() == 0) {
                                            arrayList.add(new mmr0(i1o1.k(string, charset), i1o1.k(string2, charset)));
                                        }
                                        it = it;
                                        str2 = str2;
                                        i5 = 0;
                                        i4 = 6;
                                    } else {
                                        it = it;
                                    }
                                    string = str2;
                                    str = (String) o7h.t0(1, listQ0);
                                    if (str != null) {
                                        length = str.length() - 1;
                                        z = false;
                                        i2 = 0;
                                        while (true) {
                                            str2 = str2;
                                            if (i2 > length) {
                                                if (z) {
                                                    i3 = i2;
                                                } else {
                                                    i3 = length;
                                                }
                                                if (u890.q(str.charAt(i3), 32) <= 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (z) {
                                                    if (z2) {
                                                        z = true;
                                                    } else {
                                                        i2++;
                                                    }
                                                } else if (!z2) {
                                                    length--;
                                                }
                                            }
                                        }
                                        string2 = str.subSequence(i2, length + 1).toString();
                                        if (string2 == null) {
                                        }
                                        if (string.length() == 0) {
                                            arrayList.add(new mmr0(i1o1.k(string, charset), i1o1.k(string2, charset)));
                                        }
                                        it = it;
                                        str2 = str2;
                                        i5 = 0;
                                        i4 = 6;
                                    } else {
                                        str2 = str2;
                                    }
                                    string2 = str2;
                                    if (string.length() == 0) {
                                        arrayList.add(new mmr0(i1o1.k(string, charset), i1o1.k(string2, charset)));
                                    }
                                    it = it;
                                    str2 = str2;
                                    i5 = 0;
                                    i4 = 6;
                                }
                            }
                            ArrayList<mmr0> arrayList2 = new ArrayList();
                            for (Object obj4 : arrayList) {
                                if (!u890.j(((mmr0) obj4).a, "sp_req_login_token")) {
                                    arrayList2.add(obj4);
                                }
                            }
                            for (mmr0 mmr0Var : arrayList2) {
                                builder.appendQueryParameter((String) mmr0Var.a, (String) mmr0Var.b);
                            }
                            lls0Var = new lls0(true, builder.build(), (byte) 29);
                        }
                        Uri uri2 = (Uri) lls0Var.c;
                        if (lls0Var.b) {
                            new s3i1(context, g341Var, uri2, xye1Var);
                            intent = null;
                        } else {
                            intent = new Intent("android.intent.action.VIEW", uri2);
                        }
                    }
                } else {
                    intent = (Intent) pbk1Var.a(context, WidgetInteraction.Background.DESTINATION_HOME).b;
                }
                if (intent != null) {
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                }
                return rih1Var;
            case 27:
                kp5 kp5Var = (kp5) ((cvq) ((ilh1) obj3).b).a.c;
                q8n q8nVar = (q8n) ((tkl1) kp5Var.a).i.get();
                c8o.l(q8nVar);
                return q1o1.u(new l9s(q8nVar, (zic) ((jly0) kp5Var.d).get(), (qmc) ((jly0) kp5Var.c).get(), (dvq) ((jly0) kp5Var.g).get(), (oll1) ((jly0) kp5Var.f).get(), (cir0) obj2), u291.d(nim0.a, 1.0f), (FrameLayout.LayoutParams) null, 6);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                ((sul1) obj3).b.D((y341) obj, (tul1) obj2);
                return rih1Var;
            default:
                hwl1 hwl1Var = (hwl1) obj3;
                phi0 phi0Var = hwl1Var.g;
                z311 z311Var = (z311) phi0Var.d;
                twb twbVar = (twb) phi0Var.c;
                mpc1 mpc1Var = new mpc1(2131820881, (twb) phi0Var.e);
                fug0 fug0Var = (fug0) phi0Var.b;
                jd11 jd11Var = rc11.a;
                ((ji50) obj).b.put(uv11.class, new r3r(hwl1Var.h.a((d0r) obj2, new ls11((ds11) null, (ds11) null, (ds11) null, (ds11) null, new v3v0(1, (y311) phi0Var.f, y311.class, "actionPlay", "actionPlay(Lcom/spotify/kodiak/dataloader/DataPool;)Lcom/spotify/kodiak/element/compose/DataElement;", 0, (byte) 18), (iu30) null, (qrk) null, (iu30) null, (iu30) null, z311Var, twbVar, 2, (o27) null, (gye1) null, mpc1Var, (sb2) null, (rru) null, false, (o3r) null, (o3r) null, (o3r) null, (o3r) null, w3p1.j(new l4r(new wlu(jd11Var.b(jo70.class)), 2, t011.X0, new j4r(a411.c), t011.Y0), new l4r(new wlu(jd11Var.b(jo70.class)), 2, t011.Z0, new j4r(a411.d), t011.a1), new l4r(hvm.c, 2, t011.b1, new j4r(a411.e), t011.c1), new l4r(new wlu(jd11Var.b(jo70.class)), 2, t011.d1, new k4r(a411.f, fvc0.a), t011.e1), new l4r(new xv00(jd11Var.b(zoy0.class)), 2, a411.b, new j4r(a411.g), t011.U0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, t011.V0, new j4r(a411.h), t011.W0), new wcy0(fug0Var, (byte) 3)), (o3r) null, (cv11) null, (y5z) null, (bnw0) null, (bt11) null, 0, (o3r) null, -33607185, 511), (nu11) null), u5l1.T0, 4));
                return rih1Var;
        }
    }
}
