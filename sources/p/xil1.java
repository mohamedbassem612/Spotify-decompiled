package p;

import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xil1 {
    public final y441 a;
    public c580 b;
    public final idd1 c;

    public xil1(q6y q6yVar, y441 y441Var) {
        this.a = y441Var;
        this.c = new idd1(new g4k1(q6yVar, this, (byte) 8));
    }

    public final void a(String str) {
        if (Uri.parse(str).getScheme() == null) {
            str = "https://".concat(str);
        }
        String strK = this.a.k(str);
        c580 c580Var = this.b;
        if (c580Var != null ? c580Var.h(strK) : false) {
            return;
        }
        if (URLUtil.isNetworkUrl(strK)) {
            ((WebView) this.c.getValue()).loadUrl(strK);
            return;
        }
        c580 c580Var2 = this.b;
        if (c580Var2 != null) {
            c580Var2.f(strK);
        }
    }
}
