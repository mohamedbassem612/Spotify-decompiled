package p;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eya1 extends hab0 implements iu30 {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ iu30 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eya1(iu30 iu30Var, iu30 iu30Var2, Function0 function0, iu30 iu30Var3, ven0 ven0Var, ven0 ven0Var2, iu30 iu30Var4, iu30 iu30Var5, iu30 iu30Var6) {
        super(1);
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = function0;
        this.d = iu30Var3;
        this.e = ven0Var;
        this.f = ven0Var2;
        this.g = iu30Var4;
        this.h = iu30Var5;
        this.i = iu30Var6;
    }

    public final Object invoke(Object obj) {
        WebView webView = new WebView((Context) obj);
        this.e.setValue(webView);
        this.a.invoke(webView);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setGeolocationEnabled(false);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(true);
        }
        webView.setWebViewClient(new iya1(this.b, this.c, new ry71(this.f, (byte) 8), this.d));
        webView.setWebChromeClient(new dya1(this.g, this.h, this.i));
        return webView;
    }
}
