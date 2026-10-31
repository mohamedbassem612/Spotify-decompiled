package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.markasplayed.MarkAsPlayedButtonView;
import com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity;
import com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity;
import com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase;
import com.spotify.reporting.reportaction.ReportWebViewActivity;
import com.spotify.wear.pinpairing.PinPairingActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tnm implements zdh, dl4 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;
    public final Object h;

    public tnm(uwf0 uwf0Var) {
        this.a = (byte) 18;
        this.b = uwf0Var;
        this.c = xqu.b(new blp(this, 1, (byte) 21));
        this.d = xqu.b(new blp(this, 0, (byte) 21));
        this.e = xqu.b(new blp(this, 2, (byte) 21));
        this.f = xqu.b(new blp(this, 3, (byte) 21));
        this.g = xqu.b(new blp(this, 4, (byte) 21));
        this.h = xqu.b(new blp(this, 5, (byte) 21));
    }

    public static final /* synthetic */ bbc b(tnm tnmVar) {
        return (bbc) tnmVar.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object d(tnm tnmVar, py8 py8Var, onm onmVar) {
        l8n l8nVar;
        AtomicBoolean atomicBoolean = (AtomicBoolean) tnmVar.h;
        if (onmVar instanceof l8n) {
            l8nVar = (l8n) onmVar;
            int i = l8nVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l8nVar.d = i - Integer.MIN_VALUE;
            } else {
                l8nVar = new l8n(tnmVar, onmVar);
            }
        } else {
            l8nVar = new l8n(tnmVar, onmVar);
        }
        Object objJ = l8nVar.b;
        int i2 = l8nVar.d;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                if (atomicBoolean.get()) {
                    return rih1Var;
                }
                leh lehVar = (leh) tnmVar.f;
                if (lehVar == null) {
                    hhg1.n("No CommandRunner.Monitor has been set!");
                    return null;
                }
                lehVar.c(py8Var);
                Single single = py8Var.d;
                l8nVar.a = py8Var;
                l8nVar.d = 1;
                objJ = fc11.j(single, l8nVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                py8Var = l8nVar.a;
                hm5.M(objJ);
            }
            aeh aehVar = (geh) objJ;
            if (aehVar instanceof aeh) {
                fey feyVar = aehVar.a;
                j3m j3mVar = new j3m(tnmVar, (byte) 17);
                zf30 zf30Var = (zf30) feyVar.b;
                zf30Var.s1.a(new lg30(j3mVar, zf30Var));
                atomicBoolean.set(true);
            }
            return rih1Var;
        } catch (Throwable th) {
            leh lehVar2 = (leh) tnmVar.f;
            if (lehVar2 != null) {
                lehVar2.e(py8Var, th);
            }
            throw th;
        }
    }

    public static tnm o(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(2131624500, (ViewGroup) null, false);
        int i = 2131427611;
        ArtworkView artworkViewT = m5n1.t(viewInflate, 2131427611);
        if (artworkViewT != null) {
            i = 2131427613;
            if (m5n1.t(viewInflate, 2131427613) != null) {
                i = 2131427624;
                ArtworkShadow artworkShadowT = m5n1.t(viewInflate, 2131427624);
                if (artworkShadowT != null) {
                    i = 2131427625;
                    if (((Space) m5n1.t(viewInflate, 2131427625)) != null) {
                        i = 2131427626;
                        if (((Space) m5n1.t(viewInflate, 2131427626)) != null) {
                            i = 2131427627;
                            if (((Space) m5n1.t(viewInflate, 2131427627)) != null) {
                                i = 2131427628;
                                if (((Space) m5n1.t(viewInflate, 2131427628)) != null) {
                                    i = 2131427739;
                                    ConstraintLayout constraintLayoutT = m5n1.t(viewInflate, 2131427739);
                                    if (constraintLayoutT != null) {
                                        i = 2131429029;
                                        View viewT = m5n1.t(viewInflate, 2131429029);
                                        if (viewT != null) {
                                            i = 2131429110;
                                            if (m5n1.t(viewInflate, 2131429110) != null) {
                                                FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                i = 2131431276;
                                                FrameLayout frameLayout2 = (FrameLayout) m5n1.t(viewInflate, 2131431276);
                                                if (frameLayout2 != null) {
                                                    return new tnm(frameLayout, artworkViewT, artworkShadowT, constraintLayoutT, viewT, frameLayout, frameLayout2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public void a(leh lehVar) {
        this.f = lehVar;
    }

    public void c(py8 py8Var) {
        fn31.T((llm) this.d, ((AtomicBoolean) this.g).compareAndSet(true, false) ? (q8n) this.c : (q8n) this.b, 0, new k53(this, py8Var, (lnm) null, (byte) 7), 2);
    }

    public gj5 e() {
        gj5 gj5Var = (gj5) ((kpz0) this.b).e.get();
        c8o.l(gj5Var);
        return gj5Var;
    }

    public jpz0 f() {
        kpz0 kpz0Var = (kpz0) this.b;
        gx81 gx81Var = (gx81) kpz0Var.b.get();
        c8o.l(gx81Var);
        RetrofitMaker retrofitMaker = (RetrofitMaker) kpz0Var.f.get();
        c8o.l(retrofitMaker);
        cpz0 cpz0Var = (cpz0) retrofitMaker.createWebgateService(cpz0.class, "android-radio-radiohubpage");
        vqv0 vqv0Var = new vqv0(e(), (byte) 12);
        dxz0 dxz0Var = (dxz0) kpz0Var.c.get();
        c8o.l(dxz0Var);
        Scheduler scheduler = (Scheduler) kpz0Var.a.get();
        c8o.l(scheduler);
        return new jpz0(gx81Var, new qpz0(cpz0Var, vqv0Var, dxz0Var, scheduler), new lo5(xqu.a((jly0) this.h), (byte) 4));
    }

    public mxr g() {
        ypv ypvVar = (ypv) this.b;
        jo80 jo80Var = ypvVar.c;
        Activity activity = (Activity) jo80Var.a;
        c8o.l(activity);
        i8h1 i8h1VarZ = u1n0.z((q7r0) this.d);
        r6h1 r6h1Var = r6h1.c;
        u8h1 u8h1Var = ksk0.i;
        ArrayList arrayList = new ArrayList();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-edit-playlist-cover-art";
        x6h1VarI.f = "2.2.0";
        x6h1VarI.g = "22.0.0";
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("playlist/edit-coverart");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.add(y6h1VarA);
        aod aodVar = new aod(i8h1VarZ, new r6h1(arrayList2, u8h1Var));
        Activity activity2 = (Activity) jo80Var.a;
        c8o.l(activity2);
        nw40 nw40Var = new nw40(activity2);
        q8n q8nVar = (q8n) ypvVar.b.get();
        c8o.l(q8nVar);
        return new mxr(activity, aodVar, nw40Var, q8nVar);
    }

    public zeu h() {
        mvv mvvVar = (mvv) this.c;
        i8h1 i8h1Var = (i8h1) mvvVar.g.get();
        c8o.l(i8h1Var);
        String strP = p();
        aqv aqvVar = (aqv) mvvVar.n.get();
        c8o.l(aqvVar);
        String str = ((nvv) this.b).b;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-edit-playlist-metadata-page";
        x6h1VarI.f = "6.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str;
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("playlist/edit-metadata");
        r6h1 r6h1Var = r6h1.c;
        return new zeu(i8h1Var, strP, aqvVar, new g5l0(new r6h1(kk0.l(y6h1VarA), (u8h1) null), (byte) 0));
    }

    public yfu i() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                j59 j59Var = (j59) obj;
                RetrofitMaker retrofitMaker = (RetrofitMaker) j59Var.j.get();
                c8o.l(retrofitMaker);
                s920 s920VarR = imy0.r(retrofitMaker);
                Context context = (Context) j59Var.l.get();
                c8o.l(context);
                String strW = imy0.w(context);
                FilterMetadataDatabase filterMetadataDatabase = (FilterMetadataDatabase) j59Var.o.get();
                c8o.l(filterMetadataDatabase);
                Scheduler scheduler = (Scheduler) j59Var.b.get();
                c8o.l(scheduler);
                kp00 kp00Var = new kp00(filterMetadataDatabase, scheduler, (byte) 15);
                g420 g420Var = (g420) j59Var.m.get();
                c8o.l(g420Var);
                return new yfu(s920VarR, new uny(strW, kp00Var, new vgq0(g420Var, (byte) 25)), (byte) 12);
            default:
                jkg0 jkg0Var = (jkg0) obj;
                RetrofitMaker retrofitMaker2 = (RetrofitMaker) jkg0Var.g.get();
                c8o.l(retrofitMaker2);
                s920 s920VarR2 = imy0.r(retrofitMaker2);
                Context context2 = (Context) jkg0Var.l.get();
                c8o.l(context2);
                String strW2 = imy0.w(context2);
                FilterMetadataDatabase filterMetadataDatabase2 = (FilterMetadataDatabase) jkg0Var.o.get();
                c8o.l(filterMetadataDatabase2);
                Scheduler scheduler2 = (Scheduler) jkg0Var.c.get();
                c8o.l(scheduler2);
                kp00 kp00Var2 = new kp00(filterMetadataDatabase2, scheduler2, (byte) 15);
                g420 g420Var2 = (g420) jkg0Var.m.get();
                c8o.l(g420Var2);
                return new yfu(s920VarR2, new uny(strW2, kp00Var2, new vgq0(g420Var2, (byte) 25)), (byte) 12);
        }
    }

    public na j() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                j59 j59Var = (j59) obj;
                g0l g0lVar = (g0l) j59Var.e.get();
                c8o.l(g0lVar);
                eqy0 eqy0Var = (eqy0) j59Var.i.get();
                c8o.l(eqy0Var);
                return new na(g0lVar, eqy0Var, (byte) 14);
            default:
                jkg0 jkg0Var = (jkg0) obj;
                g0l g0lVar2 = (g0l) jkg0Var.k.get();
                c8o.l(g0lVar2);
                eqy0 eqy0Var2 = (eqy0) jkg0Var.i.get();
                c8o.l(eqy0Var2);
                return new na(g0lVar2, eqy0Var2, (byte) 14);
        }
    }

    public x5u k() {
        gfr gfrVarT = t();
        na naVarJ = j();
        dma1 dma1Var = (dma1) ((j59) this.b).g.get();
        c8o.l(dma1Var);
        return new x5u(new gfr(gfrVarT, naVarJ, new iov0(dma1Var), (byte) 9), (byte) 6);
    }

    public hgo l() {
        j59 j59Var = (j59) this.b;
        RxRouter rxRouter = (RxRouter) j59Var.k.get();
        c8o.l(rxRouter);
        e6u e6uVar = new e6u(imy0.v(rxRouter), (byte) 1);
        RetrofitMaker retrofitMaker = (RetrofitMaker) j59Var.j.get();
        c8o.l(retrofitMaker);
        cqy0 cqy0Var = (cqy0) retrofitMaker.createWebgateService(cqy0.class, "android-headphone-enhancements-core");
        kly0 kly0Var = j59Var.x;
        dxz0 dxz0Var = (dxz0) kly0Var.get();
        c8o.l(dxz0Var);
        g7t g7tVar = new g7t(e6uVar, cqy0Var, dxz0Var, (byte) 2);
        na naVarJ = j();
        gfr gfrVarT = t();
        dxz0 dxz0Var2 = (dxz0) kly0Var.get();
        c8o.l(dxz0Var2);
        return new hgo(g7tVar, naVarJ, gfrVarT, dxz0Var2, (byte) 1);
    }

    public boolean m() {
        kpz0 kpz0Var = (kpz0) this.b;
        luk lukVar = (luk) kpz0Var.k.get();
        c8o.l(lukVar);
        return td70.b(new qm4(false, lukVar), ((Boolean) kpz0Var.f41p.get()).booleanValue());
    }

    public bn70 n() {
        p6r0 p6r0VarG1;
        vqy vqyVar = (vqy) this.c;
        Set set = s4b1.f;
        String str = vqyVar.a;
        if (uic.g(str, blc0.M3)) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0VarG1 = yon1.G1("ENTITYSEGMENTS_CLIP", "entitysegments/clip", 518, "entitysegments");
        } else {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            p6r0VarG1 = yon1.G1("PODCASTCHAPTER", "podcastchapter", 1508, "podcastchapter");
        }
        return new bn70(p6r0VarG1, new lik1(str), (nar0) null);
    }

    public String p() {
        String str = ((nvv) this.b).b;
        c8o.m(str);
        return str;
    }

    public g7t q() {
        jkg0 jkg0Var = (jkg0) this.b;
        RxRouter rxRouter = (RxRouter) jkg0Var.j.get();
        c8o.l(rxRouter);
        e6u e6uVar = new e6u(imy0.v(rxRouter), (byte) 1);
        RetrofitMaker retrofitMaker = (RetrofitMaker) jkg0Var.g.get();
        c8o.l(retrofitMaker);
        cqy0 cqy0Var = (cqy0) retrofitMaker.createWebgateService(cqy0.class, "android-headphone-enhancements-core");
        dxz0 dxz0Var = (dxz0) jkg0Var.y.get();
        c8o.l(dxz0Var);
        return new g7t(e6uVar, cqy0Var, dxz0Var, (byte) 2);
    }

    public xok0 r() {
        return new xok0(l1d.m("spotify:chat:", ((aif) this.c).a), (byte) 15);
    }

    public gfr s() {
        na naVarJ = j();
        jkg0 jkg0Var = (jkg0) this.b;
        Observable observable = (Observable) jkg0Var.h.get();
        c8o.l(observable);
        mw7 mw7Var = (mw7) jkg0Var.x.get();
        c8o.l(mw7Var);
        dma1 dma1Var = (dma1) jkg0Var.f.get();
        c8o.l(dma1Var);
        gfr gfrVar = new gfr(naVarJ, observable, new na(mw7Var, new t0t(dma1Var), (byte) 19), (byte) 10);
        na naVarJ2 = j();
        dma1 dma1Var2 = (dma1) jkg0Var.f.get();
        c8o.l(dma1Var2);
        return new gfr(gfrVar, naVarJ2, new iov0(dma1Var2), (byte) 9);
    }

    public gfr t() {
        na naVarJ = j();
        j59 j59Var = (j59) this.b;
        Observable observable = (Observable) j59Var.h.get();
        c8o.l(observable);
        mw7 mw7Var = (mw7) j59Var.w.get();
        c8o.l(mw7Var);
        dma1 dma1Var = (dma1) j59Var.g.get();
        c8o.l(dma1Var);
        return new gfr(naVarJ, observable, new na(mw7Var, new t0t(dma1Var), (byte) 19), (byte) 10);
    }

    public p6r0 u() {
        if (((pz6) this.b).d.isEmpty()) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return yon1.G1("ARTISTS_DNA", "artists-dna", 180, "artists-dna");
        }
        AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
        return yon1.G1("BLEND_DNA", "blend-dna", 214, "blend-dna");
    }

    public l0x0 v() {
        uqy uqyVar = (uqy) this.b;
        xfx xfxVar = (xfx) uqyVar.b.get();
        c8o.l(xfxVar);
        ofx ofxVar = new ofx(xfxVar.a, (byte) 5);
        w3l0 w3l0Var = new w3l0(n().a.path(), ((vqy) this.c).a);
        lzn0 lzn0Var = (lzn0) uqyVar.v.get();
        c8o.l(lzn0Var);
        return new l0x0(ofxVar, w3l0Var, lzn0Var, (byte) 22);
    }

    public void w(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.h;
        switch (b) {
            case 22:
                a1b a1bVar = (a1b) obj;
                teq teqVar = (teq) this.d;
                ((hip) a1bVar).F1 = (jgu) teqVar.b.u.get();
                daq daqVar = (daq) obj2;
                a1bVar.H1 = (gw70) daqVar.d8.get();
                a1bVar.I1 = (jly0) this.f;
                a1bVar.G1 = new d1b((Observable) daqVar.J6.get(), (v5n) daqVar.Pb.get(), (bi0) teqVar.g.get(), new t4d1(((jly0) this.g).get(), (byte) 29), (kt91) daqVar.f8.get(), (i8h1) daqVar.A5.get(), (ntk0) ((jly0) obj4).get(), (Resources) teqVar.N0.get());
                a1bVar.J1 = new ff4(true, (luk) daqVar.L1.get());
                break;
            case 23:
                NotificationPermissionRequestActivity notificationPermissionRequestActivity = (NotificationPermissionRequestActivity) obj;
                ((t3b1) notificationPermissionRequestActivity).b1 = (jgu) ((s2q) obj3).get();
                ((t3b1) notificationPermissionRequestActivity).c1 = new tuk(xqu.a((s2q) obj4));
                notificationPermissionRequestActivity.f1 = (m1o0) ((daq) obj2).a.w1.get();
                break;
            case 24:
                PinPairingActivity pinPairingActivity = (PinPairingActivity) obj;
                ((t3b1) pinPairingActivity).b1 = (jgu) ((s2q) obj3).get();
                ((t3b1) pinPairingActivity).c1 = new tuk(xqu.a((s2q) obj4));
                break;
            case 25:
                PremiumAccountManagementWebviewActivity premiumAccountManagementWebviewActivity = (PremiumAccountManagementWebviewActivity) obj;
                ((t3b1) premiumAccountManagementWebviewActivity).b1 = (jgu) ((s2q) obj3).get();
                ((t3b1) premiumAccountManagementWebviewActivity).c1 = new tuk(xqu.a((s2q) obj4));
                break;
            default:
                ReportWebViewActivity reportWebViewActivity = (ReportWebViewActivity) obj;
                ((t3b1) reportWebViewActivity).b1 = (jgu) ((s2q) obj3).get();
                ((t3b1) reportWebViewActivity).c1 = new tuk(xqu.a((s2q) obj4));
                break;
        }
    }

    public hce1 x() {
        jkg0 jkg0Var = (jkg0) this.b;
        HeadphoneFilterStateDatabase headphoneFilterStateDatabase = (HeadphoneFilterStateDatabase) jkg0Var.p.get();
        c8o.l(headphoneFilterStateDatabase);
        Flowable flowable = (Flowable) jkg0Var.s.get();
        c8o.l(flowable);
        kly0 kly0Var = jkg0Var.c;
        Scheduler scheduler = (Scheduler) kly0Var.get();
        c8o.l(scheduler);
        na naVar = new na(flowable, scheduler, (byte) 17);
        luk lukVar = (luk) jkg0Var.v.get();
        c8o.l(lukVar);
        x5u x5uVar = new x5u(new ppy0(false, lukVar), (byte) 10);
        Scheduler scheduler2 = (Scheduler) kly0Var.get();
        c8o.l(scheduler2);
        return new hce1(headphoneFilterStateDatabase, naVar, x5uVar, scheduler2, (byte) 18);
    }

    public tnm(xfx xfxVar, lzn0 lzn0Var, a1r0 a1r0Var, rzo rzoVar, tjq tjqVar, u35 u35Var, yqg yqgVar, xf4 xf4Var, hod0 hod0Var) {
        this.a = (byte) 2;
        this.b = xfxVar;
        this.c = lzn0Var;
        this.d = a1r0Var;
        this.e = rzoVar;
        this.f = tjqVar;
        this.g = xf4Var;
        this.h = hod0Var;
    }

    public tnm(ConstraintLayout constraintLayout, ArtworkView artworkView, ProgressBar progressBar, MarkAsPlayedButtonView markAsPlayedButtonView, ContentRestrictionBadgeView contentRestrictionBadgeView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.a = (byte) 0;
        this.b = constraintLayout;
        this.c = artworkView;
        this.d = progressBar;
        this.e = markAsPlayedButtonView;
        this.f = contentRestrictionBadgeView;
        this.g = textView;
        this.h = textView2;
    }

    public tnm(FrameLayout frameLayout, ArtworkView artworkView, ArtworkShadow artworkShadow, ConstraintLayout constraintLayout, View view, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.a = (byte) 3;
        this.d = frameLayout;
        this.c = artworkView;
        this.e = artworkShadow;
        this.b = constraintLayout;
        this.f = view;
        this.g = frameLayout2;
        this.h = frameLayout3;
    }

    public tnm(xvw xvwVar, evw evwVar) {
        this.a = (byte) 12;
        this.b = xvwVar;
        this.c = evwVar;
        this.d = xqu.b(new lbp(this, 1, (byte) 11));
        this.e = xqu.b(new lbp(this, 0, (byte) 11));
        this.f = xqu.b(new lbp(this, 4, (byte) 11));
        this.g = iy81.a(new lbp(this, 3, (byte) 11));
        this.h = xqu.b(new lbp(this, 2, (byte) 11));
    }

    public tnm(q8n q8nVar, q8n q8nVar2) {
        this.a = (byte) 1;
        this.b = q8nVar;
        this.c = q8nVar2;
        llm llmVarE = smo1.e(q8nVar);
        this.d = llmVarE;
        this.e = mno1.a(0, 0, 7);
        this.g = new AtomicBoolean(true);
        this.h = new AtomicBoolean(false);
        fn31.T(llmVarE, q8nVar2, 0, new zx0(this, (lnm) null, (byte) 5), 2);
    }

    public tnm(ek50 ek50Var, fk50 fk50Var, q7r0 q7r0Var) {
        this.a = (byte) 16;
        this.b = fk50Var;
        this.c = ek50Var;
        this.d = q7r0Var;
        this.e = xqu.b(new chp(this, 1, (byte) 19));
        this.f = new chp(this, 0, (byte) 19);
        this.g = new chp(this, 2, (byte) 19);
        this.h = xqu.b(new chp(this, 3, (byte) 19));
    }

    public tnm(hwv0 hwv0Var, q7r0 q7r0Var) {
        this.a = (byte) 21;
        this.b = hwv0Var;
        this.c = q7r0Var;
        byte b = 20;
        this.d = xqu.b(new ywp(this, 0, b));
        this.e = new ywp(this, 2, b);
        this.f = new ywp(this, 3, b);
        this.g = new ywp(this, 1, b);
        this.h = new ywp(this, 4, b);
    }

    public tnm(ch50 ch50Var, dh50 dh50Var, q7r0 q7r0Var) {
        this.a = (byte) 14;
        this.b = dh50Var;
        this.c = ch50Var;
        this.d = q7r0Var;
        this.e = xqu.b(new chp(this, 1, (byte) 16));
        this.f = new chp(this, 0, (byte) 16);
        this.g = new chp(this, 2, (byte) 16);
        this.h = xqu.b(new chp(this, 3, (byte) 16));
    }

    public tnm(mi50 mi50Var, li50 li50Var) {
        this.a = (byte) 15;
        this.b = mi50Var;
        this.c = li50Var;
        this.d = xqu.b(new chp(this, 2, (byte) 17));
        this.e = iy81.a(new chp(this, 1, (byte) 17));
        this.f = xqu.b(new chp(this, 3, (byte) 17));
        this.g = xqu.b(new chp(this, 0, (byte) 17));
        this.h = xqu.b(new chp(this, 4, (byte) 17));
    }

    public tnm(zhf zhfVar, aif aifVar) {
        this.a = (byte) 7;
        this.b = zhfVar;
        this.c = aifVar;
        this.d = new b2p(this, 0, (byte) 18);
        this.e = iy81.a(new b2p(this, 2, (byte) 18));
        this.f = new b2p(this, 1, (byte) 18);
        this.g = new b2p(this, 3, (byte) 18);
        this.h = new b2p(this, 4, (byte) 18);
    }

    public tnm(is90 is90Var, ks90 ks90Var) {
        this.a = (byte) 17;
        this.b = is90Var;
        this.c = iy81.a(new chp(this, 1, (byte) 28));
        this.d = iy81.a(new chp(this, 2, (byte) 28));
        this.e = iy81.a(new chp(this, 3, (byte) 28));
        this.f = xqu.b(new chp(this, 4, (byte) 28));
        this.g = iy81.a(new chp(this, 0, (byte) 28));
        this.h = iy81.a(new chp(this, 5, (byte) 28));
    }

    public tnm(pwg0 pwg0Var, qwg0 qwg0Var, q7r0 q7r0Var) {
        this.a = (byte) 20;
        this.b = qwg0Var;
        this.c = q7r0Var;
        this.d = pwg0Var;
        this.e = xqu.b(new blp(this, 0, (byte) 26));
        this.f = xqu.b(new blp(this, 2, (byte) 26));
        this.g = xqu.b(new blp(this, 3, (byte) 26));
        this.h = iy81.a(new blp(this, 1, (byte) 26));
    }

    public tnm(lct lctVar, ivj ivjVar, m4z0 m4z0Var, q7r0 q7r0Var, tso tsoVar) {
        this.a = (byte) 27;
        this.b = m4z0Var;
        this.c = tsoVar;
        this.d = lctVar;
        this.e = q7r0Var;
        this.f = new ykq(this, 1, (byte) 3);
        this.g = xqu.b(new ykq(this, 2, (byte) 3));
        this.h = xqu.b(new ykq(this, 0, (byte) 3));
    }

    public tnm(tke tkeVar, ivj ivjVar, lke lkeVar, q7r0 q7r0Var) {
        this.a = (byte) 6;
        this.b = lkeVar;
        this.c = tkeVar;
        this.d = q7r0Var;
        this.e = xqu.b(new b2p(this, 0, (byte) 13));
        this.f = xqu.b(new b2p(this, 2, (byte) 13));
        this.g = xqu.b(new b2p(this, 1, (byte) 13));
        this.h = xqu.b(new b2p(this, 3, (byte) 13));
    }

    public tnm(nz6 nz6Var, pz6 pz6Var, q7r0 q7r0Var) {
        this.a = (byte) 4;
        this.b = pz6Var;
        this.c = nz6Var;
        this.d = q7r0Var;
        this.e = xqu.b(new fwo(this, 1, (byte) 24));
        this.f = xqu.b(new fwo(this, 2, (byte) 24));
        this.g = iy81.a(new fwo(this, 3, (byte) 24));
        this.h = xqu.b(new fwo(this, 0, (byte) 24));
    }

    public tnm(byj byjVar, c061 c061Var, q7r0 q7r0Var) {
        this.a = (byte) 9;
        this.b = c061Var;
        this.c = byjVar;
        this.d = q7r0Var;
        byte b = 0;
        this.e = xqu.b(new d7p(this, b, b));
        this.f = xqu.b(new d7p(this, 2, b));
        this.g = xqu.b(new d7p(this, 3, b));
        this.h = xqu.b(new d7p(this, 1, b));
    }

    public tnm(rjz0 rjz0Var, ivj ivjVar, ujz0 ujz0Var, q7r0 q7r0Var) {
        this.a = (byte) 28;
        this.b = rjz0Var;
        this.c = q7r0Var;
        this.d = xqu.b(new ykq(this, 1, (byte) 6));
        this.e = xqu.b(new ykq(this, 3, (byte) 6));
        this.f = xqu.b(new ykq(this, 4, (byte) 6));
        this.g = iy81.a(new ykq(this, 2, (byte) 6));
        this.h = iy81.a(new ykq(this, 0, (byte) 6));
    }

    public tnm(rls0 rls0Var, mdg mdgVar) {
        this.a = (byte) 8;
        this.b = mdgVar;
        this.c = rls0Var;
        this.d = iy81.a(new b2p(this, 0, (byte) 22));
        this.e = iy81.a(new b2p(this, 2, (byte) 22));
        this.f = iy81.a(new b2p(this, 3, (byte) 22));
        this.g = iy81.a(new b2p(this, 1, (byte) 22));
        this.h = iy81.a(new b2p(this, 4, (byte) 22));
    }

    public tnm(ypv ypvVar, zpv zpvVar, q7r0 q7r0Var) {
        this.a = (byte) 10;
        this.b = ypvVar;
        this.c = zpvVar;
        this.d = q7r0Var;
        this.e = iy81.a(new lbp(this, 2, (byte) 5));
        this.f = iy81.a(new lbp(this, 3, (byte) 5));
        this.g = iy81.a(new lbp(this, 1, (byte) 5));
        this.h = new lbp(this, 0, (byte) 5);
    }

    public tnm(uqy uqyVar, vqy vqyVar, q7r0 q7r0Var) {
        this.a = (byte) 13;
        this.b = uqyVar;
        this.c = vqyVar;
        this.d = iy81.a(new lbp(this, 0, (byte) 17));
        this.e = iy81.a(new lbp(this, 1, (byte) 17));
        this.f = iy81.a(new lbp(this, 2, (byte) 17));
        this.g = iy81.a(new lbp(this, 3, (byte) 17));
        this.h = iy81.a(new lbp(this, 4, (byte) 17));
    }

    public tnm(mvv mvvVar, nvv nvvVar) {
        this.a = (byte) 11;
        this.b = nvvVar;
        this.c = mvvVar;
        this.d = xqu.b(new lbp(this, 0, (byte) 7));
        this.e = iy81.a(new lbp(this, 1, (byte) 7));
        this.f = iy81.a(new lbp(this, 2, (byte) 7));
        this.g = iy81.a(new lbp(this, 3, (byte) 7));
        this.h = iy81.a(new lbp(this, 4, (byte) 7));
    }

    public tnm(kpz0 kpz0Var) {
        this.a = (byte) 29;
        this.b = kpz0Var;
        this.c = xqu.b(new ykq(this, 3, (byte) 7));
        this.d = xqu.b(new ykq(this, 4, (byte) 7));
        this.e = xqu.b(new ykq(this, 2, (byte) 7));
        this.f = xqu.b(new ykq(this, 5, (byte) 7));
        this.g = xqu.b(new ykq(this, 1, (byte) 7));
        this.h = xqu.b(new ykq(this, 0, (byte) 7));
    }

    public tnm(j59 j59Var, k59 k59Var, q7r0 q7r0Var) {
        this.a = (byte) 5;
        this.b = j59Var;
        this.c = q7r0Var;
        this.d = k59Var;
        this.e = iy81.a(new b2p(this, 1, (byte) 2));
        this.f = xqu.b(new b2p(this, 3, (byte) 2));
        this.g = iy81.a(new b2p(this, 2, (byte) 2));
        this.h = iy81.a(new b2p(this, 0, (byte) 2));
    }

    public tnm(jkg0 jkg0Var, kkg0 kkg0Var, q7r0 q7r0Var) {
        this.a = (byte) 19;
        this.b = jkg0Var;
        this.c = q7r0Var;
        this.d = kkg0Var;
        this.e = iy81.a(new blp(this, 1, (byte) 24));
        this.f = xqu.b(new blp(this, 3, (byte) 24));
        this.g = iy81.a(new blp(this, 2, (byte) 24));
        this.h = iy81.a(new blp(this, 0, (byte) 24));
    }

    public tnm(daq daqVar, NotificationPermissionRequestActivity notificationPermissionRequestActivity) {
        this.a = (byte) 23;
        this.c = daqVar;
        this.b = notificationPermissionRequestActivity;
        byte b = 17;
        this.d = new s2q(daqVar, this, 1, b);
        this.e = new s2q(daqVar, this, 0, b);
        this.f = xqu.b(new s2q(daqVar, this, 4, b));
        this.g = xqu.b(new s2q(daqVar, this, 3, b));
        this.h = new s2q(daqVar, this, 2, b);
    }

    public tnm(daq daqVar, PinPairingActivity pinPairingActivity) {
        byte b = 24;
        this.a = (byte) 24;
        this.c = daqVar;
        this.b = pinPairingActivity;
        this.d = new s2q(daqVar, this, 1, b);
        this.e = new s2q(daqVar, this, 0, b);
        this.f = xqu.b(new s2q(daqVar, this, 4, b));
        this.g = xqu.b(new s2q(daqVar, this, 3, b));
        this.h = new s2q(daqVar, this, 2, b);
    }

    public tnm(daq daqVar, PremiumAccountManagementWebviewActivity premiumAccountManagementWebviewActivity) {
        this.a = (byte) 25;
        this.c = daqVar;
        this.b = premiumAccountManagementWebviewActivity;
        byte b = 26;
        this.d = new s2q(daqVar, this, 1, b);
        this.e = new s2q(daqVar, this, 0, b);
        this.f = xqu.b(new s2q(daqVar, this, 4, b));
        this.g = xqu.b(new s2q(daqVar, this, 3, b));
        this.h = new s2q(daqVar, this, 2, b);
    }

    public tnm(daq daqVar, ReportWebViewActivity reportWebViewActivity) {
        this.a = (byte) 26;
        this.c = daqVar;
        this.b = reportWebViewActivity;
        byte b = 29;
        this.d = new s2q(daqVar, this, 1, b);
        this.e = new s2q(daqVar, this, 0, b);
        this.f = xqu.b(new s2q(daqVar, this, 4, b));
        this.g = xqu.b(new s2q(daqVar, this, 3, b));
        this.h = new s2q(daqVar, this, 2, b);
    }

    public tnm(daq daqVar, teq teqVar, a1b a1bVar) {
        this.a = (byte) 22;
        this.c = daqVar;
        this.d = teqVar;
        this.b = a1bVar;
        this.e = xqu.b(new p2p(daqVar, this, 1, (byte) 18));
        this.f = xqu.b(new p2p(daqVar, this, 0, (byte) 18));
        this.g = xqu.b(new p2p(daqVar, this, 2, (byte) 18));
        this.h = xqu.b(new p2p(daqVar, this, 3, (byte) 18));
    }
}
