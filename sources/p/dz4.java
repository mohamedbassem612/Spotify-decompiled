package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dz4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sx4(this, (byte) 20));

    public dz4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        dz4 dz4Var = (dz4) this.c.getValue();
        return dz4Var != null ? dz4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_promo_disclosure_webview_page", "android-promo-disclosure-page", a()));
    }
}
