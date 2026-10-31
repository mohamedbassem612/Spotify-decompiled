package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oz4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sx4(this, (byte) 26));

    public oz4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        oz4 oz4Var = (oz4) this.c.getValue();
        return oz4Var != null ? oz4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("unreported_consumption_enabled", "android-ratings-ratingsandreviews", a()));
    }
}
