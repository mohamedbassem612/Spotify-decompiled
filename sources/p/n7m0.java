package p;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class n7m0 extends tv30 implements vu30 {
    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        ((WebView) this.receiver).evaluateJavascript((String) obj, (ValueCallback) obj2);
        return rih1.a;
    }
}
