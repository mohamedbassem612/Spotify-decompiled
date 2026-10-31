package p;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vag extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ gag c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ csj1 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ ven0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vag(boolean z, int i, gag gagVar, String str, String str2, String str3, csj1 csj1Var, ven0 ven0Var, ven0 ven0Var2) {
        super(1);
        this.a = z;
        this.b = i;
        this.c = gagVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = csj1Var;
        this.h = ven0Var;
        this.i = ven0Var2;
    }

    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        if (this.a) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        WebView webView = new WebView(context);
        int i = this.b;
        gag gagVar = this.c;
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f;
        csj1 csj1Var = this.g;
        ven0 ven0Var = this.h;
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setBuiltInZoomControls(false);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setSupportZoom(false);
        webView.setBackgroundColor(i);
        webView.addJavascriptInterface(gagVar, "genUiNative");
        gagVar.m = webView;
        webView.setWebChromeClient(new tag());
        webView.setWebViewClient(new uag(str2, str3, csj1Var, ven0Var, gagVar));
        webView.loadUrl(str);
        this.i.setValue(webView);
        return webView;
    }
}
