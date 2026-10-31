package p;

import android.net.Uri;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class gq8 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gr8 b;

    public /* synthetic */ gq8(gr8 gr8Var, byte b) {
        this.a = b;
        this.b = gr8Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        gr8 gr8Var = this.b;
        switch (b) {
            case 0:
                up8 up8Var = (up8) obj;
                ((AuthorizationActivity) gr8Var).o0(new dr8(up8Var.a, null, up8Var.b));
                break;
            case 1:
                vp8 vp8Var = (vp8) obj;
                ((AuthorizationActivity) gr8Var).o0(new dr8(vp8Var.a, vp8Var.b, vp8Var.c));
                break;
            case 2:
                String str = ((qp8) obj).b;
                AuthorizationActivity authorizationActivity = (AuthorizationActivity) gr8Var;
                wq8 wq8Var = authorizationActivity.h1;
                wq8Var.getClass();
                authorizationActivity.o0(azo1.o(str, wq8Var.e));
                break;
            case 3:
                String str2 = ((rp8) obj).b;
                AuthorizationActivity authorizationActivity2 = (AuthorizationActivity) gr8Var;
                wq8 wq8Var2 = authorizationActivity2.h1;
                wq8Var2.getClass();
                authorizationActivity2.o0(azo1.o(str2, wq8Var2.e));
                break;
            default:
                tp8 tp8Var = (tp8) obj;
                Uri uri = tp8Var.a;
                String str3 = tp8Var.b;
                AuthorizationActivity authorizationActivity3 = (AuthorizationActivity) gr8Var;
                WebView webView = (WebView) authorizationActivity3.findViewById(2131428129);
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setSaveFormData(false);
                settings.setSavePassword(false);
                webView.setWebViewClient(new lp8(webView, authorizationActivity3, str3));
                webView.loadUrl(uri.toString());
                break;
        }
    }
}
