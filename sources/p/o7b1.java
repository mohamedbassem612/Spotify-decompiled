package p;

import android.R;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o7b1 extends WebChromeClient {
    public final n7b1 a;
    public final iu30 b;
    public final owf1 c = new owf1();
    public final qpj1 d;

    public o7b1(n7b1 n7b1Var, m7b1 m7b1Var, iu30 iu30Var) {
        this.a = n7b1Var;
        this.b = iu30Var;
        this.d = new qpj1(m7b1Var, (byte) 15);
    }

    public final void a(int i, int i2, Intent intent) {
        if (i == 1780) {
            Uri[] result = WebChromeClient.FileChooserParams.parseResult(i2, intent);
            qpj1 qpj1Var = this.d;
            ValueCallback valueCallback = (ValueCallback) qpj1Var.c;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(result);
            }
            qpj1Var.c = null;
        }
    }

    public final void b() {
        owf1 owf1Var = this.c;
        AlertDialog alertDialog = (AlertDialog) owf1Var.b;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
        owf1Var.b = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        this.a.b();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Context context = webView.getContext();
        owf1 owf1Var = this.c;
        AlertDialog alertDialog = (AlertDialog) owf1Var.b;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
        owf1Var.b = new AlertDialog.Builder(context).setMessage(str2).setPositiveButton(R.string.ok, new uhl1(jsResult, (byte) 0)).setNegativeButton(R.string.cancel, new uhl1(jsResult, (byte) 1)).setOnCancelListener(new vae(jsResult, (byte) 15)).setOnDismissListener(new whr(owf1Var, (byte) 7)).show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        this.b.invoke(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        qpj1 qpj1Var = this.d;
        ValueCallback valueCallback2 = (ValueCallback) qpj1Var.c;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        qpj1Var.c = valueCallback;
        try {
            Intent intentCreateIntent = fileChooserParams.createIntent();
            m7b1 m7b1Var = (m7b1) qpj1Var.b;
            intentCreateIntent.getClass();
            m7b1Var.b(intentCreateIntent);
            return true;
        } catch (ActivityNotFoundException unused) {
            ValueCallback valueCallback3 = (ValueCallback) qpj1Var.c;
            if (valueCallback3 != null) {
                valueCallback3.onReceiveValue(null);
            }
            qpj1Var.c = null;
            return true;
        }
    }
}
