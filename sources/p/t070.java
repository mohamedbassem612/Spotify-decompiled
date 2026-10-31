package p;

import android.content.Context;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t070 extends WebChromeClient {
    public final /* synthetic */ bz60 a;
    public final /* synthetic */ iu30 b;

    public t070(bz60 bz60Var, iu30 iu30Var) {
        this.a = bz60Var;
        this.b = iu30Var;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage;
        if (consoleMessage != null && (strMessage = consoleMessage.message()) != null && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && ihc1.h0(strMessage, "Content Security Policy", false)) {
            this.b.invoke(new j070(strMessage));
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        Context context;
        if (webView == null || (context = webView.getContext()) == null) {
            return false;
        }
        WebView webView2 = new WebView(context);
        webView2.setWebViewClient(new s070(this.a, z2));
        Object obj = message != null ? message.obj : null;
        WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
        if (webViewTransport != null) {
            webViewTransport.setWebView(webView2);
        }
        if (message == null) {
            return true;
        }
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (jsResult == null) {
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (jsResult == null) {
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (jsPromptResult == null) {
            return true;
        }
        jsPromptResult.cancel();
        return true;
    }
}
