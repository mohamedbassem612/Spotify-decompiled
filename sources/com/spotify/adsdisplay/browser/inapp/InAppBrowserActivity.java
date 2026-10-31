package com.spotify.adsdisplay.browser.inapp;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.adsdisplay.browser.BreadcrumbException;
import com.spotify.legacyglue.icons.SpotifyIconView;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.a580;
import p.ak20;
import p.b580;
import p.bb01;
import p.c580;
import p.een0;
import p.f72;
import p.hhg1;
import p.j830;
import p.kx40;
import p.mir0;
import p.mma0;
import p.nfb;
import p.p6r0;
import p.pjl1;
import p.qir0;
import p.rwq0;
import p.sgp0;
import p.t3b1;
import p.u890;
import p.w480;
import p.y480;
import p.ydb;
import p.yon1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/spotify/adsdisplay/browser/inapp/InAppBrowserActivity;", "Lp/t3b1;", "Lp/pjl1;", "<init>", "()V", "p/nfb", "src_main_java_com_spotify_adsdisplay_browser-browser"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InAppBrowserActivity extends t3b1 implements pjl1 {
    public TextView f1;
    public TextView g1;
    public View h1;
    public TextView i1;
    public TextView j1;
    public ProgressBar k1;
    public WebView l1;
    public SpotifyIconView m1;
    public c580 n1;
    public final y480 o1 = new y480(this, (byte) 0, false);
    public final y480 p1 = new y480(this, (byte) 1, false);
    public final y480 q1 = new y480(this, (byte) 2);
    public final y480 r1 = new y480(this, (byte) 3);
    public static final /* synthetic */ mma0[] t1 = {new een0(InAppBrowserActivity.class, "title", "getTitle()Ljava/lang/String;", 0), new een0(InAppBrowserActivity.class, "subtitle", "getSubtitle()Ljava/lang/String;", 0), new een0(InAppBrowserActivity.class, "isLoading", "isLoading()Z", 0), new een0(InAppBrowserActivity.class, "currentProgress", "getCurrentProgress()I", 0)};
    public static final nfb s1 = new nfb((byte) 13, false);

    public final WebView H() {
        WebView webView = this.l1;
        if (webView != null) {
            return webView;
        }
        u890.C("webView");
        throw null;
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("ADS_IN_APP_WEB_BROWSER", "ads/in-app-web-browser", 22, "ads"), (qir0) null, 4));
    }

    public final int o0() {
        mma0 mma0Var = t1[3];
        return ((Number) ((sgp0) this.r1).a).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        Single singleJust;
        super.onCreate(bundle);
        setContentView(2131623999);
        rwq0.s(getWindow().getDecorView().getRootView(), j830.O0);
        this.l1 = (WebView) findViewById(2131431680);
        this.k1 = (ProgressBar) findViewById(2131431688);
        this.h1 = findViewById(2131431683);
        this.i1 = (TextView) findViewById(2131431686);
        this.j1 = (TextView) findViewById(2131431685);
        this.g1 = (TextView) findViewById(2131431691);
        this.f1 = (TextView) findViewById(2131431690);
        SpotifyIconView spotifyIconViewFindViewById = findViewById(2131427815);
        byte b = 0;
        spotifyIconViewFindViewById.setOnClickListener(new w480(this, b));
        this.m1 = spotifyIconViewFindViewById;
        byte b2 = 1;
        findViewById(2131427810).setOnClickListener(new w480(this, b2));
        findViewById(2131431684).setOnClickListener(new w480(this, (byte) 2));
        J().a(this, new ydb(this, (byte) 11));
        c580 c580VarP0 = p0();
        a580 a580Var = (a580) getIntent().getParcelableExtra("com.spotify.adsdisplay.browser.webview.metadata");
        if (a580Var == null) {
            hhg1.n("Cannot use WebViewActivity without InAppBrowserMetadata");
            return;
        }
        c580VarP0.V0 = a580Var;
        String str = a580Var.a;
        Uri uri = Uri.parse(str);
        uri.getClass();
        String host = uri.getHost();
        if (host == null ? false : host.equalsIgnoreCase("www.spotify.com")) {
            singleJust = c580VarP0.i.b(uri).timeout(2L, TimeUnit.SECONDS, Single.error(new TimeoutException()));
        } else {
            singleJust = Single.just(uri);
        }
        c580VarP0.T0.a(singleJust.observeOn((Scheduler) c580VarP0.Z.b).onErrorReturnItem(uri).map(ak20.d).doOnSubscribe(new b580(c580VarP0, b)).doAfterTerminate(new f72(c580VarP0, (byte) 25)).onErrorResumeNext(new bb01(new BreadcrumbException(), (byte) 13)).subscribe(new b580(c580VarP0, b2)));
        c580VarP0.e(str);
        InAppBrowserActivity inAppBrowserActivity = c580VarP0.a;
        inAppBrowserActivity.o1.c(t1[0], inAppBrowserActivity, a580Var.c);
    }

    public final c580 p0() {
        c580 c580Var = this.n1;
        if (c580Var != null) {
            return c580Var;
        }
        u890.C("listener");
        throw null;
    }

    public final void q0(boolean z) {
        this.q1.c(t1[2], this, Boolean.valueOf(z));
    }
}
