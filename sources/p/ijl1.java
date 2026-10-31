package p;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lp/ijl1;", "Lp/zf30;", "<init>", "()V", "p/fjl1", "src_main_java_com_spotify_checkout_web-web"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public abstract class ijl1 extends zf30 {
    public static final /* synthetic */ mma0[] U1 = {new een0(ijl1.class, "state", "getState()Lcom/spotify/checkout/web/WebViewFragment$State;", 0), new een0(ijl1.class, "webViewState", "getWebViewState()Landroid/os/Bundle;", 0)};
    public WebView G1;
    public WebView H1;
    public View I1;
    public ViewGroup J1;
    public o7b1 K1;
    public final e821 M1;
    public final e821 N1;
    public boolean O1;
    public boolean P1;
    public boolean Q1;
    public boolean R1;
    public final BehaviorSubject S1;
    public final CompositeDisposable T1;
    public final Handler F1 = new Handler(Looper.getMainLooper());
    public final seg1 L1 = new seg1(this, (byte) 11);

    public ijl1() {
        w3l1 w3l1Var = w3l1.Q0;
        ae41 ae41Var = ae41.b;
        ae41Var.getClass();
        this.M1 = fdg1.W(this, fjl1.Companion.serializer(), ae41Var, w3l1Var);
        this.N1 = fdg1.W(this, wmo1.n(ae41Var.a(), rc11.a.b(Bundle.class)), ae41Var, w3l1.R0);
        this.Q1 = true;
        this.R1 = true;
        this.S1 = BehaviorSubject.g(Boolean.TRUE);
        this.T1 = new CompositeDisposable();
    }

    @Override // p.zf30
    public final void F0(Bundle bundle) {
        WebView webView = this.H1;
        if (webView != null) {
            webView.saveState((Bundle) this.N1.m(this, U1[1]));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void Y0(fjl1 fjl1Var) throws NoWhenBranchMatchedException {
        boolean z;
        Logger.g("Changing state " + a1() + " -> " + fjl1Var, new Object[0]);
        this.M1.v(U1[0], this, fjl1Var);
        int i = gjl1.a[fjl1Var.ordinal()];
        if (i == 1 || i == 2) {
            z = true;
        } else {
            if (i != 3 && i != 4) {
                eg.o();
                return;
            }
            z = false;
        }
        WebView webView = this.H1;
        if (webView != null) {
            webView.setVisibility(z ? 0 : 8);
        }
        ViewGroup viewGroup = this.J1;
        if (viewGroup != null) {
            viewGroup.setVisibility(!z ? 0 : 8);
        }
        View view = this.I1;
        if (view != null) {
            view.setVisibility((z || !this.R1) ? 8 : 0);
        }
        View view2 = this.I1;
        if (view2 != null) {
            view2.setEnabled(true);
        }
    }

    public int Z0() {
        return 2131624701;
    }

    public final fjl1 a1() {
        return (fjl1) this.M1.m(this, U1[0]);
    }

    public boolean b1(Uri uri) {
        return false;
    }

    public abstract void c1();

    public final boolean d1() {
        WebView webView = this.H1;
        if (webView == null || !webView.canGoBack()) {
            return false;
        }
        webView.goBack();
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void l1(String str) throws NoWhenBranchMatchedException {
        this.F1.removeCallbacks(this.L1);
        if (a1() == fjl1.b || a1() == fjl1.c) {
            Y0(fjl1.d);
            WebView webView = this.H1;
            if (webView != null) {
                webView.loadUrl(str);
            }
        }
    }

    @Override // p.zf30
    public final void u0(int i, int i2, Intent intent) {
        o7b1 o7b1Var = this.K1;
        if (o7b1Var != null) {
            o7b1Var.a(i, i2, intent);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.zf30
    public View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws NoWhenBranchMatchedException {
        WebSettings settings;
        WebSettings settings2;
        WebView webView;
        Logger.g("onCreateView() (retained? " + (this.G1 != null) + ")", new Object[0]);
        View viewInflate = layoutInflater.inflate(Z0(), viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(2131427864);
        if (viewFindViewById == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        viewFindViewById.setOnClickListener(new gl61(this, (byte) 18));
        this.I1 = viewFindViewById;
        WebView webView2 = this.G1;
        if (webView2 != null) {
            this.H1 = webView2;
            this.G1 = null;
        } else {
            this.H1 = new WebView(N0());
            WebView.setWebContentsDebuggingEnabled(false);
            WebView webView3 = this.H1;
            if (webView3 != null && (settings2 = webView3.getSettings()) != null) {
                settings2.setJavaScriptEnabled(true);
            }
            WebView webView4 = this.H1;
            if (webView4 != null && (settings = webView4.getSettings()) != null) {
                settings.setDomStorageEnabled(true);
            }
            WebChromeClient o7b1Var = new o7b1(new ssk1(this), new h5a1(this, (byte) 26), new zgl1(this));
            this.K1 = o7b1Var;
            WebView webView5 = this.H1;
            if (webView5 != null) {
                webView5.setWebChromeClient(o7b1Var);
            }
            WebView webView6 = this.H1;
            if (webView6 != null) {
                webView6.setWebViewClient(new q78(this, (byte) 4));
            }
        }
        View viewFindViewById2 = viewInflate.findViewById(2131431687);
        if (viewFindViewById2 == null) {
            eg.m("Required value was null.");
            return null;
        }
        ((ViewGroup) viewFindViewById2).addView(this.H1, -1, -1);
        View viewFindViewById3 = viewInflate.findViewById(2131428723);
        if (viewFindViewById3 == null) {
            eg.m("Required value was null.");
            return null;
        }
        this.J1 = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(2131429821);
        if (viewFindViewById4 == null) {
            eg.m("Required value was null.");
            return null;
        }
        Observable observableSwitchMap = this.S1.switchMap(kcx0.Y0);
        Scheduler scheduler = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler);
        this.T1.b(observableSwitchMap.observeOn(scheduler).subscribe(new rkn0(viewFindViewById4, (byte) 1)));
        Y0(a1());
        fjl1 fjl1VarA1 = a1();
        fjl1 fjl1Var = fjl1.b;
        if (fjl1VarA1 == fjl1Var || a1() == fjl1.c) {
            this.F1.postDelayed(this.L1, 3100L);
            Y0(fjl1Var);
            c1();
            return viewInflate;
        }
        WebView webView7 = this.H1;
        String url = webView7 != null ? webView7.getUrl() : null;
        if (url == null || url.length() == 0) {
            mma0[] mma0VarArr = U1;
            mma0 mma0Var = mma0VarArr[1];
            e821 e821Var = this.N1;
            if (!((Bundle) e821Var.m(this, mma0Var)).isEmpty() && (webView = this.H1) != null) {
                webView.restoreState((Bundle) e821Var.m(this, mma0VarArr[1]));
            }
        }
        return viewInflate;
    }

    @Override // p.zf30
    public void y0() {
        this.h1 = true;
        WebView webView = this.H1;
        if (webView != null) {
            webView.setWebChromeClient(null);
        }
        this.H1 = null;
        this.F1.removeCallbacks(this.L1);
    }

    @Override // p.zf30
    public void z0() {
        this.h1 = true;
        this.T1.g();
        this.I1 = null;
        this.J1 = null;
        vi30.e(this);
        if (this.d1) {
            WebView webView = this.H1;
            ViewGroup viewGroup = (ViewGroup) (webView != null ? webView.getParent() : null);
            if (viewGroup != null) {
                viewGroup.removeView(this.H1);
                this.G1 = this.H1;
            }
        }
        this.H1 = null;
        o7b1 o7b1Var = this.K1;
        if (o7b1Var != null) {
            o7b1Var.b();
        }
    }

    public void j1() {
    }

    public void k1() {
    }

    public void e1(String str) {
    }

    public void f1(String str) {
    }

    public void h1(SslError sslError) {
    }

    public void i1(String str) {
    }

    public void g1(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }
}
