package p;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.spotify.nowplaying.scroll.view.NowPlayingScrollView;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.Suppressions$Providers;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.search.esperanto.proto.OfflineSearchResponse;
import com.spotify.search.proto.OfflineTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rok0 implements h8q0, Function, hep0, llq0 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public rok0(yqg yqgVar) {
        this.a = (byte) 27;
        this.b = yqgVar;
        this.c = sqg0.J(new mmr0[]{new mmr0("EAGLE", new biq0(2, 12, 1, "EAGLE")), new mmr0("ARCTIC", new biq0(2, 12, 9, "ARCTIC")), new mmr0("WILLOW", new biq0(2, 12, 15, "WILLOW")), new mmr0("IVY", new biq0(2, 13, 3, "IVY")), new mmr0("HAWK", new biq0(2, 13, 9, "HAWK")), new mmr0("DOLPHIN", new biq0(2, 14, 3, "DOLPHIN")), new mmr0("GLACIER", new biq0(2, 14, 11, "GLACIER")), new mmr0("MAPLE", new biq0(2, 14, 17, "MAPLE")), new mmr0("ALPS", new biq0(2, 15, 5, "ALPS")), new mmr0("PANTHER", new biq0(2, 15, 11, "PANTHER")), new mmr0("FALCON", new biq0(2, 16, 5, "FALCON")), new mmr0("REDWOOD", new biq0(2, 16, 19, "REDWOOD")), new mmr0("AMAZON", new biq0(2, 17, 7, "AMAZON")), new mmr0("OAK", new biq0(2, 17, 13, "OAK")), new mmr0("FERN", new biq0(2, 18, 1, "FERN")), new mmr0("LEOPARD", new biq0(2, 18, 7, "LEOPARD")), new mmr0("MOSS", new biq0(3, 12, 2, "MOSS")), new mmr0("SHARK", new biq0(3, 12, 8, "SHARK")), new mmr0("TIGER", new biq0(3, 13, 2, "TIGER")), new mmr0("CANYON", new biq0(3, 13, 10, "CANYON")), new mmr0("CEDAR", new biq0(3, 13, 16, "CEDAR")), new mmr0("ROSE", new biq0(3, 14, 4, "ROSE")), new mmr0("LION", new biq0(3, 14, 10, "LION")), new mmr0("WOLF", new biq0(3, 15, 4, "WOLF")), new mmr0("VOLCANO", new biq0(3, 15, 12, "VOLCANO")), new mmr0("BIRCH", new biq0(3, 15, 18, "BIRCH")), new mmr0("SAHARA", new biq0(3, 16, 6, "SAHARA")), new mmr0("ORCA", new biq0(3, 16, 12, "ORCA")), new mmr0("BEAR", new biq0(3, 17, 6, "BEAR")), new mmr0("BAMBOO", new biq0(3, 17, 20, "BAMBOO")), new mmr0("EVEREST", new biq0(3, 18, 8, "EVEREST")), new mmr0("PINE", new biq0(3, 18, 14, "PINE"))});
    }

    public static void g(hmb0 hmb0Var) {
        if (hmb0Var.o1 > 0) {
            if (hmb0Var.f1.d == 5 && !hmb0Var.q() && !hmb0Var.r() && !hmb0Var.p1 && hmb0Var.J()) {
                pim0 pim0Var = (pim0) hmb0Var.e1.g;
                if ((pim0Var.d & 256) != 0) {
                    while (pim0Var != null) {
                        if ((pim0Var.c & 256) != 0) {
                            pim0 pim0VarS = pim0Var;
                            bfn0 bfn0Var = null;
                            while (pim0VarS != null) {
                                if (pim0VarS instanceof mv40) {
                                    mv40 mv40Var = (mv40) pim0VarS;
                                    mv40Var.E(oap1.w(mv40Var, 256));
                                } else if ((pim0VarS.c & 256) != 0 && (pim0VarS instanceof l5t)) {
                                    int i = 0;
                                    for (pim0 pim0Var2 = ((l5t) pim0VarS).P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
                                        if ((pim0Var2.c & 256) != 0) {
                                            i++;
                                            if (i == 1) {
                                                pim0VarS = pim0Var2;
                                            } else {
                                                if (bfn0Var == null) {
                                                    bfn0Var = new bfn0(0, new pim0[16]);
                                                }
                                                if (pim0VarS != null) {
                                                    bfn0Var.b(pim0VarS);
                                                    pim0VarS = null;
                                                }
                                                bfn0Var.b(pim0Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                pim0VarS = oap1.s(bfn0Var);
                            }
                        }
                        if ((pim0Var.d & 256) == 0) {
                            break;
                        } else {
                            pim0Var = pim0Var.f;
                        }
                    }
                }
            }
            hmb0Var.n1 = false;
            bfn0 bfn0VarA = hmb0Var.A();
            Object[] objArr = bfn0VarA.a;
            int i2 = bfn0VarA.c;
            for (int i3 = 0; i3 < i2; i3++) {
                g((hmb0) objArr[i3]);
            }
        }
    }

    public void a(xnm0 xnm0Var, x5o0 x5o0Var) {
        dwm0.a((nen0) this.b, xnm0Var, x5o0Var);
        dwm0.a((nen0) this.c, x5o0Var.b, xnm0Var);
    }

    public Object apply(Object obj) {
        k560 k560Var;
        Observable observableJust;
        byte b = 9;
        switch (this.a) {
            case 1:
                mmr0 mmr0Var = (mmr0) obj;
                String str = (String) mmr0Var.a;
                return Observable.fromCallable(new wra((uv00) this.c, (Class) mmr0Var.b, str, (byte) 3)).subscribeOn(((cvm0) this.b).c);
            case 13:
                return new CompletableFromAction(new tt60((kt91) this.b, ((Context) this.c).getString(2131962659, ((duo0) obj).a), (byte) 9)).w();
            case 20:
                d560 d560Var = (j560) obj;
                ob0 ob0Var = (tb0) this.c;
                if (d560Var instanceof d560) {
                    return Observable.just(new ksy0(d560Var.a, sf20.c));
                }
                if (d560Var instanceof f560) {
                    f560 f560Var = (f560) d560Var;
                    return Observable.just(new ksy0(f560Var.a, new rf20(f560Var.b)));
                }
                boolean z = true;
                if (d560Var instanceof h560) {
                    b050 b050Var = ((gjp0) this.b).f;
                    m560 m560Var = ((h560) d560Var).a;
                    ima1 ima1Var = b050Var.a;
                    if (m560Var instanceof k560) {
                        bma1 bma1Var = csy0.a;
                        observableJust = yoi1.i(ima1Var.s(bma1Var), o6x.a).startWithItem(new cma1(1, ima1Var.b(bma1Var, w7x.a))).map(new vqv0(m560Var, (byte) 7));
                    } else if (m560Var instanceof l560) {
                        observableJust = Observable.just(Boolean.FALSE);
                    } else {
                        eg.o();
                    }
                    Observable observableSwitchMap = observableJust.switchMap(new ewn0(ob0Var, b));
                    observableSwitchMap.getClass();
                    return observableSwitchMap;
                }
                if (d560Var instanceof e560) {
                    return Observable.just(new ksy0(((e560) d560Var).a, qf20.c));
                }
                if (d560Var instanceof g560) {
                    return Observable.just(new ksy0(((g560) d560Var).a, tf20.c));
                }
                if (d560Var.equals(i560.a)) {
                    ob0 ob0Var2 = (rb0) ob0Var;
                    boolean z2 = ob0Var2 instanceof ob0;
                    if (z2) {
                        k560Var = ob0Var2.a;
                    } else if (ob0Var2 instanceof sb0) {
                        k560Var = ((sb0) ob0Var2).a;
                    } else {
                        eg.o();
                    }
                    if (z2) {
                        z = ob0Var2.b;
                    } else if (!(ob0Var2 instanceof sb0)) {
                        eg.o();
                    }
                    return Observable.just(new qsy0(k560Var, z));
                }
                eg.o();
                return null;
            case 22:
                OfflineSearchResponse offlineSearchResponse = (OfflineSearchResponse) obj;
                rzo0 rzo0Var = (rzo0) this.b;
                if (!((ewp0) this.c).b) {
                    Single singleJust = Single.just(new mmr0(offlineSearchResponse, b7x.a));
                    singleJust.getClass();
                    return singleJust;
                }
                List tracksList = offlineSearchResponse.getTracksList();
                ArrayList arrayList = new ArrayList(q7h.U(tracksList, 10));
                Iterator it = tracksList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((OfflineTrack) it.next()).getUri());
                }
                Single singleFirstOrError = ((f8b) rzo0Var.c).a(arrayList).map(new qkn0(offlineSearchResponse, b)).firstOrError();
                singleFirstOrError.getClass();
                return singleFirstOrError;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    Single singleJust2 = Single.just(Boolean.FALSE);
                    singleJust2.getClass();
                    return singleJust2;
                }
                r3q0 r3q0Var = (r3q0) this.b;
                String str2 = (String) this.c;
                com.spotify.player.model.Context contextFromUri = com.spotify.player.model.Context.fromUri(str2);
                j380 j380VarMetadata = contextFromUri.metadata();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : j380VarMetadata.entrySet()) {
                    if (!ContextTrack$Metadata.KEY_MFT_UNPLAYABLE_POLICY.equals(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Map mapP = sqg0.P(linkedHashMap, new mmr0(ContextTrack$Metadata.KEY_MFT_UNPLAYABLE_POLICY, "replace"));
                return r3q0Var.c.a(PlayCommand.builder(contextFromUri.toBuilder().metadata(mapP).pages(Collections.singletonList(ContextPage.builder().tracks(Collections.singletonList(ContextTrack.builder(contextFromUri.uri()).metadata(Collections.singletonMap(ContextTrack$Metadata.KEY_PROVIDER, "social_ondemand")).build())).build())).build(), r3q0Var.d.toBuilder().featureClasses(Collections.singleton("social_play")).build()).options(PreparePlayOptions.builder().skipTo(SkipToTrack.fromUri(str2)).initiallyPaused(false).suppressions(Collections.singleton(Suppressions$Providers.MFT_INJECT_RANDOM_TRACKS)).build()).build()).map(cj20.U0);
        }
    }

    public List b(Integer num) {
        List listB = ((llq0) this.b).b((Integer) null);
        hf91 hf91Var = (hf91) this.c;
        int i = hf91Var.v;
        if (i < 0) {
            return listB;
        }
        return o7h.N0(listB, rc2.q(hf91Var, num, i, Integer.valueOf(hf91Var.F(i, hf91Var.b))));
    }

    public boolean c() {
        return ((llq0) this.b).c();
    }

    public void d() {
        ((nen0) this.b).a();
        ((nen0) this.c).a();
    }

    public boolean e(xnm0 xnm0Var) {
        return ((nen0) this.b).b(xnm0Var);
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 3:
                if (!(obj instanceof nmr0)) {
                    return false;
                }
                nmr0 nmr0Var = (nmr0) obj;
                Object obj2 = nmr0Var.a;
                Object obj3 = this.b;
                if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
                    return false;
                }
                Object obj4 = nmr0Var.b;
                Object obj5 = this.c;
                return obj4 == obj5 || (obj4 != null && obj4.equals(obj5));
            default:
                return super.equals(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f() {
        Object[] objArr;
        bfn0 bfn0Var = (bfn0) this.b;
        f46.G0(bfn0Var.a, k0d.Y, bfn0Var.c);
        int i = bfn0Var.c;
        hmb0[] hmb0VarArr = (hmb0[]) this.c;
        if (hmb0VarArr == null || hmb0VarArr.length < i) {
            objArr = hmb0VarArr;
            objArr = new hmb0[Math.max(16, i)];
        }
        objArr = hmb0VarArr;
        this.c = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = bfn0Var.a[i2];
        }
        bfn0Var.g();
        while (true) {
            i--;
            if (-1 >= i) {
                this.c = objArr;
                return;
            }
            hmb0 hmb0Var = objArr[i];
            hmb0Var.getClass();
            if (hmb0Var.n1) {
                g(hmb0Var);
            }
            objArr[i] = 0;
        }
    }

    public jge h(boolean z) {
        Flowable flowable = (Flowable) this.b;
        vbm[] vbmVarArr = q601.a;
        kge kgeVar = new kge(flowable);
        fad0 fad0Var = (fad0) this.c;
        return hu20.e(rqt0.u(new x010(kgeVar, yoi1.g(new ObservableFromPublisher(((Flowable) fad0Var.b).J(new eb80(fad0Var, (byte) 13)))), new blm(3, null, (byte) 1), (byte) 1)), new h42(z, (lnm) null));
    }

    public int hashCode() {
        switch (this.a) {
            case 3:
                Object obj = this.b;
                int iHashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.c;
                return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public void i() {
        qek1 lvq0Var = new lvq0(wso0.a1, new mvq0(this, (byte) 0));
        View view = (View) this.b;
        view.animate().cancel();
        oek1 oek1VarC = b8k1.c(view);
        oek1VarC.d(150L);
        oek1VarC.e(hlv.c);
        oek1VarC.f(lvq0Var);
        oek1VarC.a(0.0f);
        oek1VarC.g();
    }

    public boolean j() {
        return ppn0.c == 3;
    }

    public boolean k() {
        return ((bfn0) this.b).c != 0;
    }

    public void l() {
        this.c = UUID.randomUUID().toString();
        String string = Uri.parse("https://nid.naver.com/oauth2.0/authorize").buildUpon().appendQueryParameter("response_type", "code").appendQueryParameter("state", (String) this.c).appendQueryParameter("client_id", "r9SepABaSaKdL47pyi4d").appendQueryParameter("redirect_uri", "spotify-auth-music://callback/r/android/music/login").build().toString();
        ppn0.c = 2;
        try {
            oxg1 oxg1Var = new oxg1();
            oxg1Var.g();
            oxg1Var.c(2);
            oxg1Var.a().j((Activity) this.b, Uri.parse(string));
        } catch (ActivityNotFoundException e) {
            String str = (String) this.c;
            String message = e.getMessage();
            if (message == null) {
                message = "No browser available to complete sign-in";
            }
            opn0 opn0Var = new opn0(null, str, "no_browser", message);
            ppn0.c = 1;
            ppn0.b.onNext(opn0Var);
        }
    }

    public void m() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((ixk0) this.c).a.c();
        x6h1VarC.i.add(new a7h1("notification_opt_in_sheet", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void n() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((ixk0) this.c).a.c();
        x6h1VarC.i.add(new a7h1("notification_opt_in_sheet", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("dismiss", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void o() {
        if (ppn0.c == 2) {
            ppn0.c = 3;
        }
    }

    public void onSuccess(Object obj) {
        ((l441) this.b).resumeWith((nxo1) this.c);
    }

    public PublishSubject p() {
        return ppn0.b;
    }

    public void q(hmb0 hmb0Var) {
        if (hmb0Var.o1 > 0) {
            ((bfn0) this.b).b(hmb0Var);
            hmb0Var.n1 = true;
        }
    }

    public void r(hmb0 hmb0Var) {
        bfn0 bfn0Var = (bfn0) this.b;
        if (hmb0Var.o1 > 0) {
            bfn0Var.g();
            bfn0Var.b(hmb0Var);
            hmb0Var.n1 = true;
        }
    }

    public void s(hmb0 hmb0Var) {
        ((bfn0) this.b).k(hmb0Var);
    }

    public x5o0 t(xnm0 xnm0Var) {
        nen0 nen0Var = (nen0) this.b;
        x5o0 x5o0Var = (x5o0) dwm0.b(nen0Var, xnm0Var);
        if (nen0Var.i()) {
            ((nen0) this.c).a();
        }
        return x5o0Var;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder("Pair{");
                sb.append(this.b);
                sb.append(" ");
                return td6.l(sb, this.c, "}");
            default:
                return super.toString();
        }
    }

    public void u() {
        ppn0.c = 1;
    }

    public void v() {
        View view = (View) this.b;
        if (view.getVisibility() == 0) {
            i();
            return;
        }
        qek1 lvq0Var = new lvq0(new mvq0(this, (byte) 1), new mvq0(this, (byte) 2));
        view.animate().cancel();
        view.removeCallbacks((an90) this.c);
        oek1 oek1VarC = b8k1.c(view);
        oek1VarC.d(150L);
        oek1VarC.e(hlv.c);
        oek1VarC.f(lvq0Var);
        oek1VarC.a(1.0f);
        oek1VarC.g();
    }

    public void w(znm0 znm0Var) {
        nen0 nen0Var = (nen0) this.b;
        Object objG = ((nen0) this.c).g(znm0Var);
        if (objG != null) {
            if (!(objG instanceof wdn0)) {
                dwm0.c(nen0Var, (xnm0) objG, new gv20(znm0Var, (byte) 27));
                return;
            }
            wdn0 wdn0Var = (wdn0) objG;
            Object[] objArr = wdn0Var.a;
            int i = wdn0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                dwm0.c(nen0Var, (xnm0) objArr[i2], new gv20(znm0Var, (byte) 27));
            }
        }
    }

    public rok0(View view) {
        this.a = (byte) 29;
        this.b = view;
        an90 an90Var = new an90(this, (byte) 16);
        this.c = an90Var;
        view.postDelayed(an90Var, 3500L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rok0(NowPlayingScrollView nowPlayingScrollView) {
        this.a = (byte) 17;
        this.b = nowPlayingScrollView;
        pgr pgrVar = new pgr(new rm5(new y3o0(this, (byte) 19), (byte) 13), false);
        nowPlayingScrollView.setOnScrollChangeListener(new yl7(pgrVar, nowPlayingScrollView, (byte) 0));
        tl7.f(pgrVar, 0, (Float) null, nowPlayingScrollView.getResources().getDisplayMetrics().density, 6);
        this.c = pgrVar;
    }

    public rok0(i8h1 i8h1Var) {
        this.a = (byte) 11;
        this.b = i8h1Var;
        this.c = new ixk0();
    }

    public /* synthetic */ rok0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public rok0(byte b) {
        this.a = b;
        switch (b) {
            case 8:
                this.b = new nen0();
                this.c = new nen0();
                break;
            case 23:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                break;
            case 25:
                this.b = new bfn0(0, new hmb0[16]);
                break;
        }
    }

    public rok0(Activity activity, ppn0 ppn0Var) {
        this.a = (byte) 5;
        this.b = activity;
    }

    public rok0(Map map) {
        this.a = (byte) 18;
        this.b = map;
        this.c = new voe0("Java nullability annotation states").b(new gqb0(this, (byte) 6));
    }

    public rok0(bg11 bg11Var, int[] iArr) {
        this.a = (byte) 4;
        this.b = b380.p(bg11Var);
        this.c = iArr;
    }
}
