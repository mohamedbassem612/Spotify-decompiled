package p;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p78 extends WebChromeClient {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p78(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((r78) obj).b.t.setProgress(i, true);
                super.onProgressChanged(webView, i);
                break;
            default:
                c580 c580Var = ((xil1) obj).b;
                if (c580Var != null) {
                    uil1.L0.getClass();
                    int iQ = yoi1.q(i, til1.b);
                    InAppBrowserActivity inAppBrowserActivity = c580Var.a;
                    inAppBrowserActivity.r1.c(InAppBrowserActivity.t1[3], inAppBrowserActivity, Integer.valueOf(iQ));
                }
                super.onProgressChanged(webView, i);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                super.onReceivedTitle(webView, str);
                ((r78) obj).b.i.setText(str);
                break;
            default:
                super.onReceivedTitle(webView, str);
                c580 c580Var = ((xil1) obj).b;
                if (c580Var != null && ihc1.y0(c580Var.b().c)) {
                    InAppBrowserActivity inAppBrowserActivity = c580Var.a;
                    inAppBrowserActivity.o1.c(InAppBrowserActivity.t1[0], inAppBrowserActivity, str);
                    break;
                }
                break;
        }
    }
}
