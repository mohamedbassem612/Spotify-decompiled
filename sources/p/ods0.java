package p;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ods0 {
    public final eds0 a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public ods0(eds0 eds0Var) {
        this.a = eds0Var;
    }

    @JavascriptInterface
    public final void onBridgeReady() {
        this.b.post(new lds0(this, (byte) 0));
    }

    @JavascriptInterface
    public final void onError() {
        this.b.post(new lds0(this, (byte) 1));
    }

    @JavascriptInterface
    public final void onFieldFocus(String str) {
        this.b.post(new aih0(this, str, false, (byte) 10));
    }

    @JavascriptInterface
    public final void onLoad(double d) {
        this.b.post(new mds0(this, d, (byte) 0));
    }

    @JavascriptInterface
    public final void onResize(double d) {
        this.b.post(new mds0(this, d, (byte) 1));
    }

    @JavascriptInterface
    public final void onSubmitRequested() {
        this.b.post(new lds0(this, (byte) 2));
    }

    @JavascriptInterface
    public final void onSuccess(String str, String str2) {
        this.b.post(new nds0(this, str, str2, (byte) 0));
    }

    @JavascriptInterface
    public final void onValidationError(String str, String str2) {
        this.b.post(new nds0(this, str, str2, (byte) 1));
    }
}
