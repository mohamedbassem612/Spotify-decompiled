package p;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pk21 {
    public final rl21 a;
    public final nt01 b;
    public final lpx0 c;
    public final Handler d = new Handler(Looper.getMainLooper());

    public pk21(rl21 rl21Var, nt01 nt01Var, lpx0 lpx0Var) {
        this.a = rl21Var;
        this.b = nt01Var;
        this.c = lpx0Var;
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        String strG;
        try {
            uga0 uga0VarL = fga0.l(nfa0.d.c(str));
            ega0 ega0Var = (ega0) uga0VarL.get("action");
            if (ega0Var == null || (strG = fga0.g(fga0.m(ega0Var))) == null) {
                return;
            }
            this.d.post(new uu1(strG, this, uga0VarL, (byte) 29));
        } catch (Exception e) {
            n57.e("ReportBridgeInterface: failed to parse message: " + e);
        }
    }
}
